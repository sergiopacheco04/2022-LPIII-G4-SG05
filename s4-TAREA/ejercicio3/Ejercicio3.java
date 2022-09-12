/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Cesar
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        // Filas: productos
        // Columnas: vendedores
                int[][] ventas = {{300, 200, 570, 480},
        {850, 100, 405, 350},
        {950, 220, 523, 454},
        {230, 800, 546, 654},
        {343, 325, 325, 742}};

        System.out.println("VENTAS TOTALES:");
        System.out.print("            ");

        // encabezado
        for (int i = 0; i < ventas[0].length; i++) {
            System.out.printf("Vendedor %d   ", i + 1);
        }

        System.out.println("TOTAL");
        for (int producto = 0; producto < ventas.length; producto++) {
            System.out.printf("Producto %d", producto + 1);
            for (int vendedor : ventas[producto]) {
                System.out.printf("%11d", vendedor);
            }
            int total = obtTotal(ventas[producto]);
            System.out.printf("%,16d%n", total);
        }
        System.out.print("TOTAL");

        int contador = 1;
        int col = 0;
        int totalTotal = 0;
        while (contador < 5) {
            int fcol = col;
            int totalV = 0;
            for (int[] venta : ventas) {
                for (int l = col; l == fcol; l++) {
                    totalV += venta[l];
                } // Fin de for anidado
            } // Fin de for principal
            totalTotal += totalV;
            System.out.printf("%,10d ", totalV);
            col++;
            contador++;
        } // Fin de while
        System.out.printf("%,13d ", totalTotal);
        System.out.println();

    }// Fin de metodo main
    public static int obtTotal(int[] matriz) {
        int total = 0;
        for (int i : matriz) {
            total += i;
        }
        return total;

    }
    
}
