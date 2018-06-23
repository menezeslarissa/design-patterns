
/**
 * Escreva a descrição da classe ConcreteVideoPlayer aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ConcreteVideoPlayer implements VideoPlayer
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    VideoAdapter va;
    
    @Override 
    public void reproduzir(String nome, String formato){
        // formato padrão
       if(formato.equalsIgnoreCase("avi")){
         System.out.println("Arquivo: " + nome + " - Reproduzindo vídeo no formato .avi");
       }
       //o adapter está provendo suporte a outros formatos
       va = new VideoAdapter(formato);
       va.reproduzir(nome, formato);
    }

  
}
