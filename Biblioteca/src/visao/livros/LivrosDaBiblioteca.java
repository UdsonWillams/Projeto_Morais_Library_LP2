package visao.livros;

import java.util.ArrayList;
import modelo.Livro;

/**
 * @author UdsonWillams
 */
public class LivrosDaBiblioteca {
    
    ArrayList<Livro> livros = new ArrayList<Livro>();
    
        Livro biblia = new Livro("biblia", "eletronico", "JC", "N sei", 2000, 0, "nao");
        Livro matematica = new Livro("naruto", "fisico", "udson", "N sei", 1990, 5, "nao");
        Livro orgulhoEPreconceito = new Livro("Orgulho e Preconceito", "fisico", "Jane Austen", "N sei", 2010, 3, "nao");
        Livro pequenoPrincipe = new Livro("O Pequeno Príncipe", "fisico", "Antoine de Saint-Exupéry", "N sei", 2010, 3, "nao");
        Livro domCasmurro = new Livro("Dom Casmurro", "eletronico", "Machado de Assis", "N sei", 2000, 0, "nao");
        Livro condeMonteCristo = new Livro("O Conde de Monte Cristo", "eletronico", "Alexandre Dumas", "N sei", 1990, 0, "nao");
        Livro guerraEPaz = new Livro("Guerra e Paz", "fisico", "Guerra e Paz", "N sei", 2000, 4, "nao");
        Livro hamlet = new Livro("Hamlet", "eletronico", "William Shakespeare", "N sei", 2000, 0, "nao");
        
    public LivrosDaBiblioteca(){
        
        livros.add(biblia);
        livros.add(matematica);
        livros.add(orgulhoEPreconceito);
        livros.add(pequenoPrincipe);
        livros.add(domCasmurro);
        livros.add(condeMonteCristo);
        livros.add(guerraEPaz);
        livros.add(hamlet);
        
    }
}