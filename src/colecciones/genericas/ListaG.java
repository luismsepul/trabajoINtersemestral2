/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones.genericas;

/**
 *
 * @author Dell
 */
public class ListaG<T> {
    
    private int tamaño;
    private Nodo<T> cabeza;

    public ListaG() {
        this.tamaño = 0;
        this.cabeza = null;
    
    }
    
    public void agregar(T elemento){
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        
        if(this.cabeza == null){
            this.cabeza = nuevoNodo;
        }else{
            Nodo<T> observador = cabeza;
            while(observador.getSiguiente() != null){
                observador = cabeza.getSiguiente();
            }
            observador.setSiguiente(nuevoNodo);
        }
        this.tamaño++;
    }
    
    public void imprimirContenido(){
        Nodo<T> nodoActual = this.cabeza;
        if(this.cabeza == null){
            return;
        }
        while(nodoActual.getSiguiente() != null){
            System.out.println(nodoActual.getDato());
            nodoActual = nodoActual.getSiguiente();
        }
        System.out.println(nodoActual.getDato());
    }
    
}
