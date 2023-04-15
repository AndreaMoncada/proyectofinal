/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.LinkedList;
import java.util.List;
import modelo.administrador;



/**
 *
 * @author ANDREA
 */
public class administradorcontrolador {
      private final List<administrador> administradorlista = new LinkedList<>();

    public void addadministrador(administrador admi) {
        administradorlista.add(admi);
    }

    public void eliminaradministrador(administrador admi) {
        administradorlista.remove(admi);
    }

    public void actualizaradministrador(administrador admi) {
        for (administrador ad:administradorlista) {
            if (ad.getID().equals(admi.getID())) {
                ad.setNombre(admi.getNombre());
                ad.setApellido(admi.getApellido());
                ad.setCorreo(admi.getCorreo());
                ad.setListanotas(admi.getListanotas());
            }
        }
    }

    public List<administrador> getadministradorlista() {
        return administradorlista;
    }
}
 
    

    

