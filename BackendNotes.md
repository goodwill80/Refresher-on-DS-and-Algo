1. Difference between web server and app server?
    - Web server handle HTTP requests and serve static web content such as CSS, HTML, images or JS files. It is responsible for hosting and delivering web content to clients upon request.
    - App server provides a runtime environment for executing application logic. It is capable of hosting dynamic web application and server side code. In addition to HTTP requests, app server provides DB connectivity, security, session and transaction processing.
    - Web server can host and serve static web pages and files. It can handle basic server-side scripting using technologies like CGI (Common Gateway Interface) or serve pre-generated content. However, it relies on external components or frameworks to execute complex server-side application logic.
    - App server is designed to host and execute full-fledged web applications. It provides an integrated environment that supports server-side scripting, dynamic content generation, business logic execution, and communication with other systems and services.
    - Web servers generally support a range of programming languages for basic server-side scripting, such as PHP, Perl, Python, or server-side JavaScript (Node.js).
    - App servers typically support a wider range of programming languages and frameworks, including Java EE (Enterprise Edition), .NET, Python, Ruby, and more. They provide runtime environments and services specific to these languages/frameworks.

2. Please describe any application architecture you may have come across, a simple one will do or describe your understanding of an architecture?
    - A blueprint/Layout of how the web app is structured.
    - Web App architecture describe major components, their relationships and how they interact with each other. Server contains all business logic
    - Client Server architecture (Most common) - Client > server > database all living their own, or 2-tier (Client-server and DB) / (Client and Server-DB)
    - Client Server architecture is subject to risk of single point of failure.
    - Peer-to-peer architecture (i.e. web3, blockchain) overcomes single point of failures as it consists of a network of peers-nodes which are both clients and servers, without a centralised server.
    - *** Monolithic structure - all codes into a single codebase tightly coupled. (Risk of single point of failure)
    - *** Microservice structure - every distinct feature of an application may have one or more dedicated microservice powering it. (collection of services that each serve a unique responsibility and live separately from one another but connected to each other. Hence, each service can be scale independently) - each service can have its own language, DB and libraries
    - *** Serverless structure / functions - is a design pattern where a microservice responsibility is hosted by a third-party (AWS Lambda, Azure, firebase cloud). Each serverless functions execute small blocks of codes.
    - Event-driven architecture is a way of building enterprise IT systems that lets information flow between applications, microservices, and connected devices in a real-time manner as events occur throughout the business.
    - An event is simply an action
    - An event notification is a message confirming an action has been taken. The notification may be a simple confirmation of the action or contain additional data about the event that downstream systems use to apply their business logic.
    - Because it's the event notification or message that's being handled in the system, event-driven architecture is sometimes referred to as message-driven architecture.
    - Event-driven architecture (EDA) is a system design practice built to record, transmit, and process events through a decoupled architecture. This means that systems don't need to know about each other to share information and accomplish tasks.
    - Decoupling is a central component of EDA, and it offers a major advantage versus other methods for sharing data such as APIs. When sending an API call, the application needs to know the dependencies and parameters so it can send a properly formatted request. It then waits for the response before proceeding. This also means that there will always be a request and a response to transfer data.

3. What is jUnit test?
- A unit test is a type of software testing that focuses on verifying the correctness of individual units of code, typically at the function or method level. The goal of unit testing is to isolate and test each unit of code in isolation to ensure that it behaves as expected and produces the desired output.
- Unit tests serve as a safety net during refactoring and code changes. If a unit test fails after modifying the code, it indicates that the changes might have introduced a regression, allowing developers to quickly identify and fix the issue.
- By writing and maintaining unit tests, developers can catch bugs early in the development process, improve code quality, facilitate easier maintenance, and increase confidence in the correctness of the software.
- Unit testing is just one aspect of a comprehensive testing strategy. Other types of testing, such as integration testing, system testing, and acceptance testing, complement unit testing to provide broader coverage and ensure the overall quality of the software.

