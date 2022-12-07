package EstructurasNoLinales;
import EstructurasLineales.*;

public class ArbolBB<T extends Comparable> {
    private T raiz;
    private ArbolBB<T> izquierda;
    private ArbolBB<T> derecha;

    public ArbolBB(){
        raiz=null;
        izquierda=null;
        derecha=null;
    }
    public boolean empty(){
        return (raiz==null) && (izquierda==null) && (derecha==null);
    }
    public void insert(T dato){
        if (empty()) {
            raiz=dato;
            izquierda=new ArbolBB<T>();
            derecha=new ArbolBB<T>();
        }else{
            if (raiz.compareTo(dato)<0) {
                derecha.insert(dato);
            }else{
                izquierda.insert(dato);
            }
        }
    }

    public int estado(){
        int res;
        if (izquierda.empty()) {
            if (derecha.empty()) {
                res=0;
            }else{
                res=2;
            }
        }else{
            if (derecha.empty()) {
                res=1;
            }else{
                res=3;
            }
        }
        return res;
    }
    
    // minimo dato
    public T minimo(){
        T minimo = null;
        if(!empty()){
            minimo = raiz;
            T aux = null;
            if(!izquierda.empty()){
                aux = izquierda.minimo();
                if(aux.compareTo(minimo)<0){
                    minimo = aux;
                }
            }
        }
        return minimo;
    }

    public T maximo(){
        T maximo=null;
        if (!empty()) {
            maximo=raiz;
            T aux=null;
            if (!izquierda.empty()) {
                aux=izquierda.maximo();
                if (aux.compareTo(maximo)>0) {
                    maximo=aux;
                }
            }
            if (!derecha.empty()) {
                aux=derecha.maximo();
                if (aux.compareTo(maximo)>0) {
                    maximo=aux;
                }
            }

        }
        return maximo;
    }
    public ListSE<T> datoMayores(T dato){
        ListSE<T> res=new ListSE<T>();
        if (!empty()) {
            if (raiz.compareTo(dato)>0) {
                res.insertarFinal(raiz);
            }
            if (!izquierda.empty()) {
                izquierda.datoMayores(dato,res);
            }
            if (!derecha.empty()) {
                derecha.datoMayores(dato,res);
            }
        }
        return res;
    }
    
    private void datoMayores(T dato,ListSE<T> lista){
        if (!empty()) {
            if (raiz.compareTo(dato)>0) {
                lista.insertarFinal(raiz);
            }
            if (!izquierda.empty()) {
                izquierda.datoMayores(dato,lista);
            }
            if (!derecha.empty()) {
                derecha.datoMayores(dato,lista);
            }
        }
    }
    
}