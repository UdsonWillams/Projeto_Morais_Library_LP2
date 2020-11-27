package modelo;
import controlador.TableModel;
public class Usuario {

    private String nome;
    private String cpf;
    private String genero;
    private String telefone;
    private String email;
    private String endereco;
    private String cidade;
    private String curso;
    private String categoria;
    private int tempo;
   
    
    public Usuario(String nome, String cpf, String genero, String telefone, String email,
            String endereco, String cidade,
            String categoria,int tempo, String curso) {
        
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.cidade = cidade;
        this.categoria = categoria;
        this.tempo = tempo;
        this.curso = curso;
}
    public Usuario() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Override
    public String toString() {
        return "Usuario{" + "nome = " + nome + ", cpf = " + cpf + ", genero = " + genero +
                ", telefone = " + telefone + ", email = " + email +
                ", endereco = " + endereco + ", cidade = " + cidade + ", curso = " + curso + 
                ", categoria = " + categoria + ", tempo = " + tempo + '}';
    }
    
    
    
    
}
