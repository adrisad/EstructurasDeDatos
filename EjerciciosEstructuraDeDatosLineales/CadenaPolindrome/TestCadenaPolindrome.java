package EjerciciosEstructuraDeDatosLineales.CadenaPolindrome;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCadenaPolindrome {
    private CadenaPolindrome maquina;
    @Before
    public void Herramienta(){
        maquina=new CadenaPolindrome();
    }
    @Test
    public void Test_esPolindrome(){
        assertEquals(true, maquina.esPolindrome("oso"));
    }
}
