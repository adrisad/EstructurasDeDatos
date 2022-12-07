package Ejercicios.NavegadorWeb;

import javax.print.attribute.standard.MediaSize.NA;

import Pila.Pila;

public class Navegador {
    private Pila<String> espalda,delantero;
    private String actual;
    public Navegador(){
        actual = "http://www.acm.org";
        espalda = new Pila<String>();
        delantero = new Pila<String>();
    }
    
    public String espalda(){
        String res="";
        if (espalda.empty()) {
            res="Ignored";
        }else{
            delantero.push(actual);
            actual=espalda.pop();
            res=actual;
        }
        return res;
    }
}
