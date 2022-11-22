package actividad1b;

public class Actividad1b {

    public static void main(String[] args) throws Exception {

        System.out.printf("El maximo de %d, %d, %d y %d es = %d%n", 3, 4, 5, 6, maximo(3, 4, 5, 6));
        System.out.printf("El maximo de %.1f, %.1f, %.1f y %.1f es = %.1f%n", 6.6, 7.7, 8.8, 9.9, maximo(6.6, 7.7, 8.8, 9.9));
        System.out.printf("El maximo de %s, %s, %s y %s es = %s%n", "palta", "zanahoria", "mango", "platano", maximo("palta", "zanahoria", "mango", "platano"));

        System.out.println("******************************************************");
        System.out.println("******************************************************");

        System.out.printf("El minimo de %d, %d, %d y %d es = %d%n", 3, 4, 5, 6, minimo(3, 4, 5, 6));
        System.out.printf("El minimo de %.1f, %.1f, %.1f y %.1f es = %.1f%n", 6.6, 7.7, 8.8, 9.9, minimo(6.6, 7.7, 8.8, 9.9));
        System.out.printf("El minimo de %s, %s, %s y %s es = %s%n", "palta", "zanahoria", "mango", "platano", minimo("palta", "zanahoria", "mango", "platano"));

    }

    public static <T extends Comparable<T>> T maximo(T x, T y, T z, T a) {
        T max = x;
        if (x.compareTo(y) > 0 && x.compareTo(z) > 0 && x.compareTo(a) > 0) {
            max = x;
        }
        if (y.compareTo(x) > 0 && y.compareTo(z) > 0 && y.compareTo(a) > 0) {
            max = y;
        }
        if (z.compareTo(x) > 0 && z.compareTo(y) > 0 && z.compareTo(a) > 0) {
            max = z;
        }
        if (a.compareTo(x) > 0 && a.compareTo(y) > 0 && a.compareTo(z) > 0) {
            max = a;
        }
        return max;
    }

    public static <T extends Comparable<T>> T minimo(T x, T y, T z, T a) {
        T max = x;
        if (x.compareTo(y) < 0 && x.compareTo(z) < 0 && x.compareTo(a) < 0) {
            max = x;
        }
        if (y.compareTo(x) < 0 && y.compareTo(z) < 0 && y.compareTo(a) < 0) {
            max = y;
        }
        if (z.compareTo(x) < 0 && z.compareTo(y) < 0 && z.compareTo(a) < 0) {
            max = z;
        }
        if (a.compareTo(x) < 0 && a.compareTo(y) < 0 && a.compareTo(z) < 0) {
            max = a;
        }
        return max;
    }
}
