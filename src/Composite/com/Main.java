package Composite.com;

public class Main {
    public static void main (String[] args){
        ComponenteFileSystem componente;

        componente = new Pasta();
        componente.exibir();
        componente.getTamanhoKB();

        componente = new Arquivo();
        componente.exibir();
        componente.getTamanhoKB();
    }
}
