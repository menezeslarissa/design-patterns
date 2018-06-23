
/**
 * Escreva a descrição da classe VideoAdapter aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class VideoAdapter implements VideoPlayer
{
    AdvancedVideoPlayer vp;

   public VideoAdapter(String formato){
   
      if(formato.equalsIgnoreCase("rmvb") ){
         vp = new RmvbPlayer();			
         
      }else if (formato.equalsIgnoreCase("mkv")){
         vp = new MkvPlayer();
      }	
   }

   @Override
   public void reproduzir(String nome, String formato) {
   
      if(formato.equalsIgnoreCase("rmvb")){
         vp.playRmvb(nome);
      }
      else if(formato.equalsIgnoreCase("mkv")){
         vp.playMkv(nome);
      }
   }
}
