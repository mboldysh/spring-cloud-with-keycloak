FROM java:8-jre

ADD ./target/discovery.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/discovery.jar"]

HEALTHCHECK --interval=10s --timeout=10s CMD curl -f http://localhost:8761/actuator/health || exit 1

EXPOSE 8761