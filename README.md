# Crud Fullstack con Java y Angular(Backend)

## Descripción

Este es un proyecto de Java Spring Boot que sirve como backend para una futura aplicación web. El proyecto está diseñado para proporcionar una arquitectura robusta y escalable para el desarrollo de aplicaciones web modernas. Actualmente, el repositorio solo contiene el backend, mientras que el frontend con Angular se incorporará en futuras actualizaciones.

## Tecnologías Utilizadas

- Java Spring Boot: Framework de desarrollo de aplicaciones Java para la creación de aplicaciones web y servicios RESTful.
- Spring Data JPA: Para la capa de persistencia y el acceso a datos.
- MySQL: Sistema de gestión de bases de datos relacional.
- Postman: Para testeo de la Api.

## Instalación y Uso

1. Clona este repositorio en tu máquina local.
2. Abre el proyecto en tu IDE favorito.
3. Configura la base de datos MySQL en el archivo `application-dev.properties`.
5. Ejecuta la aplicación desde tu IDE o mediante el comando `mvn spring-boot:run`.
6. La aplicación estará disponible en `http://localhost:8080`.

## Contribución

Si quieres contribuir a este proyecto, por favor sigue los siguientes pasos:

1. Realiza un fork del proyecto.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y haz commit de ellos (`git commit -am 'Agrega nueva funcionalidad'`).
4. Haz push de tu rama (`git push origin feature/nueva-funcionalidad`).
5. Abre un Pull Request.

## Pruebas con Postman

Para probar las API de este proyecto, puedes utilizar Postman, una herramienta muy útil para realizar solicitudes HTTP y probar APIs.

1. Descarga e instala [Postman](https://www.postman.com/downloads/), si aún no lo has hecho.
2. Abre Postman y crea una nueva colección.
3. Agrega las solicitudes HTTP que deseas probar, utilizando las URL y los métodos de tu API.
4. Configura las cabeceras y los parámetros según sea necesario.
5. Envía las solicitudes y verifica las respuestas para asegurarte de que la API funciona correctamente.

A continuación, se proporciona una breve descripción de cómo probar algunas de las funcionalidades principales:

- **Obtener todos los elementos:** 
    - Método: GET
    - URL: `http://localhost:8080/api/customers`
- **Crear un nuevo elemento:** 
    - Método: POST
    - URL: `http://localhost:8080/api/customers/create`
    - Cuerpo (JSON): 
    ```json
  {
        "firstname": "Mauro",
        "lastname": "Valerioti",
        "email": "mauro.valerioti.18@gmail.com"
    }
    ```
- **Actualizar un elemento existente:** 
    - Método: PUT
    - URL: `http://localhost:8080/api/customers`
    - Cuerpo (JSON): 
    ```json
  {
        "id": 1,
        "firstname": "Mauro",
        "lastname": "Valerioti",
        "email": "mauro.valerioti.18@gmail.com"
  }
    ```
- **Eliminar un elemento:** 
    - Método: DELETE
    - URL: `http://localhost:8080/api/customers/{id}`


