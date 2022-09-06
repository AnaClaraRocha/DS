
public abstract class Conta {

	private String numero;
	private String agencia; 
	private double saldo;
	Cliente cliente;
	private double taxa;
	
	public Conta() { }
	
	Conta(String agencia, String numero, Cliente cliente ){
		this.numero = numero;
		this.agencia = agencia;
		this.cliente = cliente;
	}
	
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean sacar (double valor) {
		if(getSaldo() < valor ) {
			System.out.println("\n Saldo Insuficiente");
			return false;
		}else {
			setSaldo (this.saldo-valor);
			return true;
		}

}
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public double consultarSaldo() {
		
		System.out.println("Saldo da conta");
		System.out.println("Saldo Atual: "+ getSaldo ());
		return saldo;

	}

} 