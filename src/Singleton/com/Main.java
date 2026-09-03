package Singleton.com;

public class Main {
    public static void main(String[] args) {
        // O Módulo A obtém a instância global e altera o tema
        Configuracao configModuloA = Configuracao.getInstancia();
        configModuloA.setTema("Claro");

        // O Módulo B obtém A MESMA instância da memória
        Configuracao configModuloB = Configuracao.getInstancia();

        System.out.println("Módulo A: " + configModuloA.getTema()); // Imprime: Claro
        System.out.println("Módulo B: " + configModuloB.getTema()); // Imprime: Claro
        System.out.println(configModuloA == configModuloB);        // Imprime: true
    }
}
