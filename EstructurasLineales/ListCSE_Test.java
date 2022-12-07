package EstructurasLineales;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ListCSE_Test {
    private ListCSE<Integer> lista;
    
    @Before
    public void ListaCircularDeSimpleEnlace(){
        lista=new ListCSE<Integer>();
    }

    @Test
    public void Test_estaVacio(){
        assertEquals(true,lista.estaVacio());
        lista.insertarFinal(1);
        assertEquals(false,lista.estaVacio());
    }

    @Test
    public void Test_insertarFinal(){
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        assertEquals(1,lista.acceder(0));
        assertEquals(2,lista.acceder(1));
    }

    @Test
    public void Test_insertarInicio(){
        lista.insertarInicio(3);
        lista.insertarInicio(2);
        lista.insertarInicio(1);
        assertEquals(1,lista.acceder(0));
        assertEquals(2,lista.acceder(1));
        assertEquals(3,lista.acceder(2));
    }

    @Test
    public void Test_insertar(){

    }

    @Test
    public void Test_acceder(){
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        assertEquals(1,lista.acceder(0));
        assertEquals(2,lista.acceder(1));
    }

    @Test
    public void Test_accederInferiorYsuperior(){
        ListCSE<Integer> listaAuxiliar=new ListCSE<>();
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);
        listaAuxiliar=(ListCSE<Integer>) lista.acceder(0, 0);
        assertEquals("[1]",listaAuxiliar.toString());
        listaAuxiliar=(ListCSE<Integer>) lista.acceder(0, 2);
        assertEquals("[1,2,3]",listaAuxiliar.toString());
    }

    @Test
    public void Test_eliminarDadaUnaPosicion(){
        
    }

    @Test
    public void Test_eliminar_devuelveBolean(){
        
    }
    
    @Test
    public void Test_eliminarTodo(){
        lista.insertarFinal(1);
        assertEquals(false, lista.estaVacio());
        lista.eliminarTodo();
        assertEquals(true, lista.estaVacio());
    }

    @Test
    public void Test_eliminarTodas(){
        
    }

    @Test
    public void Test_eliminar_deUnRangoSuperiorYinferior(){
        
    }
    
    @Test
    public void Test_eliminarTodasList(){
        
    }

    @Test
    public void Test_Longitud(){
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        assertEquals(2,lista.Longitud());
    }

    @Test
    public void Test_selearizar(){
        
    }

    @Test
    public void Test_indexOf(){
        
    }
    
    @Test
    public void Test_Buscar(){
        
    }

    @Test
    public void Test_indexOfTodas(){
        
    }
    
    @Test
    public void Test_establecer(){
        
    }

    @Test
    public void Test_intercambiar(){
        
    }

    @Test
    public void Test_serializarConDelimitador(){
        
    }
    
    @Test
    public void Test_Split(){
        
    }
    
    @Test
    public void Test_eliminarSegmento(){
        
    }

    @Test
    public void Test_toString(){
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);
        assertEquals("[1,2,3]",lista.toString());
    }
}
