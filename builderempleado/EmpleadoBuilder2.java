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
public class EmpleadoBuilder2 {
    
    private String nombre  ;
    private String apellido1  ;
    private String apellido2 = "";
    private String dni;
    private String cargo = "";
    private int dia = 0;
    private int mes = 0;
    private int ano = 0;
    private int altura = 0;
    private int pie = 0;
    private int diametroCabeza = 0;
    private int sueldo = 0;
    private int formacion = 0;

    public EmpleadoBuilder2(final String nombre, final String apellido1, final String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.dni = dni;
    }

    public EmpleadoBuilder2 setApellido2(String apellido2) {
        this.apellido2 = apellido2;
        return this;
    }

    public EmpleadoBuilder2 setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public EmpleadoBuilder2 setDia(int dia) {
        this.dia = dia;
        return this;
    }

    public EmpleadoBuilder2 setMes(int mes) {
        this.mes = mes;
        return this;
    }

    public EmpleadoBuilder2 setAno(int ano) {
        this.ano = ano;
        return this;
    }

    public EmpleadoBuilder2 setAltura(int altura) {
        this.altura = altura;
        return this;
    }

    public EmpleadoBuilder2 setPie(int pie) {
        this.pie = pie;
        return this;
    }

    public EmpleadoBuilder2 setDiametroCabeza(int diametroCabeza) {
        this.diametroCabeza = diametroCabeza;
        return this;
    }

    public EmpleadoBuilder2 setSueldo(int sueldo) {
        this.sueldo = sueldo;
        return this;
    }

    public EmpleadoBuilder2 setFormacion(int formacion) {
        this.formacion = formacion;
        return this;
    }

    public Empleado crearEmpleado() {
        return new Empleado(nombre, apellido1, apellido2, dni, cargo, dia, mes, ano, altura, pie, diametroCabeza, sueldo, formacion);
    }
}
