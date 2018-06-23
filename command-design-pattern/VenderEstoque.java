
/**
 * Command Concreto
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class VenderEstoque implements Pedido
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private Estoque estoque;

    public VenderEstoque(Estoque estoque)
    {
        this.estoque = estoque;
    }

    
    public void executar(){
       estoque.vender();
    }
}
