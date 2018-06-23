
/**
 * Command Concreto
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ComprarEstoque implements Pedido
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private Estoque estoque;

    public ComprarEstoque(Estoque estoque){
        this.estoque = estoque;
    }

   public void executar(){
       estoque.comprar();
    }
}
