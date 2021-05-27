@echo off
call mvn clean package
call docker build -t pe.edu.vallegrande.taller.javaee21/SonarCloud .
call docker rm -f SonarCloud
call docker run -d -p 9080:9080 -p 9443:9443 --name SonarCloud pe.edu.vallegrande.taller.javaee21/SonarCloud