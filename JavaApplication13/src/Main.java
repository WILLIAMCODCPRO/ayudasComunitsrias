import Vista.Menu;
import Controlador.pedirDatos;
public class Main {

    public static void main(String[] args) {
        int opcionUsuario;

        do {
            Menu.mostrarMenuPrincipal();
            opcionUsuario = pedirDatos.pedirEntero();
            X
        } while (opcionUsuario != 7);
    }
}
