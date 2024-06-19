# users-api
API Endpoints:

/api/user/register [ POST ]
/api/user/fetch [ GET ]
Requirement:

/api/user/register
POST api
Implement an endpoint to register new users.
The endpoint should accept a JSON request body containing the user's details (e.g., username, email, password).
Store the user's information securely in the database or any other storage mechanism of your choice, in-memory storage in any data structure will also work.
Return appropriate responses to indicate success or failure of the registration process.
/api/user/fetch
GET api
Implement an endpoint to fetch user details.
The endpoint should accept query parameter username
fetch the users information securely from database or any other storage mechanism of your choice , in-memory storage in any data structure will also work
Return appropriate responses to indicate success or failure of the user fetch process.
Guidelines:

Use Spring Boot to build the RESTful API.
Implement proper exception handling and use security best practices to protect sensitive user data and prevent potential vulnerabilities. (If implementation is complex/time consuming, documenting the idea as a TODO for the API is fair enough.)
Write unit tests to ensure the correct behaviour of the registration endpoint. (optional)
Document the API using Swagger or an alternate documentation tool you know of. (optional)
