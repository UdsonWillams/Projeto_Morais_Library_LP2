package visao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Usuario;
import controlador.TableModel;


public class Biblioteca extends javax.swing.JFrame {
    
    public String nomeUsuario = "";
    public String cpf = "";
    public String genero = "";
    public String telefone = "";
    public String email = "";
    public String endereco = "";    
    public String cidade = "";
    public String curso = "";
    public String categoria = "";
    public String vinculo = "";
    public int tempo = 0;
    
    public String retornoNomes = "";
    
    public TableModel tableModel = new TableModel();        
  
    public Biblioteca() {
        initComponents();
        panCadastro.setVisible(false);
        panResultado.setVisible(false);
        tabelaCadastro.setModel(tableModel);
        
      
        Usuario alunoOne = new Usuario("Pedro José","555.987.234-56","Masculino","(83)99958-4423","PedroJose@gmail.com",
                "Rua projetada","João Pessoa","aaaaa",3,"Aluno","Farmacia");
        Usuario alunoTwo = new Usuario("Fernanda","987.654.123-47","Feminino","(81)99116-8901","Fernanda123@hotmail.com",
                "Rua manuel justus","Recife","bbb",5,"Membro Externo", "null");
        
        tableModel.addRow(alunoOne);
        tableModel.addRow(alunoTwo);
        
        
    }
      
    public void apagar() {
        txtNomeUsuario.setText(null);
        txtCpf.setText(null);
        txtGenero.setSelectedItem(null);
        txtTelefone.setText(null);
        txtEmail.setText(null);
        txtEndereco.setText(null);
        txtCidade.setText(null);
        txtCurso.setText(null);
        selectUsuario.setSelectedItem(null);
    }

    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaResultado = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCadastrarUsuario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnVisualizar = new javax.swing.JButton();
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
        jLabel9 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JTextField();
        btnSairCadastro = new javax.swing.JButton();
        selectUsuario = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        panResultado = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaCadastro = new javax.swing.JTable();
        btnRemoveUsuario = new javax.swing.JButton();
        btnSairTabela = new javax.swing.JButton();
        btnVoltaMenu = new javax.swing.JButton();

        jLabel15.setText("jLabel15");

        txtAreaResultado.setColumns(20);
        txtAreaResultado.setRows(5);
        jScrollPane1.setViewportView(txtAreaResultado);

        jButton1.setText("jButton1");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("MORAIS LIBRARY");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Cadastrar novos Úsuarios");

        btnCadastrarUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCadastrarUsuario.setText("Cadastrar ");
        btnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUsuarioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Visualizar úsuario cadastrado");

        btnVisualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/visualizar-arquivo-32.png"))); // NOI18N
        btnVisualizar.setText("Visualizar");
        btnVisualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVisualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
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
        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-salvar-32.png"))); // NOI18N
        btnCadastro.setText("Salvar");
        btnCadastro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        txtCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCursoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Gênero:");

