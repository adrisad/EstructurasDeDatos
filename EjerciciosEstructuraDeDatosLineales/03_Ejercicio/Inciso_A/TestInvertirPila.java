import static org.junit.Assert.assertEquals;
import org.junit.Test;

import Pila.Pila;

public class TestInvertirPila {
    @Test
    public void Prueba_InvertirPila(){
        Pila<Integer> pilas=new Pila<Integer>();
        pilas.push(3);
        pilas.push(2);
        pilas.push(1);
        InvertirPila<Integer> invertirPila=new InvertirPila<>();
        invertirPila.agregarElemento(1);
        invertirPila.agregarElemento(2);
        invertirPila.agregarElemento(3);
        invertirPila.invertir();
        assertEquals(pilas.verDato(),invertirPila.getPila().verDato());
    }
}
