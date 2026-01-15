package Vista;

import java.util.Scanner;
public class DatosIngresoUsuario {
    static Scanner emilia = new Scanner(System.in);
    
    public static int pedirNumero(String mensaje) {
        hacerMensaje(mensaje);
        
    }
    
  
    
    public static void hacerMensaje(String mensaje){
        System.out.println(mensaje);    
    }
    
    public static int validarNumero() {
        while (true) {
            try {
                int opcionUsuario = emilia.nextInt();
                return opcionUsuario;
            } catch (Exception e) {
                System.out.println("Dato no valido");
            }
        }
    }
}
