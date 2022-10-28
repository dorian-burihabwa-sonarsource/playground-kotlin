#! /usr/bin/env bash

if [[ "${1}" == "8.9" ]]; then
  source 8.9.secrets.env
  ./gradlew sonarqube \
    -Dsonar.projectKey=playground-kotlin \
    -Dsonar.host.url=http://localhost:9000 \
    -Dsonar.login="${SONAR_TOKEN}"
  else
    echo "No version provided"
fi