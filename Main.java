import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Loop loop = new Loop();
		loop.iniciarLoop();
		
		/* PRÓXIMOS PASSOS
		 * - distribuir as cartas para o array de jogadores (7 para cada)
		 * - criar a VIRA (array)
		 * - determinar a ordem dos jogadores (sortear no array de jogadores)
		 * - criar a análise das mãos com base na VIRA
		 * 		- com base na VIRA, calcular na minhaMao:
		 * 			- quantas cartas com mesmo SIMBOLO
		 * 			- quantas cartas com mesma COR
		 * 			- quantos CORINGAS (mudaCor e +4)
		 * 			- analisar a quantidade de cartas na mao do proximo jogador (para jogar cartas especiais)
		 * 
		 *  
		 * */


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