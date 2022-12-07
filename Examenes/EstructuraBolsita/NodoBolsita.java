package Examenes.EstructuraBolsita;

public class NodoBolsita<T> {
    private T dato;
    private int Repeticiones;
    NodoBolsita<T> siguiente;
    NodoBolsita<T> anterior;

    public NodoBolsita(T dato){
        this.dato=dato;
        siguiente=null;
        anterior=null;
        Repeticiones=1;
    }
    public T getDato(){
        return dato;
    }
    public void setDato(T dato){
        this.dato=dato;
    }
    public NodoBolsita<T> getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(NodoBolsita<T> siguiente){
        this.siguiente=siguiente;
    }
    public NodoBolsita<T> getAnterior(){
        return anterior;
    }
    public void setAnterior(NodoBolsita<T> anterior){
        this.anterior=anterior;
    }
    public int getRepeticiones(){
        return Repeticiones;
    }
    public void setRepeticiones(int Repeticiones){
        this.Repeticiones=Repeticiones;
    }
    public boolean equals(NodoBolsita<T> otro){
        return this.dato.equals(otro.getDato());
    }
}
