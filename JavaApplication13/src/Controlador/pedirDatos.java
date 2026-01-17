package Controlador;
import Vista.Menu;
import java.util.Scanner;
import java.util.ArrayList;
public class pedirDatos {
    
    public static int pedirOpcionMenu(){
        Menu.crearMensajeMenu("Elige una opcion");
        return validarDatos.validarNumeroEnUnRango(0,8, "Opcion no disponible porfavor ingresa una opcion valida");
        
    }
    
    public static int pedirEdad(){
        Menu.crearMensajeMenu("Edad");
        return validarDatos.validarNumeroEnUnRango(17,1100,"Rango de edad no valido");
        
    }
    
    public static int pedirHoraColaborador(){
        Menu.crearMensajeMenu("Horas");
        return validarDatos.validarNumeroEnUnRango(0,26,"Solo pude tener maximo 25 horas");
        
    }
    
     public static int pedirCantidadDeAyudasAlMes(){
        Menu.crearMensajeMenu("Cantidad de ayudas al mes recibidas");
        return validarDatos.validarNumeroEnUnRango(0,6,"Solo pude tener 5 ayudas al mes");
        
    }
    
    public static String pedirString(String mensaje){
        Menu.crearMensajeMenu(mensaje);
        String texto = new Scanner(System.in).nextLine();
        return texto;
    }
    
    public static double pedirSalarioEmpleado(){
        Menu.crearMensajeMenu("Ingresa el salario del empleado");
        return validarDatos.validarSalarioEmpleado();
    }
    
    public static ArrayList<String> pedirDatosPersonas() {
        ArrayList<String> datosPersonas = new ArrayList<>();
        datosPersonas.add(pedirString("Documento"));
        datosPersonas.add(pedirString("Nombre"));
        datosPersonas.add(pedirString("apellido"));
        datosPersonas.add(pedirString("Direccion"));
        datosPersonas.add(String.valueOf(pedirEdad()));
        return datosPersonas;
    }
    
    public static ArrayList<String> pedirDatosEmpleado() {
        ArrayList<String> datosEmpleado = pedirDatosPersonas();
        datosEmpleado.add(String.valueOf(pedirSalarioEmpleado()));
        datosEmpleado.add(pedirString("Cargo"));
        datosEmpleado.add(pedirString("horario"));
        return datosEmpleado;
    }
    
    public static ArrayList<String> pedirDatosColaborador() {
        ArrayList<String> datosColaborador = pedirDatosPersonas();
        datosColaborador.add(String.valueOf(pedirHoraColaborador()));
        return datosColaborador;
    }
    
    public static ArrayList<String> pedirDatosBeneficiario() {
        ArrayList<String> datosBeneficiario = pedirDatosPersonas();
        datosBeneficiario.add(String.valueOf(pedirCantidadDeAyudasAlMes()));
        return datosBeneficiario;
    }
}


