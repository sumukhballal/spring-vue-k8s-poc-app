#!/bin/bash
mvn clean
mvn package
docker build -t springsumukhimage .
kubectl delete deployment spring-web-sumukh
kubectl apply -f deployment.yaml
minikube service spring-web-sumukh-service 
