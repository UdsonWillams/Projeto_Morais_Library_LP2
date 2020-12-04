/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.eventos;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import controlador.EventoTableModel;
import controlador.EspacoTableModel;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Evento;
import modelo.Espaco;
import visao.livros.FichasCatalograficas;
import modelo.LeitorArquivo;

/**
 *
 * @author Leo
 */
public class VisaoEvento extends javax.swing.JFrame {
    
    EventoTableModel tableModel = new EventoTableModel();
    final int SIM = 0;
    final int NAO = 1;
    final int CANCELAR = 2;
    ArrayList<String> listaEspaco = new ArrayList<>();
    EspacoTableModel espacos = new EspacoTableModel();
    ArrayList <Evento> eventoImport = new ArrayList<>();
    LeitorArquivo leitorArquivo = new LeitorArquivo();
    
    /**
     * Creates new form visaoEvento
     */
    public VisaoEvento() {
        initComponents();
        
        jTEventos.setModel(tableModel);
        
        jBoxEspaco.removeAllItems();
        
        //Adicionando espaços para teste
        Espaco e1 = new Espaco("Espaço 1", 800);
        Espaco e2 = new Espaco("Espaço 2", 1100);
        Espaco e3 = new Espaco("Auditório Central", 2000);
        
        //Adicionando espaços na comboBox
        jBoxEspaco.addItem(e1.toString());
        jBoxEspaco.addItem(e2.toString());
        jBoxEspaco.addItem(e3.toString());

        //Adicionando eventos para teste
        Evento ev1 = new Evento("INOVA", "Marcelo", "03/11/2020", "10/11/2020", 1000, "Espaço 2");
        Evento ev2 = new Evento("Natal UNIESP", "Aline", "24/12/2020", "25/12/2020", 750, "Auditório Central");
        Evento ev3 = new Evento("Ano Novo UNIESP", "Alana", "30/12/2020", "01/01/2021", 800, "Auditório Central");
        Evento ev4 = new Evento("Feira do Livro", "Elaine", "15/11/2020", "20/11/2020", 300, "Espaço 1");
        Evento ev5 = new Evento("Workshop de QA", "Marcelo", "05/01/2021", "08/01/2020", 400, "Espaço 1");
        
        tableModel.addRow(ev1);
        tableModel.addRow(ev2);
        tableModel.addRow(ev4);
        tableModel.addRow(ev3);
        tableModel.addRow(ev5);
        
        //Setando variáveis para importação
       
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTEventos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabelNomeEven = new javax.swing.JLabel();
        jLabelNomeResp = new javax.swing.JLabel();
        jLabelDataFim = new javax.swing.JLabel();
        jLabelDataCmc = new javax.swing.JLabel();
        jLabelCap = new javax.swing.JLabel();
        jLabelEsp = new javax.swing.JLabel();
        jTxtNomeEven = new javax.swing.JTextField();
        jTxtNomeResp = new javax.swing.JTextField();
        jTxtCap = new javax.swing.JTextField();
        jTxtDataCmc = new javax.swing.JFormattedTextField();
        jTxtDataFim = new javax.swing.JFormattedTextField();
        jBoxEspaco = new javax.swing.JComboBox<>();
        jBtSalvar = new javax.swing.JButton();
        jBtExcluir = new javax.swing.JButton();
        jBtAlterar = new javax.swing.JButton();
        jBtVoltar = new javax.swing.JButton();
        jBtSalvar1 = new javax.swing.JButton();
        jBtImportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Biblioteca - Janela de Eventos");
        setResizable(false);

        jTEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTEventosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTEventos);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNomeEven.setText("Nome do Evento:");

        jLabelNomeResp.setText("Nome do Responsável:");

        jLabelDataFim.setText("Data de Término:");

        jLabelDataCmc.setText("Data de Início:");

        jLabelCap.setText("Capacidade:");

        jLabelEsp.setText("Espaço:");

