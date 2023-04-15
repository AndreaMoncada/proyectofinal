
package modelo;

/**
 *
 * @author ANDREA
 */

public class zona {
 
   private String ID, nombre, descripcion,listacursos;

    public zona() {
    }

    public zona(String ID, String nombre, String descripcion, String listacursos) {
        this.ID = ID;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.listacursos = listacursos;
    }

    public String getID() {
        return ID;
    }

  

    public String getDescripcion() {
        return descripcion;
    }

    public String getListacursos() {
        return listacursos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

  
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setListacursos(String listacursos) {
        this.listacursos = listacursos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString (){
        return this.nombre+"  "+this.ID+"  ";
                }
}