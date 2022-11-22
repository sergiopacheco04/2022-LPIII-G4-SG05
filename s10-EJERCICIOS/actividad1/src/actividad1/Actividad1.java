package actividad1;

public class Actividad1 {

    public static void main(String[] args) {

        float[] floatArray = {1, 2, 3, 4, 5, 6 ,7};
        boolean[] booleanArray = {true, false, false, true};

        System.out.printf("Array floatArray incluye:%n");
        imprimirArray(floatArray);
        System.out.printf("%nArray doubleArray incluye:%n");
        imprimirArray(booleanArray);

    }

    public static void imprimirArray(float[] inputArray) {
        for (float elemento : inputArray) {
            System.out.printf("%s ", elemento);
        }
    }

    public static void imprimirArray(boolean[] inputArray) {
        for (boolean elemento : inputArray) {
            System.out.printf("%s ", elemento);
        }
        System.out.println("");
    }
}








