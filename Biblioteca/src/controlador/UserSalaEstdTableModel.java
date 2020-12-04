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
public class UserSalaEstdTableModel extends AbstractTableModel{
    
    private final static int NOME_INDEX = 0;
    private final static int SALA_INDEX = 1;
    private final static int DATA_INDEX = 2;
    private ArrayList<String> nomeReserva= new ArrayList<>();
    private ArrayList<String> salasEstudo = new ArrayList<>();
    private ArrayList<String> datasReserva = new ArrayList<>();
    private String[] colunas = {"Responsável", "Espaço Reservado", "Data da Reserva"};

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
                return nomeReserva.get(linha);                
            case SALA_INDEX:
                return salasEstudo.get(linha);
            case DATA_INDEX:
                return datasReserva.get(linha);
        }
        return null;
        
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        
        switch(coluna){
            case NOME_INDEX:
                nomeReserva.set(linha, (String) valor); 
                break;
            case SALA_INDEX:
                salasEstudo.set(linha, (String) valor);
                break;
            case DATA_INDEX:
                datasReserva.set(linha, (String) valor);
        }
        
        this.fireTableRowsUpdated(linha, linha);
    }   
    
    public void addRow(String nome, String sala, String data){
        this.nomeReserva.add(nome);
        this.salasEstudo.add(sala);
         this.datasReserva.add(data);
        fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.salasEstudo.remove(linha);
        this.datasReserva.remove(linha);
        fireTableRowsDeleted(linha, linha);
    }
    
}
