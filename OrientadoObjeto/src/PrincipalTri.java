import java.util.Scanner;
public class PrincipalTri {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	        Triangulo  t1 = new Triangulo();
		
		// VOID 01  SEM PARAMETRO SEM RETORNO
		//PARA USUARIO DIGITAR
		
		System.out.println("Digite a Base do Triangulo:");
		t1.base = in.nextDouble();
		
		System.out.println("Digite a Altura do Triangulo:");
		t1.altura = in.nextDouble();
		
		System.out.println("Digite a cor do Triangulo :");
		t1.cor = in.next();
		
		System.out.println();
		
		//APRESENTAR
		
		System.out.println("Dados digitados sobre o Triangulo");
		System.out.println();
		System.out.println("Base: " +t1.base);
		System.out.println("Altura: " +t1.altura);
		System.out.println("Cor: " +t1.cor);
		
		// SEM PARAMETRO COM RETORNO

		System.out.println("Apresentar Area: " +t1.calcularArea());
		
		
		//  COM PARAMETRO SEM RETORNO
		//System.out.println(RETANGULO COM OS DAODS DIRETO NOS PARAMETROS);
		
		System.out.println();
		
		t1.atribuirExibir(10, 20, "ROSA");
		System.out.println("Apresentar NOVA Area: " +t1.calcularArea());

		
		//  COM PARAMETRO E COM RETORNO 
		// ATRIBUINDO, CALCULANDO E EXIBINDO PELO MESMO METODO 
		
		System.out.println();
		
	
		System.out.println("Apresentar NOVA Area: " +t1.atribuirCalcularExibir(15, 49, "VERDE AGUA"));
		
		
		
	}
}

