package Nodos;

public class NodoSE<T>{
    private T dato;
    private NodoSE<T> siguiente;
    public NodoSE(T dato){
        this.dato=dato;
        siguiente=null;
    }
    public T getDato(){
        return dato;
    }
    public NodoSE<T> getSiguiente(){
        return siguiente;
    }
    public void setDato(T dato){
        this.dato=dato;
    }
    public void setSiguiente(NodoSE<T> siguiente){
        this.siguiente=siguiente;
    }
}