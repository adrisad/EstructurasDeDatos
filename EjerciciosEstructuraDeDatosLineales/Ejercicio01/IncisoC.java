package EjerciciosEstructuraDeDatosLineales.Ejercicio01;
import ListaDeSimpleEnlace.ListSE;

public class IncisoC{
    private ListSE<Integer> numeros;
    public IncisoC(){
        numeros=new ListSE<Integer>();
    }
    public void invertir(){
        ListSE<Integer> auxi=new ListSE<Integer>();
        while(numeros.estaVacio()!=true){
            auxi.insertarInicio(numeros.eliminar(0));
        }
        while(auxi.estaVacio()!=true){
            numeros.insertarFinal(auxi.eliminar(0));
        }
    }
    public ListSE<Integer> getNUmeros(){
        return numeros;
    }

}