
/**
 * Iterator Concreto para tipo doméstico
 * 
 * @author Larissa Menezes 
 * @version 2.0
 */
import java.util.Iterator;

public class DomesticoIterator implements Iterator<Animal>
{
    private Zoo zoo;
    private int pos = 0;

    public DomesticoIterator(Zoo zoo){
        this.zoo = zoo;
    }

    //Metodo verifica se existe um proximo elemento especifico desse tipo na lista
    public boolean hasNext() {
        for(int i=pos; i < zoo.getAnimais().size(); i++) {
            Animal a = zoo.getAnimais().get(i);
            if(a.getTipo().equalsIgnoreCase("domestico")){
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

            if(a.getTipo().equalsIgnoreCase("domestico")){
                return a;
            }
        }
        //Retorna null se não ha mais elementos especificos desse tipo na lista
        return null;
    }
}
