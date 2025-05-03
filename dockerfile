# Étape de construction
FROM eclipse-temurin:21-jdk-jammy as builder
WORKDIR /hackverse
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
COPY src ./src
RUN ./mvnw package -DskipTests

# Étape d'exécution
FROM eclipse-temurin:21-jre-jammy
WORKDIR /hackverse
COPY --from=builder /hackverse/target/*.jar hackverse.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "hackverse.jar"]