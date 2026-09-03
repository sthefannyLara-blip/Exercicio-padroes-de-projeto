package Adapter.com;
public class Main {
    public static void main(String[] args) {
        // O sistema principal trata o PayPal como qualquer outro processador de pagamento
        ProcessadorPagamento pagador = new PaypalAdapter(new PaypalAPI());

        // O código chama a interface padrão sem se preocupar com conversão de centavos
        pagador.processar(150.50);
    }
}
