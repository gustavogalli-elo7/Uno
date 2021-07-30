public enum Cores {
    AZUL ("Azul"),
    AMARELO ("Amarelo"),
    VERDE ("Verde"),
    VERMELHO ("Vermelho"),
    PRETO ("Preto");

    private String cor;

    Cores(String cor) {
        this.cor = cor;
    }

    public String getCor(){
        return this.cor;
    }
}
