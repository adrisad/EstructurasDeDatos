package Nodos;

public class NodoDE<T>{
    private T dato;
    private NodoDE<T> anterior;
    private NodoDE<T> siguiente;

    public NodoDE(T dato){
        this.dato=dato;
        siguiente=null;
        anterior=null;
    }
    public T getDato(){
        return dato;
    }
    public NodoDE<T> getAnterior(){
        return anterior;
    }
    public NodoDE<T> getSiguiente(){
        return siguiente;
    }
    public void setDato(T dato){
        this.dato=dato;
    }
    public void setSiguiente(NodoDE<T> siguiente){
        this.siguiente=siguiente;
    }
    public void setAnterior(NodoDE<T> anterior){
        this.anterior=anterior;
    }
}