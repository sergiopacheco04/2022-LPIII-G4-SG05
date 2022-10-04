package com.mycompany.figurasgeometricas;

    public final class Cubo extends FiguraTri {

        private double lado;

        public Cubo(String tipoFiguraTri, String tipoCuerpoTri, double lado) {
            super(tipoFiguraTri, tipoCuerpoTri);
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
            return 6 *(getLado()* getLado());
        }

        @Override
        public double volumen() {
            return (getLado()* getLado()* getLado());
        }

        @Override
            public String toString() {
                String s;
                s = """

                    Datos del : """ + this.tipoTri +"\n" +
                    "Tipo : " + this.figuraTri + "\n" +
                    "Figura : " + this.tipoTri + "\n" +
                    "Lado : " + this.lado + "\n" +
                    "Area : " + this.area() + "\n"+
                    "Volumen: " + this.volumen() + "\n";
                    return s;
            }

    }