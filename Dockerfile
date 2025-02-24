FROM eclipse-temurin:17

LABEL mentainer="saurabhdorle02@gmail.com"

WORKDIR /myapp

COPY target/JPADemo-0.0.1-SNAPSHOT.war /myapp/JPADemo-docker.war

EXPOSE 8080

ENTRYPOINT ["java", "-jar","JPADemo-docker.war"]
