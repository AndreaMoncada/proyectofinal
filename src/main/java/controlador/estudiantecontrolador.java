/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import java.util.LinkedList;
import java.util.List;
import modelo.estudiantes;

/**
 *
 * @author ANDREA
 */
public class estudiantecontrolador {
    private final List<estudiantes> estudianteslista = new LinkedList<>();

    public void addestudiante(estudiantes estudi) {
        estudianteslista.add(estudi);
    }

    public void eliminarestudiantes(estudiantes estudi) {
        estudianteslista.remove(estudi);
    }

    public void actualizarestudiantes(estudiantes estudi) {
        for (estudiantes estu : estudianteslista) {
            if (estu.getID().equals(estudi.getID())) {
                estu.setNombre(estudi.getNombre());
                estu.setApellido(estudi.getApellido());
                estu.setCorreo(estudi.getCorreo());
                estu.setListanotas(estudi.getListanotas());
            }
        }
    }

    public List<estudiantes> getestudianteslista() {
        return estudianteslista;
    }
}

