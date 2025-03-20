#!/bin/bash

# compile java file and make JAR (Java ARchive) file
rm coordinates.jar

jar -cvfm coordinates.jar coordinates_manifest.txt *.class coordinates_128.png coordinates.ico

