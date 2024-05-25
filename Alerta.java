// Classe Alerta que implementa Observer, permitindo que receba notificações de mudanças de preço de produtos
public class Alerta implements Observer {
    private Usuario usuario;
    private Produto produto;
    private double precoDesejado;

    // Construtor da classe Alerta
    public Alerta(Usuario usuario, Produto produto, double precoDesejado) {
        this.usuario = usuario;
        this.produto = produto;
        this.precoDesejado = precoDesejado;
        produto.adicionarObserver(this);  // Registra o alerta como observador do produto
    }

    // Método atualizar que é chamado quando o preço do produto muda
    @Override
    public void atualizar(Produto produto) {
        if (produto.getPreco() < precoDesejado) {
            SistemaDeNotificacao.notificar(usuario, produto, produto.getPreco());
        }
    }
}
