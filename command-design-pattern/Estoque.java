
/**
 * Classe da solicitação
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Estoque
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome = "Produto A";
    private int qtde = 100;

    public void comprar(){
        System.out.println("Estoque [Nome: " +
            nome + "| Quantidade: " + qtde + "] - comprado");
    }

    public void vender(){
        System.out.println("Estoque [Nome: " +
            nome + "| Quantidade: " + qtde + "] - vendido");
    }
}
