package composicion;

public class TestComposicion {

	public static void main(String[] args) {
		Persona p1 = new Persona(2734,"Oscar","Gutierrez",'E',3600);

		Persona p2 = new Persona(2734,"Felipe","Lopez",2500);
		
		Persona p3 = new Persona(112,"Maria","Fernandez",'B');
		
		Persona p4 = new Persona(112,"Ana","Apaza");
		
		System.out.println(p1);
		System.out.println();
		System.out.println(p2);
		System.out.println();
		System.out.println(p3);
		System.out.println();
		System.out.println(p4);
		System.out.println();
	}

}
