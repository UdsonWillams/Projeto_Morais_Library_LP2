package modelo;

public class Eventos {
    
    private String nomeResponsavel;
    private String nomeEvento;
    private int dataComecoEvento;
    private int dataTerminoEvento;
    private String categoriaLocatario;
    private int capacidadeEvento;

    public Eventos() {
    }

    public Eventos(String nomeResponsavel, String nomeEvento, int dataComecoEvento, 
             int dataTerminoEvento, String categoriaLocatario, int capacidadeEvento) {
        
        this.nomeResponsavel = nomeResponsavel;
        this.nomeEvento = nomeEvento;
        this.dataComecoEvento = dataComecoEvento;
        this.dataTerminoEvento = dataTerminoEvento;
        this.categoriaLocatario = categoriaLocatario;
        this.capacidadeEvento = capacidadeEvento;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public int getDataComecoEvento() {
        return dataComecoEvento;
    }

    public int getDataTerminoEvento() {
        return dataTerminoEvento;
    }

    public String getCategoriaLocatario() {
        return categoriaLocatario;
    }

    public int getCapacidadeEvento() {
        return capacidadeEvento;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public void setDataComecoEvento(int dataComecoEvento) {
        this.dataComecoEvento = dataComecoEvento;
    }

    public void setDataTerminoEvento(int dataTerminoEvento) {
        this.dataTerminoEvento = dataTerminoEvento;
    }

    public void setCategoriaLocatario(String categoriaLocatario) {
        this.categoriaLocatario = categoriaLocatario;
    }

    public void setCapacidadeEvento(int capacidadeEvento) {
        this.capacidadeEvento = capacidadeEvento;
    }

    public String toString() {
        return "Eventos{" + "nomeResponsavel=" + nomeResponsavel + ", nomeEvento=" + nomeEvento + ", dataComecoEvento=" + dataComecoEvento + ", dataTerminoEvento=" + dataTerminoEvento + ", categoriaLocatario=" + categoriaLocatario + ", capacidadeEvento=" + capacidadeEvento + '}';
    }

    
    
    
    
}
