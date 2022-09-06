public class Carro extends Veiculo {
	
	double cavalos;
	String step;
	String tetoSolar;

	//METODOS
	
	//01
  public double cavalos () {
			
			this.cavalos=cavalos;
			
			if (this.cavalos >= 300 ) {
				System.out.println("Parabêns o seu carro é esportivo");
			}else {
				System.out.println("Infelizmente seu carro não é esportivo");
			}
			return this.cavalos;
			}
 }

