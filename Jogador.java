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

	public void mostraMao(){
		System.out.println("Mão do Jogador "+ this.nome);
		for(int i = 0; i < this.minhaMao.size(); i++){
			System.out.println("[" + i + "] " + this.minhaMao.get(i));
		}
	}
	
	@Override
	public String toString() {
		return nome;
	}
}
