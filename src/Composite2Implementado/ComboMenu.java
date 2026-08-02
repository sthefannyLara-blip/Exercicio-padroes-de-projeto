package Composite2Implementado;

import java.util.ArrayList;
import java.util.List;

public class ComboMenu implements ElementoMenu{
    private String nome;
    List<ElementoMenu> elementos = new ArrayList<>();


    public ComboMenu(String nome) {
        this.nome = nome;
    }

    @Override
    public double getPreco() {
        double valorTotal = 0;
        for (ElementoMenu elemento : elementos) {
            valorTotal += elemento.getPreco();
        }
        return valorTotal;
    }

    @Override
    public void exibir() {
        for (ElementoMenu elemento : elementos) {
            elemento.exibir();
        }
    }

    public void adicionarElemento(ElementoMenu elemento) {
        elementos.add(elemento);
    }

    public void removerElemento(ElementoMenu elemento) {
        elementos.remove(elemento);
    }
}
