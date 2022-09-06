import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField caixa01;
	private JTextField caixa02;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calculadora() {
		setResizable(false);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 417, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel.setBounds(160, 11, 138, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Insira o primeiro n\u00FAmero:");
		lblNewLabel_1.setForeground(new Color(204, 0, 102));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(10, 50, 198, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Insira o segundo n\u00FAmero:");
		lblNewLabel_2.setForeground(new Color(204, 0, 102));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(10, 118, 188, 14);
		panel.add(lblNewLabel_2);
		
		caixa01 = new JTextField();
		caixa01.setBounds(10, 75, 169, 20);
		panel.add(caixa01);
		caixa01.setColumns(10);
		
		caixa02 = new JTextField();
		caixa02.setBounds(10, 143, 169, 20);
		panel.add(caixa02);
		caixa02.setColumns(10);
		
		JButton calcular = new JButton("Soma");
		calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//DECLARAR VARIAVEL QUE IRA USAR//
				double numero1;
				double numero2;
				double soma;
				
				//CONVERTER A CAIXA EM VARIALVE//
				numero1= Double.parseDouble(caixa01.getText());
				numero2= Double.parseDouble(caixa02.getText());
				
				//SOMA DOS NUMEROS//
				soma = numero1 + numero2;		
				
				//APRESENTAR A RESPOSTA//
				JOptionPane.showMessageDialog(null, "A soma dos dois n�meros �: " +soma, "Resultado Soma",  JOptionPane.INFORMATION_MESSAGE);
			}
		});
		JButton sub = new JButton("Subtra��o");
		
		
		
		calcular.setBackground(new Color(204, 0, 102));
		calcular.setFont(new Font("Times New Roman", Font.BOLD, 15));
		calcular.setForeground(new Color(0, 0, 0));
		calcular.setBounds(10, 205, 89, 23);
		panel.add(calcular);
		

		
		JButton sub1 = new JButton("Sub");
		sub1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//DECLARAR VARIAVEL QUE IRA USAR//
				double numero1;
				double numero2;
				double sub;
				
				//CONVERTER A CAIXA EM VARIALVE//
				numero1= Double.parseDouble(caixa01.getText());
				numero2= Double.parseDouble(caixa02.getText());
				
				//SOMA DOS NUMEROS//
				sub = numero1 - numero2;		
				
				//APRESENTAR A RESPOSTA//
				JOptionPane.showMessageDialog(null, "A subtra�ao dos dois n�meros �: " +sub, "Resultado Subtra��o",  JOptionPane.INFORMATION_MESSAGE);
			}
		});
		sub1.setForeground(Color.BLACK);
		sub1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		sub1.setBackground(new Color(204, 0, 102));
		sub1.setBounds(219, 205, 89, 23);
		panel.add(sub1);
		
		JButton multi = new JButton("Multi");
		multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//DECLARAR VARIAVEL QUE IRA USAR//
				double numero1;
				double numero2;
				double multi;
				
				//CONVERTER A CAIXA EM VARIALVE//
				numero1= Double.parseDouble(caixa01.getText());
				numero2= Double.parseDouble(caixa02.getText());
				
				//SOMA DOS NUMEROS//
				multi = numero1 * numero2;		
				
				//APRESENTAR A RESPOSTA//
				JOptionPane.showMessageDialog(null, "A multiplica��o dos dois n�meros �: " +multi, "Resultado Multiplica��o",  JOptionPane.INFORMATION_MESSAGE);
			}
		});
		multi.setForeground(Color.BLACK);
		multi.setFont(new Font("Times New Roman", Font.BOLD, 15));
		multi.setBackground(new Color(204, 0, 102));
		multi.setBounds(109, 205, 89, 23);
		panel.add(multi);
		
		JButton div = new JButton("Div");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//DECLARAR VARIAVEL QUE IRA USAR//
				double numero1;
				double numero2;
				double div;
				
				//CONVERTER A CAIXA EM VARIALVE//
				numero1= Double.parseDouble(caixa01.getText());
				numero2= Double.parseDouble(caixa02.getText());
				
				//SOMA DOS NUMEROS//
				if (numero1 == 0) {
					JOptionPane.showMessageDialog(null, "N�o � possivel dividir qualquer n�mero por 0 " , "Erro",  JOptionPane.INFORMATION_MESSAGE);
				}else if (numero2 ==0){
					JOptionPane.showMessageDialog(null, "N�o possivel dividir qualquer n�mero por 0" ,"Erro",  JOptionPane.INFORMATION_MESSAGE);
				}else{
					div = numero1 / numero2;
					JOptionPane.showMessageDialog(null, "A divis�o dos dois n�meros �: " +div, "Resultado Divis�o",  JOptionPane.INFORMATION_MESSAGE);
				};	
			}
		});
		
		div.setForeground(Color.BLACK);
		div.setFont(new Font("Times New Roman", Font.BOLD, 15));
		div.setBackground(new Color(204, 0, 102));
		div.setBounds(318, 205, 89, 23);
		panel.add(div);
	}
}
