package Modelo;

import java.util.ArrayList;

public class Fundacion extends Funciones{

    private Datos baseDeDatos;

    public Fundacion(Datos baseDeDatos) {
        this.baseDeDatos = baseDeDatos;
    }
    
    @Override
    public void registrarColaborador(ArrayList<String> datosColaborador) {
        baseDeDatos.getDatosColaborador().add(
                new Colaborador(
                        Integer.parseInt(datosColaborador.get(5)),
                        datosColaborador.get(0),
                        datosColaborador.get(1),
                        datosColaborador.get(2),
                        datosColaborador.get(3),
                        Integer.parseInt(datosColaborador.get(4))
                ));
    }

    @Override
    public void VerColaborador() {
        for (int i = 0; i < baseDeDatos.getDatosColaborador().size(); i++) {
            System.out.println("-----------------------------------------------------------------");
            baseDeDatos.getDatosColaborador().get(i).presentarse();
            System.out.println("Nombre: "+baseDeDatos.getDatosColaborador().get(i).getNombre());
            System.out.println("Apellido: "+baseDeDatos.getDatosColaborador().get(i).getApellido());
            System.out.println("Documento: "+baseDeDatos.getDatosColaborador().get(i).getDocumento());
            System.out.println("Direccion: "+baseDeDatos.getDatosColaborador().get(i).getDireccion());
            System.out.println("Edad: "+baseDeDatos.getDatosColaborador().get(i).getEdad());
            System.out.println("Horas: "+baseDeDatos.getDatosColaborador().get(i).getHoras());
            System.out.println("Bonificacion: "+baseDeDatos.getDatosColaborador().get(i).getBonificacion());
            System.out.println("------------------------------------------------------------------");
        }
    }

    @Override
    public void registrarEmpleado(ArrayList<String> datosEmpleado) {
        baseDeDatos.getDatosEmpleados().add(
                new Empleado(
                        Double.parseDouble(datosEmpleado.get(5)),
                        datosEmpleado.get(6),
                        datosEmpleado.get(7),
                        datosEmpleado.get(0),
                        datosEmpleado.get(1),
                        datosEmpleado.get(2),
                        datosEmpleado.get(3),
                        Integer.parseInt(datosEmpleado.get(4))
                ));
    }

    @Override
    public void VerEmpleado() {
        for (int i = 0; i < baseDeDatos.getDatosEmpleados().size(); i++) {
            System.out.println("-----------------------------------------------------------------");
            baseDeDatos.getDatosEmpleados().get(i).presentarse();
            System.out.println("Nombre: "+baseDeDatos.getDatosEmpleados().get(i).getNombre());
            System.out.println("Apellido: "+baseDeDatos.getDatosEmpleados().get(i).getApellido());
            System.out.println("Documento: "+baseDeDatos.getDatosEmpleados().get(i).getDocumento());
            System.out.println("Direccion: "+baseDeDatos.getDatosEmpleados().get(i).getDireccion());
            System.out.println("Edad: "+baseDeDatos.getDatosEmpleados().get(i).getEdad());
            System.out.println("Salario: "+baseDeDatos.getDatosEmpleados().get(i).getSalario());
            System.out.println("Cargo: "+baseDeDatos.getDatosEmpleados().get(i).getCargo());
            System.out.println("Horario: "+baseDeDatos.getDatosEmpleados().get(i).getHorario());
            System.out.println("------------------------------------------------------------------");
        }
    }

    @Override
    public void registrarBeneficiario(ArrayList<String> datosBeneficiario) {
        baseDeDatos.getDatosBeneficiario().add(
                new Beneficiario(
                        Integer.parseInt(datosBeneficiario.get(5)),
                        datosBeneficiario.get(0),
                        datosBeneficiario.get(1),
                        datosBeneficiario.get(2),
                        datosBeneficiario.get(3),
                        Integer.parseInt(datosBeneficiario.get(4))
                ));
    }

    @Override
    public void VerBeneficiario() {
        for (int i = 0; i < baseDeDatos.getDatosBeneficiario().size(); i++) {
            System.out.println("-----------------------------------------------------------------");
            baseDeDatos.getDatosBeneficiario().get(i).presentarse();
            System.out.println("Nombre: "+baseDeDatos.getDatosBeneficiario().get(i).getNombre());
            System.out.println("Apellido: "+baseDeDatos.getDatosBeneficiario().get(i).getApellido());
            System.out.println("Documento: "+baseDeDatos.getDatosBeneficiario().get(i).getDocumento());
            System.out.println("Direccion: "+baseDeDatos.getDatosBeneficiario().get(i).getDireccion());
            System.out.println("Edad: "+baseDeDatos.getDatosBeneficiario().get(i).getEdad());
            System.out.println("Cantidad de ayudas al mes: "+baseDeDatos.getDatosBeneficiario().get(i).getCantidadAyudasMes());
            System.out.println("------------------------------------------------------------------");
        }
    }

   

   
    
}
