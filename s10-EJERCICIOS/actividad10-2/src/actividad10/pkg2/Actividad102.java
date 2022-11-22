package actividad10.pkg2;

public class Actividad102 {

    public static void main(String[] args) throws Exception {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'O', 'L', 'A'};

        System.out.printf("Array integerArray incluye:%n");
        imprimirArray(intArray);
        System.out.printf("%nArray doubleArray incluye:%n");
        imprimirArray(doubleArray);
        System.out.printf("%nArray charArray incluye:%n");
        imprimirArray(charArray);

        System.out.println("\n------MUESTRA DE LIMITES-------");
        System.out.printf("Array integerArray incluye");
        imprimirArray(intArray, 0, 5);
        System.out.printf("%nArray doubleArray incluye");
        imprimirArray(doubleArray, 3, 3);
        System.out.printf("%nArray charArray incluye");
        imprimirArray(charArray, 0, 2);

    }

    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray) {
            System.out.printf("%s ", elemento);
        }

        System.out.println();

    }

    public static <T> void imprimirArray(T[] inputArray, int limiteInferior, int limiteSuperior) {
        int ancho = inputArray.length - 1;
        try {
            validarLimites(ancho, limiteInferior, limiteSuperior);
            System.out.print(" el indice de" + limiteInferior + " a " + limiteSuperior + ": \n");
            for (int i = limiteInferior; i <= limiteSuperior; i++) {
                System.out.print(inputArray[i] + " ");
            }

        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
        }
    }

    public static void validarLimites(int ancho, int limiteInferior, int limiteSuperior) throws LimiteInvalidoException {
        if (limiteInferior < 0 || limiteInferior > ancho || limiteSuperior < 0 || limiteSuperior > ancho || limiteInferior > limiteSuperior) {
            throw new LimiteInvalidoException("LimiteInvalidoException");
        }
    }

}

class LimiteInvalidoException extends IndexOutOfBoundsException {

    public LimiteInvalidoException() {

    }

    public LimiteInvalidoException(String msjError) {
        super(msjError);
    }

}
