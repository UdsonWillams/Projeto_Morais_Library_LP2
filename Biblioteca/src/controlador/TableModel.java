package controlador;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelo.Usuario;

public class TableModel extends AbstractTableModel {
    
    private final static int NOME_INDEX = 0;
    private final static int CPF_INDEX = 1;
    private final static int GENERO_INDEX = 2;
    private final static int TELEFONE_INDEX = 3;
    private final static int EMAIL_INDEX = 4;
    private final static int ENDERECO_INDEX = 5;
    private final static int CIDADE_INDEX = 6;
    private final static int CURSO_INDEX = 7;

   private ArrayList<Usuario> dados;
   private final String[] colunas = {"NOME", "CPF", "GÊNERO", "CELULAR", "EMAIL", "ENDEREÇO", "CIDADE", "CURSO"};
   
   public TableModel() {
       dados = new ArrayList<>();
   }
   
   public String getColumnName(int column) {
       return colunas[column];
   }
   
    public int getRowCount() {
        return dados.size();
    }
   
    public int getColumnCount() {
        return colunas.length;       
    }
  
    public Object getValueAt(int linha, int coluna) {
        final Usuario usuario = dados.get(linha);
        switch(coluna) {
            case NOME_INDEX:
                return usuario.getNome();
            case CPF_INDEX:
                return usuario.getCpf();
            case GENERO_INDEX:
                return usuario.getGenero();
            case TELEFONE_INDEX:
                return usuario.getTelefone();
            case EMAIL_INDEX:
                usuario.getEmail();
            case ENDERECO_INDEX:
                return usuario.getEndereco();
            case CIDADE_INDEX:
                return usuario.getCidade();
            case CURSO_INDEX:
                return usuario.getCurso();
        }
        
        return null;
    }
    
    public void addRow(Usuario usuario) {
        this.dados.add(usuario);
        this.fireTableDataChanged();
    }
    
    public void remover(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    

    
}
