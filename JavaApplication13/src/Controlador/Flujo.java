package Controlador;

import Vista.InterfasUsuario;
import Vista.DatosIngresoUsuario;

public class Flujo {

    public static void programa() {
        int opcionUsuario;

        do {
            InterfasUsuario.mostarMenuPrincipal();
            opcionUsuario = DatosIngresoUsuario.pedirNumero("Elige una opcion");

        } while (opcionUsuario != 7);
    }
}
