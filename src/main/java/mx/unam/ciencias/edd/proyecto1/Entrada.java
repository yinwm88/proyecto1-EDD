package mx.unam.ciencias.edd.proyecto1;

import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import mx.unam.ciencias.edd.Lista;

public class Entrada{

    /**
     * Método que sirve para encontrar la entrada entre tanta banderas o bandera que pueda
     *  encontrarse en la entrada. La cual corresponde con ser archivo de entrada y no de salida.
     * 
     * @param entrada Entrada con el nombre del posible archivo entrada y n banderas.
     * @return Lista la cual contiene cada una de las lineas del archivo leido. 
     * 
     */
    public static Lista<String> encontrarEntrada(String[] entrada){
            if(Banderas.oBandera(entrada)){
                int indiceBO;
                int indiceABO;
                for(int i = 0; i < entrada.length; i++){
                    indiceBO = getIndiceObandera(entrada);
                    indiceABO = Banderas.getIndiceArchivoSalida(entrada);
                    if(manejoObandera(entrada, 0, indiceBO) != null)
                       return manejoObandera(entrada, 0, indiceBO);
                    else
                        return manejoObandera(entrada, indiceABO+1, entrada.length); 
                }
            }else{
                for(int i = 0; i < entrada.length; i++){
                    if(!entrada[i].equals("-r"))
                        return leerArchivo(entrada[i]);
                }
            }             
            return null;
    }


    // Metodo auxiliar del metodo encontrarEtrada, este es usado para encontrar el indice del archivo correcto para leer.
    public static Lista<String> manejoObandera(String[] entrada, int ini, int fin){
            for(int i = ini; i < fin; i++)
                if((!entrada[i].equals("-r")) && !entrada[i].equals("-o")){
                        return leerArchivo(entrada[i]);
                }
            return null;
    }

    //Metodo auxiliar de encontrarEtrada, este es usado para encontrar el indice que ocupa la bandera -o en el arreglo de  entrada 
    public static int getIndiceObandera(String[] entrada){
        for (int i = 0; i < entrada.length; i++)
            if (entrada[i].equals("-o"))
                return i;   
        return -1;
    }

    /**
     * Devuelve la lista la cual contiene cada una de las lineas del archivo leido.
     * @param nombreArchivo nombre del archivo del cual leeremos su contenido para guardar
     * cada una de sus lineas en una lista
     * @return Lista que contiene todas las lineas que conforman el archivo recibido como parametro.
     */
    public static Lista<String> leerArchivo(String nombreArchivo){
        Lista<String> lista = new Lista<>();
        try{
            BufferedReader br = new BufferedReader( new InputStreamReader(new FileInputStream(nombreArchivo)));
            String linea;
            while ((linea = br.readLine()) != null)
                    lista.agregaFinal(linea);
            return lista;
        }catch (IOException io){
            System.out.println(io.getMessage());
        }
            return null;    


    }

    /**
     * Método para leer de la entrada estandar 
     * @return Lista que contiene la lineas leidas de la entrada estandar.
     */
    public static Lista<String> leerEstandar(){
        Lista<String> lista = new Lista<>();
        String nodo;

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while((nodo = br.readLine())!=null)
                lista.agrega(nodo);
            return lista;     
        
        }catch(IOException io){
         
            System.out.println(io.getMessage());
        
        }
        return null;
    }
    

}
