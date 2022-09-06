public class Poupanca extends Conta {
	
	 private double redimento;
	 private int diaAniversario;
	 
	 public Poupanca() { }
		
		public Poupanca(String agencia, String numero, Cliente cliente) {
			super(agencia, numero, cliente);
			super.setTaxa(1.5);
			super.setSaldo(100);
		}
	 
	public double getRedimento() {
		return redimento;
	}
	
	public void setRedimento(double redimento) {
		this.redimento = redimento;
	}
	
	public int getDiaAniversario() {
		return diaAniversario;
	}
	
	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	public boolean sacar(double valor) {
		if(super.getSaldo()<valor) {
			return false;
		}else {
			super.setSaldo(super.getSaldo()-valor);
			return false;
			
		}
	}
	
}
