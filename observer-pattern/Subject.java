
/**
 * Interface Subject adiciona, remove e notifica observadores
 * 
 * @author larissa menezes
 * @version 1.0
 */
public interface Subject
{
    //adiciona observadores
    void registrarObserver(Observer observer);
    //remove bservadores
    void removerObserver(Observer observer);
    //notifica todos os observadores
    void notificarObservers();
}
