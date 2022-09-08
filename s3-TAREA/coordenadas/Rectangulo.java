package com.mycompany.tarealp2;


public class Rectangulo 
{
    private Coordenada vertice1;
    private Coordenada vertice2;
    static String color;
    static int cont;
    public Rectangulo(Coordenada c1, Coordenada c2){
        this.vertice1 = c1;
        this.vertice2 = c2;
        Rectangulo.setColor();
        cont++;
    }
    public Coordenada getvertice1(){
        return vertice1;
    }
    public void setvertice1(Coordenada vertice1) {
        this.vertice1 = vertice1;
    }
    public Coordenada getvertice2(){
        return vertice2;
    }
    public void setvertice2(Coordenada vertice2) {
        this.vertice2 = vertice2;
    }
    public static void setColor(){
        if (Rectangulo.cont == 3){
            Rectangulo.cont = 0;
        }
        switch(Rectangulo.cont){
            case 0 -> Rectangulo.color = "verde";
            case 1 -> Rectangulo.color = "amarillo";
            case 2 -> Rectangulo.color = "rojo";
        }
    }
    public String color(){
        return Rectangulo.color;
    }
    public Rectangulo(int alt , int bs) {
        this.vertice1 = new Coordenada(0,0);
        this.vertice2 = new Coordenada(bs,alt);
        Rectangulo.setColor();
        cont++;
    }
    @Override
        public String toString() {
        return "Rectangulo " + " Esquina1 = " + vertice1 + ", vertice2 = " + vertice2+ '}';
    }
}
