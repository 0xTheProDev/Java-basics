#!/bin/sh
# This script compiles *.java files into *.class files of a package
javac -d classes sources/examportal/*.java
echo "Success"