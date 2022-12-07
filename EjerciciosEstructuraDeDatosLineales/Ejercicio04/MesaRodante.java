package EjerciciosEstructuraDeDatosLineales.Ejercicio04;

import ListaCircularDeSimpleEnlace.ListCSE;
import ListaDeSimpleEnlace.ListSE;

public class MesaRodante {
    private ListCSE<Plato> MesaDePlatos;
    private ListCSE<Comensal> ListaDeComensales;
    public MesaRodante(){}
    public void LlenarMesaDePlatos(ListSE<Comensal> comensales){
        for(int i=0;i<comensales.Longitud();i++){
            ListSE<Plato> platos=comensales.acceder(i).getPlatos();
            for(int j=0;j<platos.Longitud();j++){
                MesaDePlatos.insertarFinal(platos.acceder(j));
            }
        }
    }
    public void pedir(Comensal comensal,Plato plato){
        int posComensal=-1;
        for(int i=0;i<ListaDeComensales.Longitud();i++){
            if (comensal.getName()==ListaDeComensales.acceder(i).getName()) {
                posComensal=i;
                i=ListaDeComensales.Longitud();
            }
        }
        int factor=MesaDePlatos.Longitud()/ListaDeComensales.Longitud();
        int posEnLaMesa=posComensal*factor;
        while (MesaDePlatos.acceder(posEnLaMesa).getName()!=plato.getName()) {
            Plato platoAux=MesaDePlatos.eliminar(MesaDePlatos.Longitud()-1);
            MesaDePlatos.insertarInicio(platoAux);
        }
        
    }
    public void ElPlatoDeLuiz
}
