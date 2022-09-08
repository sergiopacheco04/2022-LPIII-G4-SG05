/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perro;

/**
 *
 * @author Cesar
 */
public class diagnostico {

    public static String aptoVacunaA(perro p1) {
        p1.getTemp();
        p1.getEdad();
        p1.getPeso();
        if (p1.getTemp() > 36 && p1.getTemp() < 41 && p1.getEdad() > 1 && p1.getPeso() > 5) {
            return "Esta sano";
        } else {
            return "No esta sano";
        }

    }

    public static String aptoVacunaB(int temperat, int edad1, int peso1) {
        if ((temperat >= 37 && temperat <= 40) && peso1 >= 5 && edad1 >= 1) {
            return "Esta sano";
        } else {
            return "No esta sano";
        }
    }
}
