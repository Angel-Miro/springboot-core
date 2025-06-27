# springboot-core

## SB= SPRINGBOOT, FWK = SPRING FRAMEWORK
- SB 3 | FWK 6 | jdk17+
- SB 2 | FWK 5 | jdk8+
- SB 1 | FWK 4 | jdk6,7, 8


### -----------------------------------------------------------------------------------------

#### DAO (DATA ACCESS OBJECT)
    Es un patrón de diseño que provee una interfaz para obtener la infromación de la BD, 
    la principal diferenca es que ayuda a separar el acceso de datos a la capa de negocio

#### DTO (DATA TRANSFER OBJECT)
    Es un objeto que se usa para poder generar un objeto diferente al que se recupere de la bd, o bien
    que contenga formatos diferentes(se usa entre procesos).


## Anotaciones Spring


### Stereotypes : Son las anotaciones básicas del core de spring:
     @Component   : La anotación mas genérica, hace una clase en un bean
     @Repository  : Anotación para la capa de persistencia
     @Service     : Anotación que denota lógica de negocio
     @Controller  : Anotación para indicar un controlador
    
    -------------------------------------------------------------------------------------
    @RequestParam : Dato que se envia para busqueda
        http://localhost:9090/cd/get-all-request-param?anio=2005 , donde ?anio=2005 es para pasar el valor a buscar
        - required [true, false]
        - defaultValue [value default]

    @PathVariable : Dato que forma parte de la url
        http://localhost:9090/cd/get-cd-path-variable/1993

    @RequestBody: Sirve para indicar que recibira un cuerpo, normalmente en JSON

## @RestController : Es una anotación que combina @Controller y @ResponseBody
     Dando como resultado la salida como JSON, utilizando la librería jackson

### @Primary : Sirve para especificar que implementación utilizar

### Scopes : Se anota la clase con @Scope("singleton/prototype"), el scope por defecto es el Singleton
    Singleton : misma referencia en memoria
    Prototype : se genera uno cada vez que se manda a llamar

