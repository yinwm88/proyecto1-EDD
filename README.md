<div>

  **Simulacion de sort**
  
</div>

<div>
  
  **USAGE**  
  
Para generar el target:
  
```
mvn compile
```
```
mvn install
```

>Despues de usar el programa varias veces, correr el siguiente comando:


 ```
 mvn clean install
 ```

Despues 

```
java -jar target/proyecto1.jar  <opcion>
```
Sustituye **opcion** por alguna de las siguientes opciones:
  - ```archivo.txt```
  - ```archivo.txt -r```
  - ```-r```
  - ```   ```
  - ```-o archivoSalida.txt```
  - ```archivo.txt -o archivoSalida.txt```


Las banderas pueden ir en cualquier orden, nada más que cuandos se use la bandera -o debera ir acompañado de un archivoSalida.txt, es decir seguido de un identificador. 

</div>
