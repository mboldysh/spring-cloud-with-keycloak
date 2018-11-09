# Spring Cloud With Keycloak

## Development Setup

Before you start export environment variable:

```console
export CONFIG_SERVICE_PASSWORD
```

For correct local keycloak work you should add the following to /etc/hosts

```console
127.0.0.1 localhost gateway keycloak
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

Kibana default index pattern - cloud-*

### Important endpoints
- http://localhost:4000 - Gateway
- http://localhost:8888 - Config Service
- http://localhost:8761 - Eureka Dashboard
- http://localhost:8080 - Keycloak
- http://localhost:9200 - Elasticsearch
- http://localhost:5601 - Kibana
