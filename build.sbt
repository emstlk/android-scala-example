minSdkVersion in Android := "11"

targetSdkVersion in Android := "21"

platformTarget in Android := "android-21"

buildToolsVersion in Android := Some("21.1.1")

scalaVersion := "2.11.6"

scalacOptions ++= Seq("-target:jvm-1.7", "-encoding", "UTF-8", "-feature", "-unchecked", "-deprecation", "-Xcheckinit")

javacOptions ++= Seq("-source", "1.7", "-target", "1.7", "-Xlint:unchecked", "-Xlint:deprecation")

libraryDependencies += "com.android.support" % "appcompat-v7" % "21.0.2"
