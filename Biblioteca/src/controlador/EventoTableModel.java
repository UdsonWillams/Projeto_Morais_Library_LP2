/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelo.Evento;

/**
 *
 * @author Leo
 */
public class EventoTableModel extends AbstractTableModel{
    
    private final static int NOME_INDEX = 0;
    private final static int RESPONSAVEL_INDEX = 1;
    private final static int INICIO_INDEX = 2;
    private final static int TERMINO_INDEX = 3;
    private final static int CAPACIDADE_INDEX = 4;
    private final static int ESPACO_INDEX = 5;
    
    private final ArrayList<Evento> eventos = new ArrayList<>();
    private final String[] colunas = {"Nome", "Responsável", "Início", 
                                "Término", "Capacidade", "Espaço"};

    EspacoTableModel espaco = new EspacoTableModel();
    int tamanho = espaco.getRowCount();
    ArrayList<String> listEspaco = new ArrayList<>();
    
    
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    @Override
    public int getRowCount() {
        return eventos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
     
        switch(coluna){
            case NOME_INDEX:
                return eventos.get(linha).getNomeEvento();
            case RESPONSAVEL_INDEX:
                return eventos.get(linha).getNomeResponsavel();
            case INICIO_INDEX:
                return eventos.get(linha).getDataInicio();
            case TERMINO_INDEX:
                return eventos.get(linha).getDataTermino();
            case CAPACIDADE_INDEX:
                return eventos.get(linha).getCapacidade();
            case ESPACO_INDEX:
                return eventos.get(linha).getEspaco();
            
            
        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        
        switch(coluna){
            case NOME_INDEX:
                eventos.get(linha).setNomeEvento((String) valor);
                break;
            case RESPONSAVEL_INDEX:
                eventos.get(linha).setNomeResponsavel((String) valor);
                break;
            case INICIO_INDEX:
                eventos.get(linha).setDataInicio((String) valor);
                break;
            case TERMINO_INDEX:
                eventos.get(linha).setDataTermino((String) valor);
                break;
            case CAPACIDADE_INDEX:
                eventos.get(linha).setCapacidade(Integer.parseInt((String) valor));
                break;
            case ESPACO_INDEX:
                eventos.get(linha).setEspaco((String) valor);
                break;
        }
                
        
        this.fireTableRowsUpdated(linha, linha);
    }   
    
    public void addRow(Evento e){
        this.eventos.add(e);
        fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.eventos.remove(linha);
        fireTableRowsDeleted(linha, linha);
    }
    
    //criando uma lista com o nome dos espaços
    public ArrayList getEspaco(){
        for (int i=0;i<tamanho;i++){
           listEspaco.add(espaco.getItem(i));
        }
        return listEspaco;
    }
    
}
