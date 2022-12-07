package EjerciciosEstructuraDeDatosLineales.Ejercicio01;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import ListaDeSimpleEnlace.ListSE;

public class TestIncisoC {
    @Test
    public void Test_Invertir(){
        IncisoC ListaInvertida=new IncisoC();
        ListaInvertida.getNUmeros().insertarFinal(1);
        ListaInvertida.getNUmeros().insertarFinal(2);
        ListaInvertida.getNUmeros().insertarFinal(3);
        ListaInvertida.getNUmeros().insertarFinal(4);
        ListaInvertida.getNUmeros().insertarFinal(5);
        ListaInvertida.invertir();
        ListSE<Integer> aux=ListaInvertida.getNUmeros();
        assertEquals("[5,4,3,2,1]",aux.toString());
    }
}
