
/**
 * Escreva a descrição da classe ImagemDecodificada aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class VestuarioFactory
{
    public static TipoDeVestuario criarVestuario(String selecao){
        if(selecao.equalsIgnoreCase("Vestido")){
            return new Vestido();
        } else if(selecao.equalsIgnoreCase("Camisa")){
            return new Camisa();
        }
        throw new IllegalArgumentException("Tipo de vestuário não existe.");
    }
}
