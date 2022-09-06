import javax.swing.JOptionPane;

public class dolarEuro {
	
	public static void main(String[] args) {
		double valor, escolha, soma;
		
	 
	escolha =Double.parseDouble( JOptionPane.showInputDialog(null,"Escolha o tipo de conversão:\n 1-Dolar\n 2-Euro","Banco troca moedas",
			JOptionPane.INFORMATION_MESSAGE));
	valor =Double.parseDouble( JOptionPane.showInputDialog(null,"Coloque o valor em Real","Banco troca moedas"
		, JOptionPane.QUESTION_MESSAGE));
	if(  escolha == 1 ) {
		soma = valor / 5.70;

	}else {
		soma = valor / 5.22;
		
	}
	JOptionPane.showMessageDialog(null,"Dinheiro em Reais convertido: " +soma, "Total",  JOptionPane.INFORMATION_MESSAGE);
	
	}

}

