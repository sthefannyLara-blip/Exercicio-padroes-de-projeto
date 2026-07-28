package Strategy.com;

public class Sedex implements EstrategiaFretes{
    @Override
    public double calcularFrete(double pesoKg) {
        return 15.0 + (pesoKg * 5.0);
    }
}
