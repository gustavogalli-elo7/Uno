package uno;


import java.util.Scanner;

public class Loop {

    private Jogo jogo;

    public void iniciarLoop(){

        Scanner scanner = new Scanner(System.in);
        this.jogo = new Jogo();

        System.out.println("Seja bem vindo(a)! Qual é o seu nome?");
        String nome = scanner.nextLine();

        this.adicionaJogador(nome);

        System.out.println("Quantos bots você precisa?");
        int bots = scanner.nextInt();

        this.adicionaBots(bots);


    }


    private void adicionaJogador(String nome){
        Jogador player = new Jogador(nome);
        this.jogo.adicionarJogador(player);
    }

    private void adicionaBots(int quantidade){
        for (int i = 0; i < quantidade; i++){
            this.adicionaJogador(("Bot " + (i+1)));
        }
    }

}
