/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mp32;

/**
 *
 * @author User
 */
public class Intro extends javax.swing.JFrame {
    
    public Intro() {
        
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

        jLabel22 = new javax.swing.JLabel();
        Intro = new javax.swing.JLabel();
        Avatar = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/bloco.png"))); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel22MouseReleased(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vinheitor Habbid");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(366, 236));
        setName("Tela1"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        Intro.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        Intro.setForeground(new java.awt.Color(102, 102, 102));
        Intro.setText("<html>Olá meu Nick é Hadia sou locutor da radio Habbid desde<br/> 8 de Outubro de 2010, a muito tempo queria deixar algo<br/> para ajudar todos os novos locutores que estão nessa vida<br/>de Fãsite ou até mesmo WeRádio, então fica aqui o meu<br/>programa que toca vinhetas para te ajudar.<br/><br/> Desenvolvido e Idealizado por: Hadia<br/>Design por: Rym<br/>Ajuda externa: Josenil Ezequiel<br/> Qualquer Duvida ou problema:<br/><href>www.habbid.com.br/home/hadia</href></html>");
        Intro.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(Intro);
        Intro.setBounds(80, 20, 1618, 170);

        Avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/avatarimage.png"))); // NOI18N
        getContentPane().add(Avatar);
        Avatar.setBounds(10, 30, 64, 120);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/boxe hadia.fw.png"))); // NOI18N
        Fundo.setMaximumSize(new java.awt.Dimension(369, 209));
        Fundo.setMinimumSize(new java.awt.Dimension(369, 209));
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 370, 210);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel22MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseReleased
    
    }//GEN-LAST:event_jLabel22MouseReleased

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
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Intro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Avatar;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Intro;
    private javax.swing.JLabel jLabel22;
    // End of variables declaration//GEN-END:variables
}