4. What is Object Relational Mapping (ORM)?
- It is a technique use to map or persist application models (classes with its methods) to relational database tables. 
- It maps the fields/properties of classes to the columns of the tables
- It provides a convenient way of mapping objects to DB. Less code or SQL statements
- JPA provides ORM mapping in Java or spring boot to map data to DB
- JPA makes talking to the database very easy.

5. What is JPA? And what is Spring Data JPA?
- It is an API and acts like an interface
- It allows definition and mapping of entity with annotations like @entity @columns
- JPA stands for JAVA persistence API, it performs ORM mapping to relational Databases
- It maps the entity classes to seq tables, and provides some mata data and query methods on your entity classes so that you do not have to perform the query or mapping yourself.
- Spring Data JPA is an added layer on top of JPA that makes ORM mapping even easier
- Spring Data JPA add additional features to ORM mapping like creation of database query methods from method names
- Spring Data JPA provide a set of crud methods to interact with DB by simply extending to it i.e. Class Repo extends JPA<Student, ID>

6. What is Hibernate?
- Hibernate is the actual implementation of JPA.
- In short, it is a tool that provides the implementation of JPA. JPA is interface while Hibernate is implementation.
- It is the most mature JPA implementation 
- Spring boot by default choose hibernate

7. What is a Bean in Spring? 
- In the context of the Spring Framework, a bean refers to an object that is managed by the Spring IoC (Inversion of Control) container.
- A bean represents an instance of a class that is created, configured, and managed by the Spring container.
- Beans are defined and configured in the Spring configuration files or through annotations. @Bean
- By leveraging the Spring container and its bean management capabilities, developers can benefit from the flexibility, modularity, and testability provided by dependency injection. Beans in Spring facilitate the construction of modular and maintainable applications by promoting loose coupling and separation of concerns.

8. What is the Autowired annotation?
- It is part of Dependency injection. 
- It allows Spring to resolve and inject collaborating beans into our bean.
- It is denoted by @Autowired
- Example of injecting Service, repository component into the relevent beans
- The @Autowired annotation can be used to autowire bean on the setter method just like @Required annotation, constructor, a property or methods with arbitrary names and/or multiple arguments.

9. What is Dependency Injection?
- Dependency injection is the process of supplying a resource that a given piece of code requires. The required resource, which is often a component of the application itself, is called a dependency.

10. How is Maven used as a dependency manager for Java?
- Maven helps manage and enable dependencies to be made avail to the entire application
- It simplify and standardise the build process
- It is equivalent to NPM manager in JS
- Maven reach out to all dependencies listed in POM (Project Object Model) same as Package.json and inject them to the application

11. What is the Maven lifecycle?
- Maven is based around the central concept of a build lifecycle. What this means is that the process for building and distributing a particular artifact (project) is clearly defined. For the person building a project, this means that it is only necessary to learn a small set of commands to build any Maven project, and the POM will ensure they get the results they desired.
- There are three built-in build lifecycles: default, clean and site. The default lifecycle handles your project deployment, the clean lifecycle handles project cleaning, while the site lifecycle handles the creation of your project's web site.

12. What are some annotations used for requests and controllers?
- @Controller: This annotation is used to mark a class as a Spring MVC controller. It is typically placed on the class level.
- @RestController: This annotation combines the @Controller and @ResponseBody annotations. It is used for RESTful web services where the response is serialized directly to the HTTP response body.
- @RequestMapping: This annotation is used to map a URL pattern or path to a controller method. It can be applied at the class level and/or method level to specify the request mapping.
- @GetMapping, @PostMapping, @PutMapping, @PatchMapping, @DeleteMapping (Shortcut for @RequestMapping)
- @PathVariable: This annotation is used to bind a method parameter to a path variable in the URL.
- @RequestParam: This annotation is used to bind a method parameter to a query parameter or form parameter in the request.
- @RequestBody: This annotation is used to bind the request body to a method parameter.
- @RequestHeader: This annotation is used to bind a method parameter to a specific HTTP request header.
- @Valid: This annotation is used to trigger validation on a method parameter or a method return value.
  


