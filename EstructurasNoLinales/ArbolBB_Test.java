import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestArbolBB {
    @Test
    public void Test_minimo(){
        ArbolBB<Integer> arbol=new ArbolBB<Integer>();
        arbol.insert(1);
        arbol.insert(2);
        arbol.insert(3);
        arbol.insert(4);
        arbol.insert(5);
        arbol.insert(0);
        assertEquals(0, arbol.minimo());
        assertEquals(5, arbol.maximo());
        assertEquals("[2,3,4,5]", arbol.datoMayores(1)+"");

    }
}
