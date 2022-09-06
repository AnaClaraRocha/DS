
public class ControleTaxas {

	private static double somaTaxa=0;
	
	public static double getSomaTaxa() {
		return somaTaxa;
	}
	
	public static void setSomaTaxa() {
		ControleTaxas.somaTaxa = somaTaxa;
	}
	
	public static void registroOperacao(Conta conta) {
		double taxa = conta.getTaxa();
		ControleTaxas.somaTaxa = ControleTaxas.somaTaxa + taxa;
	}

}
