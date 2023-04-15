/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ANDREA
 */
public class maestros {
   
    private String  ID,nombre, apellido, correo, listacursos,listaestudiantes;
    

    public maestros() {
    }

    public maestros(String ID, String nombre, String apellido, String correo, String listacursos, String listaestudiantes) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.listacursos = listacursos;
        this.listaestudiantes = listaestudiantes;
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

   

    public String getListacursos() {
        return listacursos;
    }

    public String getListaestudiantes() {
        return listaestudiantes;
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

    

    public void setListacursos(String listacursos) {
        this.listacursos = listacursos;
    }

    public void setListaestudiantes(String listaestudiantes) {
        this.listaestudiantes = listaestudiantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     @Override
    public String toString() {
        return "nombre: " + this.nombre + " ID " + this.ID + " apellido"  + this.apellido + "correo " + this.correo+ "listacursos" +this.listacursos +"listaestudaintes" +this.listaestudiantes;
    }

}


