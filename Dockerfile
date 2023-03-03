FROM openjdk:11
ADD target/app.jar app.jar
CMD ["java","-jar","/app.jar"]