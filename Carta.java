package uno;

public class Carta {
	String simbolo;
	String cor;
	
	public Carta(String simbolo, String cor){
		this.simbolo = simbolo;
		this.cor = cor;
	}

	public String toString() {
		return simbolo + "-" + cor;
	}
	

}
