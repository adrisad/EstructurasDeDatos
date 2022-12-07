package Examenes.ListaClasificada;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Prueba {
    @Test
    public void Prueba(){
        ListaClasificada<Integer> lista=new ListaClasificada<Integer>();
        lista.insert(4);
        lista.insert(7);
        lista.insert(1);
        lista.insert(4);
        lista.insert(2);
        lista.insert(8);
        lista.insert(4);
        lista.insert(2);
        lista.insert(5);
        lista.insert(5);
        lista.insert(1);
        lista.insert(2);
        assertEquals("[4,4,4,7,1,1,2,2,2,8,5,5]", lista.toString());
    }
}
