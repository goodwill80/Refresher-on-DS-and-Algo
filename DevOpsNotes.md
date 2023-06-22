What is the difference between Agile and Waterfall methodologies?

- AGILE : Project management by breaking it up into phrases. Each phase or stage involves close and continuous collaboration between stakeholders.

- WATERFALL : A clearly defined sequence of execution with project phases that do not advance until a phase receives final approval. Once a phase is completed, it can be difficult and costly to revisit a previous stage. (1. Requirement Gathering, 2. Design, 3. Implementation, 4. Test and Verifications, Deployment & Maintainance)

a. Waterfall is sequential and linear (one needs to be completed 1st b4 moving to another), while Agile is flexible and adapt to changing requirements during development process

b. Waterfall is more rigid and less flexible and can be time consuming and costly.

c. Waterfall involves less customer involvement and only covers initial requirement gathering and reviewing the final product. While agile emphasize on close collaboration with the customer at every phase, and customer is involves in prioritising feedback and reviews.

d. Waterfall emphsize more on documentation, while agile emphasize more on working software.

Explain Scrum in your own terms. What are the artifacts and rituals related to Scrum?

- Scrum is an Agile methodology that is widely used for managing and organizing software development projects. It provides a flexible and iterative approach to project management, allowing teams to deliver working software in shorter timeframes while adapting to changing requirements. Scrum Team: A Scrum team is a self-organizing and cross-functional group of individuals responsible for delivering the software increments. The team typically consists of a Product Owner, a Scrum Master, and the Development Team. The team collaboratively works together to achieve the project goals.

What is XSS and how can it be prevented?

- Cross-Site Scripting (XSS) attacks are a type of injection, in which malicious scripts are injected into otherwise benign and trusted websites. XSS attacks occur when an attacker uses a web application to send malicious code, generally in the form of a browser side script, to a different end user. Flaws that allow these attacks to succeed are quite widespread and occur anywhere a web application uses input from a user within the output it generates without validating or encoding it.

Explain Dev Ops.
- DevOps is the combination of cultural philosophies, practices, and tools that increases an organization’s ability to deliver applications and services at high velocity: evolving and improving products at a faster pace than organizations using traditional software development and infrastructure management processes. This speed enables organizations to better serve their customers and compete more effectively in the market.
- Under a DevOps model, development and operations teams are no longer “siloed.” Sometimes, these two teams are merged into a single team where the engineers work across the entire application lifecycle, from development and test to deployment to operations, and develop a range of skills not limited to a single function.

List the Benefits of DevOps.
- Speed: Move at high velocity so you can innovate for customers faster, adapt to changing markets better, and grow more efficient at driving business results.
- Reliability: Ensure the quality of application updates and infrastructure changes so you can reliably deliver at a more rapid pace while maintaining a positive experience for end users. Use practices like continuous integration and continuous delivery to test that each change is functional and safe. Monitoring and logging practices help you stay informed of performance in real-time.
- Improved Collaboration: Build more effective teams under a DevOps cultural model, which emphasizes values such as ownership and accountability. Developers and operations teams collaborate closely, share many responsibilities, and combine their workflows.

What is velocity?
- In Agile software development, velocity refers to a metric that measures the amount of work a development team can complete during a sprint. It is a key indicator of the team's productivity and helps in planning future sprints.
- Velocity is typically measured in story points, which are assigned to user stories or tasks during the estimation process. The team determines how many story points they can complete within a single sprint based on their past performance and historical data. The velocity is calculated by summing up the story points of all completed work items in a sprint.

Explain Continuous Integration.
- Continuous integration is a software development practice where developers regularly merge their code changes into a central repository, after which automated builds and tests are run. The key goals of continuous integration are to find and address bugs quicker, improve software quality, and reduce the time it takes to validate and release new software updates.
- With continuous integration, developers frequently commit to a shared repository using a version control system such as Git. Prior to each commit, developers may choose to run local unit tests on their code as an extra verification layer before integrating. A continuous integration service automatically builds and runs unit tests on the new code changes to immediately surface any errors.
- With continuous delivery, code changes are automatically built, tested, and prepared for a release to production. Continuous delivery expands upon continuous integration by deploying all code changes to a testing environment and/or a production environment after the build stage.
- Improve Developer Productivity
- Find and Address Bugs Quicker
- Deliver Updates Faster

Explain Continuous Delivery.
- Continuous delivery is a software development practice where code changes are automatically built, tested, and prepared for a release to production. It expands upon continuous integration by deploying all code changes to a testing environment and/or a production environment after the build stage. When continuous delivery is implemented properly, developers will always have a deployment-ready build artifact that has passed through a standardized test process.
- With continuous delivery, every code change is built, tested, and then pushed to a non-production testing or staging environment. There can be multiple, parallel test stages before a production deployment. The difference between continuous delivery and continuous deployment is the presence of a manual approval to update to production. With continuous deployment, production happens automatically without explicit approval.
- Automate the Software Release Process
- Improve Developer Productivity
- Find and Address Bugs Quicker
- Deliver Updates Faster

What is containerization?
- Containerization is a software deployment process that bundles an application’s code with all the files and libraries it needs to run on any infrastructure. Traditionally, to run any application on your computer, you had to install the version that matched your machine’s operating system. For example, you needed to install the Windows version of a software package on a Windows machine. However, with containerization, you can create a single software package, or container, that runs on all types of devices and operating systems.
- Containerization involves building self-sufficient software packages that perform consistently, regardless of the machines they run on. Software developers create and deploy container images—that is, files that contain the necessary information to run a containerized application. Developers use containerization tools to build container images based on the Open Container Initiative (OCI) image specification. OCI is an open-source group that provides a standardized format for creating container images. Container images are read-only and cannot be altered by the computer system.
- Portability
- Scalability
- Tech - Docker, Linux, Kubernetes

