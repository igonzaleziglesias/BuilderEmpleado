/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderempleado;

/**
 *
 * @author Usuario
 */
public class EmpleadoBuilder {
    private String nombre, apellido1, apellido2 = "", dni, cargo = "";
    private int dia, mes, ano, altura, pie, diametroCabeza, sueldo, formacion = 0;

    public EmpleadoBuilder(final String nombre, final String apellido1, final String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.dni = dni;
    }

    public EmpleadoBuilder setApellido2(String nuevoApellido2) {
        this.apellido2 = nuevoApellido2;
        return this;
    }

    public EmpleadoBuilder setCargo(String nuevoCargo) {
        this.apellido2 = nuevoCargo;
        return this;
    }

    public EmpleadoBuilder setDia(int nuevoDia) {
        this.dia = nuevoDia;
        return this;
    }

    public EmpleadoBuilder setMes(int nuevoMes) {
        this.mes = nuevoMes;
        return this;
    }

    public EmpleadoBuilder setAno(int nuevoAno) {
        this.ano = nuevoAno;
        return this;
    }

    public EmpleadoBuilder setAltura(int nuevaAltura) {
        this.altura = nuevaAltura;
        return this;
    }

    public EmpleadoBuilder setPie(int nuevoPie) {
        this.pie = nuevoPie;
        return this;
    }

    public EmpleadoBuilder setDiametroCabeza(int nuevoDiametroCabeza) {
        this.pie = nuevoDiametroCabeza;
        return this;
    }

    public EmpleadoBuilder setSueldo(int nuevoSueldo) {
        this.sueldo = nuevoSueldo;
        return this;
    }

    public EmpleadoBuilder setFormacion(int nuevaFormacion) {
        this.formacion = nuevaFormacion;
        return this;
    }

    public Empleado crearEmpleado() {
        return new Empleado(nombre, apellido1, apellido2, dni, cargo, dia, mes, ano, altura, pie, diametroCabeza, sueldo, formacion);

    }

    @Override
    public String toString() {
        return "EmpleadoBuilder{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni=" + dni + ", cargo=" + cargo + ", dia=" + dia + ", mes=" + mes + ", ano=" + ano + ", altura=" + altura + ", pie=" + pie + ", diametroCabeza=" + diametroCabeza + ", sueldo=" + sueldo + ", formacion=" + formacion + '}';
    }
}
