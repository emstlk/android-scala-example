## Android Scala Example

[![Gitter](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/emstlk/android-scala-example?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=body_badge)

Android project with sbt 0.13.8, Scala 2.11.7 and android-sdk-plugin 1.4.4

### Requirements

* Java 1.7+
* Android SDK

Also you can use script to install Android SDK

##### On Mac
```
$ ./mac_install_sdk.sh
```
##### On Linux
```
$ ./linux_install_sdk.sh
```

### Usage in console

To compile and build 

```
$ ./sbt android:packageDebug
```

To run test with Robolectric (not needed device) just type

```
$ ./sbt test
```

### Usage in IDE

You have to import project from Intellij IDEA (I use version 14.1) or Android Studio

Choose SBT project and Android SDK like this

![Import android project](https://cloud.githubusercontent.com/assets/3140251/7283309/5998b608-e93e-11e4-95d1-353c8c2055f2.png)

Probably you want to run project from IDE, so just make new "Android application" run configuration

**Warning!**

In "Before launch" section you should remove "Make" command and add "Run external tool" with `./sbt android:packageDebug` command

![Android application configuration](https://cloud.githubusercontent.com/assets/3140251/7283334/83eeb22c-e93e-11e4-91c1-ac0394082827.png)

Also you may want to use a good emulator, so I prefer [Genymotion](https://www.genymotion.com) emulator
