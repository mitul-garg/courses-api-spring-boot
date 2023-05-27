# Courses API

Courses API is a basic CRUD API for seeing, adding, deleting and updating courses.

## API Endpoints

- <em>GET /home</em> : Home Page
- <em>GET /courses</em> : Get All Courses
- <em>GET /courses/{courseId}</em> : Get a specific course with courseId
- <em>POST /courses</em> : Add a new course with JSON body containing the attributes - id, title, description
- <em>PUT /courses</em> : Update a course with JSON body containing the same attributes as described above
- <em>DELETE /courses/{courseId}</em> : Remove a course with the specified courseId

## Steps to Launch

- Download [Spring Tool Suite (STS)](https://spring.io/tools)
- Download [MySQL8 Installer 8.0.33](https://dev.mysql.com/downloads/installer/)
- Once MySQL is installed, open MySQL 8.0 Command Line Client
- Create a database named "spring"
- Open springrest in STS
- Run the project as Spring Boot Application
- Send requests to localhost:9090

## Technologies Used

- Spring Boot
- MySQL
