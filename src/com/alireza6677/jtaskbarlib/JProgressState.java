/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.alireza6677.jtaskbarlib;

/**
 *
 * @author Win8.1
 */
public enum JProgressState{
    
    
    NO_PROGRESS(0x00000000) ,
    INDETERMINATE(0x00000001) ,
    NORMAL(0x00000002) ,
    STOP_ERROR(0x00000004) ,
    PAUSE(0x00000008);

    private final int value;
    
    private JProgressState(int i){
        value = i;
    }
    int intValue(){
        return value;
    }

}
