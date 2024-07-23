/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutable;

import colecciones.genericas.ListaG;
import colecciones.simples.ListaSimple;

/**
 *
 * @author Dell
 */
public class mainColecciones {
 
    public static void main (String[] args){
        System.out.println("------Lista generica--------");
        ListaG<String> ciudades = new ListaG<>();
        ciudades.agregar("cartagena");
        ciudades.agregar("Armenia");
        ciudades.agregar("cali");
        
        ciudades.imprimirContenido();
        
        System.out.println("---------lista no generica-------");
        
        ListaSimple ciudades2 = new ListaSimple();
        ciudades2.agregar("medellin");
        ciudades2.agregar("pereira");
        
        ciudades2.imprimirContenido();
    }
}
