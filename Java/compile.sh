#!/bin/bash

# compile java file

rm coordinates*.class

# rm $1*.class
# rm $1.class
# rm $1'$1.class'
# rm $1'$2.class'
# rm $1'$3.class'
# rm $1'$4.class'
# rm $1'$4$1.class'
# rm $1'$5.class'
# rm $1'$5$1.class'
# rm $1'$6.class'
# rm $1'$6$1.class'
# rm $1'$7.class'
# rm $1'$8.class'
# rm $1'$9.class'
# rm $1'$10.class'

# javac -Xlint:unchecked $1.java
javac -Xlint:unchecked coordinates.java
#javac $1.java
# java $1
java coordinates

#java -cp AESFileCrypt

