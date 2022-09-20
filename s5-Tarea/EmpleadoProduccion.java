package herencia;

import java.text.DecimalFormat;

public class EmpleadoProduccion extends Asalariado {
	private String turno;
	
	public EmpleadoProduccion(String nombre, long dni, int diasVacaciones,double salarioBase, String turno) {
		super(nombre,dni,diasVacaciones,salarioBase);
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	

	public double getSalario() {  
		return super.getSalario()*(1 + 0.15);
	}

	@Override
	public String toString() {
		DecimalFormat frmt = new DecimalFormat("#.##");
		return "\nEmpleado de Produccion" + "\nDni        : "+ super.getDni() +"\nNombre     : "+ super.getNombre()+"\nVacaciones : " + super.getDiasVacaciones() + " dias"+ "     \tTurno : " + this.turno + "\nSalario    : "+frmt.format(this.getSalario())+"\n";
	}
	
}
