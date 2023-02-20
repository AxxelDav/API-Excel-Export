# API-Excel-Export


#### Aplicacion que consume examenes de una Base de Datos y permite exportarlos en un archivo Excel en forma de tabla y con estilos: Hecha con Spring Boot, Apache POI, y MySQL
Ademas tiene la funcionalidad de Leer un archivo Excel desde una ruta especifica y persistirlo en la Base de Datos.

Tecnologias utilizadas:
- Java
- Spring Boot
- Maven
- JPA
- Apache POI
- MySQL
- POSTMAN
- Testing Unitario (JUnit y Mockito)

## Endpoints

**Descarga Listado de Examenes:**

`http://localhost:8082/descarga/examenes`


**Importar/Persistir Tabla Excel:**

`http://localhost:8082/importar/archivoExcel`


