public class Pix implements IPix {
    private Cliente cliente;

    public Pix(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void realizarTransacaoPix(double valor, String destino) {
        System.out.println(String.format("Transação PIX no valor de R$ %.2f realizada pelo cliente %s para %s", valor, this.cliente.getNome(), destino));
    }
}