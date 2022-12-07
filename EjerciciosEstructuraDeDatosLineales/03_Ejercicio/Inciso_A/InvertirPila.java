import ListaDeSimpleEnlace.ListSE;
import Pila.Pila;

public class InvertirPila<T> {
    private Pila<T> pila;
    public InvertirPila(){
        pila = new Pila<T>();
    }
    public void invertir(){
        ListSE<T> lista=new ListSE<>();
        while(!pila.empty()){
            lista.insertarFinal(pila.pop());
        }
        for(int i=0;i<lista.Longitud();i++){
            pila.push(lista.acceder(i));
        }
    }
    public Pila<T> getPila(){
        return pila;
    }
    public void agregarElemento(T dato){
        pila.push(dato);
    }
}
