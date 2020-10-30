package modelo;

/**
 *
 * @author Leo
 */
public class Espaco {
    
    //Atributos
    private float areaUm;
    private float areaDois;
    private String nomeEspaco;

    
    //Métodos
    public Espaco(float areaUm, float areaDois, String nomeEspaco) {
        this.areaUm = areaUm;
        this.areaDois = areaDois;
        this.nomeEspaco = nomeEspaco;
    }
    
    public Espaco (){}
    
    
    //Get, Set e toString

    public float getAreaUm() {
        return areaUm;
    }

    public void setAreaUm(float areaUm) {
        this.areaUm = areaUm;
    }

    public float getAreaDois() {
        return areaDois;
    }

    public void setAreaDois(float areaDois) {
        this.areaDois = areaDois;
    }

    public String getNomeEspaco() {
        return nomeEspaco;
    }

    public void setNomeEspaco(String nomeEspaco) {
        this.nomeEspaco = nomeEspaco;
    }

    @Override
    public String toString() {
        return "Espaco{" + "areaUm=" + areaUm + ", areaDois=" + areaDois + ", nomeEspaco=" + nomeEspaco + '}';
    }
    
}
