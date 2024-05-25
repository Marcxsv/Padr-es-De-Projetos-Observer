// Classe SistemaDeNotificacao que envia notificações aos usuários
public class SistemaDeNotificacao {
    public static void notificar(Usuario usuario, Produto produto, double precoAtual) {
        System.out.println("Notificação para " + usuario.getNome() + " (" + usuario.getEmail() + "):"
                + " Temos Boas Notícias!!! O Produto "  + produto.getNome() + " que você estava de olho agora está: R$" + precoAtual + "!");
    }
}
