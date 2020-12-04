/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.eventos;

import controlador.SalaEstudoTableModel;
import javax.swing.JOptionPane;
import modelo.SalaEstudo;

/**
 *
 * @author Leo
 */
public class VisaoSalaEstudo extends javax.swing.JFrame {
    
    SalaEstudoTableModel tableModel = new SalaEstudoTableModel();

    /**
     * Creates new form visaoSalaEstudo
     */
    public VisaoSalaEstudo() {   
        
        initComponents();
        
        jTSalaEstudo.setModel(tableModel);
        
        
        //Criando Salas de Estudo para teste
        SalaEstudo s1 = new SalaEstudo("Sala Minimalista", 8);
        SalaEstudo s2 = new SalaEstudo("Sala da Monitoria", 12);
        SalaEstudo s3 = new SalaEstudo("Sala Norte", 25);
        SalaEstudo s4 = new SalaEstudo("Sala Leste", 25);
        SalaEstudo s5 = new SalaEstudo("Sala Master", 35);
        SalaEstudo s6 = new SalaEstudo("Salão Principal", 40);
        SalaEstudo s7 = new SalaEstudo("Sala de Computadores", 30);
        SalaEstudo s8 = new SalaEstudo("Cabines de Leitura", 20);
        
        //Adicionando as Salas de Estudo a tabela
        tableModel.addRow(s1);
        tableModel.addRow(s2);
        tableModel.addRow(s8);
        tableModel.addRow(s3);
        tableModel.addRow(s4);
        tableModel.addRow(s7);
        tableModel.addRow(s5);
        tableModel.addRow(s6);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTSalaEstudo = new javax.swing.JTable();
        jTxtNome = new javax.swing.JTextField();
        jTxtCap = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jLabelCap = new javax.swing.JLabel();
        jBtSalvar = new javax.swing.JButton();
        jBtAlterar = new javax.swing.JButton();
        jBtExcluir = new javax.swing.JButton();
        jBtVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Salas de Estudo");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTSalaEstudo.setModel(new javax.swing.table.DefaultTableModel(
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
        jTSalaEstudo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTSalaEstudoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTSalaEstudo);

        jLabelNome.setText("Nome:");

        jLabelCap.setText("Capacidade:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTxtCap, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 417, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jLabelNome)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtVoltar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCap)
                            .addComponent(jTxtCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                        .addComponent(jBtExcluir)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNome))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(82, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Salas de Estudo ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(711, 424));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTSalaEstudoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTSalaEstudoMouseClicked
        if(jTSalaEstudo.getSelectedRow() != -1){
            jTxtNome.setText((String) tableModel.getValueAt(jTSalaEstudo.getSelectedRow(), 0));
            jTxtCap.setText((String) tableModel.getValueAt(jTSalaEstudo.getSelectedRow(), 1).toString());
        }
    }//GEN-LAST:event_jTSalaEstudoMouseClicked

    private void jBtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSalvarActionPerformed
        if (jTxtNome.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Não deixar o nome em branco!\nEsse campo é obrigatório.");
        }else if(jTxtCap.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Não deixar a área em branco!\nEsse campo é obrigatório.");
        }else{
            SalaEstudo s = new SalaEstudo(jTxtNome.getText(), Integer.parseInt(jTxtCap.getText()));
            tableModel.addRow(s);
            
            JOptionPane.showMessageDialog(null, "Espaço cadastrado com sucesso!");
            jTxtNome.setText("");
            jTxtCap.setText("");
        }
    }//GEN-LAST:event_jBtSalvarActionPerformed

    private void jBtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAlterarActionPerformed
        if(jTSalaEstudo.getSelectedRow() != -1){
            tableModel.setValueAt(jTxtNome.getText(), jTSalaEstudo.getSelectedRow(), 0);
            tableModel.setValueAt(jTxtCap.getText(), jTSalaEstudo.getSelectedRow(), 1);
        }
    }//GEN-LAST:event_jBtAlterarActionPerformed

    private void jBtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtExcluirActionPerformed
        if(jTSalaEstudo.getSelectedRow() != -1){
            tableModel.removeRow(jTSalaEstudo.getSelectedRow());
        }
    }//GEN-LAST:event_jBtExcluirActionPerformed

    private void jBtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_jBtVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(VisaoSalaEstudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisaoSalaEstudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisaoSalaEstudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisaoSalaEstudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisaoSalaEstudo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtAlterar;
    private javax.swing.JButton jBtExcluir;
    private javax.swing.JButton jBtSalvar;
    private javax.swing.JButton jBtVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCap;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTSalaEstudo;
    private javax.swing.JTextField jTxtCap;
    private javax.swing.JTextField jTxtNome;
    // End of variables declaration//GEN-END:variables
}