public class ContaSimplificada {
	
	int numeroConta;
	String nomeCorrentista;
	double saldo;
	
	//METODOS
	
	//01
	public void abreConta ( int numeroConta,String nomeCorrentista, double saldo) {
	
		this.numeroConta = numeroConta ;
		this.nomeCorrentista = nomeCorrentista ;
		this.saldo = saldo ;
	}
	
	//02
	public void depositaValor (double valor ) {
		
		this.saldo = this.saldo + valor;
		
		
	}
	
	//03
	public void  retiraValor(double valor) {
		
		if(valor > this.saldo) {
			 System.out.println("O seu valor não pode ser retirado");
			 
		 }else {
				
				this.saldo =  this.saldo - valor;
				
			}
	
	}
	
	//04
	public double retiraValorRetornaSaldo (double valor ) {
		
		if(valor > this.saldo) {
			 System.out.println("O seu valor não pode ser retirado");
			 
		 }else {
				
				this.saldo =  this.saldo - valor;
				
			}
	
		return this.saldo;
	}
	
	//05 
	public void exibirSaldo () {
		System.out.println("Saldo Atual da Conta: "+this.saldo);
		}
	
}
