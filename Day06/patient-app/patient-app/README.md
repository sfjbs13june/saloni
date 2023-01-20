### Build application
```
mvn clean install
```
### Run application
```
mvn spring-boot:run
```

### Test
curl --location --request POST 'localhost:8081/patient/save' \
--header 'Content-Type: application/json' \
--data-raw '{
"id" : "123",
"name" : "pat123",
"age" : "30",
"gender" : "male",
"disease" : "bacterial"
}'

curl --location --request POST 'localhost:8081/patient/save' \
--header 'Authorization: Basic dXNlcjEyMzpwYXNzd29yZA==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=B0F4B04F5C0560D483C665D506BDAA1E' \
--data-raw '{
"id" : "123",
"name" : "pat123",
"age" : "30",
"gender" : "male",
"disease" : "bacterial"
}'



curl --location --request PUT 'localhost:8081/patient/update?disease=fever' \
--header 'disease: fever' \
--header 'Content-Type: application/json' \
--data-raw '{
"id" : "123",
"name" : "pat123",
"age" : "30",
"gender" : "male",
"disease" : "fever"
}'curl --location --request PUT 'localhost:8081/patient/update?disease=fever' \
--header 'Authorization: Basic YWRtaW4xMjM6cGFzc3dvcmQ=' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=B0F4B04F5C0560D483C665D506BDAA1E' \
--data-raw '{
"id" : "123",
"name" : "pat123",
"age" : "30",
"gender" : "male",
"disease" : "bacterial"
}'


