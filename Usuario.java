import java.util.ArrayList;
import java.util.List;

// Classe Usuario que representa um usuário do sistema
public class Usuario {
    private String nome;
    private String email;
    private List<Alerta> alertas;

    // Construtor da classe Usuario
    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.alertas = new ArrayList<>();
    }

    // Método para obter o nome do usuário
    public String getNome() {
        return nome;
    }

    // Método para obter o email do usuário
    public String getEmail() {
        return email;
    }

    // Método para adicionar um alerta à lista de alertas do usuário
    public void adicionarAlerta(Alerta alerta) {
        alertas.add(alerta);
    }

    // Método para obter a lista de alertas do usuário
    public List<Alerta> getAlertas() {
        return alertas;
    }
}
