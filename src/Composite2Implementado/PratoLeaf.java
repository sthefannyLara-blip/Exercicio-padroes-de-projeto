package Composite2Implementado;

public class PratoLeaf implements ElementoMenu {
    private double preco;
    private String nome;

    public PratoLeaf(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    @Override
    public void exibir() {
        System.out.println("Prato: " + this.nome + ", Preço: " + this.preco);

    }
}
