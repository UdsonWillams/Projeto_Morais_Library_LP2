package modelo;
import controlador.TableModel;
public class Usuario {

    private String nome;
    private Integer cpf;
    private String endereco;
    private String cidade;
    private String categoria;
    private int tempo;
    private String curso;
    
    
    public Usuario() {}
    
    public Usuario(String nome,Integer cpf, String endereco, String cidade,String categoria,int tempo, String curso) {
        
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cidade = cidade;
        this.categoria = categoria;
        this.tempo = tempo;
        this.curso = curso;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public int getTempo() {
        return tempo;
    }
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String toString() {
        return "Usuario{" + "nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", cidade=" + cidade + ", categoria=" + categoria + ", tempo=" + tempo + ", curso=" + curso + '}';
    }
    
    
   
    
    
}
