/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelo.Espaco;

/**
 *
 * @author Leo
 */
public class EspacoTableModel extends AbstractTableModel{

    private final static int NOME_INDEX = 0;
    private final static int AREA_INDEX = 1;
    private ArrayList<Espaco> espacos = new ArrayList<>();
    private String[] colunas = {"Nome", "Área"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    @Override
    public int getRowCount() {
        return espacos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            case NOME_INDEX:
                return espacos.get(linha).getNomeEspaco();                
            case AREA_INDEX:
                return espacos.get(linha).getArea();
        }
        return null;
        
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        
        switch(coluna){
            case NOME_INDEX:
                espacos.get(linha).setNomeEspaco((String) valor); 
                break;
            case AREA_INDEX:
                espacos.get(linha).setArea(Float.parseFloat((String) valor));
                break;
        }
        
        this.fireTableRowsUpdated(linha, linha);
    }   
    
    public void addRow(Espaco e){
        this.espacos.add(e);
        fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.espacos.remove(linha);
        fireTableRowsDeleted(linha, linha);
    }
    
}
