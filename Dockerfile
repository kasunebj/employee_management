# Use a lightweight base image with Java support
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot jar file into the container
COPY target/employee-management-docker.jar employee-management-docker.jar

# Expose the port your Spring Boot application runs on
EXPOSE 8080

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "employee-management-docker.jar"]
