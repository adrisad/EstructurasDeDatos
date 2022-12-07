package EstructurasLineales;

public class BiColaEntradaRestringida<T> {
    private NodoSE<T> frente,fin;
    public BiColaEntradaRestringida(){
        frente=null;
        fin=null;
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
    public T removeLast(){
        T res = null;
        if (!empty()) {
            res=fin.getDato();
            NodoSE<T> anterior= frente;
            while (anterior.getSiguiente()!=fin) {
                anterior=anterior.getSiguiente();
            }
            fin=anterior;
        }
        return res;
    }
    public T removeFirst(){
        T res = null;
        if (!empty()) {
            res=frente.getDato();
            frente=frente.getSiguiente();
        }
        return res;
    }
}
