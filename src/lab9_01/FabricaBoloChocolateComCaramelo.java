package lab9_01;

public class FabricaBoloChocolateComCaramelo extends FabricaBolo{
	
	@Override
	public void fazerCobertura() {
		System.out.println("Faz cobertura de caramelo");	
	}
	@Override
	public void fazerMassa() {
		System.out.println("Faz a massa de chocolate");
	}
	
}
