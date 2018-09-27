# Spring Cloud With Keycloak

## Development Setup

Before you start export environment variable:

```console
export CONFIG_SERVICE_PASSWORD
```

Build and run project:

```consloe
# build project
mvn clean package
# run
docker-compose up
```

To rebuild docker images use:

```console
docker-compose build
``` 

### Important endpoints
- http://localhost:4000 - Gateway
- http://localhost:8761 - Eureka Dashboard