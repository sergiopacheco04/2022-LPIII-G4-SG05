/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

import java.util.Scanner;

public class ARREGLOS {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        boolean salir = false;
        int opcion, fila, columna;
        boolean rellenado = false;
        do {
            System.out.println("Menu");
            System.out.println("1. Rellenar Matriz");
            System.out.println("2. Sumar fila");
            System.out.println("3. Sumar columna");
            System.out.println("4. Suma diagonal principal");
            System.out.println("5. Suma diagonal inversa");
            System.out.println("6. Media elementos");
            System.out.println("7. Salir");
            System.out.println("Elije una opcion");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1:
                    rellenarMatriz(sn, matriz);
                    break;
                case 2:

                    if (rellenado) {

                        //Validamos la fila
                        do {
                            System.out.println("Elige una fila");
                            fila = sn.nextInt();
                        } while (!(fila >= 0 && fila < matriz.length));
                        System.out.println("La suma de los valores de la fila " + fila
                                + " es: " + sumaFila(matriz, fila));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 3:
                    if (rellenado) {
                        do {
                            System.out.println("Elige una fila");
                            columna = sn.nextInt();
                        } while (!(columna >= 0 && columna < matriz.length));
                        System.out.println("La suma de los valores de la columna " + columna
                                + " es: " + sumaColumna(matriz, columna));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 4:
                    if (rellenado) {
                        System.out.println("La suma de la diagonal principal es: " + sumaDiagonalPrinc(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 5:
                    if (rellenado) {
                        System.out.println("La suma de la diagonal inversa es: " + sumaDiagonalInversa(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 6:
                    if (rellenado) {
                        System.out.println("La media de los valores de la "
                                + "matriz es de " + media(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Tienes que meter un valor entre 1 y 7");
            }
        } while (!salir);
        System.out.println("FIN");
    }

    public static void rellenarMatriz(Scanner sn, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Escribe un numero en la posicion " + i + " " + j);
                matriz[i][j] = sn.nextInt();
            }
        }
    }

    public static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int j = 0; j < matriz.length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }

    public static int sumaColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }

    public static int sumaDiagonalPrinc(int[][] matriz) {
        int suma = 0;
        for (int i = 0, j = 0; i < matriz.length; i++, j++) {
            suma += matriz[i][j];
        }
        return suma;
    }

    public static int sumaDiagonalInversa(int[][] matriz) {
        int suma = 0;
        for (int i = 0, j = 3; i < matriz.length; i++, j--) {
            suma += matriz[i][j];
        }
        return suma;
    }

    public static double media(int[][] matriz) {
        double suma = 0, media;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                suma += matriz[i][j];
            }
        }
        media = suma / (matriz.length * matriz.length);
        return media;
    }
}
