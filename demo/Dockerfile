# Use official Java runtime
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy Maven wrapper and project files
COPY . .

# Build the application
RUN ./mvnw clean package -DskipTests

# Expose the port Render provides
EXPOSE 8080

# Run the jar file
CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]
