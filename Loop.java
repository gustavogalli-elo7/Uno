import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Loop {
	Scanner scanner = new Scanner(System.in);

    private Jogo jogo;
    
    private void validaBots(int bots) {
    	boolean adversarioValido = false;
    	
    	while(!adversarioValido) {
    		adversarioValido = true;
    		
    		if(bots > 10 || bots < 1) {
    			adversarioValido = false;
    			System.out.println("Máximo de adversários é 9 e o mínimo é 1. Tente novamente.");
    			bots = scanner.nextInt();
    		}
    	}	

    }
    

    public void iniciarLoop(){

        this.jogo = new Jogo();

        System.out.println("Seja bem vindo(a)! Qual é o seu nome?");
        String nome = scanner.nextLine();
        
        nome = nome.substring(0, 1).toUpperCase() + nome.substring(1);
        
        this.adicionaJogador(nome);

        System.out.println("Quantos adversários você quer, " + nome + "?");
        int bots = scanner.nextInt();
        
        this.validaBots(bots);

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
