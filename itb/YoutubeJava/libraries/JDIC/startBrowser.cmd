@echo on
if "%JAVA_HOME%1"=="1" set JAVA_HOME=D:\java1.6\j2se\build_d
rem cp ../ndist/jdic.jar ./lib
%JAVA_HOME%\bin\java -cp "lib\jdic.jar;lib\jdic_stub_unix.jar;lib\jdic_stub_windows.jar" -jar Browser.jar
