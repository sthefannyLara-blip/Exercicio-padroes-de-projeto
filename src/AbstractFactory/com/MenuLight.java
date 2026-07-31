package AbstractFactory.com;

import AbstractFactory.com.Menu;

public class MenuLight implements Menu {
    @Override
    public void exibir() {
        System.out.println("Exibindo menu no estilo Light");
    }
}
