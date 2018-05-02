/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ConsultoraControle;
import controle.ContasPagarControle;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Dados;
import modelo.Situacao;

/**
 *
 * @author Professional
 */
public class formContasPagar extends javax.swing.JDialog {
    
    int estaEditando = 0;
    
    /**
     * Creates new form frmConsultoras
     */
    public formContasPagar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        desabilitarBotoes();
        desabilitarCampos();
        ConsultoraControle.preencherTabela(tabelaContaPagar, Dados.listaConsultoras);
    }
    
    private void desabilitarBotoes(){
        btnCancelar.setEnabled(false);
        btnSalvar.setEnabled(false);
        CmbBoxContaPaga.setEnabled(false);
        btnNova.setEnabled(true);
        btnEditar.setEnabled(true);
        btnFechar.setEnabled(true);
        
    }
    
    private void habilitarBotoes(){
        btnCancelar.setEnabled(true);
        btnSalvar.setEnabled(true);
        CmbBoxContaPaga.setEnabled(true);
        btnNova.setEnabled(false);
        btnEditar.setEnabled(false);
        btnFechar.setEnabled(false);
    }
    
    private void desabilitarCampos(){
        txtCodigo.setEnabled(false);
        txtDataVencimento.setEnabled(false);
        txtDescricao.setEnabled(false);
        txtParcelas.setEnabled(false);
        txtValorParcela.setEnabled(false);
        txtValorTotal.setEnabled(false);       
        txtData.setEnabled(false);
    }
    
    private void habilitarCampos(){
        txtDataVencimento.setEnabled(true);
        txtDescricao.setEnabled(true);
        txtParcelas.setEnabled(true);
        txtValorParcela.setEnabled(true);
        txtValorTotal.setEnabled(true);       
        txtData.setEnabled(true);        
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
        tabelaContaPagar = new javax.swing.JTable();
        lblCodigo = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        btnNova = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        CmbBoxContaPaga = new javax.swing.JComboBox<>();
        lblCodigo1 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        lblCodigo2 = new javax.swing.JLabel();
        lblCodigo3 = new javax.swing.JLabel();
        txtParcelas = new javax.swing.JTextField();
        lblCodigo4 = new javax.swing.JLabel();
        txtDataVencimento = new javax.swing.JTextField();
        txtValorTotal = new javax.swing.JTextField();
        lblCodigo5 = new javax.swing.JLabel();
        lblCodigo6 = new javax.swing.JLabel();
        txtValorParcela = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabelaContaPagar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigo", "Descricao", "Data Venc.", "Parcelas", "Valor Parcela"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaContaPagar.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tabelaContaPagar);
        if (tabelaContaPagar.getColumnModel().getColumnCount() > 0) {
            tabelaContaPagar.getColumnModel().getColumn(1).setResizable(false);
        }

        lblCodigo.setText("Código:");

        btnFechar.setBackground(new java.awt.Color(255, 255, 255));
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        btnNova.setBackground(new java.awt.Color(153, 255, 153));
        btnNova.setText("Nova");
        btnNova.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNovaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNovaMouseExited(evt);
            }
        });
        btnNova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(153, 255, 153));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 102, 102));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblStatus.setText("Conta Paga:");

        CmbBoxContaPaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbBoxContaPagaActionPerformed(evt);
            }
        });

        lblCodigo1.setText("Descrição:");

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        lblCodigo2.setText("Data:");

        lblCodigo3.setText("Parcelas:");

        txtParcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParcelasActionPerformed(evt);
            }
        });

        lblCodigo4.setText("Data Vencimento:");

        txtDataVencimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataVencimentoActionPerformed(evt);
            }
        });

        txtValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorTotalActionPerformed(evt);
            }
        });

        lblCodigo5.setText("Valor Total:");

        lblCodigo6.setText("Valor da Parcela:");

        txtValorParcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorParcelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNova)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFechar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCodigo4)
                        .addComponent(lblCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblCodigo1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblCodigo2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblCodigo3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(lblCodigo5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblStatus, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CmbBoxContaPaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo6))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(CmbBoxContaPaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar)
                    .addComponent(btnNova)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnNovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaActionPerformed
        habilitarCampos();
        habilitarBotoes();
        CmbBoxContaPaga.setSelectedIndex(0);
        txtDescricao.requestFocus();
    }//GEN-LAST:event_btnNovaActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(tabelaContaPagar.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null, "Nenhum registro selecionado.", "Erro", 0);
        }else{
            //Implementar: CARREGAR DEMAIS CAMPOS PARA OS Textfields
            habilitarCampos();
            habilitarBotoes();
            this.estaEditando = 1;
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        desabilitarCampos();
        desabilitarBotoes();
        this.estaEditando = 0;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(this.estaEditando==0){
            ContasPagarControle.cadastraContaPagar(txtDescricao.getText(), txtData.getText(), Integer.parseInt(txtParcelas.getText()), txtDataVencimento.getText(), Float.parseFloat(txtValorTotal.getText()), Float.parseFloat(txtValorParcela.getText()), CmbBoxContaPaga.getItemAt(CmbBoxContaPaga.getSelectedIndex()));
        }else{
            ContasPagarControle.editarContaPagar(txtDescricao.getText(), txtData.getText(), Integer.parseInt(txtParcelas.getText()), txtDataVencimento.getText(),Float.parseFloat(txtValorTotal.getText()) ,Float.parseFloat(txtValorParcela.getText()), CmbBoxContaPaga.getItemAt(CmbBoxContaPaga.getSelectedIndex()), tabelaContaPagar.getSelectedRow());
            this.estaEditando = 0;
        }
        desabilitarCampos();
        desabilitarBotoes();
        ConsultoraControle.preencherTabela(tabelaContaPagar, Dados.listaConsultoras);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void CmbBoxContaPagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbBoxContaPagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbBoxContaPagaActionPerformed

    private void btnNovaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovaMouseEntered

    }//GEN-LAST:event_btnNovaMouseEntered

    private void btnNovaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovaMouseExited

    }//GEN-LAST:event_btnNovaMouseExited

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void txtDataVencimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataVencimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataVencimentoActionPerformed

    private void txtValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorTotalActionPerformed

    private void txtValorParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorParcelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorParcelaActionPerformed

    private void txtParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParcelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParcelasActionPerformed

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
            java.util.logging.Logger.getLogger(formContasPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formContasPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formContasPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formContasPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                formContasPagar dialog = new formContasPagar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Status> CmbBoxContaPaga;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNova;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblCodigo3;
    private javax.swing.JLabel lblCodigo4;
    private javax.swing.JLabel lblCodigo5;
    private javax.swing.JLabel lblCodigo6;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTable tabelaContaPagar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDataVencimento;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtParcelas;
    private javax.swing.JTextField txtValorParcela;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}