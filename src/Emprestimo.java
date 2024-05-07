public class Emprestimo extends ProdutoFinanceiro {
    public Emprestimo(Cliente cliente, double valor) {
        super(cliente, valor);
    }

    @Override
    public void realizarTransacao() {
        System.out.println(String.format("Empréstimo no valor de R$ %.2f contratado pelo cliente %s", this.valor, this.cliente.getNome()));
    }
}