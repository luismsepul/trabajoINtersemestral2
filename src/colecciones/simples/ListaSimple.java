/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones.simples;

/**
 *
 * @author Dell
 */
public class ListaSimple {
    
    private int tamaño;
    private Nodo cabeza;

    public ListaSimple() {
        this.tamaño = 0;
        this.cabeza = null;
    }
    
    public void agregar(String elemento){
        Nodo nuevoNodo = new Nodo(elemento);
        
        if(this.cabeza == null){
            this.cabeza = nuevoNodo;
        }else{
            Nodo observador = this.cabeza;
            while (observador.getSiguiente() != null) {                
                observador = observador.getSiguiente();
            }
            observador.setSiguiente(nuevoNodo);
        }
        tamaño++;
    }
    
    public void imprimirContenido(){
        if(this.cabeza == null){
            return;
        }
        
        Nodo nodoActual = this.cabeza;
        while (nodoActual.getSiguiente() != null) {            
            System.out.println(nodoActual.getDato());
            nodoActual = nodoActual.getSiguiente();
        }
        
        System.out.println(nodoActual.getDato());
    }
    
}
