/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.LinkedList;
import java.util.List;
import modelo.cursos;


/**
 *
 * @author ANDREA
 */
public class cursoscontrolador {
         private final List<cursos> cursoslista = new LinkedList<>();

    public void añadircursos(cursos cur) {
        cursoslista.add(cur);
    }

    public void eliminarcursos(cursos cur) {
       cursoslista.remove(cur);
    }

    public void actualizarcursos( cursos cur) {
        for (cursos cu: cursoslista) {
            if (cu.getFechafinalcur().equals(cur.getFechafinalcur())) {
                cu.setFechainiciocur(cur.getFechainiciocur());
                cu.setListaestudiantes(cur.getListaestudiantes());
                cu.setListaprofesores(cur.getListaprofesores());
                
            }
        }
    }

    public List<cursos> getcursoslista() {
        return cursoslista;
    }
}

