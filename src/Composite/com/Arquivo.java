package Composite.com;

public class Arquivo implements ComponenteFileSystem{
    private String nome;
    private int tamanhoKB;


    @Override
    public void exibir() {
        System.out.println("Arquivo:" + nome + "Tamanho: " + tamanhoKB + "KB");
    }

    @Override
    public int getTamanhoKB() {
        return tamanhoKB;
    }
}
