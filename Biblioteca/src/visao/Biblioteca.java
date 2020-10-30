package visao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Usuario;
import controlador.TableModel;


public class Biblioteca extends javax.swing.JFrame {
    
    public String nomeUsuario = "";
    public String endereco = "";
    public String curso = "";
    public String cidade = "";
    public String categoria = "";
    public int tempo = 0;
    public int cpf = 0;
    public String retornoNomes = "";
    
    TableModel tableModel = new TableModel();
  
    public Biblioteca() {
        initComponents();
        panCadastro.setVisible(false);
        panResultado.setVisible(false);
        tabelaCadastro.setModel(tableModel);
    }
      
    public void apagar() {
        txtNomeUsuario.setText(null);
        txtCpf.setText(null);
        txtEndereco.setText(null);
        txtCidade.setText(null);
        txtCurso.setText(null);
    }

    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaResultado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCadastrarUsuario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();
        panCadastro = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        btnCadastro = new javax.swing.JButton();
        txtCurso = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        panResultado = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaCadastro = new javax.swing.JTable();

        jLabel15.setText("jLabel15");

        txtAreaResultado.setColumns(20);
        txtAreaResultado.setRows(5);
        jScrollPane1.setViewportView(txtAreaResultado);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("BIBLIOTECA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Cadastrar novos Úsuarios");

        btnCadastrarUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCadastrarUsuario.setText("Cadastrar Úsuario");
        btnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUsuarioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Remover úsuario cadastrado");

        btnVerificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVerificar.setText("Remover");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Nome: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("CPF: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Endereço: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Cidade: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Curso: ");

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        btnCadastro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCadastro.setText("Salvar");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panCadastroLayout = new javax.swing.GroupLayout(panCadastro);
        panCadastro.setLayout(panCadastroLayout);
        panCadastroLayout.setHorizontalGroup(
            panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panCadastroLayout.createSequentialGroup()
                        .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(24, 24, 24)
                        .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeUsuario)
                            .addComponent(txtCpf)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panCadastroLayout.createSequentialGroup()
                        .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCidade)
                            .addComponent(txtCurso)))
                    .addGroup(panCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco)))
                .addGap(24, 24, 24))
            .addGroup(panCadastroLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(btnCadastro)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        panCadastroLayout.setVerticalGroup(
            panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnCadastro)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        panResultado.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));

        tabelaCadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "A", "B", "C", "D", "E"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabelaCadastro);

        javax.swing.GroupLayout panResultadoLayout = new javax.swing.GroupLayout(panResultado);
        panResultado.setLayout(panResultadoLayout);
        panResultadoLayout.setHorizontalGroup(
            panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panResultadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panResultadoLayout.setVerticalGroup(
            panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(57, 57, 57))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(38, 38, 38)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVerificar)
                            .addComponent(btnCadastrarUsuario))
                        .addGap(162, 162, 162))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastrarUsuario)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(btnVerificar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(panCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void btnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioActionPerformed
        // TODO add your handling code here:
        panCadastro.setVisible(true);
    }//GEN-LAST:event_btnCadastrarUsuarioActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // TODO add your handling code here: 
        if(tabelaCadastro.getSelectedRow() != -1){
            
            tableModel.remover(tabelaCadastro.getSelectedRow());
        }else {
            JOptionPane.showMessageDialog(null,"Selecione uma das linha \n da Tabela para ser Excluida!");
        }
        
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        
        if(txtNomeUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Por favor preencha os campos\n[NOME,OBRIGATORIO!]");
            return;
        }
        if(txtCpf.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Por favor preencha os campos\n[CPF,OBRIGATORIO!]");
            return;
        }
        if(txtEndereco.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Por favor preencha os campos\n[ENDERECO,OBRIGATORIO!]");
            return;
        }
        if (txtCidade.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Por favor preencha os campos\n[CIDADE,OBRIGATORIO!]");
            return;
        }
        if (txtCurso.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Por favor preencha os campos\n[CURSO,OBRIGATORIO!]");
            return;
        }else {
            Usuario usuario = new Usuario(nomeUsuario,cpf,endereco, cidade,categoria,tempo, curso);
            usuario.setNome(txtNomeUsuario.getText());
            usuario.setCpf(Integer.parseInt(txtCpf.getText()));
            usuario.setEndereco(txtEndereco.getText());
            usuario.setCidade(txtCidade.getText());
            usuario.setCurso(txtCurso.getText());
       
            tableModel.addRow(usuario);
            apagar(); 
            panResultado.setVisible(true);
        }

        
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

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
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarUsuario;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JPanel panCadastro;
    private javax.swing.JPanel panResultado;
    private javax.swing.JTable tabelaCadastro;
    private javax.swing.JTextArea txtAreaResultado;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNomeUsuario;
    // End of variables declaration//GEN-END:variables
    
    private ArrayList nomes = new ArrayList();
      
}

