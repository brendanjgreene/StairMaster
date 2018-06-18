# StairMaster

A simple Local API Endpoint that listens at:

http://localhost:8080/climbing-stairs/rest/calculate/json/

You Can send an Array of Flights of Stairs and strides length in JSON format and it will calculate the total Strides need to traverse the stair case.

In order to use clone or download this repository and Import into eclipse or your favorite IDE.  Then Run as Maven Install and a WAR file is created in Target folder.

Copy this WAR into you WildFly deployment folder.  

Then you can use Postman to send a POST request to:

http://localhost:8080/climbing-stairs/rest/calculate/json/

Sample request body:

{
  "stairs": [2,14,14,19,3,8,17,7,17,6,9,5],
  "strides": 4
}

sample response body:

{
    "message": "The minumum number of steps to reach the top of your stairwell is 58",
    "totalStrides": 58,
    "stairs": [2,14,14,19,3,8,17,7,17,6,9,5],
    "strides": 4
}
