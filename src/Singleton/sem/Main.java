package Singleton.sem;

import Singleton.sem.Configuracao;

public class Main {
    public static void main(String[] args) {
        // O Módulo A cria uma nova instância e altera o tema
        Configuracao configModuloA = new Configuracao();
        configModuloA.setTema("Claro");

        // O Módulo B cria OUTRA instância separada na memória
        Configuracao configModuloB = new Configuracao();

        System.out.println("Módulo A: " + configModuloA.getTema()); // Imprime: Claro
        System.out.println("Módulo B: " + configModuloB.getTema()); // Imprime: Escuro
    }
}