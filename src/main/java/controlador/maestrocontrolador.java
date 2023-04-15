/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.LinkedList;
import java.util.List;
import modelo.maestros;

/**
 *
 * @author ANDREA
 */
public class maestrocontrolador {
     private final List<maestros> maestroslista = new LinkedList<>();

    public void addmaestros(maestros maes) {
        maestroslista.add(maes);
    }

    public void eliminarmaestros(maestros maes) {
        maestroslista.remove(maes);
    }

    public void actualizarestudiantes(maestros maes) {
        for (maestros ma: maestroslista) {
            if (ma.getID().equals(maes.getID())) {
                ma.setNombre(maes.getNombre());
                ma.setApellido(maes.getApellido());
                ma.setCorreo(maes.getCorreo());
                ma.setListacursos(maes.getListacursos());
                ma.setListaestudiantes(maes.getListaestudiantes());
            }
        }
    }

    public List<maestros> getmaestroslista() {
        return maestroslista;
    }
}


