#!/bin/bash

# compile java file

rm coordinates*.class

javac -Xlint:unchecked coordinates.java

java coordinates
#java -cp coordinates

