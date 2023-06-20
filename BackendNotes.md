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