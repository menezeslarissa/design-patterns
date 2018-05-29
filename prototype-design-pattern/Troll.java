
/**
 * Tipo de inimigo
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Troll extends Inimigo
{
    public Troll(){
        tipo = "Troll";
    }

    @Override
    void ataque() {
        System.out.println("Troll atacando..");
    }

}
