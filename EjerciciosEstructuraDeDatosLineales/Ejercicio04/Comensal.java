package EjerciciosEstructuraDeDatosLineales.Ejercicio04;

import ListaDeSimpleEnlace.ListSE;

public class Comensal {
    private String name;
    private ListSE<Plato> platos;
    public Comensal(String name){
        this.name=name;
        platos=new ListSE<Plato>();
    }
    public String getName(){
        return name;
    }
    public void AgregarPlato(Plato plato){
        platos.insertarFinal(plato);
    }
    public ListSE<Plato> getPlatos(){
        return platos;
    }
}
