package modelo;

import java.util.ArrayList;

/**
 * @author UdsonWillams
 */
public class Livro {

    private String nomeDoLivro;
    private String tipoDoLivro;
    private String autor;
    private String editora;
    private int anoDeLancamento;
    private int quantidadeLivros;
    
    //Constructores
    public Livro() {}

    public Livro(String nomeDoLivro, String tipoDoLivro, String autor, String editora, int anoDeLancamento, int quantidadeLivros) {
        this.nomeDoLivro = nomeDoLivro;
        this.tipoDoLivro = tipoDoLivro;
        this.autor = autor;
        this.editora = editora;
        this.anoDeLancamento = anoDeLancamento;
        this.quantidadeLivros = quantidadeLivros;
    }

    //Gets e Sets
    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public void setNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }

    public String getTipoDoLivro() {
        return tipoDoLivro;
    }

    public void setTipoDoLivro(String tipoDoLivro) {
        this.tipoDoLivro = tipoDoLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getQuantidadeLivros() {
        return quantidadeLivros;
    }

    public void setQuantidadeLivros(int quantidadeLivros) {
        this.quantidadeLivros = quantidadeLivros;
    }  
    // fim dos get/set
   
    // To string
    public String toString() {
        return "Livro{" + "nomeDoLivro=" + nomeDoLivro + ", tipoDoLivro=" + tipoDoLivro + ", autor=" + autor + ", editora=" + editora + ", anoDeLancamento=" + anoDeLancamento + ", quantidadeLivros=" + quantidadeLivros + '}';
    }                                                      
}
