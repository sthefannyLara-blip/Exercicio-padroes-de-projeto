package AbstractFactory.com;

import AbstractFactory.com.Janela;

public class JanelaDark implements Janela {
    @Override
    public void exibir() {
        System.out.println("Exibindo janela no estilo Dark");
    }
}
