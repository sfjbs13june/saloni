# Create project

``` 
https://start.spring.io/
```

# Build the project

``` 
mvn clean install
```

# Run application

``` 
mvn spring-boot:run
```

# Testing the application
Save data:

curl --location --request POST 'localhost:8081/save/student' \
--header 'Content-Type: application/json' \
--data-raw '{ "rollNo":"01", "name":"Sanskruti", "std":"8" }'

curl --location --request POST 'localhost:8081/save/student' \
--header 'Content-Type: application/json' \
--data-raw '{ "rollNo":"02", "name":"Samir", "std":"7" }'


Get data:
curl --location --request GET 'localhost:8081/get/student?name=Sanskruti'

Update data:

curl --location --request PUT 'localhost:8081/update/student?name=Samir&std=10'

Remove Data:

curl --location --request DELETE 'localhost:8081/remove/student?name=Samir'


