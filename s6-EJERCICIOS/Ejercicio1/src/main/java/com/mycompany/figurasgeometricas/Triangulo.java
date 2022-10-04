package com.mycompany.figurasgeometricas;
public final class Triangulo extends FiguraBi {

    private double altura;
    private double base;

    public Triangulo(String figuraBi, String tipoBi, double altura, double base) {
        super(figuraBi, tipoBi);
        setAltura(altura);
        setBase(base);
    }



    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }


    @Override
    public double area() {
        return (double) (getAltura() * getBase()) / 2;
    }

    @Override
    public double volumen() {
        return 0;
    }


    @Override
    public String toString() {
        String s;
        s = """
            
                Datos del : """ + this.tipoBi + "\n" +
                "Tipo : " + this.figuraBi + "\n" +
		"Figura : " + this.tipoBi + "\n" +
                "Base : " + this.base + "\n" +
                "Altura : " + this.altura + "\n" +
                "Area : " + this.area() + "\n";
        return s;
    }
}