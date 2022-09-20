package asociacion;

import composicion.Persona;

public class Banco {
	private String nombre;
	private Persona clientes[];
	
	public Banco(String nombre) {
		this(nombre,20);
	}
	public Banco(String nombre, int numCli) {
		this.nombre = nombre;
		this.clientes = new Persona[numCli];
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Persona[] getClientes() {
		return this.clientes;
	}
	public void setClientes(Persona[] clientes) {
		this.clientes = clientes;
	}
	public boolean buscarCliente(Persona persona) {
		for (int i=0; i < clientes.length; i++) {
			if (this.clientes[i] !=null) {
				if (this.clientes[i].equals(persona)) {
					return true;
				}
			}
		}
		return false;
	}
	public void agregarCliente(Persona persona) {
		if (buscarCliente(persona))
			System.out.println("La persona ya es cliente del Banco ...");
		else {
			int i;
			for(i=0; i < clientes.length; i++)
				if (clientes[i] == null)
					break;
			if (i < clientes.length)
				clientes[i] = persona;
			else
				System.out.println("No hay capacidad en el arreglo ...");
		}
	}

	public Persona darBajaCliente(Persona persona) {
		if (buscarCliente(persona)) {
			int cont = -1;
			for (int i = 0; i < clientes.length; i++) {
				cont++;
				if (this.clientes[i] !=null) {
					if (this.clientes[i].equals(persona)) {
						if(i == cont)
							this.clientes[i] = null;
						else
							this.clientes[i] = this.clientes[cont];						
					}
					
				}
			}
			return persona;
		}
		return null;
	}

	public void clienteTipo() {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null) {
				switch(this.clientes[i].getTipoCliente()) {
				case 'C':
					System.out.println(this.clientes[i]+"\nTipo de Cuenta: Cliente");
					break;
				case 'B':
					System.out.println(this.clientes[i]+"\nTipo de Cuenta: Banca Exclusiva");
					break;
				case 'E':
					System.out.println(this.clientes[i]+"\nTipo de Cuenta: Empresarial");
					break;
				}
			}
		}
	}
	@Override
	public String toString() {
		String st = "Banco: "+this.nombre+"\n";
		for(Persona p : this.clientes) {
			if(p != null)
				st += p + "\n";
		}
		return st;
	}
	
}
