package EstructurasLineales;

public class ListCSE<T> implements List<T>{
    private NodoSE<T> inicio;
    public ListCSE(){
        inicio=null;
    }

    @Override
    public boolean estaVacio() {
        return inicio==null;
    }

    @Override
    public void insertarFinal(T dato) {
        NodoSE<T> nuevo=new NodoSE<T>(dato);
        if (estaVacio()) {
            inicio=nuevo;
            inicio.setSiguiente(inicio);
        }else{
            NodoSE<T> auxiliar=inicio;
            while (auxiliar.getSiguiente()!=inicio) {
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
        }
    }

    @Override
    public void insertarInicio(T dato) {
        NodoSE<T> nuevo=new NodoSE<T>(dato);
        if (estaVacio()) {
            inicio=nuevo;
            inicio.setSiguiente(inicio);
        }else{
            NodoSE<T> auxiliar=inicio;
            while (auxiliar.getSiguiente()!=inicio) {
                auxiliar=auxiliar.getSiguiente();
            }
            nuevo.setSiguiente(inicio);
            inicio=nuevo;
            auxiliar.setSiguiente(inicio);
        }
    }

    @Override
    public void insertar(T dato, int pos) {
        NodoSE<T> nuevo=new NodoSE<>(dato);
        if (estaVacio()) {
            if (pos==0) {
                inicio=nuevo;
                inicio.setSiguiente(inicio);
            }
        }else{
            if (pos>=0&&pos<Longitud()) {
                if (pos==0) {
                    insertarInicio(dato);
                }else{
                    NodoSE<T> actual=inicio;
                    NodoSE<T> anterior=null;
                    while(pos>0){
                        anterior=actual;
                        actual=actual.getSiguiente();
                        pos-=1;
                    }
                    anterior.setSiguiente(nuevo);
                    nuevo.setSiguiente(actual);
                }
            }
        }
    }

    @Override
    public T acceder(int pos) {
        T res=null;
        if (!estaVacio()) {
            NodoSE<T> auxiliar=inicio;
            while (pos>0) {
                auxiliar=auxiliar.getSiguiente();
                pos--;
            }
            res=auxiliar.getDato();
        }
        return res;
    }

    @Override
    public List<T> acceder(int inferior, int superior) {
        List<T> res=new ListCSE<T>();
        if (!estaVacio()) {
            if (PosicionValida(inferior) && PosicionValida(superior)) {
                if (inferior==superior) {
                    res.insertarFinal(acceder(inferior));
                }else{
                    NodoSE<T> actual=inicio;
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
            NodoSE<T> actual=inicio;
            boolean inicioVisitado=false;
            while(actual!=inicio || !inicioVisitado){
                if (actual==inicio) {
                    inicioVisitado=true;
                }
                actual=actual.getSiguiente();
                res++;
            }
        }
        return res;
    }

    @Override
    public String serializar() {
        return null;
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
            NodoSE<T> actual= inicio;
            boolean inicioVisitado=false;
            while (actual!=inicio || !inicioVisitado) {
                if (actual==inicio) {
                    inicioVisitado=true;
                }
                res+=actual.getDato();
                actual=actual.getSiguiente();
                if (actual!=inicio) {
                    res += ",";
                }
            }
        }
        return res + "]";
    } 
}
