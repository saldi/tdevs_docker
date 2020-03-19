FROM openjdk:14-alpine
RUN mkdir /app
ADD app/users-api*.jar /app/application.jar
RUN mkdir /conf
VOLUME /conf
EXPOSE 8080
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/application.jar", "--spring.config.location=file:/conf/application.properties"]