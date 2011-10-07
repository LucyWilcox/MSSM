javac Bank.java
javac TheBank.java
echo off
if %errorlevel% GTR 0 goto goterror
echo -------------------------------------------
java TheBank
echo -------------------------------------------
echo off
goto done
:goterror
echo Not Running due to error
:done
pause
