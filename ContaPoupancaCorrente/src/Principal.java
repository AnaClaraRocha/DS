import java.util.Scanner;
public class Principal {
	
 public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Cliente Cliente= new Cliente();
		Corrente Corrente= new Corrente();
		Poupanca P = new Poupanca();
		int tipoConta;
		
		//CORRENTE
		
		System.out.println("Cliente ");
		System.out.println("==================");
		
		System.out.println("Digite o Nome: ");
		Cliente.setNome(in.next());
		
		System.out.println("Digite o Cpf: ");
		Cliente.setCpf(in.next());
		
		System.out.println("Digite o Email: ");
		Cliente.setEmail(in.next());
		
		System.out.println();
		
		System.out.println("Dados do cliente");
		System.out.println("==================");
		System.out.println("Nome: "+Cliente.getNome());
		System.out.println("CPF: "+Cliente.getCpf());
		System.out.println("Email: "+Cliente.getEmail());
		
		Corrente.cliente = Cliente;
		P.cliente = Cliente;
		
		System.out.println();
		
		System.out.println("Qual o seu tipo de conta: 1 - Corrente ou 2 - Poupança");
		tipoConta = in.nextInt();
		
		System.out.println();
		
		if(tipoConta == 1){
				
		System.out.println("\nConta corrente");
		System.out.println("==================");

		System.out.println("Insira o número da conta:");
		Corrente.setNumero(in.next());
				
		System.out.println("Insira o nome da agência:");
		Corrente.setAgencia(in.next());
		
		System.out.println("Insira o saldo da conta:");
		Corrente.setSaldo(in.nextDouble());
		
		System.out.println("Insira o limite da conta:");
		Corrente.setLimite(in.nextDouble());
		
		Corrente.setTaxa(10);
		
		//1 INTERAÇÃO
		System.out.println("Insira o valor a ser sacado:");
		
		if(Corrente.sacar(in.nextDouble())) {
			System.out.println("Saque feito com sucesso.");
		}else {
			System.out.println("Saque não foi realizado.");
		}
		
		System.out.println("O seu Saldo: "+Corrente.consultarSaldo());
		
		System.out.println("O seu Limite: "+Corrente.getNovolimite());
		
		//2 INTERAÇÃO
		System.out.println("Insira o valor a ser depositado:");
		Corrente.depositar(in.nextDouble());
		
		System.out.println("Saldo Atual: "+Corrente.consultarSaldo());
		
		System.out.println("Limite Atual: "+Corrente.getNovolimite());
		
		System.out.println();
		
		System.out.println("Taxa a ser tirada da conta a cada interação: "+Corrente.getTaxa());
		
		System.out.println();
		
		ControleTaxas.registroOperacao(Corrente);
		Corrente.sacar(Corrente.getTaxa());
	
		ControleTaxas.registroOperacao(Corrente);
		Corrente.sacar(Corrente.getTaxa());
		
		System.out.println("Saldo da conta ja com as taxas retiradas: ");
		
		Corrente.consultarSaldo();
		
		//POUPANCA
		
		}else if (tipoConta == 2){
		
		System.out.println("\nConta poupança");
		System.out.println("==================");
		
		P.setSaldo(1000);
		P.setTaxa(1.5);

		System.out.println("Insira o número da conta:");
		P.setNumero(in.next());
		
		System.out.println("Insira o nome da agência:");
		P.setAgencia(in.next());
		
		System.out.println("Insira o valor do saldo:");
		P.setSaldo(in.nextDouble());
		
		System.out.println("Insira o valor do rendimento:");
		P.setRedimento(in.nextDouble());
		
		System.out.println("Insira o dia do aniversário:");
		P.setDiaAniversario(in.nextInt());
		
		System.out.println();
		
		System.out.println("Taxa a ser tirada da conta a cada interação: "+P.getTaxa());
		
		System.out.println();
		
		// 1 INTERAÇÃO
		System.out.println("Insira o valor a ser sacado:");
	
		if(P.sacar(in.nextDouble())) {
			System.out.println("Saque não feito com sucesso.");
		}else {
			System.out.println("Saque  foi realizado.");
		}
		
		System.out.println(P.consultarSaldo());
		System.out.println();
		
		ControleTaxas.registroOperacao(P);
		P.sacar(P.getTaxa());
		
		//2 INTERAÇÃO
		System.out.println("Insira o valor a ser depositado:");
		P.depositar(in.nextDouble());
		
		P.consultarSaldo();
		
		System.out.println();
		
		ControleTaxas.registroOperacao(P);
		P.sacar(P.getTaxa());
		
		ControleTaxas.registroOperacao(P);
		P.sacar(P.getTaxa());
		
		System.out.println("Saldo da conta ja com as taxas retiradas: ");
		
		P.consultarSaldo();
		
		}
		
 	}	
 }