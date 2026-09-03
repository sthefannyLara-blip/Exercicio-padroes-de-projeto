package Adapter.sem;

public class Main {
    public static void main(String[] args) {
        // Tentar atribuir a API direta falharia porque os tipos não batem:
        // ProcessadorPagamento pagador = new PaypalAPI(); // ERRO DE COMPILAÇÃO!

        // Sem adapter, você é forçado a tratar a conversão direto no seu código principal:
        PaypalAPI paypal = new PaypalAPI();
        double valorCompra = 150.50;

        // O código do seu sistema fica "sujo" fazendo conversões manuais
        int centavos = (int) (valorCompra * 100);
        paypal.enviarPagamentoCentavos(centavos);
    }
}
