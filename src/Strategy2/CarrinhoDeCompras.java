package Strategy2;

public class CarrinhoDeCompras {
    private DescontoStrategy desconto;

    public CarrinhoDeCompras(DescontoStrategy desconto) {
        this.desconto = desconto;
    }

    public void adicionarDesconto(double valor){
        double valorComDesconto = desconto.aplicarDeesconto(valor);
        System.out.println("Valor com desconto: " + valorComDesconto);
    }
}
