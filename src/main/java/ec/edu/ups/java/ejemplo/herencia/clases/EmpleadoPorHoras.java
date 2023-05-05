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
public class EmpleadoPorHoras extends Empleado {
    private int numeroDeHoras;
    private double valorHoraTrabajada;

    public EmpleadoPorHoras() {
    }
    

    public EmpleadoPorHoras(int numeroDeHoras, double valorHoraTrabajada) {
        this.numeroDeHoras = numeroDeHoras;
        this.valorHoraTrabajada = valorHoraTrabajada;
    }

    public EmpleadoPorHoras(int numeroDeHoras, double valorHoraTrabajada, String cedula, String nombre, String apellido, Date fechaNacimiento, String telefono, String direccion, String cargo) {
        super(cedula, nombre, apellido, fechaNacimiento, telefono, direccion, cargo);
        this.numeroDeHoras = numeroDeHoras;
        this.valorHoraTrabajada = valorHoraTrabajada;
    }

    public int getNumeroDeHoras() {
        return numeroDeHoras;
    }

    public void setNumeroDeHoras(int numeroDeHoras) {
        this.numeroDeHoras = numeroDeHoras;
    }

    public double getValorHoraTrabajada() {
        return valorHoraTrabajada;
    }

    public void setValorHoraTrabajada(double valorHoraTrabajada) {
        this.valorHoraTrabajada = valorHoraTrabajada;
    }

    @Override
    public double calcularSalario() {
        return numeroDeHoras * valorHoraTrabajada;
    }

    @Override
    public String toString() {
        return super.toString() + "EmpleadoPorHoras{" + "numeroDeHoras=" + numeroDeHoras + ", valorHoraTrabajada=" + valorHoraTrabajada + '}';
    }
    
    


    
}
