package com.mycompany.tarealp2;

public class Manejador {
    public Manejador(){
    }
    public static double Areaper(Rectangulo c){
        double X;
        double Y;
        double X2;
        double Y2;
        double base;
        double ar = 0.0;
        double altu;
        double peri;
        X = c.getvertice1().getX();
        Y = c.getvertice1().getY();
        X2 = c.getvertice2().getX();
        Y2 = c.getvertice2().getY();
        base = Math.abs(X-X2);
        altu = Math.abs(Y2-Y);
        ar = base*altu;
        peri=base*2+altu*2;
        return ar;
    }
    public static void MoverX(Rectangulo c, int cantidad){
        int X;
        int X2;
        X = c.getvertice1().getX();
        X = X + cantidad;
        c.getvertice1().setX(X);
        X2 = c.getvertice2().getX();
        X2 = X2 + cantidad;
        c.getvertice2().setX(X2);
    }
    public static void MoverY(Rectangulo c, int cantidad){
        int Y;
        int Y2;
        Y = c.getvertice1().getY();
        Y2 = c.getvertice2().getY();
        Y = Y + cantidad;
        Y2 = Y2 + cantidad;
        c.getvertice1().setY(Y  );
        c.getvertice2().setY(Y2);
    }
}