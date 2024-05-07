public class CreditoPessoal implements ITransacao {
    private Cliente cliente;
    private double valor;

    public CreditoPessoal(Cliente cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }

    @Override
    public void realizarTransacao() {
        System.out.println(String.format("Crédito pessoal no valor de R$ %.2f utilizado pelo cliente %s", this.valor, this.cliente.getNome()));
    }
}