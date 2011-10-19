javac Hangman.java
echo off
if %errorlevel% GTR 0 goto goterror
echo -------------------------------------------
java Hangman
echo -------------------------------------------
echo off
goto done
:goterror
echo Not Running due to error
:done
pause
