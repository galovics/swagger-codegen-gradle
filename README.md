# Swagger Codegen with Gradle setup
## Introduction
The project shows an example how you can use Swagger Codegen in a Gradle environment 
to generate code from the contract. There is also a related article with more details:
https://blog.arnoldgalovics.com/series/swagger-codegen-with-gradle/

## Structure
There are 2 main projects, there is one for the code generation called ```user-service-contract```
and there is a Spring Boot application called ```user-service``` which is using the generated 
code from the contract.

## Execution
In the contract project, execute

```./gradlew clean build install```

Now you can simply run the backend service itself with executing

```./gradlew clean build bootRun```

