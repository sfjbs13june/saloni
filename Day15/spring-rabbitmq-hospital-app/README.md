# Build
``` 
mvn clean install
```


# Run
``` 
docker-compose -f docker-compose-rabbitmq.yml up -d
```


# Run Producer
``` 
rabbitmq-demo-producer> mvn spring-boot:run
```


# Test
``` 
curl --location --request POST 'localhost:8080/rabbitmq/hospital' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name":"Appolo",
    "hosId":"01",
    "address":"Mumbai"
}'

curl --location --request POST 'localhost:8080/rabbitmq/patient' \
--header 'Content-Type: application/json' \
--data-raw '{
    "patientName":"sneha",
    "patId":"11",
    "gender":"female",
    "age":"15"
}'
```


# Run Consumer
``` 
rabbitmq-demo-consumer> mvn spring-boot:run
```


# Show data on browser::

http://localhost:15672/

user-name:guest
password:guest


## Stop Container
``` 
docker-compose -f docker-compose-rabbitmq.yml down
```
