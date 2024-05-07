public class CartaoCredito extends ProdutoFinanceiro {
    public CartaoCredito(Cliente cliente, double valor) {
        super(cliente, valor);
    }

    @Override
    public void realizarTransacao() {
        System.out.println(String.format("Transação no cartão de crédito no valor de R$ %.2f para o cliente %s", this.valor, this.cliente.getNome()));
    }
}