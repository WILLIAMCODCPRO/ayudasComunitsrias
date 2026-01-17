import Vista.Menu;
import Controlador.pedirDatos;
import java.util.ArrayList;
import Controlador.crearFundacion;
public class Main {

    public static void main(String[] args) {
        int opcionUsuario;
        
        do {
            Menu.mostrarMenuPrincipal();
            opcionUsuario = pedirDatos.pedirOpcionMenu();
            switch(opcionUsuario){
                case 1:
                    ArrayList<String> datosEmpleado = pedirDatos.pedirDatosEmpleado();
                    crearFundacion.funduacion.registrarEmpleado(datosEmpleado);
                    break;
                case 2:
                    ArrayList<String> datosColaborador = pedirDatos.pedirDatosColaborador();
                    crearFundacion.funduacion.registrarColaborador(datosColaborador);
                    break;
                case 3:
                    ArrayList<String> datosBeneficiario = pedirDatos.pedirDatosBeneficiario();
                    crearFundacion.funduacion.registrarBeneficiario(datosBeneficiario);
                    break;
                case 4:
                    crearFundacion.funduacion.VerEmpleado();
                    break;
                case 5:
                    crearFundacion.funduacion.VerColaborador();
                    break;
                case 6:
                    crearFundacion.funduacion.VerBeneficiario();
                    break;
                case 7:
                    Menu.crearMensajeMenu("Adios, Cerrando Programa");
                    break;
            }
        } while (opcionUsuario != 7);
    }
}
