package Strategy2;

public class DescontoBlackFriday implements DescontoStrategy{
    @Override
    public double aplicarDeesconto(double valor) {
        return 0.3 * valor;
    }
}
