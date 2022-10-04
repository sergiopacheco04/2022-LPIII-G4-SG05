package com.mycompany.figurasgeometricas;

public abstract class FiguraTri implements Figura{

    public String tipoTri;
    public String figuraTri;

    public FiguraTri(String FiguraTri, String CuerpoTri) {
        tipoTri = FiguraTri;
        figuraTri = CuerpoTri;
    }


    public String getTipoFiguraTri() {
        return figuraTri;
    }

    public String getTipoCuerpoTri() {
        return tipoTri;
    }

    public void setTipoFiguraTri(String tipoFiguraTri) {
        this.figuraTri = tipoFiguraTri;
    }

    public void setTipoCuerpoTri(String tipoCuerpoTri) {
        this.tipoTri = tipoCuerpoTri;
    }

}
