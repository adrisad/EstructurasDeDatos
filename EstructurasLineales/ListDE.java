package EstructurasLineales;

public class ListDE<T> implements List<T>{

    NodoDE<T> inicio;

    public ListDE(){
        inicio=null;
    }

    @Override
    public boolean estaVacio() {
        return inicio==null;
    }

    @Override
    public void insertarFinal(T dato) {
        NodoDE<T> nuevo=new NodoDE<T>(dato);
        if (estaVacio()) {
            inicio=nuevo;
        }else{
            NodoDE<T> auxiliar=inicio;
            while (auxiliar.getSiguiente()!=null) {
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
            nuevo.setAnterior(auxiliar);
        }
    }

    @Override
    public void insertarInicio(T dato) {
        NodoDE<T> nuevo=new NodoDE<T>(dato);
        if (estaVacio()) {
            inicio=nuevo;
        }else{
            inicio.setAnterior(nuevo);
            nuevo.setSiguiente(inicio);
            inicio=nuevo;
        }
    }

    @Override
    public void insertar(T dato, int pos) {
        
    }

    @Override
    public T acceder(int pos) {
        T res=null;
        if (!estaVacio()) {
            NodoDE<T> auxiliar=inicio;
            while (pos>0) {
                auxiliar=auxiliar.getSiguiente();
                pos--;
            }
            if (auxiliar!=null) {
                res=auxiliar.getDato();
            }
        }
        return res;
    }

    @Override
    public List<T> acceder(int inferior, int superior) {
        List<T> res=new ListDE<T>();
        if (!estaVacio()) {
            if (PosicionValida(inferior) && PosicionValida(superior)) {
                if (inferior==superior) {
                    res.insertarFinal(acceder(inferior));
                }else{
                    NodoDE<T> actual=inicio;
                    int pos=0;
                    while(pos<=superior){
                        if (pos>=inferior && pos<=superior) {
                            res.insertarFinal(acceder(pos));
                        }
                        actual=actual.getSiguiente();
                        pos++;
                    }  
                }
            }
        }
        return res;
    }
    private boolean PosicionValida(int pos){
        boolean res=true;
        if (!(pos>=0 && pos<Longitud())) {
            res=false;
        }
        return res;
    }

    @Override
    public T eliminar(int pos) {
        return null;
    }

    @Override
    public T eliminar(T dato) {
        return null;
    }

    @Override
    public void eliminarTodo() {
        inicio=null;
    }

    @Override
    public List<T> eliminarTodas(T dato) {
        return null;
    }

    @Override
    public List<T> eliminar(int inferior, int superior) {
        return null;
    }

    @Override
    public List<T> eliminarTodasList(T dato) {
        return null;
    }

    @Override
    public int Longitud() {
        int res=0;
        if (!estaVacio()) {
            NodoDE<T> actual=inicio;
            while(actual!=null){
                actual=actual.getSiguiente();
                res++;
            }
        }
        return res;
    }

    @Override
    public String serializar() {
        String res="";
        NodoDE<T> actual=inicio;
        while(actual!=null){
            res=res+actual.getDato();
            actual=actual.getSiguiente();
        }
        return res;
    }

    @Override
    public int indexOf(T dato) {
        return 0;
    }

    @Override
    public boolean Buscar(T dato) {
        return false;
    }

    @Override
    public List<Integer> indexOfTodas(Object dato) {
        return null;
    }

    @Override
    public void establecer(T d, int pos) {
        
    }

    @Override
    public void intercambiar(int orig, int dest) {
        
    }

    @Override
    public String serializar(char delimitador) {
        return null;
    }

    @Override
    public List<List<T>> split(int n) {
        return null;
    }

    @Override
    public String toString() {
        String res = "[";
        if (! estaVacio()) {
            NodoDE<T> actual= inicio;
            while (actual!=null) {
                res+=actual.getDato();
                actual=actual.getSiguiente();
                if (actual!=null) {
                    res += ",";
                }
            }
        }
        return res + "]";
    }
}
