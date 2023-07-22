# Spring-boot-Course-API

# Spring MVC

Looks at incoming request, scans class path and maps it to appropriate controller and method. takes response from Http method and converts to json and returns it.

## Basic Flow of Http request

Request from Client  < - > Controller < - > Business Service < - > Database

# Business Service

@Service

Application startsups, its gonna look at all classes with @Service annotation in class path and it will create an instance of all those classes and registers it.

In any other class such as controllers, if you need service, Spring boot provides created singleton instance by dependency injection. You declare dependency by @Autowired.

# JPA

Java Persistence API - Its a specification that lets you to ORM when you are connecting to a database

Obect Relational Mapping ( Class ↔ Table ) - It lets you map entity classes into SQL tables so that when you connect to database you provide some kind of metadata on entity classes so that you dont have to query and mapping yourself. 

# Spring Data JPA

@Entity - creates a table corresponding to class

@Id - creates a primary key corresponding to member variable of class

CrudRepository<Entity, type of Id entity class has>  

——> Interface which came out of box providing all crud operations on entity

Extend your own repository interface from CrudRepository and all crud operations can be handled.

→ Add relationships between entities by @ManyToOne or @OnetoMany
→ Declare custom methods in repository interface. here name is important narrow down the name to property by which you are filtering
→ Use the method in service and give results to controller.

# Package and Deploy

mvn clean install

java -jar target/course-api-data-1.0-SNAPSHOT.jar
