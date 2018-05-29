
/**
 * Armazena os tipos de inimigos num HashTable
 * 
 * @author larissa menezes 
 * @version (número de versão ou data)
 */
import java.util.Hashtable;

public class RepoInimigos
{
    private static Hashtable<String, Inimigo> inimigosRepo  = new Hashtable<String, Inimigo>();

    public static Inimigo getInimigo(String inimigoId) {
        Inimigo protoInimigo = inimigosRepo.get(inimigoId);
        return (Inimigo) protoInimigo.clone();    
    }

    public static void loadRepo() {
        Troll t = new Troll();
        t.setId("1");
        t.setEnergia(490);
        t.setNivel(22);
        
        inimigosRepo.put(t.getId(),t);
        
        Gigante g = new Gigante();
        g.setId("2");
        g.setEnergia(591);
        g.setNivel(22);
        
        inimigosRepo.put(g.getId(),g);
    }

}
