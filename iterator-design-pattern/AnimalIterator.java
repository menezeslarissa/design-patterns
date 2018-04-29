
/**
 * Iterador concreto para a lista completa
 * 
 * @author Larissa Menezes 
 * @version 2.0
 */
public class AnimalIterator
{
    private Zoo zoo;
    private int pos = 0;

    public AnimalIterator(Zoo zoo){
        this.zoo = zoo;
    }

    public boolean hasNext() {
        for(int i=pos; i < zoo.getAnimais().size(); i++) {

            return true;
        }
        return false;
    }

    
    public Animal next() {
        while(pos < zoo.getAnimais().size()) {
            Animal a = zoo.getAnimais().get(pos);
            pos++;
            return a;
        }
        //Retorna null se não ha mais elementos especificos desse tipo na lista
        return null;
    }
}
