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

    public static boolean oBandera(String[] entrada) {
        for (int i = 0; i < entrada.length; i++)
            if (entrada[i].equals("-o"))
                return true;
        return false;
    }
   

    /**
     * Método que nos dice que se tiene que simula la acción de la bandera -o; 
     * y además nos regresa el  archivo en donde se realizará la acción.
     * 
     * @param entrada Entrada
     * @return Indice en el arreglo donde se encuentra el archivo, -1 si no se encuentra.
     */
    public static String getArchivo(String[] entrada) {
        for (int i = 0; i < entrada.length; i++)
            if (entrada[i].equals("-o"))
                if ((i + 1) < entrada.length)
                    if (!entrada[i + 1].equals("-r") && !entrada[i + 1].equals("-o"))
                      return entrada[i + 1];   
        return null;
    }
}