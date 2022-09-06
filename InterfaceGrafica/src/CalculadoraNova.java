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
import java.awt.Window.Type;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class CalculadoraNova extends JFrame {

	private JPanel contentPane;
	private JTextField caixa01;
	private JTextField caixa02;
	private JTextField cxResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraNova frame = new CalculadoraNova();
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
	public CalculadoraNova() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\55119\\Downloads\\baixados.jpg"));
		setResizable(false);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 420);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 319, 387);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel.setBounds(129, 11, 138, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Insira o primeiro n\u00FAmero:");
		lblNewLabel_1.setForeground(new Color(204, 0, 102));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(20, 73, 198, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Insira o segundo n\u00FAmero:");
		lblNewLabel_2.setForeground(new Color(204, 0, 102));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(20, 130, 188, 14);
		panel.add(lblNewLabel_2);
		
		caixa01 = new JTextField();
		caixa01.setBounds(20, 99, 169, 20);
		panel.add(caixa01);
		caixa01.setColumns(10);
		
		caixa02 = new JTextField();
		caixa02.setBounds(20, 155, 169, 20);
		panel.add(caixa02);
		caixa02.setColumns(10);
		
		JButton soma = new JButton("+");
		soma.setIcon(new ImageIcon("C:\\Users\\55119\\Downloads\\Vector Plus Icon, Plus Icons, Plus Icon, Add PNG and Vector with Transparent Background for Free Download.jpg"));
		soma.addActionListener(new ActionListener() {
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
				
				cxResultado.setText(String.valueOf(soma).toString());
				
				//APRESENTAR A RESPOSTA//
			}
		});
		JButton sub = new JButton("Subtração");
		
		
		
		soma.setBackground(new Color(204, 0, 102));
		soma.setFont(new Font("Times New Roman", Font.BOLD, 15));
		soma.setForeground(new Color(0, 0, 0));
		soma.setBounds(10, 263, 89, 23);
		panel.add(soma);
		

		
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
				cxResultado.setText(String.valueOf(sub).toString());

			}
		});
		sub1.setForeground(Color.BLACK);
		sub1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		sub1.setBackground(new Color(204, 0, 102));
		sub1.setBounds(109, 263, 89, 23);
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
				cxResultado.setText(String.valueOf(multi).toString());

			}
		});
		multi.setForeground(Color.BLACK);
		multi.setFont(new Font("Times New Roman", Font.BOLD, 15));
		multi.setBackground(new Color(204, 0, 102));
		multi.setBounds(218, 263, 89, 23);
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
				if (numero2 == 0) {
					JOptionPane.showMessageDialog(null, "Não é possivel dividir qualquer número por 0 " , "Erro",  JOptionPane.INFORMATION_MESSAGE);
				}else{
					div = numero1 / numero2;
					cxResultado.setText(String.valueOf(div).toString());
				};	
			}
		});
		
		div.setForeground(Color.BLACK);
		div.setFont(new Font("Times New Roman", Font.BOLD, 15));
		div.setBackground(new Color(204, 0, 102));
		div.setBounds(317, 263, 89, 23);
		panel.add(div);
		
		cxResultado = new JTextField();
		cxResultado.setEditable(false);
		cxResultado.setColumns(10);
		cxResultado.setBounds(129, 225, 169, 20);
		panel.add(cxResultado);
		
		JLabel lblNewLabel_2_1 = new JLabel("                Resultado:");
		lblNewLabel_2_1.setForeground(new Color(204, 0, 102));
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_2_1.setBounds(109, 200, 188, 14);
		panel.add(lblNewLabel_2_1);
	}
}
