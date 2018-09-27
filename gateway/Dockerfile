FROM java:8-jre

ADD ./target/gateway.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/gateway.jar"]

HEALTHCHECK --interval=10s --timeout=10s CMD curl -f http://localhost:4000/actuator/health || exit 1

EXPOSE 4000