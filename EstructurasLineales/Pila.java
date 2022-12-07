package EstructurasLineales;
public class Pila<T> {
    private NodoSE<T> tope;
    public Pila(){
        tope=null;
    }
    public boolean empty(){
        return tope==null;
    }
    public void push(T dato){
        NodoSE<T> nuevo=new NodoSE<T>(dato);
        if (empty()) {
            tope=nuevo;
        }else{
            nuevo.setSiguiente(tope);
            tope=nuevo;
        }
    }
    public T pop(){
        T res = null;
        if (!empty()) {
            res=tope.getDato();
            tope=tope.getSiguiente();
        }
        return res;
    }
    public T verDato(){
        T res=null;
        if (!empty()) {
            res=tope.getDato();
        }
        return res;
    }

}
