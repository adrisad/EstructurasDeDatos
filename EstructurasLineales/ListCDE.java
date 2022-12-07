package EstructurasLineales;

public class ListCDE<T>implements List<T> {
    private NodoDE<T> inicio;
    public ListCDE(){
        inicio=null;
    }

    @Override
    public boolean estaVacio() {
        return inicio==null;
    }

    @Override
    public void insertarFinal(T dato) {
        NodoDE<T> nuevo=new NodoDE<>(dato);
        if (estaVacio()) {
            inicio=nuevo;
            inicio.setSiguiente(inicio);
            inicio.setAnterior(inicio);
        }else{
            NodoDE<T> ElementoFinal=inicio.getAnterior();
            ElementoFinal.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
            nuevo.setAnterior(ElementoFinal);
            inicio.setAnterior(nuevo);
        }
    }

    @Override
    public void insertarInicio(T dato) {
        NodoDE<T> nuevo=new NodoDE<>(dato);
        if (estaVacio()) {
            inicio=nuevo;
            inicio.setSiguiente(inicio);
            inicio.setAnterior(inicio);
        }else{
            NodoDE<T> ElementoFinal=inicio.getAnterior();
            ElementoFinal.setSiguiente(nuevo);
            nuevo.setAnterior(ElementoFinal);
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
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
            NodoDE<T> actual=inicio;
            while(pos>0){
                actual=actual.getSiguiente();
                pos--;
            }
            res=actual.getDato();
        }
        return res;
    }

    @Override
    public List<T> acceder(int inferior, int superior) {
        return null;
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
        List<T> res=new ListCDE<>();
        if (!estaVacio()) {
            int longitud=Longitud();
            NodoDE<T> auxiliar=inicio;
            for(int i=0;i<longitud;i++){
                if (auxiliar.getDato().equals(dato)) {
                    NodoDE<T> r,s;
                    r=auxiliar.getAnterior();
                    s=auxiliar.getSiguiente();
                    r.setSiguiente(s);
                    s.setAnterior(r);
                    if (r==s && s==inicio) {
                        inicio=null;
                    }else if (auxiliar==inicio) {
                        inicio=auxiliar.getSiguiente();
                    }
                }
                auxiliar=auxiliar.getSiguiente();
            }
        }
        return res;
    }

    @Override
    public List<T> eliminar(int inferior, int superior) {
        return null;
    }

    @Override
    public List<T> eliminarTodasList(Object dato) {
        return null;
    }

    @Override
    public int Longitud() {
        int res=0;
        if (!estaVacio()) {
            NodoDE<T> actual=inicio;
            boolean FueVisitadoInicio=false;
            while(actual!=inicio||FueVisitadoInicio==false){
                if (actual==inicio) {
                    FueVisitadoInicio=true;
                }
                actual=actual.getSiguiente();
                res++;
            }
        }
        return res;
    }

    @Override
    public String serializar() {
        String res="";
        if (!estaVacio()) {
            int pos=0;
            while(pos<Longitud()){
                res+=acceder(pos);
                pos++;
            }
        }
        return res;
    }

    @Override
    public int indexOf(T dato) {
        int pos=-1;
        if (!estaVacio()) {
            NodoDE<T> actual=inicio;
            pos=0;
            while((pos<Longitud())&&!(actual.getDato().equals(dato))){
                actual=actual.getSiguiente();
                pos+=1;
            }
            if (pos==Longitud()) {
                pos=-1;
            }
        }
        return pos;
    }

    @Override
    public boolean Buscar(T dato) {
        return false;
    }

    @Override
    public List<Integer> indexOfTodas(T dato) {
        List<Integer> res=new ListCDE<>();
        int pos=-1;
        if (!estaVacio()) {
            NodoDE<T> actual=inicio;
            pos=0;
            while(pos<Longitud()){
                if (actual.getDato().equals(dato)) {
                    res.insertarFinal(pos);
                }
                actual=actual.getSiguiente();
                pos+=1;
            }
        }
        return res;
    }

    @Override
    public void establecer(T dato, int pos) {
        if (!estaVacio()) {
            if (pos<Longitud()) {
                NodoDE<T> nuevo=new NodoDE<>(dato);
                if (Longitud()==1) {
                    nuevo.setSiguiente(inicio);
                    inicio.setAnterior(nuevo);
                    inicio.setSiguiente(nuevo);
                    nuevo.setAnterior(inicio);
                    inicio=nuevo;
                }else if (pos==0) {
                    NodoDE<T> ultimo=inicio.getAnterior();
                    nuevo.setSiguiente(inicio);
                    inicio.setAnterior(nuevo);
                    ultimo.setSiguiente(nuevo);
                    nuevo.setAnterior(ultimo);
                    inicio=nuevo;
                }else if (pos==Longitud()-1) {
                    NodoDE<T> ultimo=inicio.getAnterior();
                    ultimo.setAnterior(nuevo);
                    nuevo.setSiguiente(ultimo);
                    nuevo.setAnterior(ultimo.getAnterior());
                    ultimo.getAnterior().setSiguiente(nuevo);
                }else{
                    NodoDE<T> actual=buscar(pos);
                    NodoDE<T> anterior=actual.getAnterior();
                    nuevo.setSiguiente(actual);
                    actual.setAnterior(nuevo);
                    anterior.setSiguiente(nuevo);
                    nuevo.setAnterior(anterior);
                }
            }
        }
    }

    @Override
    public void intercambiar(int orig, int dest) {

    }

    @Override
    public String serializar(char delimitador) {
        String res="";
        if (!estaVacio()) {
            int pos=0;
            while(pos<Longitud()){
                res+=acceder(pos);
                if (!(pos==Longitud()-1)) {
                    res+=delimitador;
                }
                pos++;
            }
        }
        return res;
    }

    @Override
    public List<List<T>> split(int n) {
        List<List<T>> res=new ListCDE<>();
        if (!estaVacio()) {
            NodoDE<T> auxiliar=inicio;
            ListCDE<T> lista=new ListCDE<>();
            lista.insertarFinal(auxiliar.getDato());
            auxiliar=auxiliar.getSiguiente();
            int cat=1;
            while(auxiliar!=inicio){
                if (cat<n) {
                    lista.insertarFinal(auxiliar.getDato());
                    cat++;
                }else{
                    res.insertarFinal(lista);
                    lista=new ListCDE<>();
                    cat=0;
                }
                auxiliar=auxiliar.getSiguiente();
            }
            if (cat>0) {
                res.insertarFinal(lista);
            }
        }
        return res;
    }
    public NodoDE<T> buscar(int pos){
        NodoDE<T> res = null;
        NodoDE<T> auxiliar = inicio;
        boolean FueVisitadoInicio=false;
        while((pos>=0 && auxiliar!=inicio)||(FueVisitadoInicio==false)){
            if (auxiliar==inicio) {
                FueVisitadoInicio=true;
            }
            pos--;
            auxiliar = auxiliar.getSiguiente();
        }
        if(pos == 0){
            res = auxiliar;
        }
        return res;
    }

    public String toString(){
        String res = "[";
        if (! estaVacio()) {
            NodoDE<T> actual= inicio;
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
