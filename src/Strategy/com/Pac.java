package Strategy.com;

public class Pac implements EstrategiaFretes{
    @Override
    public double calcularFrete(double pesoKg) {
        return 8.0 + (pesoKg * 2.50);
    }
}
