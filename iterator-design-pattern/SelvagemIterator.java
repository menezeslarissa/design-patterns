
/** Iterador concreto
 * Implementa iterator para o tipo selvagem
 * 
 * @author Larissa Menezes
 * @version 2.0
 */
import java.util.Iterator;
public class SelvagemIterator implements Iterator<Animal>
{
    private Zoo zoo;
    private int pos = 0;

    public SelvagemIterator(Zoo zoo){
        this.zoo = zoo;
    }

    //Metodo verifica se existe um proximo elemento especifico desse tipo na lista
    public boolean hasNext() {
        for(int i=pos; i < zoo.getAnimais().size(); i++) {
            Animal a = zoo.getAnimais().get(i);
            if(a.getTipo().equalsIgnoreCase("selvagem")){
                return true;
            }
        }
        return false;
    }

    //Iterações filtradas.
    public Animal next() {
        while(pos < zoo.getAnimais().size()) {
            Animal a = zoo.getAnimais().get(pos);
            pos++;

            if(a.getTipo().equalsIgnoreCase("selvagem")){
                return a;
            }
        }
        //Retorna null se não ha mais elementos especificos desse tipo na lista
        return null;
    }

}
