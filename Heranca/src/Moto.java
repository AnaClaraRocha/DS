public class Moto extends Veiculo {
	
	double cilindradas;
	String  mataCachorro ;
	String protecaoContraoVento;
	
public double cilindradas () {
		
		this.cilindradas=cilindradas;
		
		if (this.cilindradas >= 150 ) {
			System.out.println("Parabêns sua moto é esportiva ");
		}else {
			System.out.println("Infelizmente sua moto não é esportiva");
		}
		return this.cilindradas;
		}

	
	
}