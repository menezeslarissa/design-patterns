
/**
 * Escreva a descrição da classe FlyweightFactory aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.List;
import java.util.ArrayList;

public class FlyweightFactory
{
    private List<SoldadoFlyweight> flyweights;

    public FlyweightFactory(){
        flyweights = new ArrayList<>();
        flyweights.add(new Soldado("baixo"));
        flyweights.add(new Soldado("médio"));
        flyweights.add(new Soldado("alto"));
        flyweights.add(new Soldado("expert"));
    }

    public SoldadoFlyweight getFlyweight(String nivel){
        if(nivel.equalsIgnoreCase("baixo")){
            return flyweights.get(0);
        } else if(nivel.equalsIgnoreCase("médio")){
                return flyweights.get(1);
        } else if(nivel.equalsIgnoreCase("alto")){
                return flyweights.get(2);
        } else if(nivel.equalsIgnoreCase("expert")){
               return flyweights.get(3); 
        }
        return null;
    }   

}
