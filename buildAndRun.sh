#!/bin/sh
mvn clean package && docker build -t pe.edu.vallegrande.taller.javaee21/SonarCloud .
docker rm -f SonarCloud || true && docker run -d -p 9080:9080 -p 9443:9443 --name SonarCloud pe.edu.vallegrande.taller.javaee21/SonarCloud