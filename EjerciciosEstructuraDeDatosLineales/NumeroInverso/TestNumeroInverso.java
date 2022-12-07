package Ejercicios.NumeroInverso;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestNumeroInverso {
    @Test
    public void Probar_NumeroInverso(){
        NumeroInverso inverso=new NumeroInverso();
        assertEquals(true,inverso.esInverso(321, 123));
        assertEquals(false,inverso.esInverso(321, 6123));
        assertEquals(false,inverso.esInverso(3213, 6123));
    }
}
