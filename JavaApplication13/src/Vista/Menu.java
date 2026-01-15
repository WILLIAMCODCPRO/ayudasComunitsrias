package Vista;

public class Menu {

    public static void mostrarMenuPrincipal() {
        System.out.println("1 Registrar Empleado");
        System.out.println("2 Registar Colaborador");
        System.out.println("3 Registar Beneficiario");
        System.out.println("4 Ver Empleados");
        System.out.println("5 Ver Coaboladores");
        System.out.println("6 Ver Beneficiarios");
        System.out.println("7 Salir");
    }
    
    public static void crearMensajeMenu(String mensaje){
        System.out.println(mensaje);
    }
}