        try {
            jTxtDataCmc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jTxtDataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jBoxEspaco.setMaximumRowCount(20);
        jBoxEspaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoxEspacoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNomeEven)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtNomeEven, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNomeResp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtNomeResp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDataFim)
                    .addComponent(jLabelDataCmc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtDataCmc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelEsp)
                    .addComponent(jLabelCap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBoxEspaco, 0, 120, Short.MAX_VALUE)
                    .addComponent(jTxtCap))
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtNomeEven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDataCmc)
                    .addComponent(jLabelCap)
                    .addComponent(jTxtDataCmc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeEven))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtNomeResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDataFim)
                    .addComponent(jLabelEsp)
                    .addComponent(jLabelNomeResp)
                    .addComponent(jTxtDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBoxEspaco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBtSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-salvar-32.png"))); // NOI18N
        jBtSalvar.setText("Salvar");
        jBtSalvar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBtSalvar.setHideActionText(true);
        jBtSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSalvarActionPerformed(evt);
            }
        });

        jBtExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-excluir-32.png"))); // NOI18N
        jBtExcluir.setText("Excluir");
        jBtExcluir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBtExcluir.setHideActionText(true);
        jBtExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtExcluirActionPerformed(evt);
            }
        });

        jBtAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-sincronizar-configurações-32.png"))); // NOI18N
        jBtAlterar.setText("Alterar");
        jBtAlterar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBtAlterar.setHideActionText(true);
        jBtAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAlterarActionPerformed(evt);
            }
        });

        jBtVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-sair-32.png"))); // NOI18N
        jBtVoltar.setText("Voltar");
        jBtVoltar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBtVoltar.setHideActionText(true);
        jBtVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtVoltarActionPerformed(evt);
            }
        });

        jBtSalvar1.setBackground(new java.awt.Color(0, 51, 204));
        jBtSalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-pdf.png"))); // NOI18N
        jBtSalvar1.setText("Relatório");
        jBtSalvar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBtSalvar1.setHideActionText(true);
        jBtSalvar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtSalvar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSalvar1ActionPerformed(evt);
            }
        });

        jBtImportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-importar-csv-32.png"))); // NOI18N
        jBtImportar.setText("Importar");
        jBtImportar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBtImportar.setHideActionText(true);
        jBtImportar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtImportar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtImportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBtSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBtAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtSalvar))
                    .addComponent(jBtImportar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtSalvar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(754, 578));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void jBtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSalvarActionPerformed
        String nomeEven = jTxtNomeEven.getText();
        String nomeResp = jTxtNomeResp.getText();
        String dataCmc = jTxtDataCmc.getText();
        String dataFim = jTxtDataFim.getText();
        int capacidade = Integer.parseInt(jTxtCap.getText());
        String espaco = (String) jBoxEspaco.getSelectedItem();
        Evento e = new Evento(nomeEven, nomeResp, dataCmc, dataFim, capacidade, espaco);
        tableModel.addRow(e);
        JOptionPane.showMessageDialog(null, "Evento cadastrado com sucesso!");
        jTxtNomeEven.setText("");
        jTxtNomeResp.setText("");
        jTxtDataCmc.setText("");
        jTxtDataFim.setText("");
        jTxtCap.setText("");
        
    }//GEN-LAST:event_jBtSalvarActionPerformed

    private void jBtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtExcluirActionPerformed
        if(jTEventos.getSelectedRow() != -1){
            switch(JOptionPane.showConfirmDialog(null,"Você confirma a exclusão desse evento?")){
                case SIM:
                    tableModel.removeRow(jTEventos.getSelectedRow());
                    JOptionPane.showMessageDialog(null, "Evento deletado com sucesso!");
                    break;
                case NAO:;
                case CANCELAR:
                    break;            
            }
        }
    }//GEN-LAST:event_jBtExcluirActionPerformed

    private void jBtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAlterarActionPerformed
        if(jTEventos.getSelectedRow() != -1){
            switch (JOptionPane.showConfirmDialog(null, "Você confirma a alteração dos dados?")) {
            case SIM:
                tableModel.setValueAt(jTxtNomeEven.getText(), jTEventos.getSelectedRow(), 0);  
                tableModel.setValueAt(jTxtNomeResp.getText(), jTEventos.getSelectedRow(), 1);
                tableModel.setValueAt(jTxtDataCmc.getText(), jTEventos.getSelectedRow(), 2);
                tableModel.setValueAt(jTxtDataFim.getText(), jTEventos.getSelectedRow(), 3);
                tableModel.setValueAt(jTxtCap.getText(), jTEventos.getSelectedRow(), 4);
                tableModel.setValueAt(jBoxEspaco.getSelectedItem(), jTEventos.getSelectedRow(), 5);
                JOptionPane.showMessageDialog(null, "Evento alterado com sucesso!");
                break;
            case NAO:;
            case CANCELAR:
                break;
            }
        }
    }//GEN-LAST:event_jBtAlterarActionPerformed

    private void jBtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_jBtVoltarActionPerformed

    private void jTEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTEventosMouseClicked
        if(jTEventos.getSelectedRow() != -1){
            jTxtNomeEven.setText((String) tableModel.getValueAt(jTEventos.getSelectedRow(), 0));
            jTxtNomeResp.setText((String) tableModel.getValueAt(jTEventos.getSelectedRow(), 1));
            jTxtDataCmc.setText((String) tableModel.getValueAt(jTEventos.getSelectedRow(), 2));
            jTxtDataFim.setText((String) tableModel.getValueAt(jTEventos.getSelectedRow(), 3));
            jTxtCap.setText((String) tableModel.getValueAt(jTEventos.getSelectedRow(), 4).toString());
            jBoxEspaco.setSelectedItem((String) tableModel.getValueAt(jTEventos.getSelectedRow(), 5));
        }
    }//GEN-LAST:event_jTEventosMouseClicked

    private void jBoxEspacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoxEspacoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBoxEspacoActionPerformed

    private void jBtSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSalvar1ActionPerformed
        Document document = new Document();
        
        try {
            PdfWriter.getInstance(document, new FileOutputStream("Relatório de Eventos.pdf"));
            
            document.open();
            document.add(new Paragraph("Relatório de Eventos"));
            document.add(new Paragraph("\nQuantidade de Eventos registrados: "+tableModel.getRowCount()));
            for (int i = 0; i<tableModel.getRowCount(); i++){
                document.add(new Paragraph("\n###############################"));
                document.add(new Paragraph("\nEvento ["+tableModel.getValueAt(i, 0)+"]"));
                document.add(new Paragraph("Pessoa Responsável pelo Evento: " + tableModel.getValueAt(i, 1)));
                document.add(new Paragraph("Espaço Reservado para o Evento: " + tableModel.getValueAt(i, 5)));
                document.add(new Paragraph("Capacidade máxima do Evento: " + tableModel.getValueAt(i, 4)));
                document.add(new Paragraph("Data de Início do Evento: " + tableModel.getValueAt(i, 2)));
                document.add(new Paragraph("Data de Término do Evento: " + tableModel.getValueAt(i, 3)));
                document.add(new Paragraph("\n###############################"));
            }                       
        } catch (FileNotFoundException | DocumentException ex) {
            System.out.println("Error"+ ex);                                        
        }finally{
            document.close();
        }
        
        try{
            Desktop.getDesktop().open(new File("Relatório de Eventos.pdf"));
        } catch (IOException ex) {
            Logger.getLogger(FichasCatalograficas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBtSalvar1ActionPerformed

    private void jBtImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtImportarActionPerformed
        try {
            eventoImport = leitorArquivo.importarArquivo("src/arquivos/EventoImport.txt");            
        } catch (IOException e){
            e.printStackTrace();
        }
        
        for (int i = 0; i< eventoImport.size(); i++){
            tableModel.addRow(eventoImport.get(i));
        }
        
        JOptionPane.showMessageDialog(null, "Eventos importados com Sucesso!!");
        
        
        
    }//GEN-LAST:event_jBtImportarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VisaoEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisaoEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisaoEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisaoEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisaoEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jBoxEspaco;
    private javax.swing.JButton jBtAlterar;
    private javax.swing.JButton jBtExcluir;
    private javax.swing.JButton jBtImportar;
    private javax.swing.JButton jBtSalvar;
    private javax.swing.JButton jBtSalvar1;
    private javax.swing.JButton jBtVoltar;
    private javax.swing.JLabel jLabelCap;
    private javax.swing.JLabel jLabelDataCmc;
    private javax.swing.JLabel jLabelDataFim;
    private javax.swing.JLabel jLabelEsp;
    private javax.swing.JLabel jLabelNomeEven;
    private javax.swing.JLabel jLabelNomeResp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTEventos;
    private javax.swing.JTextField jTxtCap;
    private javax.swing.JFormattedTextField jTxtDataCmc;
    private javax.swing.JFormattedTextField jTxtDataFim;
    private javax.swing.JTextField jTxtNomeEven;
    private javax.swing.JTextField jTxtNomeResp;
    // End of variables declaration//GEN-END:variables
}
