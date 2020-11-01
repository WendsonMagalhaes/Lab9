package lab9;

/**
 * Havia muita duplicação no codigo original, as classes
 * FabricaBoloBaunilhaMorango e FabricaBoloChocolateCaramelo possuiam métodos
 * iguais, onde usei o padrão Template Method, criando a classe abstrata
 * FabricaBolo e extendedo para as Classes FabricaBoloBaunilhaMorango e
 * FabricaBoloChocolateCaramelo Usei o padrão Bridge para ampliar a fabricção de
 * bolo, caso se queira fazer um bolo de baunilha com cobertura de caramelo,
 * então foi crada a classe abstrata Cobertura e as classes Morango e Caramelo
 * que extendem a classe Cobertura, deixando assim a responsabilidade pela
 * criação da cobertura por parte do usuario.
 **/
public abstract class FabricaBolo {

	Cobertura cobertura;

	public void prepararBolo() {
		fazerMassa();
		levarAoForno();
		cobertura.fazerCobertura();
		decorarBolo();
	}

	public void levarAoForno() {
		System.out.println("Leva ao forno");
	}

	public abstract void fazerMassa();

	public void decorarBolo() {
		System.out.println("Decora bolo");
	}
}
