/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perfilmedico;
import java.util.Scanner;

public class PerfilMedico {

	public static void main(String[] args) {
		 try (Scanner s1 = new Scanner(System.in)) {
	            System.out.println("Ingrese el nombre: ");
	            String mia = s1.next();
	            System.out.println("Ingrese el apellido: ");
	            String mib = s1.next();
	            System.out.println("Ingrese el sexo (masculino/femenino): ");
	            String mic = s1.next();        
	            System.out.println("Ingrese el dia de nacimiento: (01-31)");
	            Integer mid = s1.nextInt();
	            System.out.println("Ingrese el mes de nacimiento: (01-12) ");
	            Integer mie = s1.nextInt();
	            System.out.println("Ingrese el año de nacimiento: (XXXX)");
	            Integer mif = s1.nextInt();
	            System.out.println("Ingrese la altura en cm: ");
	            Double mig = s1.nextDouble();        
	            System.out.println("Ingrese el peso en kg: ");
	            Double mih = s1.nextDouble();
	     
	            perfil persona1 = new perfil();
	            persona1.seta(mia);
	            persona1.setb(mib);
	            persona1.setc(mic);
	            persona1.setd(mid);
	            persona1.sete(mie);
	            persona1.setf(mif);
	            persona1.setg(mig);
	            persona1.seth(mih);
	     
	            System.out.println("*PERFIL MEDICO*\n"+persona1.toString());
	            System.out.println("Edad: "+persona1.edad());       
	            persona1.frecuenciaCardiacaMax();
	            persona1.IMC();
	        }

	}

}
