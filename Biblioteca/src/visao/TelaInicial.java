package visao;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogin = new javax.swing.JButton();
        btnSobre = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        btnLogin.setBackground(new java.awt.Color(204, 204, 204));
        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(100, 110, 100, 40);

        btnSobre.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        btnSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/informações-32.png"))); // NOI18N
        btnSobre.setText("Sobre");
        btnSobre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnSobre.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSobre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });
        getContentPane().add(btnSobre);
        btnSobre.setBounds(440, 360, 110, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seja Bem - Vindo ao Projeto Morais Library");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 210, 520, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UNIESP_LOGO.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 11, 560, 391);

        setSize(new java.awt.Dimension(606, 452));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        // TODO add your handling code here:
        Icon painel = new ImageIcon(getClass().getResource("/iconMensagem/painel-32.png"));
        JOptionPane.showMessageDialog(null,"Essa aplicação foi proposta \n "
                + "com o intuito de promover o aprendizado tendo como  \n referência ao programa já existente  \n "
                + "da UNIESP \n"
                + "Desenvolvida na linguagem JAVA \n"
                + "Professora: Dra. Alana Morais \n"
                + "Desenvolvedores: \n"
                + "Anderson Souza \n"
                + "Leonardo Donato \n"
                + "Udson Willams \n"
                + "Ano do Projeto: 2020 \n"
                + "Curso: Sistemas Para Internet \n"
                + "Periodo do curso: 2° Periodo \n","INFORMAÇÃO",JOptionPane.INFORMATION_MESSAGE,painel);
    }//GEN-LAST:event_btnSobreActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        TelaLogin telaLogin = new TelaLogin();
            telaLogin.setVisible(true);
            dispose();            
            
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSobre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
