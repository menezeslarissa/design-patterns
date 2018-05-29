
/**
 * Estratégia concreta
 * 
 * @author larissa menezes
 * @version (número de versão ou data)
 */
public class EstrategiaSuporte implements EstrategiaSoldado
{
    @Override
    public void executar(){
        System.out.println("Esperar feridos e ajudar.");
    }
}
