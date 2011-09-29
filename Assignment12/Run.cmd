javac Test.java
javac AnimationCanvas.java
javac Ship.java
javac Player.java
javac Projectile.java
echo off
if %errorlevel% GTR 0 goto goterror
echo -------------------------------------------
java Test
echo -------------------------------------------
echo off
goto done
:goterror
echo Not Running due to error
:done
pause
