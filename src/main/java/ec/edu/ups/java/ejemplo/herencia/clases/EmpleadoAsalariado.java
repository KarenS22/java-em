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
public class EmpleadoAsalariado extends Empleado {
    private int aniosAntiguedad;
    private int salario;
    private int cargasFamiliares;

    public EmpleadoAsalariado() {
    }

    public EmpleadoAsalariado(int aniosAntiguedad, int salario, int cargasFamiliares) {
        this.aniosAntiguedad = aniosAntiguedad;
        this.salario = salario;
        this.cargasFamiliares = cargasFamiliares;
    }

    public EmpleadoAsalariado(int aniosAntiguedad, int salario, int cargasFamiliares, String cedula, String nombre, String apellido, String telefono) {
        super(cedula, nombre, apellido, telefono);
        this.aniosAntiguedad = aniosAntiguedad;
        this.salario = salario;
        this.cargasFamiliares = cargasFamiliares;
    }
    
    

    public EmpleadoAsalariado(int aniosAntiguedad, int salario, int cargasFamiliares, String cedula, String nombre, String apellido, Date fechaNacimiento, String telefono, String direccion, String cargo) {
        super(cedula, nombre, apellido, fechaNacimiento, telefono, direccion, cargo);
        this.aniosAntiguedad = aniosAntiguedad;
        this.salario = salario;
        this.cargasFamiliares = cargasFamiliares;
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getCargasFamiliares() {
        return cargasFamiliares;
    }

    public void setCargasFamiliares(int cargasFamiliares) {
        this.cargasFamiliares = cargasFamiliares;
    }

    @Override
    public double calcularSalario() {

        double pagoAntiguedad = 0;
        double pagoCargosFamiliares = 0;
        
        if(aniosAntiguedad >=2 && aniosAntiguedad<=5){
            pagoAntiguedad = 80;
        }else if (aniosAntiguedad>=6 && aniosAntiguedad<=8){
            pagoAntiguedad = 120;
        }else if (aniosAntiguedad>=9 && aniosAntiguedad<=14){
            pagoAntiguedad = 200;
        }
        
        if(cargasFamiliares == 1){
            pagoCargosFamiliares= 30;
        } else if (cargasFamiliares == 2){
            pagoCargosFamiliares = 70;
        } else if (pagoCargosFamiliares >= 3){
            pagoCargosFamiliares = 100;
        }
        return (salario + pagoAntiguedad + pagoCargosFamiliares);
    }
    
    public double calcularSalario(double valorExtra){
        return this.calcularSalario() + valorExtra;
    }

    @Override
    public String toString() {
        return super.toString() + "EmpleadoAsalariado{" + "aniosAntiguedad=" + aniosAntiguedad + ", salario=" + salario + ", cargasFamiliares=" + cargasFamiliares + '}';
    }
    
}
