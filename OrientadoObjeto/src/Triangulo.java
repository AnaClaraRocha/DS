public class Triangulo {
	
	double base;
	double altura;
    double area;
	String cor;

	//METODOS
    // VOID 01  SEM PARAMETRO SEM RETORNO
	
	public void exibirDados() {
		System.out.println("Insira a Base:: " +this.base);
		System.out.println("Insira o número de altura  " +this.altura);
		System.out.println("Cor: " +this.cor);
	}
	
	public double calcularArea() {
		
		double area;
		
		area = (this.base * this.altura) / 2;
		
		return area;
	}
	
    // DOUBLE 01 SEM PARAMETRO COM RETORNO
	public void atribuirExibir(double base, double altura, String cor)  {
		
        double area;
		
		System.out.println("Insira a Base: " +this.base);
		System.out.println("Insira a Altura  " +this.altura);
		System.out.println("Cor: " +this.cor);
		
	}
	
    // VOID 02 COM PARAMETRO SEM RETORNO
	public double atribuirCalcularExibir(double base, double altura, String cor) {
		
        double area;
		
		System.out.println("Insira a Base: " +this.base);
		System.out.println("Insira a Altura:  " +this.altura);
		System.out.println("Cor: " +this.cor);
		
		area = (this.base * this.altura) / 2 ;
		
		return area;
		
	}
	
	
}