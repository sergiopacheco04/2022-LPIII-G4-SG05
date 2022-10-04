package com.mycompany.figurasgeometricas;

public final class Esfera extends FiguraTri {

    private double radio;

    public Esfera(String tipoFiguraTri, String tipoCuerpoTri, double radio) {
        super(tipoFiguraTri, tipoCuerpoTri);
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
        return (4/3) * (3.1416 * (getRadio()* getRadio()*getRadio()));
    }

    @Override
	public String toString() {
            String s;
            s = """
                    
                Datos de la : """ + this.tipoTri +"\n" +
                "Tipo : " + this.figuraTri + "\n" +
                "Figura : " + this.tipoTri + "\n" +
                "Lado : " + this.radio + "\n" +
                "Area : " + this.area() + "\n"+
                "Volumen: " + this.volumen() + "\n";
		return s;
	}

}