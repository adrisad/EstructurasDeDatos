package Nodos;

public class NodoPrioridad<T,P> {
    private T dato;
    private NodoPrioridad<T,P> siguiente;
    private P prioridad;

    public NodoPrioridad(T dato,P prioridad){
        this.dato=dato;
        this.prioridad=prioridad;
        this.siguiente=null;
    }
    public T getDato(){
        return dato;
    }
    public NodoPrioridad<T,P> getSiguiente(){
        return siguiente;
    }
    public P getPrioridad(){
        return prioridad;
    }
    public void setDato(T dato){
        this.dato=dato;
    }
    public void setSiguiente(NodoPrioridad<T,P> siguiente){
        this.siguiente=siguiente;
    }
    public void setPrioridad(P prioridad){
        this.prioridad=prioridad;
    }
}
