package Strategy2;

public class DescontoSemDesconto implements DescontoStrategy {
    @Override
    public double aplicarDeesconto(double valor) {
        return valor;
    }
}
