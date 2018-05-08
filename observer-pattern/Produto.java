
/**
 * Um produto possui nome, tipo e seus observadores
 * 
 * @author larissa menezes
 * @version 1.0
 */
import java.util.List;
import java.util.ArrayList;

public class Produto implements Subject
{
    //lista de obsevadores
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String nome;
    private String tipo;
    String disponibilidade;

    public Produto(String nome, String tipo,String disponibilidade) {
        super();
        this.nome = nome;
        this.tipo = tipo;
        this.disponibilidade=disponibilidade;
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade){
        this.disponibilidade = disponibilidade;
        notificarObservers();
    }

    public void notificarObservers() {
        System.out.println("Notificando todos os inscritos sobre a disponibilidade do produto "+ this.nome + ":");
        for (Observer ob : observers) {
            ob.update(this.disponibilidade);
        }

    }

    public void registrarObserver(Observer observer) {
        observers.add(observer);

    }

    public void removerObserver(Observer observer) {
        observers.remove(observer);

    }
    
}
