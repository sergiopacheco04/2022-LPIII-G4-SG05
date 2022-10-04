package com.mycompany.figurasgeometricas;

public abstract class FiguraTridimensional implements Figura{

    public String tipoTri;
    public String FiguraTri;

    public FiguraTridimensional(String FiguraTri, String CuerpoTri) {
        tipoFiguraTri = FiguraTri;
        tipoCuerpoTri = CuerpoTri;
    }


    public String getTipoFiguraTri() {
        return tipoFiguraTri;
    }

    public String getTipoCuerpoTri() {
        return tipoCuerpoTri;
    }

    public void setTipoFiguraTri(String tipoFiguraTri) {
        this.tipoFiguraTri = tipoFiguraTri;
    }

    public void setTipoCuerpoTri(String tipoCuerpoTri) {
        this.tipoCuerpoTri = tipoCuerpoTri;
    }

}
