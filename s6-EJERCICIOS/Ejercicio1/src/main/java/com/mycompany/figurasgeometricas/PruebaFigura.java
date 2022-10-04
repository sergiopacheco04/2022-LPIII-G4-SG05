package com.mycompany.figurasgeometricas;
public class PruebaFigura {
    
    public static void main(String[] args) {
        Figura[] FigurasGeometricas = new Figura[6];
        int countBi = 0;
        int countTri = 0;

        FigurasGeometricas[0] = new Circulo("Circulo", "Bidimensional", 5);
        FigurasGeometricas[1] = new Cuadrado("Cuadrado", "Bidimensional", 9);
        FigurasGeometricas[2] = new Triangulo("Triangulo", "Bidimensional", 8, 9);
        FigurasGeometricas[3] = new Esfera("Esfera", "Tridimensional", 12);
        FigurasGeometricas[4] = new Cubo("Cubo", "Tridimensional", 25);
        FigurasGeometricas[5] = new Tetraedo("Tetraedro", "Tridimensional", 18);

        System.out.println("Procesadas de forma Polimorfica: \n");

        for(Figura FigurasActuales : FigurasGeometricas) 
        {
            System.out.printf( FigurasActuales.toString());

            if(FigurasActuales instanceof FiguraBidimensional){
                countBi++;
            }

            if(FigurasActuales instanceof FiguraTridimensional){
                countTri++;
            }
        }
        System.out.println("\n Hay: "+ countBi +" Figuras Bidimensionales");
        System.out.println(" Hay: "+ countTri +" Figuras Tridimensionales");
    }
}