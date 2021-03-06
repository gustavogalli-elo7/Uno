import java.util.ArrayList;

public class Jogo {

	int sentido = 1;
	int jogadorAtual = -1;
	Deck deck;

	ArrayList<Jogador> jogadores = new ArrayList<>();
	ArrayList<Carta> arrayVira = new ArrayList<>();

	public Jogo() {
		this.prepararDeck();
	}


	void iniciarJogo() {

	}

	void adicionarJogador(Jogador jogador) {
		this.jogadores.add(jogador);
	}

	void distribuirCartas() {
		System.out.println("\n----- HORA DO JOGO! -----\n");
		
		// Distribui 7 cartas pra cada jogador, uma por vez
        for(int i = 0; i < 7; i++) {
        	for(Jogador jogador: jogadores) {
        		jogador.receberCarta(deck.comprarCarta());
        	}
        }
        
        // Distribui a vira
        arrayVira.add(deck.comprarCarta()); // <- necessário adicionar a carta ao arrayVira ao invés de "comprar"
        System.out.println("[VIRA] " + arrayVira.get(0));
        
	}

	void fazerJogadorComprar() {

	}

	void prepararDeck() {
		this.deck = new Deck();
		// Não é necessário imprimir o deck abaixo
//		System.out.println(this.deck.arrayDeck);
	}

}