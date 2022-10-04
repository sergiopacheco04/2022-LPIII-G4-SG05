package com.mycompany.figurasgeometricas;

public final class Circulo extends FiguraBi {

    private double radio;

    public Circulo(String figuraBi, String tipoBi, double radio) {
        super(figuraBi, tipoBi);
        setRadio(radio);
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    @Override
    public double area() {
        return 4 * (3.1416 * (getRadio()* getRadio()));
    }

    @Override
    public double volumen() {
        return 0;
    }

    @Override
	public String toString() {
		String s;
		s = """
                    
                    Datos del: """ + this.tipoBi + "\n" +
                    "Tipo : " + this.figuraBi + "\n" +
                    "Figura : " + this.tipoBi + "\n" +
                    "Radio : " + this.radio + "\n" +
                    "Area : " + this.area() + "\n";
		return s;
	}

}