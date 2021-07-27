package uno;

public class Main {

	public static void main(String[] args) {
		
		// https://pt.wikipedia.org/wiki/Uno_(jogo_de_cartas)
		// https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/UNO_cards_deck.svg/800px-UNO_cards_deck.svg.png
		
		/* REQUISITOS
		 * [jogo] jogo
		 * [jogador] jogadores
		 * [queue] deck - 108 cartas - 5 cores
		 * [array] maos dos jogadores
		 * 
		 * [carta] cartas normais - 0 a 9
		 * [carta] cartas especiais - reverter, pular, +2, +4, trocaCor, 
		 * [carta] vira (a carta da mesa)
		 * 
		 * */
		
		/* JOGO
		 * - sentido (horário, anti-horário)
		 * - () iniciar -> 7 cartas pra cada jogador
		 * 
		 * */
		
		/* DECK
		 * https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/UNO_cards_deck.svg/800px-UNO_cards_deck.svg.png
		 * - 108 cartas
		 * - 5 cores (vermelho, verde, amarelo, azul, preta)
		 * - 13 simbolos de cores (0 a 9, pular, +2, inverter)
		 * - 2 simbolos de preto (mudaCor e +4)
		 * 
		 * */
		
		Deck deck = new Deck();
		System.out.println(deck.arrayDeck);
	}
}