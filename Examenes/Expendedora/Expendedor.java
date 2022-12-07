package Examenes.Expendedora;

import Cola.Cola;
import Pila.Pila;

public class Expendedor {
    private Cola<Producto> ganchoDePapasFritas,ganchoDeNachos,ganchoDeGomitas;
    public Expendedor(){
        ganchoDePapasFritas=new Cola<Producto>();
        ganchoDeGomitas=new Cola<Producto>();
        ganchoDeNachos=new Cola<Producto>();
    }
    public void insertarProducto(Producto producto){

    }
    public void sensor(Producto producto){
        if (producto instanceof PapasFritas) {
            ganchoDePapasFritas.insert(producto);
        }else if (producto instanceof Nachos) {
            ganchoDeNachos.insert(producto);
        }else if (producto instanceof Gomitas) {
            ganchoDeGomitas.insert(producto);
        }
    }
    public Producto vender(Producto producto){
        Producto res=null;
        if (producto instanceof PapasFritas) {
            res=ganchoDePapasFritas.remove();
        }else if (producto instanceof Gomitas) {
            res=ganchoDeGomitas.remove();
        }else if (producto instanceof Nachos) {
            res=ganchoDeNachos.remove();
        }
        return res;
    }
    public Producto VerificarCantidaDeGancho(){
        if () {
            
        }
    }

}
