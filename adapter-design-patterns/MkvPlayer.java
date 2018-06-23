
/**
 * Escreva a descrição da classe MkvPlayer aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class MkvPlayer implements AdvancedVideoPlayer
{
     @Override
    public void playRmvb(String nome){
        
    }
    
    @Override
    public void playMkv(String nome){
       System.out.println("Arquivo: " + nome + " - Reproduzindo vídeo no formato .mkv");
    }
}
