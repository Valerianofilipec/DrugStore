/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestaoPessoal;
/**
 *
 * @author Valeriano Filipe Calologio
 */
public class TelaGestaoPessoal extends javax.swing.JFrame {

    /**
     * Creates new form TelaGestaoPessoal
     */
    public TelaGestaoPessoal() {
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

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemNovoEmpregado = new javax.swing.JMenuItem();
        jMenuItemEditarEmpregado = new javax.swing.JMenuItem();
        jMenuItemEliminarEmpregado = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemTerminarSessao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(290, -10, 10, 10);

        jMenu1.setText("Empregado");

        jMenuItemNovoEmpregado.setText("Novo");
        jMenuItemNovoEmpregado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovoEmpregadoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemNovoEmpregado);

        jMenuItemEditarEmpregado.setText("Editar");
        jMenuItemEditarEmpregado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarEmpregadoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemEditarEmpregado);

        jMenuItemEliminarEmpregado.setText("Eliminar");
        jMenuItemEliminarEmpregado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarEmpregadoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemEliminarEmpregado);

        jMenuBar1.add(jMenu1);

        jMenuSair.setText("Sair");

        jMenuItemTerminarSessao.setText("Terminar a Sessão");
        jMenuSair.add(jMenuItemTerminarSessao);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(642, 444));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemEliminarEmpregadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarEmpregadoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuItemEliminarEmpregadoActionPerformed

    private void jMenuItemNovoEmpregadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovoEmpregadoActionPerformed
        new CadastroEmpregado().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemNovoEmpregadoActionPerformed

    private void jMenuItemEditarEmpregadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarEmpregadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemEditarEmpregadoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGestaoPessoal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGestaoPessoal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGestaoPessoal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGestaoPessoal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGestaoPessoal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemEditarEmpregado;
    private javax.swing.JMenuItem jMenuItemEliminarEmpregado;
    private javax.swing.JMenuItem jMenuItemNovoEmpregado;
    private javax.swing.JMenuItem jMenuItemTerminarSessao;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}