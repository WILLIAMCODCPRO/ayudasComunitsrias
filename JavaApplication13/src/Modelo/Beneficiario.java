package Modelo;

public class Beneficiario extends Persona{
    private int cantidadAyudasMes;

    public Beneficiario(int cantidadAyudasMes, String documento, String nombre, String apellido, String direccion, int edad) {
        super(documento, nombre, apellido, direccion, edad);
        this.cantidadAyudasMes = cantidadAyudasMes;
    }

    public int getCantidadAyudasMes() {
        return cantidadAyudasMes;
    }
    
    @Override
    public void presentarse() {
        System.out.println("Hola, soy " + getNombre() + " y soy un Beneficiario");
    }
}
