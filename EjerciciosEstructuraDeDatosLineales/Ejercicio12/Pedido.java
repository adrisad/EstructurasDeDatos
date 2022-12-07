package EjerciciosEstructuraDeDatosLineales.Ejercicio12;

public class Pedido implements Comparable<Pedido>{

    private int CantidadDeUnidades;
    private Distribuidor distribuidor;

    public Pedido(int CantidadDeUnidades,Distribuidor distribuidor){
        this.CantidadDeUnidades=CantidadDeUnidades;
        this.distribuidor=distribuidor;
    }

    public int compareTo(Pedido OtroPedido){
        int res=-1;
        if (distribuidor instanceof Mayorista && OtroPedido.getDitribuidor() instanceof Minorista) {
            res=1;
        }
        return res;
    }

    public Distribuidor getDitribuidor(){
        return distribuidor;
    }

    public int getCantidadDeUnidades(){
        return CantidadDeUnidades;
    }
}
