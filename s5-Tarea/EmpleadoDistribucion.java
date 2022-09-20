package herencia;

import java.text.DecimalFormat;

public class EmpleadoDistribucion extends Asalariado {
	private String zona;
	public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, double salarioBase,String zona) {
		super(nombre,dni,diasVacaciones,salarioBase);
		this.zona = zona;
	}
	public String getZona() {
		return this.zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	

	public double getSalario() { 
		return super.getSalario()*(1+0.1);
	}
	
	@Override
	public String toString() {
		DecimalFormat frmt = new DecimalFormat("#.##");
		return "\nEmpleado de Distribuccion" + "\nDni        : "+ super.getDni() +"\nNombre     : "+ super.getNombre()+"\nVacaciones : " + super.getDiasVacaciones() + " dias"+ "     \tZona : " + this.zona + "\nSalario    : "+frmt.format(this.getSalario())+"\n";
	}
	

}
