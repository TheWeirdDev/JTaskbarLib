/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.alireza6677.jtaskbarlib;

import com.sun.jna.Native;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;

/**
 *
 * @author Alireza6677
 */
public class JTaskbarController {
    
    private JTaskbarProgress tp;
    private String title;
    private int max = 100;
    private JProgressState state = JProgressState.NORMAL;
    private int value = 1;
    private JFrame jf;
    
    public JTaskbarController(JFrame j){
        title = j.getTitle();
        //String path =  new File(JTaskbarController.class.getProtectionDomain().getCodeSource().getLocation().getPath()).getParentFile().getPath();
        loadLib();
        reset(max,j);
        jf = j;
        
        j.addPropertyChangeListener(new PropertyChangeListener() {
			@Override
			public void propertyChange(PropertyChangeEvent arg0) {
				editTitle(jf);
			}
		});
    }
    
    private void loadLib(){
    	String arch = "";
    	if(System.getProperty("sun.arch.data.model").equals("32"))
    		arch = "32";
    	
        try {
			tp = (JTaskbarProgress) Native.loadLibrary(Utils.tempJarDll("/lib/JTaskbarLib"+arch+".dll").getAbsolutePath(), JTaskbarProgress.class);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
    }
    
    public JProgressState getProgressState(){
        return state;
    }
    
    public int getProgressValue(){
        return value;
    }
    
    public int getMax(){
        return max;
    }
    
    public JFrame getJFrame(){
        return jf;
    }
    
    private void reset(int max , JFrame j){
        tp.setMax(this.max);
        tp.setTitle(title);
        tp.setProgressState(JProgressState.NORMAL.intValue());
        tp.setProgressValue(value);
        jf = j;
    }
    
    private void resetNative(){
    	loadLib();
    }
    
    public void setMax(int m){
        max = m;
        tp.setTitle(title);
        tp.setProgressState(this.state.intValue());
        tp.setProgressValue(value);
        tp.setMax(max);

    }
    
    public void editTitle(JFrame f){
        title = f.getTitle();
        tp.setMax(max);
        tp.setProgressState(this.state.intValue());
        tp.setProgressValue(value);
        tp.setTitle(title);
        jf = f;
    }
    
    public void setProgressState(JProgressState state){
        this.state = state;
        tp.setTitle(title);
        tp.setMax(max);
        tp.setProgressValue(value); 
        tp.setProgressState(this.state.intValue());

    }
    
    public void setProgressValue(int v){
        if(state != JProgressState.INDETERMINATE && state != JProgressState.NO_PROGRESS){
            value = v;
            tp.setProgressState(this.state.intValue());
            tp.setMax(max);
            tp.setTitle(title);
            tp.setProgressValue(value);
        }
    }  
    
    public void flashWindow(){
        tp.flashWindow();
    }
    
    public void setWindowOpacity(int opacity){
        if(opacity > 255 || opacity <0)
        { 
            System.err.println("Error ! opacity must be : 0 < opacity < 255");
            return;
        }
        tp.setWindowOpacity(opacity);
    }
    
    public void setThumbnailTooltip(String s){
        tp.setThumbnailTooltip(s);
    }

  //  public void setThumbnailClip(int left, int top, int right,int bottom){
  //      tp.setThumbnailClip(left, top, right,bottom);
  //  }

}