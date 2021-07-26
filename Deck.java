package uno;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	ArrayList<Carta> deck = new ArrayList<>();
	
	public Deck() {
		deck = criarDeck();
		Collections.shuffle(deck);
	}
	
	private ArrayList<Carta> criarDeck() {
		ArrayList<Carta> deckOrdenado = new ArrayList<>();
		String[] cores = {"vermelho", "verde", "amarelo", "azul"};
		String[] efeitos = {"Pular", "Inverter", "+2"};
		// Adicionando os números
		for (int i = 0; i <= 9; i++) {
			for (String cor: cores) {
				deckOrdenado.add(new Carta(i + "", cor));
				// Só adiciona um 0 de cada cor
				if (i != 0) deckOrdenado.add(new Carta(i + "", cor));
			}
		}
		// Adicionando os efeitos
		for (String efeito: efeitos) {
			for(String cor: cores) {
				deckOrdenado.add(new Carta(efeito, cor));
				deckOrdenado.add(new Carta(efeito, cor));

			}
		}
		// Adicionando as pretas
		for(int i = 0; i < 4; i++) {
			deckOrdenado.add(new Carta("+4", "preto"));
			deckOrdenado.add(new Carta("coringa", "preto"));
		}
		return deckOrdenado;
	}
	
	public Carta comprarCarta() {
		Carta comprada = deck.get(0);
		deck.remove(0);
		return comprada;
	}
	
	
	
}