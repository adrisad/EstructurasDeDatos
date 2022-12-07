package EstructurasLineales;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ListSE_Test {
    private List<Integer> lista;

    @Before
    public void ListaDeSimpleEnlace(){
        lista=new ListSE<Integer>();
    }

    @Test
    public void Test_estaVacio(){
        assertEquals(true,lista.estaVacio());
        lista.insertarFinal(2);
        assertEquals(false,lista.estaVacio());
    }

    @Test
    public void Test_insertarFinal(){
        lista.insertarFinal(5);
        lista.insertarFinal(6);
        assertEquals(5,lista.acceder(0));
        assertEquals(6,lista.acceder(1));
    }

    @Test
    public void Test_insertarInicio(){
        lista.insertarInicio(2);
        lista.insertarInicio(3);
        assertEquals(3,lista.acceder(0));
        assertEquals(2,lista.acceder(1));
    }

    @Test
    public void Test_insertar(){
        lista.insertar(1, 0);
        assertEquals(1, lista.acceder(0));
        lista.insertar(2, 0);
        lista.insertar(3, 1);
        lista.insertar(5, 1);
        assertEquals(2, lista.acceder(0));
        assertEquals(5, lista.acceder(1));
        assertEquals(3, lista.acceder(2));
        assertEquals(1, lista.acceder(3));

    }

    @Test
    public void Test_acceder(){
        lista.insertarFinal(4);
        lista.insertarFinal(3);
        assertEquals(4,lista.acceder(0));
        assertEquals(3,lista.acceder(1));
    }

    @Test
    public void Test_accederInferiorYsuperior(){
        List<Integer> listaAuxiliar=new ListSE<Integer>();
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
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);
        assertEquals(2, lista.eliminar(1));
        assertEquals(1,lista.acceder(0));
        assertEquals(3,lista.acceder(1));
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
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);
        lista.insertarFinal(4);
        List<Integer> ElementoEliminados=lista.eliminar(0, 2);
        assertEquals("[1,2]", ElementoEliminados.toString());
    }
    
    @Test
    public void Test_eliminarTodasList(){
        
    }

    @Test
    public void Test_Longitud(){
        lista.insertarInicio(2);
        lista.insertarInicio(2);
        lista.insertarInicio(2);
        assertEquals(3,lista.Longitud());
    }

    @Test
    public void Test_selearizar(){
        ListSE<Integer>list=new ListSE<>();
        list.insertarInicio(2);
        list.insertarInicio(2);
        list.insertarInicio(2);
        list.insertarInicio(2);
        assertEquals("2222",list.serializar());
    }

    @Test
    public void Test_indexOf(){
        ListSE<Integer>list=new ListSE<>();
        list.insertarFinal(4);
        list.insertarFinal(3);
        assertEquals(1,list.indexOf(3));
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
        ListSE<Integer>list=new ListSE<>();
        list.insertarInicio(2);
        list.insertarInicio(2);
        assertEquals("2,2",list.serializar(','));
    }
    
    @Test
    public void Test_Split(){
        ListSE<Integer>list=new ListSE<>();
        List<List<Integer>> list2=new ListSE<>();
        ListSE<Integer>listAux=new ListSE<>();
        
        list2.insertarFinal(listAux);
        
        assertEquals(list2, list.split(2));
    }
    
    @Test
    public void Test_eliminarSegmento(){
        ListSE<Integer>list=new ListSE<>();
        List<List<Integer>> list2=new ListSE<>();
        ListSE<Integer>listAux=new ListSE<>();
        
        list2.insertarFinal(listAux);
        
        assertEquals(list2, list.split(2));
    }

    @Test
    public void Test_toString(){
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);
        assertEquals("[1,2,3]", lista.toString());
    }
}
