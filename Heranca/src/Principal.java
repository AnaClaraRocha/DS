import java.util.Scanner;
public class Principal {
	
 public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	        Carro c = new Carro();
	        Moto m = new Moto();
	        Bike b = new Bike();

	        Veiculo v = new Veiculo();
	        
	     // CARRO
	    System.out.println("Digite a cor do veiculo:");
	    c.cor = in.next();
	    
	    System.out.println("Digite o modelo do veiculo:");
	    c.modelo = in.next();
	    
	    System.out.println("Digite qual tipo de combustivel o veiculo utiliza:");
	    c.combustivel = in.next();
	    
	    System.out.println("Digite quantos cavalos tem o veiculo:");
	    c.cavalos = in.nextDouble();
	    
	    System.out.println("Digite se o veiculo tem step:");
	    c.step = in.next();
	    
	    System.out.println("Digite se o veiculo tem Teto Solar:");
	    c.tetoSolar = in.next();
	    
	    // APRESENTAR CARRO
		
	 	System.out.println("Dados digitados do Carro");
	 	System.out.println();
	 	System.out.println("Cor: " +c.cor);
	 	System.out.println("Modelo: " +c.modelo);
	 	System.out.println("Combustivel: " +c.combustivel);
	 	System.out.println("Cavalos: " +c.cavalos);
	 	System.out.println("Step: " +c.step);
	 	System.out.println("Teto Solar: " +c.tetoSolar);

	    // METODOS CARRO
		
	    System.out.println("Apresentar Cavalos: " +c.cavalos());
	    c.frear("Freio a Disco");
	    c.locomover("Dirigindo");
	    
	    System.out.println();
	    
	    // MOTO
	    
	    System.out.println("Digite a cor da Moto:");
	    m.cor = in.next();
	    
	    System.out.println("Digite o modelo da Moto:");
	    m.modelo = in.next();
	    
	    System.out.println("Digite qual tipo de combustivel a Moto utiliza:");
	    m.combustivel = in.next();
	    
	    System.out.println("Digite quantos cilindradas tem a Moto:");
	    m.cilindradas = in.nextDouble();
	    
	    System.out.println("Digite se a Moto tem mata cachorro:");
	    m.mataCachorro = in.next();
	    
	    System.out.println("Digite se a Moto tem proteção contra vento:");
	    m.protecaoContraoVento = in.next();
	    
	    // APRESENTAR MOTO
		
	 	System.out.println("Dados digitados do Carro");
	 	System.out.println();
	 	System.out.println("Cor: " +m.cor);
	 	System.out.println("Modelo: " +m.modelo);
	 	System.out.println("Combustivel: " +m.combustivel);
	 	System.out.println("Cilindradas: " +m.cilindradas);
	 	System.out.println("Mata Cachorro: " +m.mataCachorro);
	 	System.out.println("Proteção Conta o Vento: " +m.protecaoContraoVento);

	    // METODOS MOTO
		
	    System.out.println("Apresentar Cilindradas: " +m.cilindradas());
	    m.frear("Freio a Disco");
	    m.locomover("Pilotando");

	    System.out.println();
	    
	    // CARRO
	    System.out.println("Digite a cor da Bike:");
	    b.cor = in.next();
	    
	    System.out.println("Digite o modelo cor da Bike:");
	    b.modelo = in.next();
	    
	    System.out.println("Digite se da Bike tem Pedal:");
	    b.pedal = in.next();
	    
	    System.out.println("Digite se da Bike tem porta copos:");
	    b.portaCopos = in.next();
	    
	    System.out.println("Digite o preço da Bike:");
	    b.preco = in.nextDouble();
	    
	    // APRESENTAR CARRO
		
	 	System.out.println("Dados digitados do Carro");
	 	System.out.println();
	 	System.out.println("Cor: " +b.cor);
	 	System.out.println("Modelo: " +b.modelo);
	 	System.out.println("Pedal: " +b.pedal);
	 	System.out.println("Porta Copos: " +b.portaCopos);
	 	System.out.println("Preço: " +b.preco);

	    // METODOS CARRO
		
	    System.out.println("Apresentar preço : " +b.preco());
	    c.frear("Freio a Disco");
	    c.locomover("Pedalando");
	    
	    System.out.println();
	 	

	    
	    
	    
	        
 }

}
