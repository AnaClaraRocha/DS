import javax.swing.JOptionPane; 
public class combust�velAlGa {
	
	public static void main (String args[])   {
		
		double escolha, quilometro, km, resultado, litros;
		
		escolha =Double.parseDouble( JOptionPane.showInputDialog(null,"Qual o tipo de combust�vel : \n 1-Alcool\n 2-Gasolina","Dados Combustivel",
		JOptionPane.QUESTION_MESSAGE));
		 km = Double.parseDouble(JOptionPane.showInputDialog(null,"Quantos km?","Alcool",JOptionPane.QUESTION_MESSAGE));
		 quilometro = Double.parseDouble(JOptionPane.showInputDialog(null,"Quantos km por litro?","Alcool",JOptionPane.QUESTION_MESSAGE));
		
	  if(escolha == 1) {
		  resultado = (km/quilometro);
		  resultado = resultado*3.50;
		  litros = resultado/3.50;
		  
	  }else {
		 resultado = (km/quilometro);
		 resultado = resultado*5.00;
		 litros = resultado/5.00;
		  
	  }
	  
	  JOptionPane.showMessageDialog(null,"O consumo do ve�culo em reais � de R$"+resultado+" para rodar "+km+"km e gastar "+litros+" litros", "Resultado Combustivel", JOptionPane.INFORMATION_MESSAGE);
	}

}
