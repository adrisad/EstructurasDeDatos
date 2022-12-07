package BiColas;

import Nodos.NodoSE;

public class BiColaSalidaRestringida<T> {
    private NodoSE<T> frente,fin;
    public BiColaSalidaRestringida(){
        frente=null;
        fin=null;
    }
    public boolean empty(){
        return (frente==null)&&(fin==null);
    }
    public void insertLast(T dato){
        NodoSE<T> nuevo=new NodoSE<T>(dato);
        if (empty()) {
            frente=nuevo;
            fin=nuevo;
        }else{
            fin.setSiguiente(nuevo);
            fin=nuevo;
        }
    }
    public void insertFront(T dato){
        NodoSE<T> nuevo=new NodoSE<T>(dato);
        if (empty()) {
            frente=nuevo;
            fin=nuevo;
        }else{
            nuevo.setSiguiente(frente);
            frente=nuevo;
        }
    }
    public T remove(){
        T res=null;
        if (!empty()) {
            res=frente.getDato();
            frente=frente.getSiguiente();
        }
        return res;
    }
}
