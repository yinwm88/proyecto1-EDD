package mx.unam.ciencias.edd.proyecto1;

import mx.unam.ciencias.edd.IteradorLista;
import mx.unam.ciencias.edd.Lista;

public class Banderas {

    /**
     * Método que nos dice si se tiene que simular la acción de la bandera -r.
     * 
     * @param entrada Entrada.
     * @return True si hay que simular la acción, False en caso contrario.
     */
    public static boolean rBandera(String[] entrada) {
        for (String e : entrada) 
            if (e.equals("-r"))
                return true;
        return false;
    }

    /**
     * Método que nos dice si se tiene que simular la acción de la bandera -o.
     * 
     * @param entrada Entrada.
     * @return True si hay que simular la acción, False en caso contrario.
     */
    public static boolean oBandera(String[] entrada) {
        for (int i = 0; i < entrada.length; i++)
            if (entrada[i].equals("-o"))
                return true;
        return false;
    }

    /**
     * Método que nos regresa en archivo Salida que ocupara la bandera -o
     * 
     * @param entrada Entrada
     * @return nombre del archivo salida.
     */
    public static String getArchivo(String[] entrada) {
        if(getIndiceArchivoSalida(entrada)!=-1)
            return entrada[getIndiceArchivoSalida(entrada)];
        return null;   
    }
   
    
    /**
     * Método auxiliar que nos regresa el indice del archivo en donde se realizará la acción.
     * o -1 si no se encuentra.
     * 
     * @param entrada Entrada
     * @return indice donde se encuentra el archivo salida.
     */
    public static int getIndiceArchivoSalida(String[]entrada){
        for (int i = 0; i < entrada.length; i++)
            if (entrada[i].equals("-o"))
                if ((i + 1) < entrada.length)
                    if (!entrada[i + 1].equals("-r") && !entrada[i + 1].equals("-o"))
                      return i + 1;   
        return -1;
    }
}