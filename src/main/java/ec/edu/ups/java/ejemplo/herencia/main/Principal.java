/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.java.ejemplo.herencia.main;

import ec.edu.ups.java.ejemplo.herencia.clases.Empleado;
import ec.edu.ups.java.ejemplo.herencia.clases.EmpleadoAsalariado;
import ec.edu.ups.java.ejemplo.herencia.clases.EmpleadoPorComision;
import ec.edu.ups.java.ejemplo.herencia.clases.EmpleadoPorHoras;
import java.util.Date;

/**
 *
 * @author ACER
 */
public class Principal {

    public static void main(String[] args) {
        
        
        System.out.println("Hello World!");
        EmpleadoAsalariado empleadoUno = new EmpleadoAsalariado(10, 120,
                2,"01010", "Andres", "Vera", "099999");
        EmpleadoPorComision empleadoDos = new EmpleadoPorComision(10,
                1, 300, "020202", "n2", "ap2");
        EmpleadoPorHoras empleadoTres = new EmpleadoPorHoras(120, 10,
                "03030", "n3", "ap3",new Date(2023,10,02) ,
                "09999", "Call1", "vdendedor");
        System.out.println(empleadoUno.toString());
        System.out.println(empleadoUno.calcularSalario());
        
        
        System.out.println("comision " + empleadoDos.toString());
        System.out.println("salario" + empleadoDos.calcularSalario());
        
        System.out.println("hora" + empleadoTres.toString());
        System.out.println("sal" + empleadoTres.calcularSalario());
        
        System.out.println("EMpl 1 es igual a empl 2" + empleadoUno.equals(empleadoDos)); 
        
        Empleado empleadoX = new Empleado("01010");
        Empleado empleadoY = new Empleado("01010");
        
        System.out.println("x es igual a y " + empleadoX.equals(empleadoY));
                
    }
    
}
