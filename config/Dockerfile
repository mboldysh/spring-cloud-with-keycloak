FROM java:8-jre

ADD ./target/config.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/config.jar"]

HEALTHCHECK --interval=10s --timeout=5s --start-period=15s CMD curl -f http://localhost:8888/actuator/health || exit 1

EXPOSE 8888