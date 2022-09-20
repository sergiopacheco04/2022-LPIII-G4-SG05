package asociacion;

import composicion.Persona;

public class TestAsociacion {

	public static void main(String[] args) {
		Banco bcp = new Banco("bcp",10);
		
		Persona p1 = new Persona(1,"Felipe","Fernandez");
		Persona p2 = new Persona(2,"Maria","Luna",'E');
		Persona p3 = new Persona(9,"Juan","Rodriguez",'B');
		Persona p4 = new Persona(3,"Rodrigo","Rodriguez");

		
		bcp.agregarCliente(p5);
		bcp.agregarCliente(p6);
		bcp.agregarCliente(p8);
		bcp.agregarCliente(p7);
		System.out.println(bcp);

		bcp.darBajaCliente(p5);
		System.out.println(bcp);

		bbva.darBajaCliente(p7);
		bbva.clienteTipo();

	}

}
