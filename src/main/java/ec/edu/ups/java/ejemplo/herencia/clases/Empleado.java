/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.herencia.clases;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author ACER
 */
public class Empleado {
    String cedula;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String telefono;
    private String direccion;
    protected String cargo;

    public Empleado() {
    }

    public Empleado(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Empleado(String cedula, String nombre, String apellido, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Empleado(String cedula) {
        this.cedula = cedula;
    }

    public Empleado(String cedula, String nombre, String apellido, Date fechaNacimiento, String telefono, String direccion, String cargo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cargo = cargo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    //(---Declarar metodo------\|firma metodo|
    public double calcularSalario(){
        return 0.00;
    }
    //el abrir llaves es la implemetacion del metodo

    @Override
    public String toString() {
        return "Empleado{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", direccion=" + direccion + ", cargo=" + cargo + '}';
    }
//identificador unico para cada instancia de la clase (es  maomeno como un id, q sirve para hacerle interno en el obj
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.cedula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }
       // if (this.getClass()!=obj.getClass()){
         //   return false;
        //}
        //asegurar que la clase pertenezca a empleado
        if(!(obj instanceof EmpleadoAsalariado) && !(obj instanceof EmpleadoPorComision)
             && !(obj instanceof EmpleadoPorHoras)){ 
            return false;
        }
        final Empleado other = (Empleado)obj;
        if (this.cedula.equals(other.cedula)){
            return false;
        }
        return true;
        
    }


    
    
    
}
