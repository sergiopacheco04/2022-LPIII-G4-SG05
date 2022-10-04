package com.mycompany.figurasgeometricas;
public class Prueba {
    
    public static void main(String[] args) {
        Figura[] FigurasGeometricas = new Figura[6];
        int countBi = 0;
        int countTri = 0;

        FigurasGeometricas[0] = new Circulo("Circulo", "Bidimensional", 5);
        FigurasGeometricas[1] = new Cuadrado("Cuadrado", "Bidimensional", 3);
        FigurasGeometricas[2] = new Triangulo("Triangulo", "Bidimensional", 2, 7);
        FigurasGeometricas[3] = new Esfera("Esfera", "Tridimensional", 12);
        FigurasGeometricas[4] = new Cubo("Cubo", "Tridimensional", 41);
        FigurasGeometricas[5] = new Tetraedo("Tetraedro", "Tridimensional", 26);

        System.out.println("Procesadas de forma Polimorfica: \n");

        for(Figura FigurasActuales : FigurasGeometricas) 
        {
            System.out.printf( FigurasActuales.toString());

            if(FigurasActuales instanceof FiguraBi){
                countBi++;
            }

            if(FigurasActuales instanceof FiguraTri){
                countTri++;
            }
        }
        System.out.println("\n Hay: "+ countBi +" Figuras Bidimensionales");
        System.out.println(" Hay: "+ countTri +" Figuras Tridimensionales");
    }
}