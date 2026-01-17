package Modelo;

public class Colaborador extends Persona {
    private int horas;
    private double bonificacion;

    public Colaborador(int horas, String documento, String nombre, String apellido, String direccion, int edad) {
        super(documento, nombre, apellido, direccion, edad);
        this.horas = horas;
        this.bonificacion = calcularBonificacion();
    }
    
    private  double calcularBonificacion(){
        double bonificaion = horas * 55000;
        return bonificaion;
    }

    public int getHoras() {
        return horas;
    }

    public double getBonificacion() {
        return bonificacion;
    }
    
    @Override
    public void presentarse() {
        System.out.println("Hola, soy " + getNombre() + " y soy un colaborador");
    }
}
