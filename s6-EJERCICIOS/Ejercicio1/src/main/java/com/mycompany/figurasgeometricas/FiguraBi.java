package com.mycompany.figurasgeometricas;
public abstract class FiguraBi implements Figura{
    
    public String tipoBi;
    public String figuraBi;


    public FiguraBi(String FiguraBi, String CuerpoBi){
        tipoBi = FiguraBi;
        figuraBi = CuerpoBi;
    }


    public String getTipoFiguraBi(){
        return tipoBi;
    }

    public String getTipoCuerpoBi(){
        return figuraBi;
    }

    public void setTipoFiguraBi(String figuraBi){
        this.tipoBi = figuraBi;
    }

    public void setTipoCuerpoBi(String tipoBi){
        this.figuraBi = tipoBi;
    }

}
