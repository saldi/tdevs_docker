#!/usr/bin/env bash
rm ./app -R
mvn dependency:copy -Dartifact=edu.devs.tarnow.docker:users-data:1.0.0 -DoutputDirectory=./app
docker build -f users-data.Dockerfile -t tdevs/users-data:1.0.0 .
mvn dependency:copy -Dartifact=edu.devs.tarnow.docker:users-api:1.0.0 -DoutputDirectory=./app
docker build -f users-api.Dockerfile -t tdevs/users-api:1.0.0 .