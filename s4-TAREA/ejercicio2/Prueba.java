/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import java.util.ArrayList;
import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        int x = 0;
        int sexo = -1;
        int trabaja = 0;
        int sueldo = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<Persona>();
        while (x < 8) {
            int ban = x + 1;
            System.out.println("Datos de la " + ban + " Persona");
            do {
                System.out.println("Ingrese el sexo (1-M, 2-F)");
                sexo = sc.nextInt();
            } while (sexo > 2 || sexo < 0);
            do {
                System.out.println("Ingrese si trabja (1-SI, 2-NO)");
                trabaja = sc.nextInt();
            } while (trabaja > 2 || trabaja < 0);
            do {
                if (trabaja == 1) {
                    System.out.println("Ingrese su sueldo");
                    sueldo = sc.nextInt();
                } else {
                    sueldo = 2000;
                }
            } while (sueldo > 3000 || sueldo < 950);
            if (trabaja == 2) {
                sueldo = 0;
            }
            Persona p1 = new Persona(sexo, trabaja, sueldo);
            personas.add(p1);
            x++;
        }

        System.out.println("Porcentaje de hombres: " + calcularPorcentajeHombres(personas) + " %");
        System.out.println("Porcentaje de mujeres: " + calcularPorcentajeMujeres(personas) + " %");
        System.out.println("Porcentaje de hombres que trabajan: " + calcularPorcentajeHombresTrabajan(personas) + " %");
        System.out.println("Porcentaje de mujeres que trabajan: " + calcularPorcentajeMujeresTrabajan(personas) + " %");
        System.out.println("Promedio del sueldo de los hombres que trabajan: " + sueldoPromedioHombresTrabajan(personas));
        System.out.println("Promedio del sueldo de las mujeres que trabajan: " + sueldoPromedioMujeresTrabajan(personas));
    }

    public static double calcularPorcentajeHombres(ArrayList<Persona> personas) {
        double cant = 0;
        double porcentaje = 0;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getSexo() == 1) {
                cant += 1;
            }
        }
        porcentaje = (cant * 100) / personas.size();
        return porcentaje;
    }

    public static double calcularPorcentajeMujeres(ArrayList<Persona> personas) {
        double cant = 0;
        double porcentaje = 0;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getSexo() == 2) {
                cant += 1;
            }
        }
        porcentaje = (cant * 100) / personas.size();
        return porcentaje;
    }

    public static double calcularPorcentajeHombresTrabajan(ArrayList<Persona> personas) {
        double cant = 0;
        double divisor = 0;
        double porcentaje = 0;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getSexo() == 2 && personas.get(i).getTrabaja() == 1) {
                divisor++;
            }
            if (personas.get(i).getSexo() == 1 && personas.get(i).getTrabaja() == 1) {
                cant += 1;
                divisor++;
            }
        }
        porcentaje = (cant * 100) / divisor;
        return porcentaje;
    }

    public static double calcularPorcentajeMujeresTrabajan(ArrayList<Persona> personas) {
        double cant = 0;
        double divisor = 0;
        double porcentaje = 0;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getSexo() == 1 && personas.get(i).getTrabaja() == 1) {
                divisor++;
            }
            if (personas.get(i).getSexo() == 2 && personas.get(i).getTrabaja() == 1) {
                cant += 1;
                divisor++;
            }
        }
        porcentaje = (cant * 100) / divisor;
        return porcentaje;
    }

    public static double sueldoPromedioHombresTrabajan(ArrayList<Persona> personas) {
        double cant = 0;
        double divisor = 0;
        double promedio = 0;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getSexo() == 1 && personas.get(i).getTrabaja() == 1) {
                cant += personas.get(i).getSueldo();
                divisor++;
            }

        }
        promedio = cant / divisor;
        return promedio;
    }

    public static double sueldoPromedioMujeresTrabajan(ArrayList<Persona> personas) {
        double cant = 0;
        double divisor = 0;
        double promedio = 0;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getSexo() == 2 && personas.get(i).getTrabaja() == 1) {
                cant += personas.get(i).getSueldo();
                divisor++;
            }
        }
        promedio = cant / divisor;
        return promedio;
    }
}
