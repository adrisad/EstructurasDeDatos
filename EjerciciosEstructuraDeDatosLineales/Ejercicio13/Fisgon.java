package EjerciciosEstructuraDeDatosLineales.Ejercicio13;

import Pila.Pila;

public class Fisgon {
    public String EliminarLetrasIdenticas(String texto){
        String res="";
        Pila<Character> pilaAuxiliar=new Pila<Character>();
        int pos=1;
        pilaAuxiliar.push(texto.charAt(0));
        while (pos<texto.length()) {
            if (pilaAuxiliar.empty()) {
                pilaAuxiliar.push(texto.charAt(pos));
            }else{
                if (pilaAuxiliar.verDato()==texto.charAt(pos)) {
                    pilaAuxiliar.pop();
                }else{
                    pilaAuxiliar.push(texto.charAt(pos));
                }
            }
            pos++;
        }
        while (!pilaAuxiliar.empty()) {
            res=pilaAuxiliar.pop()+""+res;
        }
        return res;
    }
}