What is some steps involved in CI?
- Version Control: Developers work on their local branches and commit changes to a version control system (e.g., Git). They should regularly pull the latest changes from the main repository.
- Automated Build: A CI server, such as Jenkins or Travis CI, monitors the repository for changes. When changes are detected, it triggers an automated build process.
- Compilation: The CI server fetches the latest code from the repository and performs a compilation step to ensure the code compiles successfully.
- Automated Tests: The CI server runs a suite of automated tests, including unit tests, integration tests, and possibly other types of tests. The tests help ensure that the code changes have not introduced any regressions or issues.
- Deployment (Optional): In some cases, the CI server may be configured to automatically deploy the build artifacts to a staging environment or another target environment for further testing or user acceptance.

What are secrets and what the risks involved with unprotected secrets?
- A cyber security best practice for digital businesses, secrets management allows organizations to consistently enforce security policies for non-human identities. Secrets management provides assurance that resources across tool stacks, platforms and cloud environments can only be accessed by authenticated and authorized entities.

What is HTTP & HTTPS?
- HTTP (Hypertext Transfer Protocol) and HTTPS (Hypertext Transfer Protocol Secure) are protocols used for communication between web browsers and web servers. They define the rules and standards for transmitting data over the internet.
- HTTP is the foundation of data communication on the World Wide Web. It is a protocol that allows clients (web browsers) to request resources from servers and receive responses. HTTP operates over TCP/IP and typically uses port 80.
- When you type a website URL in your browser's address bar and hit Enter, the browser sends an HTTP request to the server hosting that website. The server processes the request and sends back an HTTP response containing the requested data, such as HTML, images, or other resources. This back-and-forth communication enables the browser to render and display the website content.
- HTTP is a stateless protocol, meaning each request-response cycle is independent and does not maintain any memory of previous interactions. This limitation makes it challenging to handle certain scenarios that require maintaining user sessions or storing data between requests.
- HTTPS is an extension of HTTP that adds an extra layer of security through encryption. It uses SSL (Secure Sockets Layer) or TLS (Transport Layer Security) protocols to establish a secure, encrypted connection between the client and the server. HTTPS operates over TCP/IP and typically uses port 443.
- When you visit a website that uses HTTPS, your browser establishes a secure connection with the server before sending any HTTP requests. This secure connection ensures that the data transmitted between the client and the server is encrypted and cannot be easily intercepted or tampered with by attackers.
- In summary, HTTP is the standard protocol for web communication, while HTTPS adds encryption and security features to protect the data transmitted between clients and servers. As web security has become increasingly important, HTTPS is widely adopted to safeguard user privacy and secure online transactions.


What is the benefits of HTTPS?
- Data Confidentiality: Encryption protects the privacy of sensitive data exchanged between the client and the server.
- Data Integrity: Integrity checks ensure that data remains intact and unaltered during transmission.
- Authentication: HTTPS verifies the authenticity of the server, preventing impersonation or man-in-the-middle attacks.
- Trust and Website Security: HTTPS uses digital certificates issued by trusted Certificate Authorities (CAs), assuring visitors that they are communicating with the intended and legitimate website.


What is session management?
- Session management refers to the process of managing and maintaining user sessions in a web application. A session is a period of interaction between a user and a web application, starting from the time the user logs in or visits the site until they log out or their session expires.
- Session management is essential for maintaining user state and providing personalized and secure experiences. It involves various mechanisms and techniques to track and manage user sessions. Here are some key aspects of session management:
- 1. Session Identification: Each user session needs a unique identifier to differentiate it from other sessions. This identifier, typically called a session ID, is generated by the server and associated with the user's session.
- 2. Session Creation and Termination: When a user visits a web application, a session is created for them. The session is terminated when the user logs out, closes the browser, or after a certain period of inactivity. Proper session termination is crucial to prevent unauthorized access and protect user data.
- 3. Session Data Storage: Session data includes information specific to a user's session, such as user preferences, shopping cart contents, authentication status, and other relevant data. This data needs to be stored securely and associated with the corresponding session ID.
- 4. Session Tracking: The server needs a way to associate incoming requests with the correct session. Commonly, session tracking is done using cookies or URL rewriting. Cookies store the session ID in the user's browser, while URL rewriting appends the session ID to the URLs.
- 5. Session Expiration and Timeout: To ensure security and efficient resource utilization, sessions should have an expiration mechanism. Sessions may expire after a certain period of inactivity or after a predetermined duration. When a session expires, the user is typically required to re-authenticate.
- 6. Session Security: Session management plays a critical role in ensuring the security of user sessions. It involves protecting session data from unauthorized access or tampering, preventing session hijacking or fixation attacks, and implementing secure session storage mechanisms.
- 7. Session Persistence: In distributed web applications, session data may need to be shared across multiple servers or instances. Techniques such as session replication or session clustering are employed to maintain session persistence and consistency across different nodes.
- Effective session management is crucial for providing a seamless and secure user experience in web applications. It involves proper handling of session data, secure session tracking, and robust security measures to protect against session-related vulnerabilities.