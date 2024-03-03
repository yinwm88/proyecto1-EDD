package mx.unam.ciencias.edd.proyecto1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

import mx.unam.ciencias.edd.Lista;

public class Salida {

    /**
     * Metodo para escribir en la salida estandar dada una lista como argumento.
     * @param listaOrdenada Una lista con sus entradas ordenadas alfabeticamente.
     */
    public static void escribirEstandar(Lista<String> listaOrdenada){
        try{
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for(String s : listaOrdenada){
                bw.write(s);
                bw.newLine();
            }
            bw.close();

        }catch(IOException io){
        
            System.out.println(io.getMessage());
        
        }
          
    }

    /**
     * Metodo para escribir una lista en un archivo.
     * @param listaOrdenada Lista de la cual se ecribira su contenido.
     * @param nombreArchivo Nombre del archivo en el cual se escribira el contenido obtenido de 
     * la lista parametro.
     */
    public static void escribirArchivo(Lista<String> listaOrdenada, String nombreArchivo){   
         try{
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nombreArchivo)));
            for (String nodo : listaOrdenada){
                bw.write(nodo);
                bw.newLine();
            }
            bw.close();
         }catch(IOException io){
            System.out.println(io.getMessage());
         }
         
    }

}
