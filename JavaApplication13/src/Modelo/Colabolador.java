package Modelo;

public class Colabolador extends Persona {
    private int horas;
    private double bonificacion;

    public Colabolador(int horas, String documento, String nombre, String apellido, String direccion, int edad) {
        super(documento, nombre, apellido, direccion, edad);
        this.horas = horas;
        this.bonificacion = calcularBonificacion();
    }
    
    public double calcularBonificacion(){
        double bonificaion = horas * 55000;
        return bonificaion;
    }

    public int getHoras() {
        return horas;
    }

    public double getBonificacion() {
        return bonificacion;
    }
}
