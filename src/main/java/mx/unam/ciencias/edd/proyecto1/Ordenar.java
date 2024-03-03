package mx.unam.ciencias.edd.proyecto1;

import mx.unam.ciencias.edd.Lista;

/**
 * Clase para ordenar lexicograficamente una lista.
 */
public class Ordenar{

  /**
 * Limpia la cadena quitando mayusculas.
 * @param cadena cadena sin formato
 * @return cadena en formato simple.
 */  
  public static String limpiaCadena(String cadena){
    return cadena.trim().toLowerCase().replaceAll(
        "[^a-z]","");
  }

/**
 * Usa mergeSort, regresa la lista con orden lexicografico. 
 * @param listaSucia la lista  generada despues de leer la entrada.
 * @return la lista ordenada lexicograficamente.
 */
  
  public static Lista<String> sort(Lista<String> listaSucia){
    return listaSucia.mergeSort((a, b) -> limpiaCadena(a).compareTo(limpiaCadena(b)));
  }

}
