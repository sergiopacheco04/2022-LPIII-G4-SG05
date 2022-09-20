package agregacion;

public class TestAgregacion {

	public static void main(String[] args) {
		Automovil a1 = new Automovil("AU398",3,"Toyota","Corolla");
		Automovil a2 = new Automovil("VH742",5,"Nissan","Versa");
		Motor m1 = new Motor(3728,1000);
		a2.setMotor(m1);
		System.out.println(a1);
		System.out.println(a2);


	}

}
