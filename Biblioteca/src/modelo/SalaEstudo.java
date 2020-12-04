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
public class SalaEstudo {
    
    private String nome;
    private int cap;

    public SalaEstudo(String nome, int cap) {
        this.nome = nome;
        this.cap = cap;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    @Override
    public String toString() {
        return "SalaEstudo{" + "nome=" + nome + ", cap=" + cap + '}';
    }
    
}
