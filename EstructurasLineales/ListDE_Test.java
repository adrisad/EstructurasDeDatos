package EstructurasLineales;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ListDE_Test {
    private List<Integer> lista;
    
    @Before
    public void ListaDeSimpleEnlace(){
        lista=new ListDE<Integer>();
    }

    @Test
    public void Test_estaVacio(){
        assertEquals(true, lista.estaVacio());
        lista.insertarInicio(1);
        assertEquals(false, lista.estaVacio());
    }

    @Test
    public void Test_insertarFinal(){
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        assertEquals(1, lista.acceder(0));
        assertEquals(2, lista.acceder(1));
    }

    @Test
    public void Test_insertarInicio(){
        lista.insertarInicio(2);
        lista.insertarInicio(1);
        assertEquals(1, lista.acceder(0));
        assertEquals(2, lista.acceder(1));
    }

    @Test
    public void Test_insertar(){

    }

    @Test
    public void Test_acceder(){
        lista.insertarInicio(2);
        lista.insertarInicio(1);
        assertEquals(1, lista.acceder(0));
        assertEquals(2, lista.acceder(1));
    }

    @Test
    public void Test_accederInferiorYsuperior(){
        List<Integer> listaAuxiliar=new ListDE<Integer>();
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);
        listaAuxiliar=lista.acceder(0, 0);
        assertEquals(1,listaAuxiliar.acceder(0));
        assertEquals(null,listaAuxiliar.acceder(1));
        listaAuxiliar=lista.acceder(0, 1);
        assertEquals(1,listaAuxiliar.acceder(0));
        assertEquals(2,listaAuxiliar.acceder(1));
        assertEquals(null,listaAuxiliar.acceder(2));
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
        lista.insertarFinal(3);
        assertEquals(3,lista.Longitud());
    }

    @Test
    public void Test_selearizar(){
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);
        assertEquals("123",lista.serializar());
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
        assertEquals("[1,2,3]", lista.toString());
    }
}
