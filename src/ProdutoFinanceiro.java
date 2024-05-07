public abstract class ProdutoFinanceiro implements ITransacao {
    protected Cliente cliente;
    protected double valor;

    public ProdutoFinanceiro(Cliente cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }
}