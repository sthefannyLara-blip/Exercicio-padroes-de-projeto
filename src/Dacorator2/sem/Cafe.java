package Dacorator2.sem;

public class Cafe {
    private boolean leite;
    private boolean chocolate;

    public Cafe(boolean leite, boolean chocolate) {
        this.leite = leite;
        this.chocolate = chocolate;
    }

    public double getPreco(){
        double preco = 5.0;

        if (leite){
            preco += 2.0;
        }
        if(chocolate){
            preco += 2.5;
        }
        return preco;
    }

}
