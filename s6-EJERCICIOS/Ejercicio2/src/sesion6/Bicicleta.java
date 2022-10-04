package sesion6;

/**
 *
 * @author Cesar
 */
public class Bicicleta implements ImpactoEcologico {

    String TBicicleta;
    double TiempoUso;
    double EstadoBici;
    double TiempoVida;
    double factor_emision = 0.05;



    public Bicicleta(String Tbici, double Uso, double Estado, double Tvida) {
        TBicicleta = Tbici;
        TiempoUso = Uso;
        EstadoBici = Estado;
        TiempoVida = Tvida;
    }

    public String getTBicicleta() {
        return TBicicleta;
    }

    public void setTBicicleta(String TBicicleta) {
        this.TBicicleta = TBicicleta;
    }

    public double getTiempoUso() {
        return TiempoUso;
    }

    public void setTiempoUso(double TiempoUso) {
        this.TiempoUso = TiempoUso;
    }

    public double getEstadoBici() {
        return EstadoBici;
    }

    public void setEstadoBici(double EstadoBici) {
        this.EstadoBici = EstadoBici;
    }

    public double getTiempoVida() {
        return TiempoVida;
    }

    public void setTiempoVida(double TiempoVida) {
        this.TiempoVida = TiempoVida;
    }



    public double Dato_actividad(){
        return (getTiempoVida() * getTiempoUso()) - (getEstadoBici()/2);
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
            Datos de la """+" "+this.TBicicleta +" y su Impacto Ecologico:" + "\n" +
                "Tiempo de uso de la Bicicleta (Horas): " + this.TiempoUso+ "\n" +
                "Estado de la Bicicleta (Porcentaje): " + this.EstadoBici+ "\n"+
                "Tiempo de vida de la Bicicleta (Años): " + this.TiempoVida + "\n" +
                "Impacto Ecologico: " + this.ObtenerImpactoEcologico() + "\n"+
                "-----------------------------------------------------------"+ "\n" ;
        return s;
    }

}