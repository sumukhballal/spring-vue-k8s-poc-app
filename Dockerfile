FROM openjdk:8-jdk-alpine
COPY target/*.jar myapp.jar
ENTRYPOINT ["java","-jar","/myapp.jar"]