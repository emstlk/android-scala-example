import scala.collection.JavaConversions._

minSdkVersion in Android := "11"

targetSdkVersion in Android := "21"

platformTarget in Android := "android-21"

buildToolsVersion in Android := Some("21.1.1")

scalaVersion := "2.11.6"

scalacOptions ++= Seq("-target:jvm-1.7", "-encoding", "UTF-8", "-feature", "-unchecked", "-deprecation", "-Xcheckinit")

javacOptions ++= Seq("-source", "1.7", "-target", "1.7", "-Xlint:unchecked", "-Xlint:deprecation")

libraryDependencies ++= Seq(
  "com.android.support" % "appcompat-v7" % "21.0.2",
  "org.robolectric" % "robolectric" % "2.4" % "test",
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "org.apache.maven" % "maven-ant-tasks" % "2.1.3" % "test"
)

unmanagedClasspath in Test ++= (builder in Android).value.getBootClasspath map Attributed.blank

proguardOptions in Android += "-keepattributes Signature"
