/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ANDREA
 */
public class cursos {
    private String fechainiciocur,fechafinalcur;
    private String listaestudiantes,listaprofesores;

    public cursos() {
    }

    public cursos(String fechainiciocur, String fechafinalcur, String listaestudiantes, String listaprofesores) {
        this.fechainiciocur = fechainiciocur;
        this.fechafinalcur = fechafinalcur;
        this.listaestudiantes = listaestudiantes;
        this.listaprofesores = listaprofesores;
    }

    public String getFechafinalcur() {
        return fechafinalcur;
    }

    public String getFechainiciocur() {
        return fechainiciocur;
    }

   

    public String getListaestudiantes() {
        return listaestudiantes;
    }

    public String getListaprofesores() {
        return listaprofesores;
    }

    public void setFechafinalcur(String fechafinalcur) {
        this.fechafinalcur = fechafinalcur;
    }

    public void setFechainiciocur(String fechainiciocur) {
        this.fechainiciocur = fechainiciocur;
    }


    public void setListaestudiantes(String listaestudiantes) {
        this.listaestudiantes = listaestudiantes;
    }

    public void setListaprofesores(String listaprofesores) {
        this.listaprofesores = listaprofesores;
    }
       @Override
    public String toString() {
        return "fechainiciocur" + this.fechainiciocur + "fechafinalcur " + this.fechafinalcur+ "listaestudiantes"  + this.listaestudiantes + "listaprofesores " + this.listaprofesores;
    }

}

    

