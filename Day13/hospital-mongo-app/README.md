## Build the app

``` 
mvn clean install
```

## Run the app

``` 
docker-compose -f docker-compose-mongo.yml up -d
mvn spring-boot:run
docker-compose -f docker-compose-mongo.yml down

```

## Post

``` 
curl --location --request POST 'localhost:8083/hospital/create' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name":"Pratik",
    "doctorName":"Suman",
    "address":"Mumbai"
}'
```

## Get 

``` 
curl --location --request GET 'localhost:8083/hospital/read' 


```

## Patient
## Put
```
curl --location --request POST 'localhost:8083/patient/create' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name":"Karan",
    "age":"50",
    "gender":"male",
     "disease":"stomach pain"
}'
```


## Show data

```
docker exec -it  hospital-mongo-app-mongo-1 bash

mongo

show dbs

show tables

db.hospital.find()

```


## Dockerization

### Maven 
Here i am using maven spotify plugin to create the docker image for this application.
Use the below command to create the docker image.
For creating please use your repository to create the image which will be easy to push image in your docker hub.
update in your pom.xml.
<docker.image.prefix> <your repo name> </docker.image.prefix>

```bash
$ mvn install dockerfile:build
```

### Push docker images

```bash
docker login

$ docker push <repository-name>/<app-name>

```

