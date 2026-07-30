package Dacorator2.com;

public class LeiteDacorator extends CafeDacorator{

    public LeiteDacorator(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double getPreco() {
        return cafe.getPreco() + 2.0 ;
    }
}
