
/**
 * Implementa uma interface para clonar a si próprio
 * 
 * @author larissa menezes 
 * @version (número de versão ou data)
 */

public abstract class Inimigo implements java.lang.Cloneable
{
    private String id;
    protected String tipo;
    private int energia;
    private int nivel;
    abstract void ataque();

    public int getEnergia() { 
        return energia;
    }

    public void setEnergia(int energia) { 
        this.energia = energia;
    }

    public int getNivel() { 
        return nivel;
    }

    public void setNivel(int nivel) { 
        this.nivel = nivel; 
    }

    public String getTipo(){ 
        return tipo; 
    }

    public String getId() { 
        return id; 
    }

    public void setId(String id) { 
        this.id = id; 
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    }
