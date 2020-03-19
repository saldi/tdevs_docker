#!/usr/bin/env bash
rm ./app -R
mvn dependency:copy -Dartifact=edu.devs.tarnow.docker:users-data:1.0.0 -DoutputDirectory=./app
docker build -t tdevs/users-data:1.0.0 .