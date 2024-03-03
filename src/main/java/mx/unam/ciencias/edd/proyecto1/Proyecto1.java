package mx.unam.ciencias.edd.proyecto1;

import mx.unam.ciencias.edd.Lista;

import java.io.BufferedReader;

/**
 * Clase que simula el comando sort de Linux.
 * @author Wong Mestas
 */
public class Proyecto1 {

    public static void main(String[] args){
        Lista<String> listaSucia;
        Lista<String> listaLimpia = null;
                
        if(args.length == 0){
            listaSucia = Entrada.leerEstandar();
            listaLimpia = Ordenar.sort(listaSucia);
            Salida.escribirEstandar(listaLimpia);
        }else{

            if(Banderas.oBandera(args) && Banderas.getArchivo(args)==null){
                System.out.println("sort: option requires an argument -- 'o'.");
            }else{

                if(Entrada.encontrarEntrada(args)!=null){
                    listaSucia = Entrada.encontrarEntrada(args);
                }else{  
                    listaSucia = Entrada.leerEstandar();
                }
                
                listaLimpia = Ordenar.sort(listaSucia);

                if(Banderas.rBandera(args))
                    listaLimpia = listaLimpia.reversa();

                if(Banderas.oBandera(args)){
                        
                        if(Banderas.getArchivo(args)!=null)
                            Salida.escribirArchivo(listaLimpia, Banderas.getArchivo(args));
                        else{
                            System.out.println("sort: option requires an argument -- 'o'.");
                        }
                }else{
                    Salida.escribirEstandar(listaLimpia);
                }
                }
        }

    }
}