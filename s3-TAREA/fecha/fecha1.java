/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fecha;
import java.util.Calendar;

/**
 *
 * @author Cesar
 */
public class fecha1 {
    private int anio;
    private int mes;
    private int dia;

    public fecha1(int dia,int mes, int anio) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public fecha1() {
        anio=1900;
        mes=1;
        dia=1;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
    //Método para comprobar si la fecha es correcta
    public boolean valida() {
        boolean diaCorrecto, mesCorrecto, añoCorrecto;
        añoCorrecto = anio >= 1900 && anio <= 2050;
        mesCorrecto = mes >= 1 && mes <= 12;
        switch (mes) {
            case 2:
                if (Bisiesto()) {
                    diaCorrecto = dia >= 1 && dia <= 29;
                } else {
                    diaCorrecto = dia >= 1 && dia <= 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:    
                diaCorrecto = dia >= 1 && dia <= 30;
                break;
            default:
                diaCorrecto = dia >= 1 && dia <= 31;
        }
        return diaCorrecto && mesCorrecto && añoCorrecto;
    }
    
    //Método privado para comprobar si el año es bisiesto
    private boolean Bisiesto() {
        return (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0);
    }
    
    //Método que modifica la fecha cambiándola por la del día siguiente                                           
    public void Siguiente() {
        dia++;
        if (!valida()) {
            dia = 1;
            mes++;
            if (!valida()) {
                mes = 1;
                anio++;
            }
        }
    }
    //Método que modifica la fecha cambiándola por la del día anterior  
    public void Anterior() {
        dia--;
        if (!valida()) {
            dia = 1;
            mes--;
            if (!valida()) {
                mes=1;
                anio--;
            }
        }
    }
    
    
    //Método que muestra los dias del mes
    public int diasMes (){
        int numeroDias=-1;
        boolean diaCorrecto;
        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias=31;
                System.out.println("Los dias del mes "+mes+" son: "+numeroDias);
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias=30;
                System.out.println("Los dias del mes "+mes+" son: "+numeroDias);
            break;
            case 2:
                if (Bisiesto()) {
                    diaCorrecto = dia >= 1 && dia <= 29;
                    numeroDias=29;
                    System.out.println("Los dias del mes "+mes+" son: "+numeroDias);
                } else {
                    diaCorrecto = dia >= 1 && dia <= 28;
                    numeroDias=28;
                    System.out.println("Los dias del mes "+mes+" son: "+numeroDias);
                }
                break;
        }
        return numeroDias;
    }
    //Método que muestra los dias del mes
    public static void diasTranscurridos(int dia, int mes, int anio){
        Calendar inicio = Calendar.getInstance ();
        inicio.set(1 , 1 , 1900) ;
        inicio.set(Calendar.HOUR,0) ;
        inicio.set(Calendar.HOUR_OF_DAY,0) ;
        inicio.set(Calendar.MINUTE,0) ;
        inicio.set(Calendar.SECOND,0) ;
        
        Calendar fin = Calendar.getInstance ();
        fin.set(anio , mes - 1 , dia ) ;
        fin.set(Calendar.HOUR,0) ;
        fin.set(Calendar.HOUR_OF_DAY,0) ;
        fin.set(Calendar.MINUTE,0) ;
        fin.set(Calendar.SECOND,0) ;
        
        long finMS = fin.getTimeInMillis ( ) ;
        long inicioMS = inicio.getTimeInMillis ( ) ;
        int dias = ( int ) ( ( Math.abs ( finMS - inicioMS ) ) / ( 1000 * 60 * 60 * 24 ) ) ;
        System.out.println("Los dias transcurridos son: "+dias);
    }
    
    public static boolean igualQue(fecha1 f1, fecha1 f2) {
        if (f1.dia == f2.dia && f1.mes == f2.mes && f1.anio == f2.anio)
            return true;
        return false;
    }

    public static boolean menorQue(fecha1 f1, fecha1 f2) {
        if (f1.anio <= f2.anio)
            if (f1.mes <= f2.mes)
                if (f1.dia <= f2.dia)
                    return true;
        return false;
    }

    public static boolean mayorQue(fecha1 f1, fecha1 f2) {
        if (f1.anio >= f2.anio)
            if (f1.mes >= f2.mes)
                if (f1.dia >= f2.dia)
                    return true;
        return false;
    }
    
    public fecha1 copia() {
        return this;
    }
    
    //Método toString para mostrar la fecha
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (dia < 10) {
            sb.append("0");
        }
        sb.append(dia);
        sb.append("-");
        if (mes < 10) {
            sb.append("0");
        }
        sb.append(mes);
        sb.append("-");
        sb.append(anio);
        return sb.toString();
    }
    
    
}
