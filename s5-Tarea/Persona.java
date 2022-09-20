package composicion;

public class Persona {
	private int id;
	private String nombre;
	private String apellido;
	private Cuenta cuenta;
	static int contC = 0;
	static int contB = 0;
	static int contE = 0;

	private char tipoCliente;
	
	public Persona(int id, String nombre, String apellido, char tipoCliente, double saldo) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoCliente = tipoCliente;
		String numero = " ";

		switch (tipoCliente) {
		case 'C':
			numero = "C"+ 1000 + contC;
			contC++;
			break;
		case 'B':
			numero = "B"+ 5000 + contB;
			contB++;
			break;
		case 'E':
			numero = "E"+ 8000 + contE;
			contE++;
			break;
		}
		this.cuenta = new Cuenta(numero,saldo);
	}

	public Persona(int id, String nombre, String apellido, double saldo) {
		this(id,nombre,apellido,'C', saldo);
	}
	
	public Persona(int id, String nombre, String apellido) {
		this(id,nombre,apellido,'C', 50);
	}
	
	public Persona(int id, String nombre, String apellido, char tipoSaldo) {
		this(id,nombre,apellido,tipoSaldo, 50);
	}
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public char getTipoCliente() {
		return this.tipoCliente;
	}
	public void setTipoCliente(char tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	@Override
	public String toString() {
		return "Cliente: " + this.id +"\nTipo   : "+ this.tipoCliente +"\nNombres: " + this.nombre + " " + this.apellido+"\n"+ this.cuenta;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return id == other.id;
		
	}
	

}

