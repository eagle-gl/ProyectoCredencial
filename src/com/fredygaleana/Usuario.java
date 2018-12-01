/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fredygaleana;

import java.util.Date;

/**
 *
 * @author fredy
 */
public class Usuario {
   private String nombre;
   private String apellidoPa;
   private String apellidoMa;
   private char sexo;
   private Date fechaNacimiento;
   private String direccion;

    public Usuario(String nombre, String apellidoPa, String apellidoMa, char sexo, Date fechaNacimiento, String direccion) {
        this.nombre = nombre;
        this.apellidoPa = apellidoPa;
        this.apellidoMa = apellidoMa;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPa() {
        return apellidoPa;
    }

    public void setApellidoPa(String apellidoPa) {
        this.apellidoPa = apellidoPa;
    }

    public String getApellidoMa() {
        return apellidoMa;
    }

    public void setApellidoMa(String apellidoMa) {
        this.apellidoMa = apellidoMa;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
