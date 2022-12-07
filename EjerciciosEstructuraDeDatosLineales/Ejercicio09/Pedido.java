package EjerciciosEstructuraDeDatosLineales.Ejercicio09;

import ListaDeDobleEnlace.ListDE;

public class Pedido {
    private String cliente;
    private String direccion;
    private ListDE<Objeto> objetos;
    private String zona;
    public Pedido(String cliente,String direccion,String zona){
        this.cliente=cliente;
        this.direccion=direccion;
        objetos=new ListDE<Objeto>();
        this.zona=zona;
    }
    public void AgregarObjetos(){

    }
    public int PesoTotal(){
        int res=0;
        for(int i=0;i<objetos.Longitud();i++){
            res=res+objetos.acceder(i).getPeso();
        }
        return res;
    }

}
