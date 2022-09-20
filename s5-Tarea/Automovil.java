package agregacion;

public class Automovil {
	private String placa;
	private int numPuertas;
	private String marca;
	private String modelo;
	private Motor motor;
	
	public Automovil(String placa,int numPuertas,String marca, String modelo) {
		this.placa = placa;
		this.numPuertas = numPuertas;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getNumPuertas() {
		return this.numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Motor getMotor() {
		return this.motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		String m,s1,s2;
		if (this.motor == null)
			m = "sin motor";
		else
			m = "con motor";
		
		s1 =  "Automovil "+ m + "\nPlaca     : " + this.placa + "\nNo.Puertas: " + this.numPuertas + "\nMarca     : " + this.marca + "\nModelo    : " + this.modelo
				+ "\n";
		s2 = s1 + this.motor;
		
		if (this.motor == null)
			return s1;
		return s2;
	}
}

