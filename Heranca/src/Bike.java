public class Bike extends Veiculo {
	
	String pedal;
	String portaCopos;
	double preco;
	
 public double preco () {
		
		this.preco=preco;
		
		if (this.preco >= 1500 ) {
			System.out.println("Parabêns você é rico! ");
		}else {
			System.out.println("Parabêns você tem uma Bike comum!");
		}
		return this.preco;
		}
}

