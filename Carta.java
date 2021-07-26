package uno;

public class Carta {
	private String simbolo;
	private String cor;
	
	public Carta(String simbolo, String cor){
		this.simbolo = simbolo;
		this.cor = cor;
	}

	public String toString() {
		return simbolo + "-" + cor;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public String getCor() {
		return cor;
	}
	
	
}