package Composite2Implementado;


public class Main {
    public static void main(String[] args) {
        //Elementos individuais
        ElementoMenu Pizza = new PratoLeaf(15.0, "Pizza");
        ElementoMenu Hamburguer = new PratoLeaf(20.0, "Hamburguer");
        ElementoMenu CocaCola = new PratoLeaf(10.0, "Coca-Cola");
        ElementoMenu Batata = new PratoLeaf(5.0, "batata frita");

        //Combo 1
        ElementoMenu combo1 = new ComboMenu("Combo individual");
        combo1.adicionarElemento(Pizza);
        combo1.adicionarElemento(Hamburguer);
        combo1.adicionarElemento(CocaCola);
        combo1.adicionarElemento(Batata);


        //Combo 2
        ElementoMenu combo2 = new ComboMenu("Combo familia");
        combo2.adicionarElemento(combo1);
        combo2.adicionarElemento(combo1);
        combo2.adicionarElemento(CocaCola);
        combo2.adicionarElemento(Batata);
    }
}