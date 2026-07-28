package Strategy.com;

public class FretesMain {
    public static void main(String[] args) {
CalculadoraFrete calculadora = new CalculadoraFrete();
        double peso = 4.0;
        System.out.println("Frete no Pac: " + calculadora.calcularFrete(new Pac(), peso));
        System.out.println("Frete no Sedex: " +calculadora.calcularFrete(new Sedex(), peso));
        System.out.println("Frete no Transportadora: " + calculadora.calcularFrete(new Transportadora(), peso));
        System.out.println("Frete na Retirada: " + calculadora.calcularFrete(new RetiradaEmLoja(), peso));
    }

}
