##Build application
```mvn clean install
```
##Run application
```
mvn spring-boot:run
```

##Test
curl --location --request GET 'localhost:8080/add?a=5&b=6'

curl --location --request POST 'localhost:8080/sub?a=5&b=6'

curl --location --request PUT 'localhost:8080/mul?a=5&b=6'

curl --location --request DELETE 'localhost:8080/div?a=10&b=5'