package Examenes.EstructuraBolsita;

public class Bolsita<T> {
    NodoBolsita<T> inicio;
    public Bolsita(){
        inicio=null;
    }
    public boolean empty(){
        return inicio==null;
    }
    public void insert(T dato){
        NodoBolsita<T> nuevo=new NodoBolsita<T>(dato);
        if (empty()) {
            inicio=nuevo;
        }else{

        }
    }
    public NodoBolsita<T> BuscarNodo(){
        
    }
}
