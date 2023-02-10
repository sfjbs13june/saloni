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
docker-compose -f docker-compose-mongo.yml up -d
mvn spring-boot:run
docker-compose -f docker-compose-mongo.yml down
```
### Dockerization
```
$ mvn install dockerfile:build
```
### List docker images
```
$ docker images
```

### List docker running container
```
$ docker ps
```
```
## Running the application using docker-compose
```
$ docker-compose up -d
```
## Stopping the application
``` 
$ docker-compose down
```

### post--->doctorController
```
curl --location --request POST 'localhost:8080/doctor/save' \
--header 'Authorization: Basic ZG9jdG9yOmRvY3RvcjEyMw==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=CA126CD90AF68C6431E79A553B285C92' \
--data-raw '{
    "appointmentId": "01",
  "patientName": "abc",
  "doctorName": "Doctor1",
  "date": "13/02/2023",
  "prescription": {"prescriptionId": "500","appointmentId": "01","description": "Medicine for cough and cold","patientName": "abc","doctorName": "Doctor1"}
}'\''

}'
```
### GET----->DOCTORCONTROLLER:
```
curl --location --request GET 'localhost:8080/doctor/doctorappointment?doctorName=Doctor1' \
--header 'Cookie: JSESSIONID=CA126CD90AF68C6431E79A553B285C92'
```

### POST:PatientController
```
curl --location --request POST 'localhost:8080/patient/save' \
--header 'Authorization: Basic cGF0aWVudDpwYXRpZW50MTIz' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=CA126CD90AF68C6431E79A553B285C92' \
--data-raw '{
    "appointmentId": "05",
  "patientName": "Kriti",
  "doctorName": "Krishna",
  "date": "14/2/2023",
  "prescription": {"prescriptionId": "100","appointmentId": "05","description": "Medicine for knee pain","patientName": "Kriti","doctorName": "Krishna"}
}'
```

### GET------>patientController
```
curl --location --request GET 'localhost:8080/patient/myappointment?patientName=Kriti' \
--header 'Authorization: Basic cGF0aWVudDpwYXRpZW50MTIz' \
--header 'Cookie: JSESSIONID=CA126CD90AF68C6431E79A553B285C92'
```

### POST------>prescriptionController
```
curl --location --request POST 'localhost:8080/saveprescription' \
--header 'Authorization: Basic cGF0aWVudDpwYXRpZW50MTIz' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=CA126CD90AF68C6431E79A553B285C92' \
--data-raw ' {"prescriptionId": "101",
    "appointmentId": "050",
    "description": "Medicine for knee pain",
    "patientName": "Karan",
    "doctorName": "Saloni"
 }'
```

### GET------->prescriptionController
```
curl --location --request GET 'localhost:8080/viewprescription?patientName=Karan' \
--header 'Authorization: Basic ZG9jdG9yOmRvY3RvcjEyMw==' \
--header 'Cookie: JSESSIONID=1899337142C1E2AD4F00B74B84CF77FF'
```

### Swagger
```
http://localhost:8080/swagger-ui.html
```
