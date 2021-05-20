
Steps done to load this project in LAMBDA and test it

1. Uploaded the zip file lambda-aws-practice-0.0.1-SNAPSHOT-aws.jar to LAMBDA
2. After that, we need to indicate in the Handler field the fully-qualified name of the class that implements SpringBootRequestHandler, so for this project it is org.practice.functional.MyStringHandlers
3. Go to configuration and add the environment variable as FUNCTION_NAME=uppercase
4. Then go to Test tab and click on test button by giving a string value



Reference links 

https://www.baeldung.com/spring-cloud-function

https://github.com/awslabs/aws-serverless-java-container/tree/master/aws-serverless-java-container-jersey