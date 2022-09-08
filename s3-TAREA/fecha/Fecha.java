/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fecha;
import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class Fecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d, m, a;

        //Se pide por teclado el dia, mes y año
        System.out.println("Introduce fecha: ");
        System.out.print("Dia: ");
        d = sc.nextInt();
        System.out.print("Mes: ");
        m = sc.nextInt();
        System.out.print("Año: ");
        a = sc.nextInt();

        //Se crea un objeto Fecha utilizando el consructor con parámetros
        fecha1 fecha = new fecha1(d,m,a);
        fecha1 f1 = new fecha1(10,10,2010);
        
        System.out.println("La copia de la fecha es: ");
            System.out.println(fecha.copia());
        
        if (fecha.valida()) { //si la fecha es correcta

           //Se muestra utilizando el método toString()
            System.out.println("Fecha introducida: " + fecha);
            fecha.diasMes();
            
            //Se mustra cuantos dias han transcurrido hasta el de hoy desde 1/1/1900
            fecha1.diasTranscurridos(d,m,a);
            
            //Metodos booleanos
            if(fecha1.mayorQue(fecha, f1)==false)
                System.out.println(fecha.toString()+" es mayor que "+f1.toString());
            else
                System.out.println(f1.toString()+" es mayor que "+fecha.toString());
            if(fecha1.menorQue(fecha, f1)==true)
                System.out.println(fecha.toString()+" es menor que "+f1.toString());
            else
                System.out.println(f1.toString()+" es menor que "+fecha.toString());
            if(fecha1.igualQue(fecha, f1)==true)
                System.out.println("las fechas son iguales");
            else
                System.out.println("las fechas no son iguales");
        
            //Se muestra el dia siguiente                              
            System.out.println("El dia siguiente es: ");
            for (int i = 0; i < 1; i++) {
                fecha.Siguiente();
                System.out.println(fecha);
            }
            //Se muestra el dia anterior                              
            System.out.println("El dia anterior es:");
            for (int i = 0; i < 2; i++) {
                fecha.Anterior();
                System.out.println(fecha);
            }
            
            
        } else { //Si la fecha no es correcta
            System.out.println("Fecha no valida");
        }
    }
    
}
