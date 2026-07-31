package AbstractFactory.sem;

public class Main {

    public static void main(String[] args) {

        String tema = "LIGHT";

        Botao botao;
        Menu menu;
        Janela janela;

        if (tema.equals("LIGHT")) {

            botao = new BotaoLight();
            menu = new MenuLight();
            janela = new JanelaLight();

        } else {

            botao = new BotaoDark();
            menu = new MenuDark();
            janela = new JanelaDark();

        }

        botao.exibir();
        menu.exibir();
        janela.exibir();

    }

}