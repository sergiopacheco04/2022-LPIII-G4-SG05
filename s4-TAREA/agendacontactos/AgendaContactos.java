package agendacontactos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class AgendaContactos {

    public static void main(String[] args) {
        ArrayList<contacto> contac = new ArrayList<contacto>();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        String nombre1, telefono1, direccion1;
        contacto c = null;

        boolean rellenado = false;
        do {
            System.out.println("Menu");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Mostrar contacto(s)");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Modificar contacto");
            System.out.println("5. Borrar contacto");
            System.out.println("6. Salir");
            System.out.println("Elije una opcion");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Escribe un nombre");
                    nombre1 = sn.next();
                    System.out.println("Escribe un telefono");
                    telefono1 = sn.next();
                    System.out.println("Escribe una direccion");
                    direccion1 = sn.next();

                    c = new contacto(nombre1, telefono1, direccion1);
                    contac.add(c);

                    break;
                case 2:
                    System.out.println("La lista de contactos es: ");
                    listaContactos(contac);
                    break;
                case 3:
                    String nombre;
                    System.out.println("Ingresar nombre a buscar");
                    nombre = sn.next();
                    if (buscarContacto(nombre, contac)) {
                        System.out.println("Contacto SI existe");
                    } else {
                        System.out.println("Contacto NO existe");
                    }
                    break;
                case 4:
                    String nombre3,telefono3,direccion3;
                    System.out.println("Ingresar nombre a modificar");
                    nombre3 = sn.next();
                    System.out.println("Ingresar nuevo telefono");
                    telefono3 = sn.next();
                    System.out.println("Ingresar nueva direccion");
                    direccion3 = sn.next();
                    contacto g = new contacto(nombre3,telefono3,direccion3);
                    if (modificarContacto(g, contac)) {
                        System.out.println("Informacion modificada de forma correcta");
                    } else {
                        System.out.println("No se puede modificar");
                    }

                    break;
                case 5:
                    String nombree;
                    System.out.println("Escribe un nombre para eliminar");
                    nombree = sn.next();
                    if (eliminarContacto(nombree, contac)) {
                        System.out.println("Informacion eliminada");
                    } else {
                        System.out.println("No se puede eliminar");
                    }
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Tienes que meter un valor entre 1 y 6");
            }
        } while (!salir);
        System.out.println("FIN");
    }
   
    public static void listaContactos(ArrayList<contacto> contac) {
        for (contacto a : contac) {
            System.out.println(a);
        }
    }

    public static boolean buscarContacto(String nombre, ArrayList<contacto> contac) {
        boolean encontrado = false;
        for (int x = 0; x < contac.size(); x++) {
            if (contac.get(x).getNombre().equals(nombre)) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    public static boolean eliminarContacto(String nombre, ArrayList<contacto> contac) {
        boolean encontrado = false;
        for (int x = 0; x < contac.size(); x++) {
            if (contac.get(x).getNombre().equals(nombre)) {
                encontrado = true;
                contac.remove(x);
            }
        }
        return encontrado;
    }

    public static boolean modificarContacto(contacto c, ArrayList<contacto> contac) {
        boolean encontrado = false;
        for (int x = 0; x < contac.size(); x++) {
            if (contac.get(x).getNombre().equals(c.getNombre())) {
                encontrado = true;
                contac.get(x).setNombre(c.getNombre());
                contac.get(x).setTelefono(c.getTelefono());
                contac.get(x).setDireccion(c.getDireccion());

            }
        }
        return encontrado;
    }
}
