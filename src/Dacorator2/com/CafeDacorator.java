package Dacorator2.com;

public abstract class CafeDacorator implements Cafe{
    protected Cafe cafe;
    public CafeDacorator(Cafe cafe){
        this.cafe = cafe;
    }
}
