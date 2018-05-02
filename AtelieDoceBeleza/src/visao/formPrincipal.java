/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JDialog;

/**
 *
 * @author Professional
 */
public class formPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public formPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuConsultoras = new javax.swing.JMenu();
        menuManterConsultoras = new javax.swing.JMenuItem();
        menuProdutos = new javax.swing.JMenu();
        menuManterProdutos = new javax.swing.JMenuItem();
        menuContasPagar = new javax.swing.JMenu();
        menuManterContasPagar = new javax.swing.JMenuItem();
        menuContasReceber = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Atliê Doce Beleza");
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);

        menuConsultoras.setText("Consultoras");
        menuConsultoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultorasActionPerformed(evt);
            }
        });

        menuManterConsultoras.setText("Manter Consultoras");
        menuManterConsultoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManterConsultorasActionPerformed(evt);
            }
        });
        menuConsultoras.add(menuManterConsultoras);

        jMenuBar1.add(menuConsultoras);

        menuProdutos.setText("Produtos");
        menuProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdutosActionPerformed(evt);
            }
        });

        menuManterProdutos.setText("Manter Produto");
        menuManterProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManterProdutosActionPerformed(evt);
            }
        });
        menuProdutos.add(menuManterProdutos);

        jMenuBar1.add(menuProdutos);

        menuContasPagar.setText("Contas a Pagar");
        menuContasPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuContasPagarActionPerformed(evt);
            }
        });

        menuManterContasPagar.setText("ContasPagar");
        menuManterContasPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManterContasPagarActionPerformed(evt);
            }
        });
        menuContasPagar.add(menuManterContasPagar);

        jMenuBar1.add(menuContasPagar);

        menuContasReceber.setText("Contas a Receber");
        jMenuBar1.add(menuContasReceber);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuConsultorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultorasActionPerformed

    }//GEN-LAST:event_menuConsultorasActionPerformed

    private void menuManterConsultorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManterConsultorasActionPerformed
        formConsultoras form = new formConsultoras(this, true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setTitle("Manter Consultoras");
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_menuManterConsultorasActionPerformed


    private void menuContasPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuContasPagarActionPerformed

    }//GEN-LAST:event_menuContasPagarActionPerformed

    private void menuManterContasPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManterContasPagarActionPerformed
        formContasPagar form = new formContasPagar(this, true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setTitle("Contas a Pagar");
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_menuManterContasPagarActionPerformed

    private void menuManterProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManterProdutosActionPerformed
        formProdutos form = new formProdutos(this, true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setTitle("Produtos");
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_menuManterProdutosActionPerformed

    private void menuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuProdutosActionPerformed

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
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuConsultoras;
    private javax.swing.JMenu menuContasPagar;
    private javax.swing.JMenu menuContasReceber;
    private javax.swing.JMenuItem menuManterConsultoras;
    private javax.swing.JMenuItem menuManterContasPagar;
    private javax.swing.JMenuItem menuManterProdutos;
    private javax.swing.JMenu menuProdutos;
    // End of variables declaration//GEN-END:variables
}
