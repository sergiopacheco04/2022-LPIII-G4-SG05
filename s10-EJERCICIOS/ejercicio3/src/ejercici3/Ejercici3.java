package ejercici3;

public class Ejercici3{

    public static void main(String[] args) {

        System.out.println("Comparando los Tipos de Datos:");
        System.out.println(".................");

        String a, b;
        int a1, b1;
        double a2, b2;
        char a3, b4;
        a = "MétodoGenérico";
        b = "MétodoGenérico";
        a1 = 22;
        b1 = 10;
        a2 = 8.45;
        b2 = 8.45;
        a3 = 'G';
        b4 = '5';
        System.out.printf("Strings :  ");
        System.out.println(isEqualTo(a, b));
        System.out.printf("Enteros :  ");
        System.out.println(isEqualTo(a1, b1));
        System.out.printf("Doubles :  ");
        System.out.println(isEqualTo(a2, b2));
        System.out.printf("Chars   :  ");
        System.out.println(isEqualTo(a3, b4));

    }
    public static <T> boolean isEqualTo(T x, T y) {
        return x.equals(y);
    }
}
