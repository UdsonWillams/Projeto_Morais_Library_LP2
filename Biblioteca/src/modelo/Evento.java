/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Leo
 */
public class Evento {
    
    private String nomeEvento;
    private String nomeResponsavel;
    private String dataInicio;
    private String dataTermino;
    private int capacidade;
    private Espaco espaco;

    public Evento(String nomeEvento, String nomeResponsavel, String dataInicio, 
            String dataTermino, int capacidade, Espaco espaco) {
        this.nomeEvento = nomeEvento;
        this.nomeResponsavel = nomeResponsavel;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.capacidade = capacidade;
        this.espaco = espaco;
    }
    
    public Evento(){}

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Espaco getEspaco() {
        return espaco;
    }

    public void setEspaco(Espaco espaco) {
        this.espaco = espaco;
    }

    @Override
    public String toString() {
        return "Evento {" + "nomeEvento=" + nomeEvento +
                ", nomeResponsavel=" + nomeResponsavel +
                ", dataInicio=" + dataInicio +
                ", dataTermino=" + dataTermino +
                ", capacidade=" + capacidade +
                ", espaco=" + espaco + '}';
    }

    
    
    
    
}
