
/**
 * Classe Context - Soldado
 * 
 * @author larissa menezes 
 * @version 
 */
public class Soldado
{
     private EstrategiaSoldado estrategia;

    public Soldado(EstrategiaSoldado estrategia) {
        this.estrategia = estrategia;
    }

    public void mudarEstrategia(EstrategiaSoldado estrategia) {
        this.estrategia = estrategia;
    }

    public void combater() {
        estrategia.executar();
    }
}
