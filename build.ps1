# Set the correct JDK 21 path
$jdkPath = "C:\data\apps\#dev\jdk\jdk-21.0.7"
$env:JAVA_HOME = $jdkPath
$env:Path = "$jdkPath\bin;" + $env:Path

Write-Host "JAVA_HOME set to $jdkPath"

# Build the mod
./gradlew build

# Optionally, run the client (uncomment the next line to launch Minecraft after building)
# ./gradlew runClient 