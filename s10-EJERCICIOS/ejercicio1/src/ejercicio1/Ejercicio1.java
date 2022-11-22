package ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        String[] stringArray = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho"};
        System.out.println("\nArray de cadenas contiene:");
        imprimirArray(stringArray);
    }

    public static < T> void imprimirArray(T[] inputArray) {

        for (T element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void imprimirArray(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.printf("%-10s", stringArray[i]);
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }
    }
}
