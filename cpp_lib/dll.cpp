#include <windows.h>
#include <ShObjIdl.h>
#include "dll.h"
//#include <iostream>

char * titleHWND;
long max ;

DLL_FUNC void setTitle(char * a){
	titleHWND = a;
}

DLL_FUNC void setMax(long i){
   max = i; 
}
        
DLL_FUNC void setWindowOpacity(BYTE bAlpha)
{
        HWND hwnd = getWindowHandle(titleHWND);
	SetWindowLong(hwnd, GWL_EXSTYLE, GetWindowLong(hwnd, GWL_EXSTYLE) | WS_EX_LAYERED);
	SetLayeredWindowAttributes(hwnd, RGB(255, 255, 255), bAlpha, LWA_ALPHA);
	
}

DLL_FUNC HWND getWindowHandle(char* title) {
	HWND hwnd = NULL;
	const char *str = title;
	hwnd = FindWindow(NULL, str);
	return hwnd;
}

ITaskbarList3* getTaskBar() {
	HRESULT hr;
	ITaskbarList3 *taskBar = NULL;
	CoInitialize(NULL);
	hr = CoCreateInstance(CLSID_TaskbarList, NULL, CLSCTX_SERVER,
			IID_ITaskbarList3, (LPVOID*) &taskBar);
	if (SUCCEEDED(hr)) {
		taskBar->HrInit();
	}
	return taskBar;
}

DLL_FUNC long setProgressState(long state) {
	ITaskbarList3 *taskBar = getTaskBar();
        long oo = state;
	if (taskBar != NULL) {
		HRESULT hr = taskBar->SetProgressState(getWindowHandle(titleHWND), (TBPFLAG)oo);
		taskBar->Release();
		return hr;
	}
	return -1;
}

DLL_FUNC long setProgressValue(long completed) {
	ITaskbarList3 *taskBar = getTaskBar();
	if (taskBar != NULL) {
		HRESULT hr = taskBar->SetProgressValue(getWindowHandle(titleHWND), completed, max);
		taskBar->Release();
		return hr;
	}
	return -1;
}


DLL_FUNC long setThumbnailClip( long left, long top, long right,long bottom) {
	ITaskbarList3 *taskBar = getTaskBar();
	if (taskBar != NULL) {

		HRESULT hr;
		if (left == -1 && top == -1 && right == -1 && bottom == -1) {
			hr = taskBar->SetThumbnailClip(getWindowHandle(titleHWND), NULL);
		} else {
			RECT rect;
			rect.left = left;
			rect.top = top;
			rect.right = right;
			rect.bottom = bottom;
			hr = taskBar->SetThumbnailClip(getWindowHandle(titleHWND), &rect);

		}
		return hr;
	}
	return -1;
}

DLL_FUNC long setThumbnailTooltip(char * title) {
	ITaskbarList3 *taskBar = getTaskBar();
	if (taskBar != NULL) {
		const char *str = title;
		int len = strlen(str) + 1;
		wchar_t *wText = new wchar_t[len];
		if (wText == 0)
			return -2;
		memset(wText, 0, len);
		MultiByteToWideChar(CP_ACP, 0, str, -1, wText, len);
		HRESULT hr = taskBar->SetThumbnailTooltip(getWindowHandle(titleHWND), wText);
		return hr;
	}
	return -1;
}

DLL_FUNC void flashWindow(){
    FlashWindow(getWindowHandle(titleHWND), true);

}
