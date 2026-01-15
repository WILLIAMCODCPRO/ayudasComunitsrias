import Vista.Menu;
import Controlador.pedirDatos;
public class Main {

    public static void main(String[] args) {
        int opcionUsuario;

        do {
            Menu.mostrarMenuPrincipal();
            opcionUsuario = pedirDatos.pedirEntero();

        } while (opcionUsuario != 7);
    }
}
