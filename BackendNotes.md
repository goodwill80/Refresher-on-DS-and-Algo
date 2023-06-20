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
