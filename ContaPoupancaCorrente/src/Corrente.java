
public class Corrente extends Conta {

	private double limiteAutorizado, limiteDisponivel;
	
	public Corrente() { }
	
	public Corrente(String agencia, String numero, Cliente cliente  ) {
		super(agencia, numero, cliente);
		super.setTaxa(10);
		super.setSaldo(100);
	}
	
	public double getLimite() {
		return limiteAutorizado;
	}
	public void setLimite(double limite) {
		this.limiteAutorizado = limite;
		this.limiteDisponivel = limite;
	}
	public double getNovolimite() {
		return limiteDisponivel;
	}
	public void setNovolimite(double novolimite) {
		this.limiteDisponivel = novolimite;
	}
	
	public boolean sacar(double valor) {
		if(getSaldo()+this.limiteDisponivel<valor) {
			System.out.println("Limite insuficiente");
			return false;
		}else {
			this.setSaldo(this.getSaldo()-valor);
			if(this.getSaldo()<0) {
				this.limiteDisponivel=this.limiteDisponivel+this.getSaldo();
				this.setSaldo(0);
			}
			return true;
		}
	}
	
	public void depositar (double valor) {
		
		this.limiteDisponivel=this.limiteDisponivel+valor;
		if(this.limiteDisponivel>this.limiteAutorizado) {
			valor=this.limiteDisponivel-this.limiteAutorizado;
			setSaldo(getSaldo()+valor);
			this.limiteDisponivel=this.limiteAutorizado;
		}
		
		
	}
	

	
}

