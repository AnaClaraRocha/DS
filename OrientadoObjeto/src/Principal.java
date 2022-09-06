import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	        Circulo c1 = new Circulo();
		
		// VOID 01  SEM PARAMETRO SEM RETORNO
		//PARA USUARIO DIGITAR
		
		System.out.println("Digite o Raio do Circulo:");
		c1.raio = in.nextDouble();
		
		System.out.println("Digite o número do Pi:");
		c1.pi = in.nextDouble();
		
		System.out.println("Digite a Cor do Circulo:");
		c1.cor = in.next();
		
		System.out.println();
		
		// APRESENTAR  
		
		System.out.println("Dados digitados sobre o Circulo");
		System.out.println();
		System.out.println("Raio: " +c1.raio);
		System.out.println("Pi: " +c1.pi);
		System.out.println("Cor: " +c1.cor);
		
		
		// SEM PARAMETRO COM RETORNO
		
		System.out.println("Apresentar Area: " +c1.calcularArea());
		
		
	    // COM PARAMETRO SEM RETORNO
		
		System.out.println();
		
		c1.atribuirExibir(10, 20, "ROSA");
		System.out.println("Apresentar NOVA Area: " +c1.calcularArea());

		
		System.out.println();
		
	
		// COM PARAMETRO COM RETORNO
		// ATRIBUINDO, CALCULANDO E EXIBINDO PELO MESMO METODO 
		
		System.out.println("Apresentar NOVA Area: " +c1.atribuirCalcularExibir(15, 49, "VERDE AGUA"));
		
		
		
	}
}