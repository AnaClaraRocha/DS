public class Circulo {
	
	double raio;
	double pi;
    double area;
	String cor;

	//METODOS
    // VOID 01  SEM PARAMETRO SEM RETORNO
	
	public void exibirDados() {
		System.out.println("Raio: " +this.raio);
		System.out.println("Pi  " +this.pi);
		System.out.println("Cor: " +this.cor);
	}
	
	public double calcularArea() {
		
		double area;
		
		area = this.pi * this.raio * this.raio;
		
		return area;
	}
	
    // DOUBLE 01 SEM PARAMETRO COM RETORNO
	public void atribuirExibir(double raio, double pi, String cor)  {
		
        double area;
		
		System.out.println("Raio: " +this.raio);
		System.out.println("Pi  " +this.pi);
		System.out.println("Cor: " +this.cor);
		
	}
	
    // VOID 02 COM PARAMETRO SEM RETORNO
	public double atribuirCalcularExibir(double raio, double pi, String cor) {
		
        double area;
		
		System.out.println("Raio: " +this.raio);
		System.out.println("Pi  " +this.pi);
		System.out.println("Cor: " +this.cor);
		
		
		area = this.pi * this.raio * this.raio;
		
		return area;
		
	}
	
	
}

