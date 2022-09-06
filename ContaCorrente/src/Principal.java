import java.util.Scanner;
public class Principal {
	public static void main (String []args) {
		Scanner in = new Scanner(System.in);
		ContaSimplificada c1 = new ContaSimplificada();
		
		int numeroConta;
		String nomeCorrentista;
		double saldo;
		
		System.out.println("Digite o nome do correntista:");
		nomeCorrentista = in.nextLine();
		
		System.out.println("Digite o numero da Conta:");
		numeroConta = in.nextInt();
		
		System.out.println("Digite o Saldo da conta:");
		saldo = in.nextDouble();
		
		System.out.println();
		c1.exibirSaldo();
		
		System.out.println();
		
		
		c1.abreConta(numeroConta, nomeCorrentista, saldo);
		
		System.out.println("Deposite um valor para a sua conta:");
		saldo=in.nextDouble();
		c1.depositaValor(saldo);
		
		System.out.println();
		c1.exibirSaldo();
		
		System.out.println("Retire o valor da sua conta:");
		saldo=in.nextDouble();
		c1.retiraValor(saldo);
		
		System.out.println();
		c1.exibirSaldo();
		
		System.out.println("Retire o valor da sua conta:");
		saldo=in.nextDouble();
		
		System.out.println();
		
		System.out.println("O saldo atual é: "+c1.retiraValorRetornaSaldo(saldo));

		
		
 }
	
}
