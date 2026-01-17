package Controlador;
import Vista.Menu;
import java.util.Scanner;
public class validarDatos {

    public static int validarNumeroEnUnRango(int rango1, int rango2, String mensajeMenu) {
        while (true) {
            try {
                int numero = new Scanner(System.in).nextInt();
                if(numero <= rango1 || numero >= rango2){
                    Menu.crearMensajeMenu(mensajeMenu);
                }else{
                    return numero;
                }
            } catch (Exception e) {
                Menu.crearMensajeMenu("El dato no puede ser una letar ingresa un numero porfavor");
            }
        }
    }
    
    public static double validarSalarioEmpleado() {
        while (true) {
            try {
                double salarioEmpleado = new Scanner(System.in).nextDouble();
                if(salarioEmpleado <= 0){
                    Menu.crearMensajeMenu("El salario del empleado no puede ser negativo o 0");
                }else{
                    return salarioEmpleado;
                }
            } catch (Exception e) {
                Menu.crearMensajeMenu("El dato no puede ser una letar ingresa un numero porfavor");
            }
        }
    }
    
   
}
