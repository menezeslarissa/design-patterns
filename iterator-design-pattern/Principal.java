
/**
 * Escreva a descrição da classe Principal aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Principal
{
      
      public void listarAnimais(ZooImpl zoo, AnimalIterator ai){

        System.out.println("Iterando todos os animais da lista...");

        while(ai.hasNext()){
            System.out.println(ai.next().getNome());
        }

    }

    public void listarSelvagem(ZooImpl zoo, SelvagemIterator si){

        System.out.println("Iterando animais selvagens...");

        while(si.hasNext()){
            System.out.println(si.next().getNome());
        }

    }

    public void listarDomestico(ZooImpl zoo, DomesticoIterator di){

        System.out.println("Iterando animais domésticos...");

        while(di.hasNext()){
            System.out.println(di.next().getNome());
        }

    }
 
}
