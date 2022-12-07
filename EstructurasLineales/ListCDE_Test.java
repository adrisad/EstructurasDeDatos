package EstructurasLineales;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ListCDE_Test {

    private List<Integer> lista;

    @Before
    public void lista(){
        lista=new ListCDE<Integer>();
    }

    @Test
    public void Test_estaVacio(){
        assertEquals(true,lista.estaVacio());
        lista.insertarInicio(1);
        assertEquals(false,lista.estaVacio());
    }

    @Test
    public void Test_insertarFinal(){
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);
        assertEquals(1,lista.acceder(0));
        assertEquals(2,lista.acceder(1));
        assertEquals(3,lista.acceder(2));
    }

    @Test
    public void Test_insertarInicio(){
        lista.insertarInicio(2);
        lista.insertarInicio(1);
        assertEquals(1,lista.acceder(0));
        assertEquals(2,lista.acceder(1));
    }

    @Test
    public void Test_acceder(){
        lista.insertarInicio(2);
        lista.insertarInicio(1);
        assertEquals(1,lista.acceder(0));
        assertEquals(2,lista.acceder(1));
    }
    @Test
    public void Test_eliminarTodo(){
        lista.insertarFinal(1);
        assertEquals(false, lista.estaVacio());
        lista.eliminarTodo();
        assertEquals(true, lista.estaVacio());
    }
    
    
    @Test
    public void Verificar_metodo_eliminarTodas(){
        
    }
    @Test
    public void Verificar_metodo_Longitud(){
        assertEquals(0,lista.Longitud());

        lista.insertarFinal(4);
        assertEquals(1,lista.Longitud());
    }
    
    @Test
    public void Verificar_metodo_serializar(){
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);
        assertEquals("123",lista.serializar());
    }
    @Test
    public void Verificar_metodo_indexOf(){
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);
        assertEquals(0,lista.indexOf(1));
        assertEquals(1,lista.indexOf(2));
        assertEquals(2,lista.indexOf(3));
    }
    @Test
    public void Verificar_metodo_indexOfTodas(){
        
    }
    @Test
    public void Verificar_metodo_establecer(){
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);
        lista.establecer(100, 0);
        assertEquals(100,lista.acceder(0));
        assertEquals(1,lista.acceder(1));
    }
    @Test
    public void Verificar_metodo_serializarConDelimitador(){
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);
        assertEquals("1,2,3",lista.serializar(','));
    }
    @Test
    public void Verificar_metodo_split(){
    }
    @Test
    public void Verificar_metodo_BuscarNodo(){

    }
    
    @Test
    public void Test_toString(){
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);
        assertEquals("[1,2,3]",lista.toString());
    }
}
