/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelo.SalaEstudo;

/**
 *
 * @author Leo
 */
public class SalaEstudoTableModel extends AbstractTableModel{
    private final static int NOME_INDEX = 0;
    private final static int CAP_INDEX = 1;
    private ArrayList<SalaEstudo> salasEstudo = new ArrayList<>();
    private String[] colunas = {"Nome", "Capacidade"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    @Override
    public int getRowCount() {
        return salasEstudo.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            case NOME_INDEX:
                return salasEstudo.get(linha).getNome();                
            case CAP_INDEX:
                return salasEstudo.get(linha).getCap();
        }
        return null;
        
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        
        switch(coluna){
            case NOME_INDEX:
                salasEstudo.get(linha).setNome((String) valor); 
                break;
            case CAP_INDEX:
                salasEstudo.get(linha).setCap(Integer.parseInt((String) valor));
                break;
        }
        
        this.fireTableRowsUpdated(linha, linha);
    }   
    
    public void addRow(SalaEstudo e){
        this.salasEstudo.add(e);
        fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.salasEstudo.remove(linha);
        fireTableRowsDeleted(linha, linha);
    }
}
