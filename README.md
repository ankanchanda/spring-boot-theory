## Servlet and Servlet Container
- provide foundations for building web applications
- servlet is a java class, which handles client request, process it and return the response
- and servlet container are the ones which manages the servlets

![alt text](assets/servlets.png)

Spring framework solve challenges which exists with Servlets
- Removal of web.xml
    - the web.xml overtime becomes too big and becomes very difficult to manage and understand
    - Spring framework introduced annotations based configurations

- Inversion of Control(IOC)
    - Servlets depends on servlet container to create object and maintain its lifecycle
    - IOC is more flexible way to manage object dependencies and its lifecyle(through dependency injection)
    - Dependency Injection is the implementation of IOC

    User class: <a href="inversion_of_control/User.java">User.java</a><br>
    Payment class: <a href="inversion_of_control/Payment.java">Payment.java</a>

    Payment class is creating an instance of User class and there is one Major problems with this and i.e. Tight Coupling, payment class is tightly coupled with User class

    How?<br>
    -> Suppose I want to write Unit test cases for Payment "getSenderDetails()" method but now I cannot easily mock "User" object as Payment class is creating new object of User, so it will invoke the method of User class too

    @Component -> tells Spring that you have to manage this class or bean<br>
    @Autowired -> tells spring to resolve and add this object dependency

- Unit Testing is much harder
    - As the object creation depends on the Servlet, mocking is not easy, which makes unit testing harder
    - Spring dependency injection facility makes the unit testing very easy

- Difficult to manage REST APIs
    - Handling different HTTP methods, request parameters, path mapping make code little difficult to understand
    - Spring MVC provides an organised pproach to handle the requests and its easy to build RESTful APIs

- Integration with other technologies
    - like hibernate, adding security etc.

## Spring framework
![alt text](assets/spring_framework.png)

Spring boot solve challenges which exists with Spring MVC
- Dependency Management: No need for adding different dependencies separately and also their compatible version headache
- AutoConfiguration: No need for separately configuring "DispatcherServlet", "AppConfig", "EnableWebMvc", "ComponentScan". Springboot add internally by-default
- Embedded Server: In traditional Spring MVC application, we need to build WAR file which is a packaged file containing application's classes, JSP Pages, configuration files and dependencies. Then we need to deploy this WAR file to servlet container like Tomcat. But in Springboot, Servlet container is already embedded, we don't have to do all this stuff, just run the application that's all.

So what's Springboot?
- It provides a quick way to create a production ready application.
- It is based on Spring framework
- It supports Convention over Configuration
    - Use default values for configuration and if developer do not want to go with the convention, they can override it.
- It also helps to run an application as quick as possible

## Layered Architecture
![alt text](assets/layered_architecture.png)

### DTO(Data Transfer Object)