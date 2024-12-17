FROM openjdk:17
ADD target/restaurant-service.jar restaurant-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","restaurant-service.jar"]
