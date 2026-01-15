package Modelo;


public class Persona  {
    private String documento;
    private String nombre;
    private String apellido;
    private String direccion;
    private int edad;

    public Persona(String documento, String nombre, String apellido, String direccion, int edad) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEdad() {
        return edad;
    }
    
    public void presentarse(){
        System.out.println("Hola soy una persona");
    }

   
}
