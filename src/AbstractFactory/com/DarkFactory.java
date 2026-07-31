package AbstractFactory.com;

public class DarkFactory implements AbstractFactory {
    @Override
    public Janela criarJanela() {
        return new JanelaDark();
    }

    @Override
    public Menu criarMenu() {
        return new MenuDark();
    }

    @Override
    public Botao criarBotao() {
        return new BotaoDark();
    }
}
