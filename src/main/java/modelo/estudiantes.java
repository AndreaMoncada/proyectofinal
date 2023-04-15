/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JLabel;
import javax.swing.text.html.HTML;

/**
 *
 * @author ANDREA
 */
public class estudiantes {
   
   private  String  ID,nombre,apellido,correo,listanotas;

    public estudiantes() {
    }

    public estudiantes(String ID, String nombre, String apellido, String correo, String listanotas) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.listanotas = listanotas;
    }

    public estudiantes(HTML.Attribute ID, JLabel NOMBREESTUDIANTES, String APELLIDOESTUDIANTES, String CORREOESTUDIANTES, String LISTANOTASESTUDIANTES) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getID() {
        return ID;
    }

    public String getListanotas() {
        return listanotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setListanotas(String listanotas) {
        this.listanotas = listanotas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      @Override
    public String toString() {
        return "nombre: " + this.nombre + " ID " + this.ID + " apellido"  + this.apellido + "correo " + this.correo+ "listanotas" +this.listanotas; 
    }

}




