package Controlador;
import Modelo.Datos;

public class guardarDatos {
   private static  Datos baseDeDatos = new Datos();

    public static Datos getBaseDeDatos() {
        return baseDeDatos;
    }
   
}
