package uno;

public class Carta {
	String simbolo;
	String cor;
	boolean vira;
	
	public Carta(String simbolo, String cor){
		this.simbolo = simbolo;
		this.cor = cor;
		this.vira = false;
	}
	
	public Carta(String simbolo, String cor, boolean vira){
		this.simbolo = simbolo;
		this.cor = cor;
		this.vira = vira;
	}

	public String toString() {
		if(vira) {
			return simbolo + "-" + cor + " | VIRA";
		} else {
			return simbolo + "-" + cor;
		}
	}
	

}
