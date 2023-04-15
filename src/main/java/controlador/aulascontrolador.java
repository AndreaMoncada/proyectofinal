/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.LinkedList;
import java.util.List;
import modelo.aulas;



/**
 *
 * @author ANDREA
 */
public class aulascontrolador {
       private final List<aulas> aulaslista = new LinkedList<>();

    public void addaulas(aulas aul) {
        aulaslista.add(aul);
    }

    public void eliminareaulas(aulas aul) {
       aulaslista.remove(aul);
    }

    public void actualizaraulas(aulas aul) {
        for (aulas au: aulaslista) {
            if (au.getID().equals(aul.getID())) {
                au.setNombre(aul.getNombre());
                au.setDescripcion(aul.getDescripcion());
                au.setListacursos(aul.getListacursos());
             
            }
        }
    }

    public List<aulas> getaulaslista() {
        return aulaslista;
    }
}