13. What is normalization?
- refers to the process of organizing and structuring a database schema to eliminate data redundancy and improve data integrity. It involves applying a set of rules and guidelines to design a database schema that minimizes data duplication and ensures efficient storage, retrieval, and maintenance of data.
- First Normal Form (1NF): Ensures that each column in a table contains only atomic values (indivisible values) and there are no repeating groups or arrays.
- Second Normal Form (2NF): Builds upon 1NF and requires that every non-key column in a table is functionally dependent on the entire primary key, eliminating partial dependencies.
- Third Normal Form (3NF): Builds upon 2NF and ensures that there are no transitive dependencies, meaning that non-key columns should not depend on other non-key columns.

14. What are the 4 main operations that can be done with databases?
- The four main operations that can be performed with databases are often referred to as CRUD operations, which stands for Create, Read, Update, and Delete. These operations encompass the basic functionalities required for managing data in a database system:

15. Explain the different relationships in a relational database?
- One-to-One (1:1) Relationship -  Each employee has only one corresponding address, and each address is associated with only one employee.
- One-to-Many (1:N) Relationship - Each customer can have multiple orders, but each order is associated with only one customer.
- Many-to-One (N:1) Relationship - Multiple orders can be placed for the same product, but each order is associated with only one product.
- Many-to-Many (N:N) Relationship -  Each student can be enrolled in multiple courses, and each course can have multiple students enrolled.


Backend Services

16. What is REST and how is it implemented?
- defines a uniform interface that consists of a set of standard methods (HTTP verbs) to perform operations on resources. The commonly used HTTP methods include GET, POST, PUT, PATCH, and DELETE. Each method has a specific purpose and follows a consistent semantics.
- enable communication and data exchange between different systems.
- Stateless: Each request from the client to the server contains all the necessary information to understand and process it.
- REST is typically implemented using the HTTP protocol 
- Map HTTP methods to operations: Map the HTTP methods (GET, POST, PUT, PATCH, DELETE) to the operations on the resources. For example, GET retrieves a resource, POST creates a new resource, PUT updates a resource, and so on.
  What can requests contain?

17. What is the difference between PUT and PATCH?
- PUT is used to update or replace an entire resource with a new representation provided in the request payload. It requires the client to send a complete representation of the resource, including any unchanged fields.
- PATCH is used to partially update a resource with the changes specified in the request payload. It allows clients to send only the modified fields or properties, rather than the entire representation of the resource.

18. What is middleware used for?
- API middleware is a software component or layer that sits between the client and server, intercepting and processing API requests and responses. It provides a way to add additional processing, transformation, and validation logic to the API flow.
- Express for example is a middleware for nodeJS, which provides methods that help simplify the backend code
- Authentication and Authorization: Middleware can handle authentication and authorization processes to ensure that only authorized users or applications can access the API. It can validate access tokens, authenticate user credentials, enforce role-based access controls, and perform other security-related tasks.


19. What is multithreading and how is it achieved?
- CPU is the processor which uses processing units, known as cores, to process instructions
- Every core is a worker
- Every java code we write is sent over to the processor in the form of a thread (pathway or conveyor belt)
- Therefore, each of the cores execute the instructions provided by the threads
- Hence, the higher the cores the CPU has, the more threads or instructions you can process at the same time
- A Multi-threaded application runs on many threads, hence, different parts of the code are running on different threads
- It is important to note that by default, an application is single threaded.
- The thread the code runs on by default is call the MAIN THREAD
- Every application has a main thread

20. What are the limitation of single threaded application? 
- A single threaded application runs everything on a main thread
- A time intensive task will block other codes from running
- This is very inefficient as time intensive task should runs on a separate thread

21. What is concurrency?
- It means running the code, by performing more than 1 task at a time i.e. branching out different threads
- Multi-threading achieve concurrency
- This is done by creating threads, and running non-time intensive code on the main thread, and the time intensive ones on other threads
- Example Thread thread = new Thread(Runnable task)


22. What is JMS or Java Message Service?
- it is a Java API that enables applications to asynchronously send and receive messages. 
- It is just like a middleware, which is placed in the middle of components or clients. 
- It served as a middleman, where one component can publish a message to the broker
- While another component consumes the message from the broker
- Hence, the concept of a publisher and subscriber

