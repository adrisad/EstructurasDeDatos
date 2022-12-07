package ListaDeSimpleEnlace;
import ListaGeneral.List;
import Nodos.NodoSE;

public class ListSE<T> implements List<T> {
    private NodoSE<T> inicio;
    public ListSE(){
        inicio=null;
    }

    /**
     * En este metodo veremos si la lista esta vacio o no
     * @param nada
     * @return devolvemos un boolean
     * true si la lista esta vacia
     * false si la lista no esta vacia
     */
    public boolean estaVacio() {
        return inicio==null;
    }
    
    /**
     * Agregamos un nuevo elemento al final de la lista
     * @param dato de tipo generico T
     * @return nada
     */
    public void insertarFinal(T dato) {
        NodoSE<T> nuevo =new NodoSE<>(dato);
        if (estaVacio()) {
            inicio=nuevo;
        }else{
            NodoSE<T> actual = inicio;
            while(actual.getSiguiente()!=null){
                actual=actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    /**
     * @NameMetodo 
     *      insertarInicio
     * @ObjetivoDelMetodo 
     *      Agregamos un nuevo elemento al inicio de la lista
     * @ComoParametro tenemos:
     *      @param T dato de tipo generico
     * @ComoRespuesta 
     *      nada
    */
    public void insertarInicio(T dato) {
        NodoSE<T> nuevo =new NodoSE<>(dato);
        if (estaVacio()) {
            inicio=nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio=nuevo;
        }
    }

    /**
     * @NameMetodo 
     *      insertar
     * @ObjetivoDelMetodo 
     *      Agregamos un nuevo elemento dada una posicion de la lista
     * @ComoParametro tenemos:
     *      @param T dato de tipo generico
     *      @param dato como entero
     * @ComoRespuesta 
     *      nada
    */
    public void insertar(T dato, int pos) {
        NodoSE<T> nuevo=new NodoSE<>(dato);
        if (estaVacio()) {
            if (pos==0) {
                inicio=nuevo;
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
    
    /**
     * @NameMetodo 
     *      acceder
     * @ObjetivoDelMetodo
     *      Lista = [10,20,30]
     *      El fin del metodo es acceder a un elemento dada una posicion de la lista por ejemplo:
     *      acceder(0) --> como respuesta 10   pos = 0
     *      acceder(1) --> como respuesta 20   pos = 1
     *      acceder(2) --> como respuesta 30   pos = 2
    */
    public T acceder(int pos) {
        T res= null;
        if ((pos>=0)&&(pos<Longitud())) {
            NodoSE<T> actual=inicio;
            while(pos>0){
                actual=actual.getSiguiente();
                pos-=1;
            }
            res=actual.getDato();
        }
        return res;
    }

    /**
     * @NameMetodo 
     *      acceder
     * @ObjetivoDelMetodo
     *      Lista = [10,20,30,40,50,60]
     *      El fin del metodo es acceder de un punto hasta otro punto de la lista por ejemplo:
     * 
     *      Como parametro: inferior = 0, superior = 2
     *      acceder(0,2) --> como respuesta [10,20,30]
     * 
     *      Como parametro: inferior = 3, superior = 5
     *      acceder(3,5) --> como respuesta [40,50,60]
    */
    public List<T> acceder(int inferior, int superior) {
        List<T> res=new ListSE<T>();
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
    
    /**
     * @NameMetodo 
     *      acceder
     * @ObjetivoDelMetodo
     *      Lista = [10,20,30,40,50,60]
     *      El fin del metodo es eliminar un elemento dada su posicion en la lista por ejemplo:
     * 
     *      Como parametro: pos = 2
     *      eliminar(2) --> como respuesta tenemos 30
     *      El estado de la lista es el siguiente: [10,20,40,50,60]
    */
    public T eliminar(int pos) {
        T res=null;
        if (pos<Longitud()) {
            if (pos==0) {
                res=inicio.getDato();
                inicio=inicio.getSiguiente();
            }else if (pos==Longitud()-1){
                NodoSE<T> actual=inicio;
                NodoSE<T> anterior = null;
                while(pos>0){
                    anterior=actual;
                    actual=actual.getSiguiente();
                    pos--;
                }
                res=actual.getDato();
                anterior.setSiguiente(null);
            }else{
                NodoSE<T> anterior=null;
                NodoSE<T> actual=inicio;
                while(pos>0){
                    anterior=actual;
                    actual=actual.getSiguiente();
                    pos--;
                }
                res=actual.getDato();
                anterior.setSiguiente(actual.getSiguiente());
            }
        }
        return res;
    }
    
    /**
     * @NameMetodo 
     *      acceder
     * @ObjetivoDelMetodo
     *      Lista = [10,20,30]
     *      El fin del metodo es acceder a un elemento dada una posicion de la lista por ejemplo:
     *      acceder(0) --> como respuesta 10   pos = 0
     *      acceder(1) --> como respuesta 20   pos = 1
     *      acceder(2) --> como respuesta 30   pos = 2
    */
    public T eliminar(T dato) {
        T res=null;
        return res;
        
    }
    
    /**
     * @NameMetodo 
     *      eliminarTodo
     * @ObjetivoDelMetodo
     *      Lista = [10,20,30]
     *      El fin del metodo es eliminar todos los elmentos de la lista por ejemplo:
     * 
     *      eliminarTodo() --> como respuesta nada
     *      El estado de la lista es el siguiente: []
    */
    public void eliminarTodo() {
        inicio=null;
    }
    
    /**
     * @NameMetodo 
     *      eliminarTodas
     * @ObjetivoDelMetodo
     *      Lista = [10,20,30,10,70]
     *      El fin del metodo es devolver una lista con todos los elementos 
     *      eliminados que son ocurencias del parametro dato por ejemplo:
     * 
     *      Como parametro: dato = 10
     *      eliminar(10) --> como respuesta tenemos [10,10]
     *      El estado de la lista es el siguiente: [20,30,70]
    */
    public List<T> eliminarTodas(T dato) {
        List<T> res=new ListSE<T>();
        int pos=indexOf(dato);
        while (pos>=0) {
            res.eliminar(pos);
            pos=indexOf(dato);
        }
        return res;
    }
    
    public List<T> eliminar(int inferior, int superior) {
        List<T> res= new ListSE<T>();
        if (!estaVacio()) {
            if (superior==inferior) {
                res.insertarFinal(eliminar(superior));
            }else if (inferior<superior) {
                res.insertarFinal(eliminar(0));
                res.insertarFinal(eliminar(1));
                res.insertarFinal(eliminar(2));
            }
        }
        return res;
    }
    
    public List<T> eliminarTodasList(T dato) {
        return null;
    }
    
    /**
     * @NameMetodo 
     *      Longitud
     * @ObjetivoDelMetodo
     *      Lista = [10,20,30,10,70]
     *      El fin del metodo es devolver el tamaño de la lista por ejemplo:
     * 
     *      Longitud() --> como respuesta tenemos 5
    */
    public int Longitud() {
        int res=0;
        if (!estaVacio()) {
            NodoSE<T> actual=inicio;
            while(actual!=null){
                actual=actual.getSiguiente();
                res+=1;
            }
        }
        return res;
    }
    
    /**
     * @NameMetodo 
     *      serializar
     * @ObjetivoDelMetodo
     *      Lista = [10,20,30]
     *      El fin del metodo es encadenar todos los elementos de la lista por ejemplo:
     *      
     *      serializar() --> como respuesta tenemos " 102030 "
    */
    public String serializar() {
        String res="";
        NodoSE<T> actual=inicio;
        while(actual!=null){
            res=res+actual.getDato();
            actual=actual.getSiguiente();
        }
        return res;
    }
    
    /**
     * @NameMetodo 
     *      indexOf
     * @ObjetivoDelMetodo
     *      Lista = [10,20,30]
     *      El metodo recorrera hasta encontrar un elemeno igual al dato dado si lo encuentra
     *      devolvera la posicion del elemento, si no lo encuentra devolvera -1 por ejemplo:
     *      
     *      Como parametro: dato = 20
     *      indexOf(20) --> como respuesta tenemos 1
     * 
     *      Como parametro: dato = 40
     *      indexOf(40) --> como respuesta tenemos -1
    */
    public int indexOf(T dato) {
        int pos=-1;
        if (!estaVacio()) {
            NodoSE<T> actual=inicio;
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
    
    /**
     * @NameMetodo 
     *      Buscar
     * @ObjetivoDelMetodo
     *      Lista = [10,20,30]
     *      El metodo nos indicara si el elemento existe o no en la lista por ejemplo:
     *      
     *      Como parametro: dato = 20
     *      Buscar(20) --> como respuesta tenemos true
     * 
     *      Como parametro: dato = 40
     *      Buscar(40) --> como respuesta tenemos false
    */
    public boolean Buscar(T dato) {
        boolean res = false;
        int pos = indexOf(dato);
        if (pos>=0) {
            res= true;
        }
        return res;
    }

    /**
     * @NameMetodo 
     *      indexOf
     * @ObjetivoDelMetodo
     *      Lista = [10,20,30,20,20]
     *      El metodo consiste en obtener todas las posiciones con el mismo dato por ejemplo:
     *      
     *      Como parametro: dato = 20
     *      indexOfTodas(20) --> como respuesta tenemos [1,3,4]
    */
    public List<Integer> indexOfTodas(T dato) {
        ListSE<Integer> res=new ListSE<>();
        if (!estaVacio()) {
            NodoSE<T> actual=inicio;
            int pos=0;
            while (pos<Longitud()) {
                if (actual.getDato().equals(dato)) {
                    res.insertarFinal(pos);
                }
                actual=actual.getSiguiente();
                pos+=1;
            }
        }
        return res; 
    }
    
    public void establecer(T d, int pos) {
        
    }
    
    public void intercambiar(int orig, int dest) {
        if (!estaVacio()) {
            NodoSE<T> origen,destino;
        }
    }
    
    public String serializar(char delimitador) {
        String res="";
        NodoSE<T> actual=inicio;
        while(actual!=null){
            res=res+actual.getDato();
            actual=actual.getSiguiente();
            if (!(actual==null)) {
                res+=delimitador;
            }
        }
        return res;
    }
    
    public List<List<T>> split(int n) {
        List<List<T>> res = new ListSE<>();
        if (!estaVacio()) {
            NodoSE<T> auxiliar=inicio;
            List<T> lista=new ListSE<>();
            lista.insertarFinal(auxiliar.getDato());
            auxiliar=auxiliar.getSiguiente();
            int cat=0;
            while(auxiliar!=null){
                if (cat<n) {
                    lista.insertarFinal(auxiliar.getDato());
                    cat++;
                }else{
                    res.insertarFinal(lista);
                    lista=new ListSE<>();
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
    public void eliminarSegmento(int a, int b){
        
    }
    public String toString(){
        String res = "[";
        if (! estaVacio()) {
            NodoSE<T> actual= inicio;
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
