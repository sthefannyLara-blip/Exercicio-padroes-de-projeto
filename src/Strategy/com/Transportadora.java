package Strategy.com;

public class Transportadora implements EstrategiaFretes{
    @Override
    public double calcularFrete(double pesoKg) {
        double calculado = 20.0 + (pesoKg * 3.0);
        return Math.max(30.0, calculado);
    }
}
