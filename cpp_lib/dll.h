/* 
 * File:   dll.h
 * Author: Win8.1
 *
 * Created on 10 September 2014, 18:49
 */

#ifndef DLL_H
#define	DLL_H
#define DLL_FUNC __declspec(dllexport)
extern "C"{  
    
    DLL_FUNC void setTitle(char * a);
    DLL_FUNC void setMax(long i);
    DLL_FUNC HWND getWindowHandle(char* title);
    ITaskbarList3* getTaskBar();
    DLL_FUNC long setProgressState(long state);
    DLL_FUNC long setProgressValue(long completed);
    DLL_FUNC long setThumbnailClip( long left, long top, long right,long bottom);
    DLL_FUNC long setThumbnailTooltip(char * title);
    DLL_FUNC void flashWindow();
    DLL_FUNC void setWindowOpacity(BYTE bAlpha);

}
#endif
