package Modelo;

import java.util.ArrayList;

public class Datos {

    private ArrayList<Empleado> datosEmpleados;
    private ArrayList<Colaborador> datosColaborador;
    private ArrayList<Beneficiario> datosBeneficiario;

    public Datos() {
        datosEmpleados = new ArrayList<>();
        datosColaborador = new ArrayList<>();
        datosBeneficiario = new ArrayList<>();
    }

    public ArrayList<Empleado> getDatosEmpleados() {
        return datosEmpleados;
    }

    public ArrayList<Colaborador> getDatosColaborador() {
        return datosColaborador;
    }

    public ArrayList<Beneficiario> getDatosBeneficiario() {
        return datosBeneficiario;
    }

    public void agregarEmpleado(Empleado nuevoEmpleado) {
        datosEmpleados.add(nuevoEmpleado);
    }

    
}
