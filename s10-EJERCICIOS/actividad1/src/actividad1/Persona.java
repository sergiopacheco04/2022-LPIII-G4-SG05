package actividad1;

public class Persona implements Comparable<Persona> {

    private String dni;
    private String nombre;

    public Persona() {
    }

    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona: " + "\tdni: " + this.dni + "\tnombre: " + this.nombre;
    }

    @Override
    public int compareTo(Persona p) {
        // TODO Auto-generated method stub
        return this.dni.compareTo(p.dni);
    }

}
