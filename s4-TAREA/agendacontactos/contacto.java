
package agendacontactos;

/**
 *
 * @author Cesar
 */
public class contacto {
    private String nombre;
    private String telefono;
    private String direccion; 
    
    
    public contacto(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public contacto() {
        nombre = "";
        telefono = "";
        direccion = "";
    }

    public contacto(String nombre) {
        this.nombre = nombre;
    }

       

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "contacto{" + "nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }    
}
