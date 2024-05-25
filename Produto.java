// Classe Produto que estende Subject, permitindo que observadores se registrem para receber notificações
public class Produto extends Subject {
    private String nome;
    private double preco;

    // Construtor da classe Produto
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Método para obter o nome do produto
    public String getNome() {
        return nome;
    }

    // Método para obter o preço atual do produto
    public double getPreco() {
        return preco;
    }

    // Método para definir o preço do produto e notificar os observadores
    public void setPreco(double preco) {
        this.preco = preco;
        notificarObservers();  // Notifica os observadores sobre a mudança de preço
    }
}
