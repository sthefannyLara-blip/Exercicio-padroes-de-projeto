package Composite.sem;

// 1. Classe para um Arquivo simples
class Arquivo {
    private String nome;
    private int tamanhoKB;

    public Arquivo(String nome, int tamanhoKB) {
        this.nome = nome;
        this.tamanhoKB = tamanhoKB;
    }

    public String getNome() {
        return nome;
    }

    public int getTamanhoKB() {
        return tamanhoKB;
    }

    public void exibir() {
        System.out.println("Arquivo: " + nome + " (" + tamanhoKB + " KB)");
    }
}
