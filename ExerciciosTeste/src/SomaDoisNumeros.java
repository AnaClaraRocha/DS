import java.util.Scanner;
public class SomaDoisNumeros {
	public static void main (String []args) {
	Scanner in = new Scanner(System.in);
	
	//ESTE PARA SOMAR DOIS NUMEROS 	
	int nu1;
	int nu2;
	double total;
	
	System.out.println("Digite o Primero N�mero:");
	nu1=in.nextInt();
	
	System.out.println("Digite o Segundo N�mero");
	nu2 = in.nextInt();
	
	total = nu1+nu2;
	
	System.out.println();
	
	System.out.println("A soma dos dois n�meros �: " +total);
	
	}	
}
