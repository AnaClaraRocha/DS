import java.util.Scanner;
public class Principal {
	public static void main (String []args) {
		Scanner in = new Scanner(System.in);
		Produto p1 = new Produto();
		
		int entrada, saida;
		double precoVenda;
		 
		System.out.println("Digite o nome do Produto:");
		p1.nome = in.next();
		
		System.out.println("Digite o codigo do Produto:");
		p1.codigo = in.nextInt();
		
		System.out.println("Digite o Preço do Custo:");
		p1.precoCusto = in.nextDouble();
		
		System.out.println("Digite a quantidade do produto:");
		p1.quantidade = in.nextInt();
		
		System.out.println("Digite a margem do lucro:");
		p1.margemLucro = in.nextDouble();
		
		p1.calcularPrecoVenda();
		
		System.out.println("Registre a Entrada de Unidades:");
		entrada = in.nextInt();
		
		System.out.println("QUANTIDADES ENTRADA PRODUTOS: " +p1.registrarEntrada(entrada));
		
		System.out.println("Registre a Saída de Unidades:");
		saida = in.nextInt();
		
		System.out.println("QUANTIDADE SAÍDA PRODUTOS: " +p1.registrarSaida(saida) );
		
		System.out.println();
		p1.exibirDados();
		
		
		System.out.println("Definir um novo valor de venda:");
		precoVenda=in.nextDouble();
	    p1.definirPrecoVenda(precoVenda);
		
	    System.out.println();
		p1.exibirDados();
		
		
		
		
		
		
		
		
		
	}
}
