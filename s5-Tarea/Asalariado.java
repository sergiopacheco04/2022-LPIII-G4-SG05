package herencia;

public class Asalariado {
	private String nombre;
	private long dni;
	private int diasVacaciones;
	private double salarioBase;
	
	public Asalariado(String nombre, long dni, int diasVacaciones, double salarioBase) {
		this.nombre = nombre; 
		this.dni = dni;
		this.diasVacaciones = diasVacaciones;
		this.salarioBase = salarioBase;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public int getDiasVacaciones() {
		return this.diasVacaciones;
	}

	public void setDiasVacaciones(int diasVacaciones) {
		this.diasVacaciones = diasVacaciones;
	}
	

	public double getSalario() {
		return this.salarioBase;
	}

	@Override
	public String toString() {
		return "\nEmpleado Asalariado" + "\nDni        : "+ this.dni +"\nNombre     : "+ this.nombre+"\nVacaciones : " + this.diasVacaciones+" dias"+ "\nSalario    : "+this.getSalario()+"\n";
	}
	
}
