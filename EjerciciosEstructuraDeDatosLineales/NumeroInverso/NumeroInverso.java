package Ejercicios.NumeroInverso;

import Pila.Pila;

public class NumeroInverso {
    
    public boolean esInverso(int number1,int number2){
        boolean res=true;
        Pila<Integer> PilaNumeros=new Pila<Integer>();
        while(number1>0){
            int digito=number1%10;
            PilaNumeros.push(digito);
            number1=number1/10;
        }
        while(number2>0 && !PilaNumeros.empty()){
            int digito=number2%10;
            if (PilaNumeros.pop()!=digito) {
                res=false;
            }
            number2=number2/10;
        }
        if (number2>0) {
            res=false;
        }
        if (!PilaNumeros.empty()) {
            res=false;
        }
        return res;
    }
}
