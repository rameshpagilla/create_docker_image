FROM openjdk:17
LABEL authors="Ramesh"
EXPOSE 8080
ADD target/create_docker_image-0.0.1-SNAPSHOT.jar create_docker_image-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","/create_docker_image-0.0.1-SNAPSHOT.jar"]