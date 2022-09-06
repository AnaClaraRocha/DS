public class Produto {
	
	String nome;
	int codigo;
	double precoCusto;
	double precoVenda;
	int quantidade;
	double margemLucro;
	
	//METODOS 
	
	public int registrarSaida(int quantidade) {
			
			if (this.quantidade <= quantidade){
				System.out.println("Quantidade Indisponivel: " +this.quantidade);
				
			}else {
				
				this.quantidade =  this.quantidade - quantidade;
				
			}

			return this.quantidade ;
		
	}
	
	public int registrarEntrada (int quantidade) {
		
		this.quantidade = this.quantidade+quantidade  ;
		
		return this.quantidade ;
	
	}
	 
	public void calcularPrecoVenda() {
		
		this.precoVenda = precoCusto+(precoCusto/100*margemLucro);
		 
		}
	
	public double definirPrecoVenda (double precoVenda) {
		
	 this.precoVenda = precoVenda;
	 
	 if(precoVenda<precoCusto) {
		 System.out.println("Preço de venda esta a baixo do preço do custo");
	 }
	 
	 return this.precoVenda;
	 
	}
	
	public void exibirDados() {
			
		System.out.println("Dados do produto:");
		System.out.println("Nome: "+this.nome);
		System.out.println("Codigo: "+this.codigo);
		System.out.println("Preço de Custo: "+this.precoCusto);
		System.out.println("Margem de Lucro: "+this.margemLucro);
		System.out.println("Quantidade: "+this.quantidade);
		System.out.println("Preço de venda: "+this.precoVenda);
	}

}
