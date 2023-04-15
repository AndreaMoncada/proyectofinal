/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ANDREA
 */
public class aulas {
  
   private String ID, nombre, descripcion, listacursos;

    public aulas() {
    }

    public aulas(String ID, String nombre, String descripcion, String listacursos) {
        this.ID = ID;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.listacursos = listacursos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getID() {
        return ID;
    }

    public String getListacursos() {
        return listacursos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setListacursos(String listacursos) {
        this.listacursos = listacursos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "nombre: " + this.nombre + " ID " + this.ID + " descripcion"  + this.descripcion + "listacursos " + this.listacursos; 
    }

}

