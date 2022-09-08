/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentabanco;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner ingreso = new Scanner(System.in);

        String titu;

        double canti;

        System.out.println("Ingresar el nombre del titular: ");

        titu = ingreso.nextLine();

        System.out.println("Hola " + titu + ", ingresa la cantidad inicial: ");

        canti = ingreso.nextDouble();

        banco cuenta_1 = new banco(titu, canti);

//Creacion del menu 
        Scanner sn = new Scanner(System.in);

        boolean salir = false;

        int opcion;

        while (!salir) {

            System.out.println("====================================");

            System.out.println("Que desea hacer " + titu + ", escoja un opcion: ");

            System.out.println("1. Ingresar nuevo dinero a su cuenta");

            System.out.println("2. Retirar dinero de su cuenta");

            System.out.println("3. Mostrar saldo actual");

            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones: ");

            opcion = sn.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println("Ingrese la cantidad exacta: ");

                    canti = ingreso.nextDouble();

                    cuenta_1.ingresar(canti);

                    break;

                case 2:

                    System.out.println("Ingrese la cantidad exacta: ");

                    canti = ingreso.nextDouble();

                    cuenta_1.retirar(canti);

                    break;

                case 3:

                    System.out.println("El saldo actual es: " + cuenta_1.getCantidad());

                    break;

                case 4:

                    salir = true;

                    break;

                default:

                    System.out.println("Solo números entre 1 y 4");

            }

        }

    }

}
