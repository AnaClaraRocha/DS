public class Bike extends Veiculo {
	
	String pedal;
	String portaCopos;
	double preco;
	
 public double preco () {
		
		this.preco=preco;
		
		if (this.preco >= 1500 ) {
			System.out.println("Parab�ns voc� � rico! ");
		}else {
			System.out.println("Parab�ns voc� tem uma Bike comum!");
		}
		return this.preco;
		}
}

