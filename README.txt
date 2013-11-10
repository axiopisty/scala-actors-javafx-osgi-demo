scala-actors-javafx-osgi-demo
=============================
A demonstration using scala, akka actors, javafx and osgi




System Setup:
=============
To build this project you must set the following environment variables:

JAVA_HOME - This should point to the root of the JDK installation directory.
GRADLE_HOME - This should point to the root of the GRADLE installation directory.
SCALA_HOME - This should point to the root of the SCALA installation directory.

NOTE: This project requires that the jfxrt.jar file be relocated inside 
      the $JAVA_HOME directory as follows:
$ cp $JAVA_HOME/jre/lib/jfxrt.jar $JAVA_HOME/jre/lib/ext/




The project has been tested on the following:
=============================================

$ java -version && javac -version && gradle -version
java version "1.7.0_45"
Java(TM) SE Runtime Environment (build 1.7.0_45-b18)
Java HotSpot(TM) 64-Bit Server VM (build 24.45-b08, mixed mode)
javac 1.7.0_45

------------------------------------------------------------
Gradle 1.8
------------------------------------------------------------

Build time:   2013-09-24 07:32:33 UTC
Build number: none
Revision:     7970ec3503b4f5767ee1c1c69f8b4186c4763e3d

Groovy:       1.8.6
Ant:          Apache Ant(TM) version 1.9.2 compiled on July 8 2013
Ivy:          2.2.0
JVM:          1.7.0_45 (Oracle Corporation 24.45-b08)
OS:           Linux 3.8.0-25-generic amd64




Directory Structure:
====================
$ tree
.
├── app (Directory containing everything needed to run the OSGi container)
│   ├── bin
│   │   └── felix.jar
│   ├── bundle (Directory containing all the OSGI bundles that should be started by Apache Felix when the OSGi container launches.)
│   │   ├── akka-osgi_2.10-2.2.1.jar
│   │   ├── client-1.0.0-SNAPSHOT.jar
│   │   ├── config-1.0.2.jar
│   │   ├── miglayout-core-4.2.jar
│   │   ├── miglayout-javafx-4.2.jar
│   │   ├── org.osgi.compendium-4.2.0.jar
│   │   ├── org.osgi.core-4.2.0.jar
│   │   └── scala-library-2.10.2.jar
│   └── conf
│       └── config.properties (Configuration file for the Apache Felix launcher application)
├── client (Directory containing the source code for our OSGi bundle)
│   ├── build.gradle
│   └── src
│       └── main
│           ├── resources
│           │   └── fxml
│           │       ├── login.fxml
│           │       └── welcome.fxml
│           └── scala
│               └── client
│                   ├── ClientActivator.scala
│                   ├── Container.scala
│                   ├── controller
│                   │   └── GuiActor.scala
│                   ├── Gui.scala
│                   ├── message
│                   │   └── LaunchGui.scala
│                   └── view
│                       ├── LoginView.scala
│                       └── Screen.scala
├── LICENSE
└── README.txt

This project has 2 main subfolders, app and client.

app is the directory for the OSGi container. 
client is the directory containing the source code for the OSGI bundle. 




How to build and run the project:
=================================
$ cd client
$ gradle build
$ cp build/libs/client-1.0.0-SNAPSHOT.jar ../app/bundle/
$ cd ../app
$ java -jar bin/felix.jar

If everything works properly, you should see a GUI appear on your screen.

Congratulations! Its working.

