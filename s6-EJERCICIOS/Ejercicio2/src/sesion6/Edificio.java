package sesion6;

/**
 *
 * @author Cesar
 */
public class Edificio implements ImpactoEcologico {

    String TipoEdificio;
    double PesoResiduos;
    double GastoEnergetico;
    double GastoAgua;
    double factor_emision = 0.5;



    public Edificio(String Edificio, double Residuos, double Energia, double Agua) {
        TipoEdificio = Edificio;
        PesoResiduos = Residuos;
        GastoEnergetico = Energia;
        GastoAgua = Agua;
    }

    public String getTipoEdificio() {
        return TipoEdificio;
    }

    public void setTipoEdificio(String TipoEdificio) {
        this.TipoEdificio = TipoEdificio;
    }

    public double getPesoResiduos() {
        return PesoResiduos;
    }

    public void setPesoResiduos(double PesoResiduos) {
        this.PesoResiduos = PesoResiduos;
    }

    public double getGastoEnergetico() {
        return GastoEnergetico;
    }

    public void setGastoEnergetico(double GastoEnergetico) {
        this.GastoEnergetico = GastoEnergetico;
    }

    public double getGastoAgua() {
        return GastoAgua;
    }

    public void setGastoAgua(double GastoAgua) {
        this.GastoAgua = GastoAgua;
    }


    public double Dato_actividad(){
        return (getGastoEnergetico()*getGastoAgua()-getPesoResiduos())/70;
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
            Datos de """+" "+ this.TipoEdificio +" y su Impacto Ecologico:" + "\n" +
                "Peso de Residuos Solidos (KG): " + this.PesoResiduos+ "\n" +
                "Gasto de energia (S/.): " + this.GastoEnergetico + "\n"+
                "Gasto de agua (S/.): " + this.GastoAgua + "\n" +
                "Impacto Ecologico: " + this.ObtenerImpactoEcologico() + "\n";
        return s;
    }

}