# Project
This Apllication is use understand the basic security mechanism in spring boot application.

## Import project
Import the project on either eclipse or inellij as a maven import project

## Building

### Maven
This project is maven project which will be build using maven command.

```bash
$ mvn clean install
```

### Running (Make sure that eureka server is up)
This project is maven project which will be run using maven command.

```bash
$ mvn spring-boot:run
```
### Dockerization
```
$ mvn install dockerfile:build
```
### List docker images
```
$ docker images
```
### Running the application in docker container
```$ docker run -p 8080:8080 falcon007/hospital-app:0.0.1-SNAPSHOT
```
### List docker running container
```
$ docker ps
```