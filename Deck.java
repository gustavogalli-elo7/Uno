import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	ArrayList<Carta> arrayDeck = new ArrayList<>();
	
	public Deck() {
		arrayDeck = criarDeck();
		Collections.shuffle(arrayDeck);
	}
	
	private ArrayList<Carta> criarDeck() {
		ArrayList<Carta> arrayDeck = new ArrayList<>();

		// Adicionando os números
		for (int i = 0; i <= 9; i++) {
			for (Cores cor : Cores.values()) {
				arrayDeck.add(new Carta(Simbolos.byId.get(i+""), cor));
				// Só adiciona um 0 de cada cor
				if (i != 0) arrayDeck.add(new Carta(Simbolos.byId.get(i+""), cor));
			}
		}
		// Adicionando os efeitos
			for(Cores cor : Cores.values()) {
				arrayDeck.add(new Carta(Simbolos.INVERTER, cor));
				arrayDeck.add(new Carta(Simbolos.PULAR, cor));
				arrayDeck.add(new Carta(Simbolos.MAIS_DOIS, cor));
			}
		// Adicionando as pretas
		for(int i = 0; i < 4; i++) {
			arrayDeck.add(new Carta(Simbolos.MAIS_QUATRO, Cores.PRETO));
			arrayDeck.add(new Carta(Simbolos.MUDA_COR, Cores.PRETO));
		}
		return arrayDeck;
	}
	
	public Carta comprarCarta() {
		Carta comprada = arrayDeck.get(0);
		arrayDeck.remove(0);
		return comprada;
	}
	
	
	
}