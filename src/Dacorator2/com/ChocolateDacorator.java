package Dacorator2.com;

public class ChocolateDacorator  extends CafeDacorator{
    public ChocolateDacorator(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double getPreco() {
        return cafe.getPreco() + 2.5;
    }
}
