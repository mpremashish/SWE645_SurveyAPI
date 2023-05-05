Survey service for submission of survey data and getting the already existing data.

We have 2 main endpoints :
1. POST (\createStudentSurvey) :
        ``` curl --location --request POST 'http://34.196.44.223:32484/createStudentSurvey' 
            \--header 'Content-Type: application/json' \--data-raw '{ "firstName" : "Jack", "lastName" : 
            "lastname","streetAddress": "213dsada","city" : "Fairfax","state" :"VA", "zip" : "22032", 
            "telephone_num" : "21379819831","email" : "sk@gmu.edu","date" : "11/07/90","mostLiked" : "campus",
            "interest" : "friends", "recommendation" : "Likely"}' ```
2. Get (\getStudents):
    ```curl --location --request GET 'http://34.196.44.223:32484/getStudents' \ --data-raw ''```

To run the project :
Either open the project in any ide and run using that or spin up the docker image using the docker file provided.
Docker commands to build the docker file:
1. ``` docker build --tag mpremashish1/surveyapi:1 . ```
2. ``` docker run -i -p 8080:8080 <container-id> ```

You can also access the endpoint deployed at kubernetes at:
```http://34.196.44.223:32484/createStudentSurvey or http://34.196.44.223:32484/getStudents``` 
