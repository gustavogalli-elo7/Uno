package uno;

import java.util.ArrayList;

public class Jogo {
	
	int sentido = 1;
	int jogadorAtual = -1;
	
	ArrayList<Jogador> jogadores = new ArrayList<>();
	
	void adicionarJogador(Jogador jogador) {
		jogadores.add(jogador);
	}
	
}