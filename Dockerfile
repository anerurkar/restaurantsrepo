FROM openjdk:17
ADD target/foodapp-restaurant-service.jar foodapp-restaurant-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","foodapp-restaurant-service.jar"]
