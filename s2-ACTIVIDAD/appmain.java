/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perro;

import java.util.Scanner;

public class appmain {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);

        perro Fido = new perro("Chihuahua", "Marron");
        perro Pelusa = new perro("Pequines", "Blanco");
        Fido.increEdad(2);
        System.out.println(Fido.toString());
        Pelusa.increEdad(5);
        System.out.println(Pelusa.toString());
        //System.out.println(p1.peso);
        //p1.dormir();

        int edad;
        int tempe;
        int peso;
        System.out.println("Ingrese el nuevo peso para el perro : ");
        peso = ingreso.nextInt();
        System.out.println("Ingrese la nueva edad para el perro : ");
        edad = ingreso.nextInt();
        System.out.println("Ingrese la nueva temperatura para el perro : ");
        tempe = ingreso.nextInt();
        System.out.println("DIAGNOSTICO B: " + diagnostico.aptoVacunaB(tempe, edad, peso));
        System.out.println("=========================================================");
        System.out.println("Los datos de la mascota son: ");
        System.out.println(Fido);
        System.out.println("DIAGNOSTICO A: " + diagnostico.aptoVacunaA(Fido));
        ingreso.close();

    }

}
