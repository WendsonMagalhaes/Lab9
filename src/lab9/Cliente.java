package lab9;

public class Cliente {
	public static void main(String[] args) {
		
		FabricaBoloBaunilha fBoloBaunilha = new FabricaBoloBaunilha();
		FabricaBoloChocolate fBoloChocolate = new FabricaBoloChocolate();
		fBoloBaunilha.prepararBolo();
		fBoloChocolate.prepararBolo();
	}
}