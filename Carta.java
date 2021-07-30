public class Carta {
	private Simbolos simbolo;
	private Cores cor;
	
	public Carta(Simbolos simbolo, Cores cor){
		this.simbolo = simbolo;
		this.cor = cor;
	}

	public String toString() {
		return simbolo.getSimbolo() + "-" + cor.getCor();
	}

	public Simbolos getSimbolo() {
		return simbolo;
	}

	public Cores getCor() {
		return cor;
	}
	
	
}