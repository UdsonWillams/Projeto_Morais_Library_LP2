package controlador;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelo.Usuario;

public class TableModel extends AbstractTableModel {
    
    private final static int NOME_INDEX = 0;
    private final static int CPF_INDEX = 1;
    private final static int ENDERECO_INDEX = 2;
    private final static int CIDADE_INDEX = 3;
    private final static int CURSO_INDEX = 4;

   private ArrayList<Usuario> dados;
   private final String[] colunas = {"NOME","CPF","ENDEREÇO","CIDADE","CURSO"};
   
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
