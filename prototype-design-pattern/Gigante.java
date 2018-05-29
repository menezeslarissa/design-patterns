
/**
 * Tipo de inimigo 
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Gigante extends Inimigo
{

    public Gigante(){
        tipo = "Gigante";
    }

    @Override
    void ataque() {
        System.out.println("Gigante atacando...");				
    }

}
