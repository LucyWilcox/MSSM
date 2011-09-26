javac Assignment10.java
javac Item.java
echo off
if %errorlevel% GTR 0 goto goterror
echo -------------------------------------------
java Assignment10
echo -------------------------------------------
echo off
goto done
:goterror
echo Not Running due to error
:done
pause
