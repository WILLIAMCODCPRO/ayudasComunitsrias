package Controlador;
import Vista.Menu;

public class pedirDatos {
    public static int pedirEntero(){
        Menu.crearMensajeMenu("Elige una opcion");
        return validarDatos.validarEntero(0, 8);
        
    }
}
