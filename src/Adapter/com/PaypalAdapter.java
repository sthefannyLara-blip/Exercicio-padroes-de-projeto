package Adapter.com;
// O ADAPTER: Implementa a interface padrão e engloba o serviço incompatível
class PaypalAdapter implements ProcessadorPagamento {
    private PaypalAPI paypalAPI;

    public PaypalAdapter(PaypalAPI paypalAPI) {
        this.paypalAPI = paypalAPI;
    }

    @Override
    public void processar(double valorReais) {
        // A tradução/adaptação acontece aqui dentro
        int centavos = (int) (valorReais * 100);
        paypalAPI.enviarPagamentoCentavos(centavos);
    }
}
