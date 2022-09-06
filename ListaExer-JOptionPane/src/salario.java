import javax.swing.JOptionPane;  

public class salario {
	public static void main (String args[])   {
		
		double salario, reajuste , sAntigo, rAntigo;
		String nome;
		
		 nome =( JOptionPane.showInputDialog(null,"Digite seu nome:","Nome"
				, JOptionPane.QUESTION_MESSAGE));
		
		salario =Double.parseDouble( JOptionPane.showInputDialog(null,"Digite seu salario atual:","Salario Atual"
				, JOptionPane.QUESTION_MESSAGE));
		
		reajuste =Double.parseDouble( JOptionPane.showInputDialog(null,"Digite O Reajuste:","Reajuste"
				, JOptionPane.QUESTION_MESSAGE));
		
		sAntigo = salario;
		
		rAntigo = salario/100*reajuste;
		
		salario =salario  +(salario/100*reajuste);
		
		 JOptionPane.showMessageDialog(null,"Nome: " +nome, "Nome",  JOptionPane.INFORMATION_MESSAGE);
		 
		 JOptionPane.showMessageDialog(null,"Salario Antigo: " +sAntigo, "Salario ANtigo",  JOptionPane.INFORMATION_MESSAGE);
		 
		 JOptionPane.showMessageDialog(null,"Reajuste: " +reajuste, "Reajuste",  JOptionPane.INFORMATION_MESSAGE);
		 
		 JOptionPane.showMessageDialog(null,"Valor do reajuste: " +rAntigo, "Valor do reajuste",  JOptionPane.INFORMATION_MESSAGE); 
		
		 JOptionPane.showMessageDialog(null,"Salario com Reajuste: " +salario, "Salario com reajuste",  JOptionPane.INFORMATION_MESSAGE);
		 	
	}
}
