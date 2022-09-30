# Task
Springboot
This project is based on Rest-API and Database developed using springBoot framework.

Requirements
For building and running the application you need:
    1) JDK 8.0
    2) Maven 3

How it works:
The application uses Spring Boot(Web).
And the code is organised as:
    1) application is services for querying the data transfer objects
    2) infrastructure contains all the implements classes as the technique details

Darabase
It uses a H2 in memory database(for easy local test), can be changed easily in the application.properties for any other database.

Getting Started

You'll need Java 8 installed

To test that it works, open a postman at  http://localhost:8080/products.
About the code:
This project entity having different layers like:
 1) project:
	This is entry point of project.
 
 2) application.properties:
	This class contains database connectivity code, where it uses H2 database.
	  (url, driverClassName, username, password, 
	   hibernate jpa's: sql, ddl.auto, console and path)

 3) controller:
	In this layer we can perform CRUD(create, read, update, delete) operations
	  as the requirement of the project. It having methods, mapping using annotations
	  for several operations.
    
  4) model:Using model class we connecting modules
  
   5) service:
	Using service interface we  storage, retrival, update, delete operations. 
  
  How to run the project:
 1) download project using link goven below:
   https://github.com/Rohan7171/Task
 2) import the downloaded project in Eclipse(it will automaticallly download dependencies as it needs).
 3) open the class Application.java and run the project as java application.
 4) you need a postman application to perform queries, 
    use the link: http://localhost:8080/products.
 5) You can put Json query as shown below
  ex{
        "pid": 1001,
        "pname": "Lenovo Yoga",
        "ptype": "Laptop",
        "pcategory": "Electronics",
        "pprice": 45000
    }
