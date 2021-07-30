import java.util.Scanner;
import java.lang.*;

public class Loop {
	Scanner scanner = new Scanner(System.in);

    private Jogo jogo;
    

    public void iniciarLoop(){

        this.jogo = new Jogo();

        System.out.println("Seja bem vindo(a)! Qual é o seu nome?");
        String nome = this.validaNome(scanner.nextLine());
        this.adicionaJogador(nome);

        System.out.println("Quantos adversários você quer, " + nome + "?");
        int bots = this.validaBots(scanner.nextInt());
        this.adicionaBots(bots);
        
        jogo.distribuirCartas();
        
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

    private int validaBots(int bots) {
        boolean adversarioValido = false;

        while(!adversarioValido) {
            adversarioValido = true;

            if(bots > 9 || bots < 1) {
                adversarioValido = false;
                System.out.println("Máximo de adversários é 9 e o mínimo é 1. Tente novamente.");
                bots = scanner.nextInt();
            }
        }
        return bots;
    }

    private String validaNome(String nome){
        boolean nomeValido = false;

        while(!nomeValido){
            nomeValido = true;

            if(nome.strip().length() <= 1){
                nomeValido = false;
                System.out.println("Por favor digite um nome válido.");
                nome = scanner.nextLine();
            }
        }
        return nome.strip().substring(0, 1).toUpperCase() + nome.strip().substring(1);
    }

}
