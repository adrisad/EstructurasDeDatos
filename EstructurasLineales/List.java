package ListaGeneral;

public interface List<T> {

    public boolean estaVacio();

    public void insertarFinal(T dato);
    public void insertarInicio(T dato);
    public void insertar(T dato,int pos);

    public T acceder(int pos);
    public List<T> acceder(int inferior,int superior);

    public T eliminar(int pos);
    public T eliminar(T dato);
    public void eliminarTodo();
    public List<T> eliminarTodas(T dato);
    public List<T> eliminar(int inferior,int superior);
    public List<T> eliminarTodasList(T dato);

    public int Longitud();
    public String serializar();
    public int indexOf(T dato);
    public boolean Buscar(T dato);
    public List<Integer> indexOfTodas(T dato);

    public void establecer(T d, int pos);
    public void intercambiar(int orig, int dest);
    public String serializar(char delimitador);
    public List<List<T>> split(int n);
    public String toString();
}
