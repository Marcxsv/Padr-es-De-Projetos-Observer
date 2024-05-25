import java.util.ArrayList;
import java.util.List;

// Define a classe abstrata Subject que gerencia a lista de observadores
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    // Adiciona um observador à lista
    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    // Remove um observador da lista
    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notifica todos os observadores sobre uma mudança de estado
    public void notificarObservers() {
        for (Observer observer : observers) {
            observer.atualizar((Produto) this);
        }
    }
}
