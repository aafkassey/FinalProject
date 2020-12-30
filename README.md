# FinalProject
A simple web application to store, create and reuse Pictionary Templates to play Pictionary games with friends, family and coworkers. 

### Uses
1. The user can create a new Game
2. User can look a list of Games already in the database
3. User can choose from a list of Games and view the specific details
  1. Details include the Games Title, Theme, Rules and Topics
4. Users can also wish to delete a Game
5. The home page gives the User all the instructions on how to navigate through the site

# Setup

### Pre-requisites

* Java 11
* Maven
* MongoDB

### Intellij Setup

1. Clone the project 
2. Import the project 
3. Make sure add it as a Maven project
4. Build the project and run the springboot project
  1. Make sure Mongo is running in the back-ground

### Necessary Commands

Running MongoDB
```
Navigate to the where MongoDB is installed. Navigate to /bin folder. Run below command to run the local server:
  - mongod.exe
```
Building the project

```
Maven command
-------------
  mvn clean install
```

Running the application

```
  mvn spring-boot:run
```

# Author and Developer

Annie Kassey
