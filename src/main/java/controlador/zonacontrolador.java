package controlador;

import java.util.LinkedList;
import java.util.List;

import modelo.zona;

/**
 *
 * @author ANDREA
 */
public class zonacontrolador {
    private final List<zona> zonalista = new LinkedList<>();

    public void addzona (zona zo){
       zonalista.add(zo);
    }

    public void eliminarzona(zona zo) {
        zonalista.remove(zo);
    }

    public void actualizarzona (zona zo) {
        for (zona z: zonalista) {
            if (z.getID().equals(zo.getID())) {
                z.setNombre(zo.getNombre());
                z.setDescripcion(zo.getDescripcion());
               z.setListacursos(zo.getListacursos());
               
            }
        }
    }

    public List<zona> getzonalista() {
        return zonalista;
    }
}
