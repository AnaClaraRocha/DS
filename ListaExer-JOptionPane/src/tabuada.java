import javax.swing.JOptionPane;  

public class tabuada {
	public static void main (String args[])   
	 {  
		 int numero, multiplicador=1;
		 String resultado="";

		 numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que deseja ter a Tabuada: "));  
		 
	        for(multiplicador=1;multiplicador <= 10; multiplicador ++) {
	        	resultado+=numero+"*"+multiplicador+"= "+numero*multiplicador+"\n";
	        }
		   
     JOptionPane.showMessageDialog(null,"Tabuada \n " +resultado, "Tabuada *",  JOptionPane.INFORMATION_MESSAGE);
	   }  
}


