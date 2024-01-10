# FizzBuzz
Roche Hackathon

https://github.com/MinatoN25/FizzBuzz/blob/main/FizzBuzz/src/main/java/com/fizzbuzz/controller/FizzBuzzController.java
above controller has two endpoints convert and statistics

convert GET API takes 5 query parameters (int a, int b, int limit, String fizz, String buzz)
http://localhost:8080/convert?a=2&b=5&limit=50&fizz=fizz&buzz=buzz
output - 1,fizz,3,fizz,buzz,fizz,7,fizz,9,fizzbuzz,11,fizz,13,fizz,buzz,fizz,17,fizz,19,fizzbuzz,21,fizz,23,fizz,buzz,fizz,27,fizz,29,fizzbuzz,31,fizz,33,fizz,buzz,fizz,37,fizz,39,fizzbuzz,41,fizz,43,fizz,buzz,fizz,47,fizz,49,fizzbuzz

statistics GET API keeps count all all hits to converts and returns most used paramters
http://localhost:8080/statistics
output - {"a":2,"b":7,"limit":100,"fizz":"fizz","buzz":"buzz","hitCount":23}

https://github.com/MinatoN25/FizzBuzz/blob/main/FizzBuzz/src/main/java/com/fizzbuzz/service/FizzBuzzService.java
above class has business logic for FizzBuzz app

https://github.com/MinatoN25/FizzBuzz/blob/main/FizzBuzz/src/test/java/com/fizzbuzz/service/FIzzBuzzServiceTest.java
above class has test cases convering positive and negative scenarios of FizzBuzz app
