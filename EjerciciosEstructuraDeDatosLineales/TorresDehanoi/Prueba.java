package Ejercicios.TorresDehanoi;

import java.util.List;

import ListaDeSimpleEnlace.ListSE;

public class Prueba {
    public static void main(String[] args) {
        ListSE<Integer> lista=new ListSE();
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);
        lista.insertarFinal(4);
        System.out.println(lista);
    }
}
