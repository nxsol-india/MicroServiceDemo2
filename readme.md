Technology :
------------

Spring Boot Microservice + Spring Data JPA + MySQL

Run Application Following Orders With spring boot

1)discovery (eureka server)

2)edge (gateway service)

3)user-service 

4)course-service


Task :
------

a] We have to create two micro service one will handle user info (email Id,name,country) and other will save course info (course name, course price domestic , course price international, institute name, course country etc)

b] User will query for course using courseId

c] If user querying for courseId is of same country as course country than display domestic course price else international course price

D] Please use service discovery for interservice communication 

E] No need for any Oauth implementation assume all APIs are open 

API Details: 
[Microservice2.postman_collection.json for post man]
------------

A)course by courseid and userid :
curl --location --request GET 'http://localhost:2222/course/1/3'

B)user by id:
curl --location --request GET 'http://localhost:3333/user/1'

c)country data:
curl --location --request GET 'http://localhost:3333/country/'

D)save course:
curl --location --request POST 'http://localhost:2222/course/' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "JPA Course",
    "domesticPrice": 125.0,
     "internationalPrice": 145.0,
    "instituteName": "oxford",
    "countryId": 3

}'

