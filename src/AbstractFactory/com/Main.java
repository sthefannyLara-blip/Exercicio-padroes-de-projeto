package AbstractFactory.com;
public class Main {

    public static void main(String[] args) {

        AbstractFactory factory = new LightFactory();

        Botao botao = factory.criarBotao();
        Menu menu = factory.criarMenu();
        Janela janela = factory.criarJanela();

        botao.exibir();
        menu.exibir();
        janela.exibir();

    }

}
