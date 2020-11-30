/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.eventos;
import java.util.ArrayList;
import modelo.Evento;
import modelo.Espaco;

/**
 *
 * @author Leo
 */
public class CadEvento extends javax.swing.JFrame {

    String evenCmc, evenFim, evenNome, evenResp, evenEspaco;
    int evenCap;
    Espaco espaco = new Espaco(1, 2, "lol");
    ArrayList<Evento> eventos = new ArrayList<>();
    /**
     * Creates new form cadEventop
     */
    public CadEvento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCadEvento = new javax.swing.JPanel();
        jLabelEvenNome = new javax.swing.JLabel();
        jLabelEvenResp = new javax.swing.JLabel();
        jLabelEvenCmc = new javax.swing.JLabel();
        jLabelEvenFim = new javax.swing.JLabel();
        jLabelEvenCap = new javax.swing.JLabel();
        jLabelEvenEspaco = new javax.swing.JLabel();
        jFormattedTextFieldEvenNome = new javax.swing.JFormattedTextField();
        jFormattedTextFieldEvenResp = new javax.swing.JFormattedTextField();
        jFormattedTextFieldEvenCmc = new javax.swing.JFormattedTextField();
        jFormattedTextFieldEvenFim = new javax.swing.JFormattedTextField();
        jFormattedTextFieldEvenCap = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jComboBoxEvenEspaco = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanelCadEvento.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelEvenNome.setText("Nome do Evento:");

        jLabelEvenResp.setText("Nome do Responsável:");

        jLabelEvenCmc.setText("Data de Início:");

        jLabelEvenFim.setText("Data de Término:");

        jLabelEvenCap.setText("Capacidade do Evento:");

        jLabelEvenEspaco.setText("Espaço Reservado:");

        jFormattedTextFieldEvenNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldEvenNomeActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldEvenCmc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldEvenFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBoxEvenEspaco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Espaço 1", "Espaço 2", "Espaço 3", "Espaço 4" }));

        javax.swing.GroupLayout jPanelCadEventoLayout = new javax.swing.GroupLayout(jPanelCadEvento);
        jPanelCadEvento.setLayout(jPanelCadEventoLayout);
        jPanelCadEventoLayout.setHorizontalGroup(
            jPanelCadEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCadEventoLayout.createSequentialGroup()
                        .addGroup(jPanelCadEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelEvenCap, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jLabelEvenFim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelEvenNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelEvenResp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelEvenCmc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelEvenEspaco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCadEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormattedTextFieldEvenCap)
                            .addComponent(jFormattedTextFieldEvenFim)
                            .addComponent(jFormattedTextFieldEvenResp)
                            .addComponent(jFormattedTextFieldEvenNome)
                            .addComponent(jFormattedTextFieldEvenCmc)
                            .addComponent(jComboBoxEvenEspaco, 0, 150, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCadEventoLayout.setVerticalGroup(
            jPanelCadEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadEventoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelCadEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEvenNome)
                    .addComponent(jFormattedTextFieldEvenNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEvenResp)
                    .addComponent(jFormattedTextFieldEvenResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEvenCmc)
                    .addComponent(jFormattedTextFieldEvenCmc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEvenFim, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldEvenFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEvenCap)
                    .addComponent(jFormattedTextFieldEvenCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEvenEspaco)
                    .addComponent(jComboBoxEvenEspaco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Eventos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelCadEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCadEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226))
        );

        setSize(new java.awt.Dimension(346, 388));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
        evenNome = jFormattedTextFieldEvenNome.getText();
        evenResp = jFormattedTextFieldEvenResp.getText();
        evenCmc = jFormattedTextFieldEvenCmc.getText();
        evenFim = jFormattedTextFieldEvenFim.getText();
        //evenEspaco = jComboBoxEvenEspaco.getSelectedItem().toString();
        evenCap = Integer.parseInt(jLabelEvenCap.getText());
        
        eventos.add(new Evento(evenNome, evenResp, evenCmc, evenFim, 200, espaco));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jFormattedTextFieldEvenNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldEvenNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldEvenNomeActionPerformed

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
            java.util.logging.Logger.getLogger(CadEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxEvenEspaco;
    private javax.swing.JFormattedTextField jFormattedTextFieldEvenCap;
    private javax.swing.JFormattedTextField jFormattedTextFieldEvenCmc;
    private javax.swing.JFormattedTextField jFormattedTextFieldEvenFim;
    private javax.swing.JFormattedTextField jFormattedTextFieldEvenNome;
    private javax.swing.JFormattedTextField jFormattedTextFieldEvenResp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEvenCap;
    private javax.swing.JLabel jLabelEvenCmc;
    private javax.swing.JLabel jLabelEvenEspaco;
    private javax.swing.JLabel jLabelEvenFim;
    private javax.swing.JLabel jLabelEvenNome;
    private javax.swing.JLabel jLabelEvenResp;
    private javax.swing.JPanel jPanelCadEvento;
    // End of variables declaration//GEN-END:variables
}