        txtGenero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Masculino", "Feminino", "Outros" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Tel.Celular");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Email:");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###. ###. ### - ##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnSairCadastro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSairCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-sair-32.png"))); // NOI18N
        btnSairCadastro.setText("Sair ");
        btnSairCadastro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSairCadastro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSairCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairCadastroActionPerformed(evt);
            }
        });

        selectUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Professor", "Aluno", "Membro Externo" }));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Vinculo");

        javax.swing.GroupLayout panCadastroLayout = new javax.swing.GroupLayout(panCadastro);
        panCadastro.setLayout(panCadastroLayout);
        panCadastroLayout.setHorizontalGroup(
            panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCadastroLayout.createSequentialGroup()
                        .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panCadastroLayout.createSequentialGroup()
                                .addComponent(selectUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panCadastroLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(28, 28, 28)
                                .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54))))
                    .addGroup(panCadastroLayout.createSequentialGroup()
                        .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panCadastroLayout.createSequentialGroup()
                                .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCadastroLayout.createSequentialGroup()
                                .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panCadastroLayout.createSequentialGroup()
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panCadastroLayout.createSequentialGroup()
                                        .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(panCadastroLayout.createSequentialGroup()
                                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel5)
                                                .addGap(33, 33, 33))
                                            .addGroup(panCadastroLayout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(18, 18, 18)))
                                        .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                            .addComponent(txtTelefone))))
                                .addGap(54, 54, 54))))))
            .addGroup(panCadastroLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(btnCadastro)
                .addGap(52, 52, 52)
                .addComponent(btnSairCadastro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panCadastroLayout.setVerticalGroup(
            panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCadastroLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCadastroLayout.createSequentialGroup()
                        .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(panCadastroLayout.createSequentialGroup()
                        .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(94, 94, 94)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(selectUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastro)
                    .addComponent(btnSairCadastro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        btnRemoveUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRemoveUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-excluir-32.png"))); // NOI18N
        btnRemoveUsuario.setText("Usuario");
        btnRemoveUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRemoveUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRemoveUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveUsuarioActionPerformed(evt);
            }
        });

        btnSairTabela.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSairTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-sair-32.png"))); // NOI18N
        btnSairTabela.setText("Sair");
        btnSairTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panResultadoLayout = new javax.swing.GroupLayout(panResultado);
        panResultado.setLayout(panResultadoLayout);
        panResultadoLayout.setHorizontalGroup(
            panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResultadoLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(btnRemoveUsuario)
                .addGap(44, 44, 44)
                .addComponent(btnSairTabela)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                .addContainerGap())
        );
        panResultadoLayout.setVerticalGroup(
            panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResultadoLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRemoveUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSairTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btnVoltaMenu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVoltaMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/desfazer-32.png"))); // NOI18N
        btnVoltaMenu.setText("Menu");
        btnVoltaMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVoltaMenu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVoltaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltaMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(108, 108, 108)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCadastrarUsuario)
                                    .addComponent(btnVisualizar)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(287, 287, 287)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addComponent(btnVoltaMenu)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btnCadastrarUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(btnVisualizar))))
                .addComponent(panCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void btnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioActionPerformed
        // TODO add your handling code here:
        panResultado.setVisible(false);
        panCadastro.setVisible(true);
    }//GEN-LAST:event_btnCadastrarUsuarioActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        // TODO add your handling code here:
        panCadastro.setVisible(false);
        panResultado.setVisible(true);
        
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        
        if(txtNomeUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Por favor preencha os campos\n[NOME,OBRIGATORIO!]");
            return;
        }
        if(txtCpf.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Por favor preencha os campos\n[CPF,OBRIGATORIO!]");
            return;
        }
        if(txtGenero.getSelectedItem().toString().equals("")) {
            JOptionPane.showMessageDialog(null,"Por favor Selecione a opção desejada\n[GÊNERO,OBRIGATORIO!]");
            return;
        }
        if(txtTelefone.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Por favor preencha os campos\n[TELEFONE,OBRIGATORIO!]");
            return;
        }
        if(txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Por favor preencha os campos\n[TELEFONE,OBRIGATORIO!]");
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
        }
        if (selectUsuario.getSelectedItem().toString().equals("")) {
            JOptionPane.showMessageDialog(null,"Por favor preencha os campos\n[VINCULO,OBRIGATORIO!]");
            return;
        }
        if(selectUsuario.getSelectedItem().toString().equals("Professor")) {
            JOptionPane.showMessageDialog(null,"Professor cadastrado \n LIMITE DE 8 LIVROS\n MULTA 1 REAL ");
             Usuario usuario = new Usuario(nomeUsuario, cpf, genero, telefone, email, endereco, 
                    cidade, categoria,tempo,vinculo, curso);
            
            usuario.setNome(txtNomeUsuario.getText());
            usuario.setCpf(txtCpf.getText());
            usuario.setGenero(txtGenero.getSelectedItem().toString());
            usuario.setTelefone(txtTelefone.getText());
            usuario.setEmail(txtEmail.getText());
            usuario.setEndereco(txtEndereco.getText());
            usuario.setCidade(txtCidade.getText());
            usuario.setCurso(txtCurso.getText());
            usuario.setVinculo(selectUsuario.getSelectedItem().toString());
            tableModel.addRow(usuario);
            apagar();
            return;
            
        }
        if(selectUsuario.getSelectedItem().toString().equals("Aluno")) {
            JOptionPane.showMessageDialog(null,"Aluno cadastrado\n LIMITE DE 4 LIVROS \n MULTA 3 REAIS");
             Usuario usuario = new Usuario(nomeUsuario, cpf, genero, telefone, email, endereco, 
                    cidade, categoria,tempo,vinculo, curso);
            
            usuario.setNome(txtNomeUsuario.getText());
            usuario.setCpf(txtCpf.getText());
            usuario.setGenero(txtGenero.getSelectedItem().toString());
            usuario.setTelefone(txtTelefone.getText());
            usuario.setEmail(txtEmail.getText());
            usuario.setEndereco(txtEndereco.getText());
            usuario.setCidade(txtCidade.getText());
            usuario.setCurso(txtCurso.getText());
            usuario.setVinculo(selectUsuario.getSelectedItem().toString());
            tableModel.addRow(usuario);
            apagar();
            return;
        }
        if(selectUsuario.getSelectedItem().toString().equals("Membro Externo")) {
            JOptionPane.showMessageDialog(null,"Membro Externo cadastrado \n LIMITE 3 LIVROS \n Taxa Semestral: R$ 30,00");
             Usuario usuario = new Usuario(nomeUsuario, cpf, genero, telefone, email, endereco, 
                    cidade, categoria,tempo,vinculo, curso);
            
            usuario.setNome(txtNomeUsuario.getText());
            usuario.setCpf(txtCpf.getText());
            usuario.setGenero(txtGenero.getSelectedItem().toString());
            usuario.setTelefone(txtTelefone.getText());
            usuario.setEmail(txtEmail.getText());
            usuario.setEndereco(txtEndereco.getText());
            usuario.setCidade(txtCidade.getText());
            usuario.setCurso(txtCurso.getText());
            usuario.setVinculo(selectUsuario.getSelectedItem().toString());
            tableModel.addRow(usuario);
            apagar();
        }
        else {
            Usuario usuario = new Usuario(nomeUsuario, cpf, genero, telefone, email, endereco, 
                    cidade, categoria,tempo,vinculo, curso);
            
            usuario.setNome(txtNomeUsuario.getText());
            usuario.setCpf(txtCpf.getText());
            usuario.setGenero(txtGenero.getSelectedItem().toString());
            usuario.setTelefone(txtTelefone.getText());
            usuario.setEmail(txtEmail.getText());
            usuario.setEndereco(txtEndereco.getText());
            usuario.setCidade(txtCidade.getText());
            usuario.setCurso(txtCurso.getText());
            usuario.setVinculo(selectUsuario.getSelectedItem().toString());
       
            tableModel.addRow(usuario);
            apagar(); 
            
        }

        
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void txtCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCursoActionPerformed

    private void btnSairCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairCadastroActionPerformed
        // TODO add your handling code here:
        panCadastro.setVisible(false);
    }//GEN-LAST:event_btnSairCadastroActionPerformed

    private void btnRemoveUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveUsuarioActionPerformed
        // TODO add your handling code here:
        
         if(tabelaCadastro.getSelectedRow() != -1){
            
            tableModel.remover(tabelaCadastro.getSelectedRow());
        }else {
            JOptionPane.showMessageDialog(null,"Selecione uma das linha \n da Tabela para ser Excluida!");
        }
    }//GEN-LAST:event_btnRemoveUsuarioActionPerformed

    private void btnSairTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairTabelaActionPerformed
        // TODO add your handling code here:
        panResultado.setVisible(false);
    }//GEN-LAST:event_btnSairTabelaActionPerformed

    private void btnVoltaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltaMenuActionPerformed
        // TODO add your handling code here:
        new TelaPrincipalAdmin().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnVoltaMenuActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

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
    private javax.swing.JButton btnRemoveUsuario;
    private javax.swing.JButton btnSairCadastro;
    private javax.swing.JButton btnSairTabela;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JButton btnVoltaMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel panCadastro;
    private javax.swing.JPanel panResultado;
    private javax.swing.JComboBox<String> selectUsuario;
    private javax.swing.JTable tabelaCadastro;
    private javax.swing.JTextArea txtAreaResultado;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JComboBox<String> txtGenero;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    
    private ArrayList nomes = new ArrayList();
      
}

