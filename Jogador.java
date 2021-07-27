package uno;

import java.util.ArrayList;

public class Jogador {
	
	String nome;
	
	ArrayList<Carta> minhaMao = new ArrayList<>();
	
	public Jogador(String nome){
		this.nome = nome;
	}
	
//	public Carta jogadorCompra(Deck deck) {
//		return deck.comprarCarta();
//	}
	
	public void receberCarta(Carta recebida) {
		minhaMao.add(recebida);
	}
	
	@Override
	public String toString() {
		return nome;
	}
}
