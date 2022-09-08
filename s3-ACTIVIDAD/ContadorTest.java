/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contadortest;

/**
 *
 * @author Cesar
 */
public class ContadorTest {
    public static void main(String[] args) {
        Contador c1,c2,c3;
        System.out.println(Contador.acumulador());
        c1 =new Contador(3);
        c2 =new Contador(10);
        c3 = new Contador();
        c1.inc();   
        c1.inc();
        c2.inc();
        System.out.println(Contador.nContadores);
        System.out.println("Valor del contador c1: "+c1.getValor());
        System.out.println("Valor del contador c2: "+c2.getValor());
        System.out.println("Valor del contador c3: "+c3.getValor());
        System.out.println("Valor del acumulador: "+Contador.acumulador);
    
        System.out.println(Contador.ultimoContador(c3));

}
    }

