public class Main {
    public static void main(String[] args) {
        // Criando produtos
        Produto produto1 = new Produto("Ar Condicionado", 3000);
        Produto produto2 = new Produto("Televisão", 1500);

        // Criando usuários
        Usuario usuario1 = new Usuario("Alice", "Alice@uniesp.com");
        Usuario usuario2 = new Usuario("Rui", "Rui@uniesp.com");

        // Criando alertas
        Alerta alerta1 = new Alerta(usuario1, produto1, 2500);
        Alerta alerta2 = new Alerta(usuario2, produto2, 1200);

        // Adicionando alertas aos usuários
        usuario1.adicionarAlerta(alerta1);
        usuario2.adicionarAlerta(alerta2);

        // Atualizando preços dos produtos
        produto1.setPreco(2400);  // Isso deve acionar uma notificação para Alice
        produto2.setPreco(1100);  // Isso deve acionar uma notificação para Rui
    }
}
