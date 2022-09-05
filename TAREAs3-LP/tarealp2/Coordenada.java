package com.mycompany.tarealp2;

public class Coordenada 
{
	private int x;
    private int y;
    public Coordenada(){
        this.x = 0;
        this.y = 0;
    }
    public Coordenada(int x,int y){
        this.x = x;
        this.y = y;
    }
    public Coordenada(Coordenada c){
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double distancia(Coordenada c){
        double X;
        double Y;
        X = c.getX();
        Y = c.getY();
        X = Math.pow(X, 2);
        Y = Math.pow(Y, 2);
        double result = 0.0;
        result = Math.sqrt(X+Y);
        return result;
    }
    @Override
    public String toString() {
        return "Coordenadas" + " x = " + x + ", y = " + y + '}';}
}
