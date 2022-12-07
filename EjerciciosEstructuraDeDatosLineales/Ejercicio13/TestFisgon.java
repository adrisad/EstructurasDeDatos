package EjerciciosEstructuraDeDatosLineales.Ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestFisgon {
    @Test
    public void Test(){
        Fisgon Eje=new Fisgon();
        String res=Eje.EliminarLetrasIdenticas("wwstdaadierfflitzzz");
        assertEquals("stierlitz", res);
    }
}
