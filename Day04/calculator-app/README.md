##Build application
```mvn clean install
```
##Run application
```
mvn spring-boot:run
```

##Test Application
```curl --location --request GET 'localhost:8080/add?a=10&b=2'
   
   curl --location --request GET 'localhost:8080/sub?a=10&b=2'
   
   curl --location --request GET 'localhost:8080/mul?a=10&b=2'
   
   curl --location --request GET 'localhost:8080/div?a=10&b=2'
   
   


```