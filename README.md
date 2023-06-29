# springboot-core

### Con este proyecto se pretende mostrar los aspectos básicos de spring core.


## Stereotypes : Son las anotaciones básicas del core de spring:
     @Component   : La anotación mas genérica, hace una clase en un bean
     @Repository  : Anotación para la capa de persistencia
     @Service     : Anotación que denota lógica de negocio
     @Controller  : Anotación para indicar un controlador

### @Primary : Sirve para especificar que implementación utilizar

### Scopes : Se anota la clase con @Scope("singleton/prototype"), el scope por defecto es el Singleton
    Singleton : misma referencia en memoria
    Prototype : se genera uno cada vez que se manda a llamar

