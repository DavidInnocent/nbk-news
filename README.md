# NBK News Article Service

This is a sample Spring Boot application that demonstrates the use of various libraries to achieve code coverage, BDD
testing, mocking, and monitoring. The application exposes a REST API for getting news articles from news api .

### Development

The application was developed using Spring Boot version 2.5.4 and Java 17. The following libraries were used for the
different functionalities:

* Jacoco for code coverage: Jacoco is a code coverage library that was used to ensure that the codebase is well tested.
  The library was integrated with Maven to generate code coverage reports after each test run. The reports were useful
  in identifying areas of the code that required additional tests.

* JUnit Vintage and Cucumber for BDD testing: JUnit Vintage was used for unit testing while Cucumber was used for BDD
  testing. The combination of these two libraries ensured that the code was thoroughly tested at all levels. Cucumber
  helped in defining user scenarios and executing them in a readable and understandable format.

* Mockito for mocking: Mockito is a mocking library that was used to create test doubles for dependencies. The library
  helped in isolating the code under test from external dependencies, making the tests faster and more reliable.

* Prometheus for monitoring: Prometheus is a monitoring library that was used to monitor the performance of the
  application. The library was integrated with Spring Boot Actuator to expose metrics and enable the application to be
  monitored in real-time.

### Project Structure

The project follows a standard Spring Boot application structure. The main components are:

* controller: The controller define the REST API endpoints and map incoming requests to the corresponding service
  methods.

* service: The service contain the business logic of the application. They are responsible for validating input,
  interacting with the data layer, and returning responses to the controllers.

* repository: The repository are responsible for interacting with the database. They fetch data directly from external
  services to provide a simplified interface for api operations.

* entity: The entity define the data structures used in the application.

* DTO: currently not available.

* tests: The tests contain the unit tests and BDD tests for the application. They are located in the src/test directory.

### Building and Running the Application

To build and run the application, follow these steps:

1. Clone the repository to your local machine.
2. Navigate to the root directory of the project.
3. Run the following command to build the application:
```
mvn clean install
```
4. Run the following command to start the application:

```
java -jar target/news-0.0.1-SNAPSHOT.jar
```
5. The application will start on port 8888. You can access the REST API by using the shared Postman Collection.

### Code Coverage

To generate the code coverage report, run the following command:

```
mvn jacoco:report
```

### Monitoring

To monitor the application, navigate to http://localhost:8888/actuator/prometheus to view the exposed Prometheus
metrics.

### Conclusion

This is just a sample and some features such as Web security,running all unit test for all layers, no persistence
implementation,no implementation for microservices e.g. No use of Spring cloud to create the service.