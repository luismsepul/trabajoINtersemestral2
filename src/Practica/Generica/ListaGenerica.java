/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica.Generica;

/**
 *
 * @author Dell
 */
public class ListaGenerica<T> {
    
    private int tamaño;
    private Nodo<T> cabeza;

    public ListaGenerica() {
        this.tamaño = 0;
        this.cabeza = null;
    }
     
    public void agregar(T elemento){
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        
        if(cabeza == null){
            cabeza = nuevoNodo;
        }else{
            Nodo<T> observador = this.cabeza;
            while(observador.getSiguiente() != null) {
             observador = cabeza.getSiguiente();
            }
            observador.setSiguiente(nuevoNodo);
        }
        tamaño++;
    }
    
    public void imprimir(){
        Nodo<T> nodoActual = this.cabeza;
        if(this.cabeza == null){
            return;
        }
        while (nodoActual.getSiguiente() != null) {            
            System.out.println(nodoActual.getDato());
            nodoActual = nodoActual.getSiguiente();
        }
        System.out.println(nodoActual.getDato());
    }
       
}
