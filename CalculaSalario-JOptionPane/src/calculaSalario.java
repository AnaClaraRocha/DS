

import javax.swing.JOptionPane;

public class calculaSalario {
	
	public static void main(String[] args) {
		double sFixo , vUnitaria,pComissao, total;
		int qtdVendida;
		
		sFixo =Double.parseDouble( JOptionPane.showInputDialog(null,"Digite seu salario fixo:","Salario Fixo"
				, JOptionPane.OK_CANCEL_OPTION));
		vUnitaria =Double.parseDouble( JOptionPane.showInputDialog(null,"Digite o Valor de cada produto:","Valor Unitario"
				, JOptionPane.OK_CANCEL_OPTION));
		qtdVendida =Integer.parseInt( JOptionPane.showInputDialog(null,"Digite a quantidade vendida :","Quantidade Venda"
				, JOptionPane.OK_CANCEL_OPTION));
		pComissao =Double.parseDouble( JOptionPane.showInputDialog(null,"Digite a Comissão :","Comissão"
				, JOptionPane.OK_CANCEL_OPTION));
		total = sFixo + ((vUnitaria*qtdVendida)*pComissao/100);
		 JOptionPane.showMessageDialog(null,"Salario  total do vendedor é: " +total, "Total",  JOptionPane.INFORMATION_MESSAGE);
		
		 Object[] options= {"Fone", "Celular","Noteboock"};
		 
		 JOptionPane.showInputDialog(null, "Selecione o aparelho desejado", "Loja", JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
		 
		 JOptionPane.showConfirmDialog(null, "Deseja Continuar", "Pergunta", JOptionPane.YES_NO_CANCEL_OPTION );
	}	
}
