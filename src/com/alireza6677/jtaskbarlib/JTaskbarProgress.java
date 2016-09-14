/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.alireza6677.jtaskbarlib;

import com.sun.jna.Library;

/**
 *
 * @author Win8.1
 */
interface JTaskbarProgress extends Library {

    
    void setTitle(String s);
    
    void setMax(int i);
    
    int setProgressState(int state);

    int setProgressValue(int completed);
    
    void flashWindow();
        
    int setThumbnailClip(int left, int top, int right,int bottom);
    
    int setThumbnailTooltip(String title);
    
    void setWindowOpacity(int bAlpha);
    
    
}
