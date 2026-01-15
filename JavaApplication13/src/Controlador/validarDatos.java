package Controlador;
import Vista.Menu;
import java.util.Scanner;
public class validarDatos {

    public static int validarEntero(int rango1, int rango2) {
        while (true) {
            try {
                int numeroEntero = new Scanner(System.in).nextInt();
                if(numeroEntero <= rango1 || numeroEntero >= rango2){
                    Menu.crearMensajeMenu("Opciones no disponibles porfavor elige una opcion disponible");
                }else{
                    return numeroEntero;
                }
            } catch (Exception e) {
                Menu.crearMensajeMenu("El dat no puede ser una letar ingresa un numero porfavor");
            }
        }
    }
}
