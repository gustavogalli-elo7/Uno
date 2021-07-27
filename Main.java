package uno;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Seja bem vindo(a)! Qual é o seu nome?");
	    String nome = scanner.nextLine();
	      
	    System.out.println("Quantos bots você precisa?");
	    int bots = scanner.nextInt();
	      
	    Jogo jogo = new Jogo(nome);
	    jogo.qntBots(bots);
	
	    System.out.println(jogo.jogadores);
	    
//	    jogo.iniciarJogo(new Deck());
//	    System.out.println(deck.arrayDeck);
	    
	    
	    
	      // https://pt.wikipedia.org/wiki/Uno_(jogo_de_cartas)
	      // https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/UNO_cards_deck.svg/800px-UNO_cards_deck.svg.png
	      /* REQUISITOS
	       * [jogo] jogo
	       * [jogador] jogadores
	       * [queue] deck - 108 cartas - 5 cores
	       * [array] maos dos jogadores
	       * [array<Carta>] vira (as cartas da mesa)
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
	}
}