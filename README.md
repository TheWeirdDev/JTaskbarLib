#JTaskbarLib

The first library for using windows Taskbar and window features in Java

#Requirements

Windows 7 , 8 , 8.1 , 10

#How to use

First add library source files to your project then initialize the controller in your JFrame :

```java
//in JFrame : (Don't forget to set a title for JFrame first)
setTitle("Sample JTaskbarLib");
JTaskbarController controller = new JTaskbarController(this);
```

You can set the values in runtime (even opacity!):

```java
controller.setProgressState(JProgressState.NO_PROGRESS);
controller.setProgressState(JProgressState.STOP_ERROR);
controller.setProgressState(JProgressState.PAUSE);
controller.setProgressState(JProgressState.INDETERMINATE);
controller.setProgressState(JProgressState.NORMAL);

controller.setProgressValue(50);
controller.setThumbnailTooltip("Test !");
controller.flashWindow();
controller.setWindowOpacity(180);

```
#Download Library
[Download](https://github.com/alireza6677/JTaskbarLib/raw/master/dist/JTaskbarLib.jar)

#Screenshots

![Screenshot1](http://www.axgig.com/images/09966399837368348184.png)
![Screenshot2](http://www.axgig.com/images/57405352266954844994.png)
![Screenshot3](http://www.axgig.com/images/64234434841136641045.gif)
![Screenshot4](http://www.axgig.com/images/77640314593542747545.png)
![Screenshot5](http://www.axgig.com/images/86958911908320093649.png)


#How to compile c++ code in windows

```bash
g++ --shared -o JTaskbar32.dll dll.cpp -lole32  -luuid
```

# Licence
JTaskbar is licenced under [GPL3](https://github.com/alireza6677/JTaskbarlLib/blob/master/LICENSE)