
/**
 * Classe que armazena meus pedidos
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.ArrayList;
import java.util.List;

public class Broker
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private List<Pedido> listaPedidos = new ArrayList<>();
    
    public void registrarPedido(Pedido pedido){
        listaPedidos.add(pedido);
    }

    public void realizarPedidos(){
        for(Pedido pedido : listaPedidos){
            pedido.executar();
        }
        listaPedidos.clear();
    }
   
}
