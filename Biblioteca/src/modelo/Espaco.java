package modelo;

/**
 *
 * @author Leo
 */
public class Espaco {
    
    //Atributos
    private float area;
    private String nomeEspaco;

    
    //Métodos
    public Espaco(String nomeEspaco, float area) {
        this.area = area;
        this.nomeEspaco = nomeEspaco;
    }
    
    public Espaco (){}
    
    
    //Get, Set e toString

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getNomeEspaco() {
        return nomeEspaco;
    }

    public void setNomeEspaco(String nomeEspaco) {
        this.nomeEspaco = nomeEspaco;
    }

    @Override
    public String toString() {
        return this.nomeEspaco;
    }
    
}
