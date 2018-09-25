FROM java:8-jre

ADD ./target/test-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/test-service.jar"]

EXPOSE 8000