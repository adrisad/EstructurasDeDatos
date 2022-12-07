package Examenes.ListaClasificada;

import Nodos.NodoDE;

public class ListaClasificada<T> {
    NodoDE<T> inicio;
    public ListaClasificada(){
        inicio=null;
    }
    public boolean empty(){
        return inicio==null;
    }
    public NodoDE<T> buscarNodo(T dato){
        NodoDE<T> res=null;
        NodoDE<T> aux=inicio;
        while (aux.getSiguiente()!=null) {
            if (aux.getDato().equals(dato)) {
                res=aux;
            }
            aux=aux.getSiguiente();
        }
        if (res==null) {
            res=aux;
        }
        return res;
    }
    public void insert(T dato){
        NodoDE<T> nuevo=new NodoDE<T>(dato);
        if (empty()) {
            inicio=nuevo;
        }else{
            NodoDE<T> actual= buscarNodo(dato);
            if (actual.getSiguiente()==null) {
                actual.setSiguiente(nuevo);
                nuevo.setAnterior(actual);
            }else{
                NodoDE<T> siguiente=actual.getSiguiente();
                actual.setSiguiente(nuevo);
                nuevo.setAnterior(actual);
                nuevo.setSiguiente(siguiente);
                siguiente.setAnterior(nuevo);
            }
        }
    }
    public String toString(){
        String res="[";
        NodoDE<T> aux=inicio;
        while (aux!=null) {
            res=res+""+aux.getDato();
            aux=aux.getSiguiente();
            if (aux!=null) {
                res=res+",";
            }
        }
        return res+"]";
    }
}
