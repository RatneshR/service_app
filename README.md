# service_app
Service application in Spring 3.4.2 (Java)

## Running with Docker

This project includes a Docker setup for building and running the Spring 3.4.2 Java service. The provided `Dockerfile` uses Eclipse Temurin JDK 21 for building and JRE 21 for running the application. The service exposes port **8181**.

### Build and Run

To build and start the service using Docker Compose:

```sh
docker compose up --build
```

This will build the application image and start the `java-service_app` container, mapping port 8181 on your host to the service.

### Configuration
- **Port:** The application runs on port `8181` (as set in `application.properties` and exposed in the Dockerfile and compose file).
- **Environment Variables:** No required environment variables are set by default. You may uncomment and use an `.env` file in `docker-compose.yml` if needed for your setup.
- **Dependencies:** No external services (databases, caches, etc.) are required or configured by default.

No additional configuration is needed for a basic run. For customizations, edit the `docker-compose.yml` or `application.properties` as needed.
