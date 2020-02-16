/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drugstoresystem;

//import static drugstoresystem.DrugStoreSystem.registoAtividade;
import static drugstoresystem.DrugStoreSystem.registoAtividade;
import static drugstoresystem.DrugStoreSystem.registoHistorico;
import static drugstoresystem.DrugStoreSystem.validarFicheiro;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Valeriano Filipe Calologio
 */
public class TelaLogin extends javax.swing.JFrame{
    
    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
        //Permite verificar o ficheiros de registos antes abrir a telaLogin
        validarFicheiro(registoHistorico);
        validarFicheiro(registoAtividade);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSair = new javax.swing.JButton();
        jButtonEntrar = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelFundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(340, 170, 80, 29);

        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar);
        jButtonEntrar.setBounds(250, 170, 90, 29);

        jLabelUsuario.setText("Usuário:");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(190, 100, 60, 30);

        jLabelSenha.setText("Senha:");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(190, 130, 50, 20);

        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });
        jPasswordFieldSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(250, 130, 170, 26);

        jTextFieldUsuario.setToolTipText("Nº de Funcionário");
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(250, 100, 170, 30);

        jLabelFundoLogin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundoTelaLogin.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoLogin);
        jLabelFundoLogin.setBounds(0, 0, 500, 250);

        setSize(new java.awt.Dimension(492, 264));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        //validar os dados inseridos
        
         
        if (validarLogin(jTextFieldUsuario.getText(), jPasswordFieldSenha.getText())){
            //Abrir TelaPrincipal e fechar a TelaLogin
            new TelaPrincipal().setVisible(true);
            dispose();
            //Guardar inicio de atividade
            try{
            FileWriter registoAtiv = new FileWriter(registoAtividade.getName(), true);
            BufferedWriter entrada = new BufferedWriter(registoAtiv);
            entrada.newLine();
            entrada.write(new Date().toString()+";"+linha[0]+";"+linha[2]+"; Entrada");
            entrada.close();
            }
            catch(IOException ex){
            JOptionPane.showConfirmDialog(rootPane, "Foi impssivel registar Entrada!");
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Usuário ou Senha Incorrecta");
        }
        
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        //fechar sistema
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed
        // chamar metodo para entrar no sistema, apenas clicando tecla Enter
        jButtonEntrarActionPerformed(evt);
    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    private void jPasswordFieldSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenhaKeyPressed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelFundoLogin;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
    //Array String Estatica para guardar(do ficheiro de registoHistorico) as informações de usuario logado
    public static String[] linha;
    
    public boolean validarLogin(String usuario, String senha) {
        try {
            Scanner leitor = new Scanner(registoHistorico);
            leitor.nextLine();
            do{
                linha = leitor.nextLine().split(";");
                //Condição que verifica o Nº de Funcionário do Usuario e se é um Funcionário ativo
                if (usuario.equals(linha[0]) && linha[5].equalsIgnoreCase("true")){
                    //verificando caso seja nulo também!
                    return(senha.equals(linha[1]));
                }
            }while(leitor.hasNextLine());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Erro em ler o Ficheiro *.CSV");
        }
        return false;
    }
}