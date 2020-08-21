# Calculadora Estadística Web

> Arquitecturas Empresariales

> Laboratorio 2

> Heroku: Intérpretes, canales de comunicación y memoria

Este repositorio contiene la implementación de una calculadora estadística, usando como colección una lista enlazada simple, con el propósito de poner en práctica el uso de las herramientas tecnológicas *Maven* y *Git*. Adicionalmente cuenta con el despliegue de la aplicación web para libre uso de la calculadora, gracias al uso de *Spark* y *Heroku*.

## Diseño

![](https://github.com/D4v0r/AREP-StatisticalCalculatorWeb/blob/master/img/Package%20arep.png?raw=true)
Reporte en detalle [AQUÍ](paper.pdf)


## Comenzando

### Funcionalidades
La calculadora estadística, ofrece el cálculo del promedio de un conjunto de datos y su desviación estándar.

### Prerrequisitos
+ Java 8 SE JDK 
+ Maven
+ Git

### Instalación
Primero debemos clonar este repositorio con el siguiente comando:

`````
git clone https://github.com/D4v0r/AREP-INTRO-MVN-GIT
`````

Ahora debemos dirigirnos al directorio donde fue clonado el respositorio ejecutar una consola de comandos y compilar el proyecto con el siguiente comando:

````
mvn package
````


### Documentación

Para generar la documentación en su máquina puede ejecutar el siguiente comando:
```
$ mvn javadoc: javadoc
$ mvn javadoc:jar
$ mvn javadoc:aggregate
$ mvn javadoc:aggregate-jar
$ mvn javadoc:test-javadoc
$ mvn javadoc:test-jar
$ mvn javadoc:test-aggregate
$ mvn javadoc:test-aggregate-jar
```
También puede observarla [AQUÍ](https://d4v0r.github.io/AREP-StatisticalCalculatorWeb/apidocs/index.html).


### Entorno de Pruebas

La pruebas se encuentran automatizadas utilizando el framework JUnit, puede ejecutarlas con el siguiente comando:
````
mvn test
````

### Automatización

Integración continua usando la tecnología de CircleCi:

[![CircleCI](https://circleci.com/gh/D4v0r/AREP-StatisticalCalculatorWeb.svg?style=svg)](https://circleci.com/gh/D4v0r/D4v0r/AREP-StatisticalCalculatorWeb)


### Despliegue

La aplicación web se encuentra desplegada en Heroku:

[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://warm-shelf-61069.herokuapp.com/inputdata)



## Desarrollo

Este proyecto fue desarrollado con:
+ Java 8
+ Spark
+ JUnit
+ Maven
+ CircleCI
+ Heroku

## Autor

>Davor Javier Cortés Cardozo

>Estudiante de la Escuela Colombiana de Ingeniería Julio Garavito

## Licencia

Este proyecto está licenciado bajo la GNU General Public License v3.0, para más información ver la [LICENCIA](LICENSE.txt).
