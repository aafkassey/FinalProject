# FinalProject
A simple web application to store, create and reuse Pictionary Templates to play Pictionary games with friends, family and coworkers. 

**Link to the code base -> https://github.com/aafkassey/FinalProject**

Video Presentation link -> https://youtu.be/pVcFB7QbQvs 

[![Video Presentation](https://i9.ytimg.com/vi/pVcFB7QbQvs/mq1.jpg?sqp=CJyltf8F&rs=AOn4CLC5VdSDePMzM2zgwSEW4F2l432ZhQ)](https://youtu.be/pVcFB7QbQvs)

### Uses
1. The user can create a new game
2. User can look a list of games already in the database
3. User can choose from a list of games and view the specific details
  1. Details include the Games Title, Theme, Rules and Topics
4. Users can also wish to delete a game
5. The home page has all the instructions on how to navigate through the site

# Setup

### Technologies used
* Java, Spring Boot - Backend server code, uses embedded Tomcat
* MongoDB - To store, retrieve and delete data from database
* HTML, CSS, Thymeleaf, Bootstrap - Front-end development code
* Tiny bit of JQuery

#### CSS Styles

**W3Schools open stylesheet layouts are used for this project. Below is the line of code included in all the .HTML files**

``` <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css"> ```

### Pre-requisites

* Java 11
* Maven
* MongoDB

*Java 11, Maven and MongoDB have to be installed on the computer inorder to run the project*

### Clone the project

* HTTPS -> https://github.com/aafkassey/FinalProject.git
* SSH -> git@github.com:aafkassey/FinalProject.git

```
  git clone https://github.com/aafkassey/FinalProject.git
```

### Intellij Setup

1. Clone the project 
2. Import the project 
3. Make sure to add it as a Maven project by right clicking on *pom.xml*
4. Build the project and run the springboot project (Refer to Commands sections)
  1. Make sure Mongo is running in the back-ground
  2. The default port Mongo runs on is 27017

### Commands

Run MongoDB
---------------

Navigate to where MongoDB is installed. Navigate to /bin folder. Run below command to run the local server:

```
  mongod.exe
```

Build project
--------------------

```
Maven command
-------------
  mvn clean install
```

Run application
-----------------------

```
  mvn spring-boot:run
```

Once springboot is up, it is initialized on port 8080. 

Access website
---------------
Make sure the welcome page is mapped. You should see this in the logs:
```
  Adding welcome page: class path resource [static/index.html]
```

Link -> http://localhost:8080/index.html 

**Sprinboot app won't come up if MongoDB is not running**

# Author and Developer

**Name:** Annie Kassey
