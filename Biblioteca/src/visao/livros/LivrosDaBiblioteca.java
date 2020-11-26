package visao.livros;

import java.util.ArrayList;
import modelo.Livro;

/**
 * @author UdsonWillams
 */
public class LivrosDaBiblioteca {
    
    ArrayList<Livro> livros = new ArrayList<Livro>();
    
        Livro biblia = new Livro("a biblia", "eletronico", "JC", "N sei", 2000, 0);
        Livro matematica = new Livro("naruto", "fisico", "udson", "N sei", 1990, 5);
        Livro ingles = new Livro("o ingles", "fisico", "joao", "N sei", 2010, 3);
        Livro joao = new Livro("joao doido", "fisico", "joseph", "N sei", 2010, 3);
        
    public LivrosDaBiblioteca(){
        
        livros.add(biblia);
        livros.add(matematica);
        livros.add(ingles);
        livros.add(joao);
    }
}

