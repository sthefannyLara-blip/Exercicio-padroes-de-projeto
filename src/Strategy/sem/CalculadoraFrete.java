package Strategy.sem;

public class CalculadoraFrete {

    public double calcularFrete(String tipoEnvio, double pesoKg) {
        if (tipoEnvio.equalsIgnoreCase("SEDEX")) {
            // R$ 15,00 taxa fixa + R$ 5,00 por kg
            return 15.0 + (pesoKg * 5.0);

        } else if (tipoEnvio.equalsIgnoreCase("PAC")) {
            // R$ 8,00 taxa fixa + R$ 2,50 por kg
            return 8.0 + (pesoKg * 2.50);

        } else if (tipoEnvio.equalsIgnoreCase("RETIRADA_LOJA")) {
            // Frete grátis
            return 0.0;

        } else if (tipoEnvio.equalsIgnoreCase("TRANSPORTADORA")) {
            // R$ 20,00 taxa fixa + R$ 3,00 por kg (mínimo R$ 30,00)
            double calculado = 20.0 + (pesoKg * 3.0);
            return Math.max(30.0, calculado);

        } else {
            throw new IllegalArgumentException("Tipo de envio desconhecido: " + tipoEnvio);
        }
    }

    public static void main(String[] args) {
        CalculadoraFrete calculadora = new CalculadoraFrete();
        double peso = 4.0; // 4 kg

        System.out.println("SEDEX: R$ " + calculadora.calcularFrete("SEDEX", peso));
        System.out.println("PAC: R$ " + calculadora.calcularFrete("PAC", peso));
        System.out.println("Retirada: R$ " + calculadora.calcularFrete("RETIRADA_LOJA", peso));
    }
}