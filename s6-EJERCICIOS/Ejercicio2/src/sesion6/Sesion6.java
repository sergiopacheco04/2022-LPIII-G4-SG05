package sesion6;

/**
 *
 * @author Cesar
 */
public class Sesion6 {

    public static void main(String[] args) {

        ImpactoEcologico[] ObjImpacto = new ImpactoEcologico[3];

        ObjImpacto[0] = new Edificio("Edificio",150,110,50);
        ObjImpacto[1] = new Auto("Automovil", 200, 50, 26.4979);
        ObjImpacto[2] = new Bicicleta("Biclicleta", 6, 70, 10);

        System.out.println("Impacto Ambiental en los objetos Edificio, Automovil y Bicicleta: ");
        
        for(ImpactoEcologico ObjetosActuales : ObjImpacto) 
        {
            System.out.printf( ObjetosActuales.toString());
        }
    }    
}