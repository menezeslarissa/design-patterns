
/**
 * Implementação Flyweight (FlyweightConcreto).
 * Não deve ser instanciado diretamente pelos clientes
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Soldado implements SoldadoFlyweight
{
   private String nivel;
   
   public Soldado(String nivel){
       this.nivel = nivel;
   }
   
   @Override
   public void mover(int x, int y){
        System.out.println("Soldado de nivél " + this.nivel +" está localizado na posição x: " + x + " e y: " + y);
    }
}
