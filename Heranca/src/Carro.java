public class Carro extends Veiculo {
	
	double cavalos;
	String step;
	String tetoSolar;

	//METODOS
	
	//01
  public double cavalos () {
			
			this.cavalos=cavalos;
			
			if (this.cavalos >= 300 ) {
				System.out.println("Parab�ns o seu carro � esportivo");
			}else {
				System.out.println("Infelizmente seu carro n�o � esportivo");
			}
			return this.cavalos;
			}
 }

