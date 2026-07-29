package Composite.sem;

import Composite.sem.Arquivo;
import Composite.sem.Pasta;

// 3. Teste principal
public class Main {
    public static void main(String[] args) {
        // Criando arquivos individuais
        Arquivo arq1 = new Arquivo("foto.jpg", 1500);
        Arquivo arq2 = new Arquivo("documento.pdf", 500);
        Arquivo arq3 = new Arquivo("planilha.xlsx", 800);

        // Criando pasta de Documentos
        Pasta pastaDocs = new Pasta("Meus Documentos");
        pastaDocs.adicionarArquivo(arq2);
        pastaDocs.adicionarArquivo(arq3);

        // Criando pasta Raiz (contém foto + pasta de Documentos)
        Pasta pastaRaiz = new Pasta("Raiz (C:)");
        pastaRaiz.adicionarArquivo(arq1);
        pastaRaiz.adicionarSubpasta(pastaDocs);

        // Exibindo estrutura e tamanhos
        pastaRaiz.exibir();
        System.out.println("\nTamanho total da pasta Raiz: " + pastaRaiz.getTamanhoTotalKB() + " KB");
    }
}
