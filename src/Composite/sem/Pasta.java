package Composite.sem;

import java.util.ArrayList;
import java.util.List;

// 2. Classe para uma Pasta que pode conter Arquivos e outras Pastas
class Pasta {
    private String nome;
    // O problema começa aqui: precisamos de duas listas separadas!
    private List<Arquivo> arquivos = new ArrayList<>();
    private List<Pasta> subpastas = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionarArquivo(Arquivo arquivo) {
        arquivos.add(arquivo);
    }

    public void adicionarSubpasta(Pasta pasta) {
        subpastas.add(pasta);
    }

    // Calcula o tamanho total varrendo as duas listas separadamente
    public int getTamanhoTotalKB() {
        int total = 0;

        // Soma o tamanho dos arquivos simples
        for (Arquivo arq : arquivos) {
            total += arq.getTamanhoKB();
        }

        // Soma o tamanho das subpastas (que por sua vez somam o que tem dentro delas)
        for (Pasta sub : subpastas) {
            total += sub.getTamanhoTotalKB();
        }

        return total;
    }

    // Exibe a estrutura chamando exibições diferentes para cada tipo
    public void exibir() {
        System.out.println("\n[Pasta: " + nome + "]");

        for (Arquivo arq : arquivos) {
            arq.exibir();
        }

        for (Pasta sub : subpastas) {
            sub.exibir();
        }
    }
}

