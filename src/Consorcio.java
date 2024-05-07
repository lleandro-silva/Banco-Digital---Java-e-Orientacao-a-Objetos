public class Consorcio implements IInvestimento {
    private Cliente cliente;
    private double valor;

    public Consorcio(Cliente cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }

    @Override
    public void aplicarInvestimento(double valor) {
        System.out.println(String.format("Consórcio no valor de R$ %.2f contratado pelo cliente %s", this.valor, this.cliente.getNome()));
    }
}