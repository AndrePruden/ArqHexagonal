# ÍNDICE

## TECNOLOGÍAS UTILIZADAS

- Spring Boot 3.4.5
- Java 17
- Maven 3.9.9
- Docker

## ESTILO DE ARQUITECTURA
- Microservicios

## PATRÓN DE ARQUITECTURA
- Hexagonal
  - application
  - domain
  - infrastructure

## ESTRUCTURA DEL PROYECTO


## DOCUMENTACIÓN
http://localhost:<PORT>/swagger/index.html

## BASE DE DATOS
- MySQL

## CÓMO LEVANTAR EL PROYECTO
- Terminal:
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```
  o
    ```bash
    ./mvnw clean install
    ./mvnw spring-boot:run
    ```

## CÓMO CONSTRUIR LA IMAGEN
    ```bash
    mvn package
    docker build -t billing:latest .
    ```

## CÓMO EJECUTAR EL CONTENEDOR CON DOCKER COMPOSE
    ```bash
    docker compose up
    ```
