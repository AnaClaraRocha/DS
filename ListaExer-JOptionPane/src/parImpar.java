import javax.swing.JOptionPane;  
	public class parImpar {
	
	public static void main (String args[])   {
		
		int numero ;
		double confirmacao, escolha = 0;
		String pergunta;
		
		for(confirmacao=1;confirmacao <= 2; confirmacao ++) {
			
			numero = Integer.parseInt( JOptionPane.showInputDialog(null,"Digita o n�mero","Par ou �mpar",
					  JOptionPane.QUESTION_MESSAGE));
					
			if(numero %2 == 0){
			  JOptionPane.showMessageDialog(null,"Par \n Numero Digitado: " +numero, "Numero Par ",  JOptionPane.INFORMATION_MESSAGE);
		    }else{
			  JOptionPane.showMessageDialog(null,"�mpar \n Numero Digitado:  " +numero, "Numero �mpar ",  JOptionPane.INFORMATION_MESSAGE);
			}
					
			escolha = JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "Pergunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );
     
        }
		
		if(escolha == 1) {
			
			 JOptionPane.showConfirmDialog(null, "Voc� Terminou o Programa!", "Terminou", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE );
		}
		
	}
}
