package Strategy.com;

public class CalculadoraFrete {

    public double calcularFrete(EstrategiaFretes estrategia,double pesoKg ){
        return estrategia.calcularFrete(pesoKg);

    }
}
