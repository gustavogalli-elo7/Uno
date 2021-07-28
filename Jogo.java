package uno;

import java.util.ArrayList;

public class Jogo {

	int sentido = 1;
	int jogadorAtual = -1;
	Deck deck;

	ArrayList<Jogador> jogadores = new ArrayList<>();

	public Jogo() {
		this.prepararDeck();
	}


	void iniciarJogo() {

	}

	void adicionarJogador(Jogador jogador) {
		this.jogadores.add(jogador);
	}

	void distribuirCartas() {
	}

	void fazerJogadorComprar() {

	}

	void prepararDeck() {
		this.deck = new Deck();
		System.out.println(this.deck.arrayDeck);
	}

}