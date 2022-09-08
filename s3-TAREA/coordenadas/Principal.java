package com.mycompany.tarealp2;

public class Principal 
{
	public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(4,5);
        System.out.println("El área del rectángulo es: " + Manejador.Areaper(r1));
        Rectangulo ColorA = new Rectangulo(2,5);
        System.out.println("Rectangulo de color Amarillo: " + ColorA.toString());
        Rectangulo ColorR = new Rectangulo(5,7);
        System.out.println("Rectangulo de color Rojo: " + ColorR.toString());
        Rectangulo ColorV = new Rectangulo(1,3);
        System.out.println("Rectangulo de color Verde: " + ColorV.toString());
    }
}
