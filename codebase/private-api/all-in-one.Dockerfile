FROM h2:tdev
RUN mkdir /app
ADD build/libs/private-api-*.jar /app/application.jar
ENTRYPOINT ["java", "-jar", "/app/application.jar"]