package com.mycompany.figurasgeometricas;

public final class Cuadrado extends FiguraBi {

    private double lado;

    public Cuadrado(String tipoFiguraBi, String tipoCuerpoBi, double lado) {
        super(tipoFiguraBi, tipoCuerpoBi);
        setLado(lado);
    }


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return (getLado()* getLado());
    }

    @Override
    public double volumen() {
        return 0;
    }

    @Override
	public String toString() {
		String s;
		s = """
                    
                    Datos del: """ + this.tipoBi +"\n" +
                    "Tipo : " + this.figuraBi + "\n" +
                    "Figura : " + this.tipoBi + "\n" +
                    "Lado : " + this.lado + "\n" +
                    "Area : " + this.area() + "\n";
		return s;
	}

}
