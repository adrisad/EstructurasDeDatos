import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Pila.Pila;

public class TestBuscarElemento {
    @Test
    public void Probar_buscar(){
        BuscarElemento<Integer> clase=new BuscarElemento<Integer>();
        clase.agregar(1);
        clase.agregar(2);
        clase.agregar(3);
        assertEquals(true,clase.buscar(1));
        assertEquals(false,clase.buscar(0));
        assertEquals(true,clase.buscar(3));
    }
}
