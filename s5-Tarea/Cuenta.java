package composicion;

public class Cuenta {
	private String numero;
	private double saldo;
	public Cuenta(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	public Cuenta(String numero) {
		this(numero,50);		
	}
	public String getNumero() {
		return this.numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double retirar(double cantidad) {
		this.saldo = this.saldo - cantidad;
		return this.saldo;
	}
	

	public double depositar(double cantidad) {
		this.saldo = this.saldo + cantidad;
		return this.saldo;
	}

	@Override
	public String toString() {
		return "No.Cuenta: " + this.numero + "      Saldo:  " + this.saldo;
	}


}