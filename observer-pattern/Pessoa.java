
/**
 * Classe pessoa (observadores)
 * 
 * @author larissa menezes
 * @version 1.0
 */
public class Pessoa implements Observer
{
    String nome;
   
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void update(String disponibilidade) {

        System.out.println("Olá "+nome+", o produto agora está "+disponibilidade+" na loja");
    }
    
    public String toString(){
        return "Pessoa [nome = " + this.nome + "]";
    }
}
