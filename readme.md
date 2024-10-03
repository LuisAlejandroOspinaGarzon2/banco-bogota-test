# Proyecto Banco Bogotá

Este proyecto está compuesto por dos partes principales:
1. **Backend**: Un servicio REST desarrollado en Spring Boot.
2. **Frontend**: Una aplicación web desarrollada en Angular.

A continuación, se detallan los pasos para ejecutar ambos componentes.

## Requisitos previos

Antes de ejecutar el proyecto, asegúrate de tener instalados los siguientes programas:

- **Java 17**
- **Maven**
- **Node.js** y **npm**
- **Angular CLI**

## Ejecución del Backend

### Ubicación:
Debes estar ubicado en el siguiente directorio:
banco-bogota/backend/cliente-rest-service

### Comandos:

1. **Instalar dependencias**
   mvn clean install
2. **Ejecutar la aplicación**
mvn spring-boot:run

El backend se ejecutará en el puerto 8090. Puedes verificarlo accediendo a http://localhost:8090.

## Ejecución del Frontend

### Ubicación:
Debes estar ubicado en el siguiente directorio:
banco-bogota/frontend

### Comandos:
1. **Instalar dependencias**
npm install
2. **Ejecutar la aplicación**
ng serve

El frontend estará disponible en el puerto 4200. Puedes acceder a la aplicación en http://localhost:4200.