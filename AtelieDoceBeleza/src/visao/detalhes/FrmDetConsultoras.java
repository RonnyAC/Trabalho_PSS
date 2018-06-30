/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.detalhes;

import controle.ConsultoraControle;
import java.awt.Component;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Consultora;
import modelo.Status;

/**
 *
 * @author Professional
 */
public class FrmDetConsultoras extends javax.swing.JDialog {

    private Component componente;
    int estaEditando = 0;

    /**
     * Creates new form frmConsultoras
     *
     * @param parent
     * @param modal
     */
    public FrmDetConsultoras(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        desabilitarCampos();
        desabilitaBotoes();
        //ConsultoraControle.preencherTabela(tabelaConsultoras, Dados.listaConsultoras);
    }

    public void preencheCampos(int id) {
        Consultora consultora = ConsultoraControle.getConsultoraPorCodigo(id);

        txtCodigo.setText(consultora.getCodigo().toString());
        txtNome.setText(consultora.getNome());
        txtCpf.setText(consultora.getCpf());
        txtCodSite.setText(consultora.getCodSite());
        txtDataNascimento.setText(consultora.getDataNascimento());

    }

    private void habilitaBotoes() {
        btnCancelar.setEnabled(true);
        btnSalvar.setEnabled(true);
    }

    private void desabilitaBotoes() {
        btnCancelar.setEnabled(false);
        btnSalvar.setEnabled(false);
    }

    private void desabilitarCampos() {
        txtCodigo.setEnabled(false);
        txtCodSite.setEnabled(false);
        txtCpf.setEnabled(false);
        txtDataNascimento.setEnabled(false);
        txtNome.setEnabled(false);
        txtContatos.setEnabled(false);
        cmbStatus.setEnabled(false);
    }

    private void habilitarCampos() {
        txtCodSite.setEnabled(true);
        txtCpf.setEnabled(true);
        txtDataNascimento.setEnabled(true);
        txtNome.setEnabled(true);
        txtContatos.setEnabled(true);
        cmbStatus.setEnabled(true);
    }

    public boolean validaCampos() {
        if (!(txtNome.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe o Nome da Cosnultora", "Campo Obrigatório", 0);
            txtNome.requestFocus();
            return false;
        }

        if (!(txtCpf.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe o CPF da Cosnultora", "Campo Obrigatório", 0);
            txtCpf.requestFocus();
            return false;
        }

        if (!(txtCodSite.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe o Código Romance da Cosnultora", "Campo Obrigatório", 0);
            txtCodSite.requestFocus();
            return false;
        }

        if (!(txtDataNascimento.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe a Data de Nascimento da Cosnultora", "Campo Obrigatório", 0);
            txtDataNascimento.requestFocus();
            return false;
        }

        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblCodSite = new javax.swing.JLabel();
        lblDataNascimento = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtCodSite = new javax.swing.JTextField();
        txtDataNascimento = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtContatos = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnRelatorioVendas = new javax.swing.JButton();
        lblRelatorios = new javax.swing.JLabel();
        btnRelatorioFrequencia = new javax.swing.JButton();
        btnRelatorioConfiabilidade = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCodigo.setText("Código:");

        lblNome.setText("Nome:");

        lblCpf.setText("CPF:");

        lblCodSite.setText("Cód. Site:");

        lblDataNascimento.setText("Data Nasc.:");

        txtCodigo.setText("0");
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtNome.setText("Consultora Teste");

        txtCpf.setText("062.974.125-05");

        txtCodSite.setText("999999");

        txtDataNascimento.setText("01/01/2001");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        lblStatus.setText("Status:");

        cmbStatus.setModel(new DefaultComboBoxModel<>(Status.values()));
        cmbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStatusActionPerformed(evt);
            }
        });

        jLabel1.setText("Contatos");

        txtContatos.setText("(44) 9 9999-9999");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnRelatorioVendas.setText("Vendas");

        lblRelatorios.setText("Relatórios:");

        btnRelatorioFrequencia.setText("Frequência");

        btnRelatorioConfiabilidade.setText("Confiabilidade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCpf)
                                    .addComponent(lblNome)
                                    .addComponent(lblCodSite))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome)
                                    .addComponent(txtCpf)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCodSite, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtContatos, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFechar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCodigo)
                                    .addComponent(lblDataNascimento)
                                    .addComponent(lblStatus))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRelatorios)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(btnRelatorioVendas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnRelatorioFrequencia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnRelatorioConfiabilidade)))))
                        .addGap(0, 198, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataNascimento)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodSite)
                    .addComponent(txtCodSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtContatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(lblRelatorios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRelatorioVendas)
                    .addComponent(btnRelatorioFrequencia)
                    .addComponent(btnRelatorioConfiabilidade))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnFechar)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        int id = Integer.parseInt(txtCodigo.getText());
        String nome = txtNome.getText();
        String cpf = txtCpf.getText();
        String dataNascimento = txtDataNascimento.getText();
        String codSite = txtCodSite.getText();
        String cStatus = cmbStatus.getSelectedItem().toString();
        Status status;

        switch (cStatus) {
            case "ATIVA":
                status = Status.ATIVA;
                break;
            case "INATIVA":
                status = Status.INATIVA;
                break;
            default:
                status = null;
                break;
        }

        ConsultoraControle.editarConsultora(new Consultora(id, nome, cpf, codSite, dataNascimento, status));

        desabilitaBotoes();
        desabilitarCampos();
        btnEditar.setEnabled(true);
        JOptionPane.showMessageDialog(componente, "Cadastro alterado com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cmbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStatusActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        habilitarCampos();
        habilitaBotoes();
        btnEditar.setEnabled(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        desabilitaBotoes();
        desabilitarCampos();
        btnEditar.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDetConsultoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDetConsultoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDetConsultoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDetConsultoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            FrmDetConsultoras dialog = new FrmDetConsultoras(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnRelatorioConfiabilidade;
    private javax.swing.JButton btnRelatorioFrequencia;
    private javax.swing.JButton btnRelatorioVendas;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<Status> cmbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCodSite;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRelatorios;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtCodSite;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtContatos;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
