public class Moto extends Veiculo {
	
	double cilindradas;
	String  mataCachorro ;
	String protecaoContraoVento;
	
public double cilindradas () {
		
		this.cilindradas=cilindradas;
		
		if (this.cilindradas >= 150 ) {
			System.out.println("Parab�ns sua moto � esportiva ");
		}else {
			System.out.println("Infelizmente sua moto n�o � esportiva");
		}
		return this.cilindradas;
		}

	
	
}