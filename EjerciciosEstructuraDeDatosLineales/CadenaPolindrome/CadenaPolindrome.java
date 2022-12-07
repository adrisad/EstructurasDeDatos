package EjerciciosEstructuraDeDatosLineales.CadenaPolindrome;
import BiColas.BiColaEntradaRestringida;

public class CadenaPolindrome {
    private BiColaEntradaRestringida<Character> caracteres;
    public CadenaPolindrome(){
        caracteres= new BiColaEntradaRestringida<Character>();
    }
    public void agregarCaracteres(String cadena){
        for(int i=0;i<cadena.length();i++){
            caracteres.insert(cadena.charAt(i));
        }
    }
    public boolean esPolindrome(String cadena){
        boolean res=true;
        
        agregarCaracteres(cadena);
        char caracterInicio=caracteres.removeFirst();
        char caracterFinal=caracteres.removeLast();
        while (!(caracteres.empty())&&res==true) {
            if (!caracteres.empty()) {
                if (caracterInicio!=caracterFinal) {
                    res=false;
                }
            }
            if (!caracteres.empty()) {
                caracterInicio=caracteres.removeFirst();
            }
            if (!caracteres.empty()) {
                caracterFinal=caracteres.removeLast();
            }  
        }
        return res;
    }
}
