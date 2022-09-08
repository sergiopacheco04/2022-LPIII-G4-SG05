/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contadortest;

/**
 *
 * @author Cesar
 */
public class Contador {
static int acumulador=0;
final static int VALOR_INICIAL = 10;
private int valor;
static int nContadores=0;
static int ultimoContador;

public static int ultimoContador(Contador p1){
    System.out.println("El numero inicial del ultimo contador es: ");
    return p1.getValor();
}


public static int acumulador(){
return acumulador;
}


public Contador(int valora){
    this.valor =valora;
    acumulador +=valor;
    nContadores++;
}
public Contador(){
    this(Contador.VALOR_INICIAL);
    
}
public void inc(){
this.valor++;
acumulador++;

}

public int getValor(){
return this.valor;
}
}
