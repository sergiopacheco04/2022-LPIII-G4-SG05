package herencia;

public class TestHerencia {

	public static void main(String[] args) {
		
		Asalariado empleado1 = new Asalariado("Juan Perez",28339187,5,3500);
		EmpleadoProduccion empleado2 = new EmpleadoProduccion("Rocio Fernandez",35289129,10,3500,"Tarde");
		EmpleadoDistribucion empleado3 = new EmpleadoDistribucion("Rocio Fernandez",35289129,10,3500,"Centro");
		System.out.println(empleado1);
		System.out.println(empleado2);
		System.out.println(empleado3);

	}

}
