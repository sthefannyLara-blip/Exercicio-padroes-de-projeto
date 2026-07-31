package AbstractFactory.com;

import AbstractFactory.com.MenuLight;

public class LightFactory implements AbstractFactory{
    @Override
    public Janela criarJanela() {
        return new JanelaLight();
    }

    @Override
    public Menu criarMenu() {
        return new MenuLight();
    }

    @Override
    public Botao criarBotao() {
        return new BotaoLight();
    }
}
