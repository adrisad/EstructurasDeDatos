import Pila.Pila;

public class BuscarElemento<T> {
    Pila<T> pila;
    public BuscarElemento(){
        pila=new Pila<T>();
    }
    public boolean buscar(T dato){
        boolean res=false;
        Pila<T> pilaAuxiliar=new Pila<T>();
        while(!pila.empty() && !res){
            T elemento = pila.pop();
            pilaAuxiliar.push(elemento);
            if (dato.equals(elemento)) {
                res=true;
            }
        }
        while(!pilaAuxiliar.empty()){
            pila.push(pilaAuxiliar.pop());
        }
        return res;
    }
    public void agregar(T dato){
        pila.push(dato);
    }
}
