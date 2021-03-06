
import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;


public class Gato {

    public static void main(String[] args) {
        Modelo m = new Modelo();
        Vista v = new Vista();
        Controlador con = new Controlador(v, m);
        con.Iniciar_Vista();
    }
    
}
