package sesion6;

/**
 *
 * @author Cesar
 */
public class Auto implements ImpactoEcologico {

    String TAuto;
    double EmisionToxica;
    double Velocidad;
    double Combustible;
    double factor_emision = 0.3;



    public Auto(String Auto, double Emision, double Aceleracion, double Gas) {
        TAuto = Auto;
        EmisionToxica = Emision;
        Velocidad = Aceleracion;
        Combustible = Gas;
    }

    public double getEmisionToxica() {
        return EmisionToxica;
    }

    public void setEmisionToxica(double EmisionToxica) {
        this.EmisionToxica = EmisionToxica;
    }

    public double getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(double Velocidad) {
        this.Velocidad = Velocidad;
    }

    public double getCombustible() {
        return Combustible;
    }

    public void setCombustible(double Combustible) {
        this.Combustible = Combustible;
    }

    public String getTAuto() {
        return TAuto;
    }

    public void setTAuto(String TAuto) {
        this.TAuto = TAuto;
    }


    public double Dato_actividad(){
        return (getEmisionToxica()+getVelocidad()/100)-(getCombustible()/50);
    }


    @Override
    public double ObtenerImpactoEcologico() {
        return Dato_actividad() * factor_emision;
    }


    @Override
    public String toString() {
        String s;
        s = """
            -----------------------------------------------------------
            Datos del """+" "+ this.TAuto +" y su Impacto Ecologico:" + "\n" +
            "Emision  toxica de Co2: " + this.EmisionToxica + "\n"+
            "Velocidad minima (KM/H): " + this.Velocidad + "\n" +
            "Gasolina depositada (L): " + this.Combustible+ "\n" +
            "Impacto Ecologico: " + this.ObtenerImpactoEcologico() + "\n";
        return s;
    }
}