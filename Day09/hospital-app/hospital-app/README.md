### Build application
```
mvn clean install
```
### Run application
```
mvn spring-boot:run
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