package Cola;

import Nodos.NodoSE;

public class Cola<T> {
    NodoSE<T> frente,fin;
    public Cola(){
        frente = null;
        fin = null;
    }
    public boolean empty(){
        return (frente==null)&&(fin==null);
    }
    public void insert(T dato){
        NodoSE<T> nuevo=new NodoSE<T>(dato);
        if (empty()) {
            frente=nuevo;
            fin=nuevo;
        }else{
            fin.setSiguiente(nuevo);
            fin=nuevo;
        }
    }
    public T remove(){
        T res = null;
        if (!empty()) {
            res = frente.getDato();
            frente = frente.getSiguiente();
        }
        if (frente == null) {
            fin = null;
        }
        return res;
    }
}
