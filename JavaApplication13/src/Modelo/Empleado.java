package Modelo;


public class Empleado extends Persona{
    private double salario;
    private String cargo;
    private String horario;

    public Empleado(double salario, String cargo, String horario, String documento, String nombre, String apellido, String direccion, int edad) {
        super(documento, nombre, apellido, direccion, edad);
        this.salario = salario;
        this.cargo = cargo;
        this.horario = horario;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public String getHorario() {
        return horario;
    }
}
