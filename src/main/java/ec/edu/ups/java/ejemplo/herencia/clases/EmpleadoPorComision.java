/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.herencia.clases;

import java.util.Date;

/**
 *
 * @author ACER
 */
public class EmpleadoPorComision extends Empleado {
    private double totalDeventas;
    private double porcentajeComision;
    private double salario;

    public EmpleadoPorComision() {
    }

    public EmpleadoPorComision(double totalDeventas, double porcentajeComision, double salario) {
        this.totalDeventas = totalDeventas;
        this.porcentajeComision = porcentajeComision;
        this.salario = salario;
        
    }

    public EmpleadoPorComision(double totalDeventas, double porcentajeComision, double salario, String cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
        this.totalDeventas = totalDeventas;
        this.porcentajeComision = porcentajeComision;
        this.salario = salario;
    }
    

    public EmpleadoPorComision(double totalDeventas, double porcentajeComision, double salario, String cedula, String nombre, String apellido, Date fechaNacimiento, String telefono, String direccion, String cargo) {
        super(cedula, nombre, apellido, fechaNacimiento, telefono, direccion, cargo);
        this.totalDeventas = totalDeventas;
        this.porcentajeComision = porcentajeComision;
        this.salario = salario;
    }

    public double getTotalDeventas() {
        return totalDeventas;
    }

    public void setTotalDeventas(double totalDeventas) {
        this.totalDeventas = totalDeventas;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return salario + (totalDeventas*(porcentajeComision/100));
        
    }

    @Override
    public String toString() {
        return super.toString() + "EmpleadoPorComision{" + "totalDeventas=" + totalDeventas + ", porcentajeComision=" + porcentajeComision + ", salario=" + salario + '}';
    }
    
}