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
public class Tela8 extends javax.swing.JFrame {
    Wav Wav = new Wav();
    MetodoVinhetasMp3 Mp3 = new MetodoVinhetasMp3();
    LeitorDocumento L = new LeitorDocumento();
    LeitorBancoVht X = new LeitorBancoVht();

    public Tela8() {
        
        initComponents();
        X.LerBanco();
        l1.setText("  "+X.a8t1);
        l2.setText("  "+X.a8t2);
        l3.setText("  "+X.a8t3);
        l4.setText("  "+X.a8t4);
        l5.setText("  "+X.a8t5);
        l6.setText("  "+X.a8t6);
        l7.setText("  "+X.a8t7);
        l8.setText("  "+X.a8t8);
        l9.setText("  "+X.a8t9);
        l10.setText("  "+X.a8t10);
        l11.setText("  "+X.a8t11);
        l12.setText("  "+X.a8t12);
        l13.setText("  "+X.a8t13);
        l14.setText("  "+X.a8t14);
        l15.setText("  "+X.a8t15);
        l16.setText("  "+X.a8t16);
        
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
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        l13 = new javax.swing.JLabel();
        l14 = new javax.swing.JLabel();
        l15 = new javax.swing.JLabel();
        l16 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        b5 = new javax.swing.JLabel();
        b6 = new javax.swing.JLabel();
        b7 = new javax.swing.JLabel();
        b8 = new javax.swing.JLabel();
        b9 = new javax.swing.JLabel();
        b10 = new javax.swing.JLabel();
        b11 = new javax.swing.JLabel();
        b12 = new javax.swing.JLabel();
        b13 = new javax.swing.JLabel();
        b14 = new javax.swing.JLabel();
        b15 = new javax.swing.JLabel();
        b16 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Esq = new javax.swing.JLabel();
        Dir = new javax.swing.JLabel();
        pag = new javax.swing.JLabel();
        pause = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/bloco.png"))); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel22MouseReleased(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vinheitor Habbid");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(366, 236));
        setName("Tela1"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        l1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        l1.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(l1);
        l1.setBounds(70, 20, 50, 20);

        l2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        l2.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(l2);
        l2.setBounds(10, 20, 50, 20);

        l3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        l3.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(l3);
        l3.setBounds(130, 20, 50, 20);

        l4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        l4.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(l4);
        l4.setBounds(190, 20, 50, 20);

        l5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        l5.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(l5);
        l5.setBounds(10, 70, 50, 20);

        l6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        l6.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(l6);
        l6.setBounds(70, 70, 50, 20);

        l7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        l7.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(l7);
        l7.setBounds(130, 70, 50, 20);

        l8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        l8.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(l8);
        l8.setBounds(190, 70, 50, 20);

        l9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        l9.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(l9);
        l9.setBounds(10, 120, 50, 20);

        l10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        l10.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(l10);
        l10.setBounds(70, 120, 50, 20);

        l11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        l11.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(l11);
        l11.setBounds(130, 120, 50, 20);

        l12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        l12.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(l12);
        l12.setBounds(190, 120, 50, 20);

        l13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        l13.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(l13);
        l13.setBounds(10, 170, 50, 20);

        l14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        l14.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(l14);
        l14.setBounds(70, 170, 50, 20);

        l15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        l15.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(l15);
        l15.setBounds(130, 170, 50, 20);

        l16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        l16.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(l16);
        l16.setBounds(190, 170, 50, 20);

        b1.setForeground(new java.awt.Color(51, 51, 51));
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/bloco.png"))); // NOI18N
        b1.setToolTipText("");
        b1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b1MouseReleased(evt);
            }
        });
        b1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                b1InputMethodTextChanged(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(70, 10, 56, 40);

        b2.setForeground(new java.awt.Color(51, 51, 51));
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/bloco.png"))); // NOI18N
        b2.setToolTipText("");
        b2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b2MouseReleased(evt);
            }
        });
        b2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                b2InputMethodTextChanged(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(10, 10, 56, 40);

        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/bloco.png"))); // NOI18N
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b3MouseReleased(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(130, 10, 56, 40);

        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/bloco.png"))); // NOI18N
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b4MouseReleased(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(190, 10, 56, 40);

        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/bloco.png"))); // NOI18N
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b5MouseReleased(evt);
            }
        });
        getContentPane().add(b5);
        b5.setBounds(10, 60, 56, 40);

        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/bloco.png"))); // NOI18N
        b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b6MouseReleased(evt);
            }
        });
        getContentPane().add(b6);
        b6.setBounds(70, 60, 56, 40);

        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/bloco.png"))); // NOI18N
        b7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b7MouseReleased(evt);
            }
        });
        getContentPane().add(b7);
        b7.setBounds(130, 60, 56, 40);

        b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/bloco.png"))); // NOI18N
        b8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b8MouseReleased(evt);
            }
        });
        getContentPane().add(b8);
        b8.setBounds(190, 60, 56, 40);

        b9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/bloco.png"))); // NOI18N
        b9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b9MouseReleased(evt);
            }
        });
        getContentPane().add(b9);
        b9.setBounds(10, 110, 56, 40);

        b10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/bloco.png"))); // NOI18N
        b10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b10MouseReleased(evt);
            }
        });
        getContentPane().add(b10);
        b10.setBounds(70, 110, 56, 40);

        b11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/bloco.png"))); // NOI18N
        b11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b11MouseReleased(evt);
            }
        });
        getContentPane().add(b11);
        b11.setBounds(130, 110, 56, 40);

        b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/bloco.png"))); // NOI18N
        b12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b12MouseReleased(evt);
            }
        });
        getContentPane().add(b12);
        b12.setBounds(190, 110, 56, 40);

        b13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/bloco.png"))); // NOI18N
        b13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b13MouseReleased(evt);
            }
        });
        getContentPane().add(b13);
        b13.setBounds(10, 160, 56, 40);

        b14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/bloco.png"))); // NOI18N
        b14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b14MouseReleased(evt);
            }
        });
        getContentPane().add(b14);
        b14.setBounds(70, 160, 56, 40);

        b15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/bloco.png"))); // NOI18N
        b15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b15MouseReleased(evt);
            }
        });
        getContentPane().add(b15);
        b15.setBounds(130, 160, 56, 40);

        b16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/bloco.png"))); // NOI18N
        b16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b16MouseReleased(evt);
            }
        });
        getContentPane().add(b16);
        b16.setBounds(190, 160, 56, 40);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/logotipo.png"))); // NOI18N
        getContentPane().add(Logo);
        Logo.setBounds(260, 10, 87, 96);

        Esq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/setaesq.png"))); // NOI18N
        Esq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                EsqMouseReleased(evt);
            }
        });
        getContentPane().add(Esq);
        Esq.setBounds(250, 110, 34, 34);

        Dir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/setadire.png"))); // NOI18N
        Dir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DirMouseReleased(evt);
            }
        });
        getContentPane().add(Dir);
        Dir.setBounds(310, 110, 34, 34);

        pag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/pagina8.png"))); // NOI18N
        getContentPane().add(pag);
        pag.setBounds(260, 170, 73, 33);

        pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/pause.png"))); // NOI18N
        pause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pauseMouseReleased(evt);
            }
        });
        getContentPane().add(pause);
        pause.setBounds(290, 140, 20, 21);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp32/imags/boxe hadia.fw.png"))); // NOI18N
        Fundo.setMaximumSize(new java.awt.Dimension(369, 209));
        Fundo.setMinimumSize(new java.awt.Dimension(369, 209));
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 370, 210);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseReleased
        Wav.Sons(X.a8l3);
        Wav.tocarWav();
        Mp3.Play(X.a8l3);
    }//GEN-LAST:event_b3MouseReleased

    private void b1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseReleased
        Wav.Sons(X.a8l1);
        Wav.tocarWav();
        Mp3.Play(X.a8l1);
    }//GEN-LAST:event_b1MouseReleased

    private void jLabel22MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseReleased
        Wav.Sons(X.a8l2);
        Wav.tocarWav();
        Mp3.Play(X.a8l2);
    }//GEN-LAST:event_jLabel22MouseReleased

    private void b6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseReleased
        Wav.Sons(X.a8l6);
        Wav.tocarWav();
        Mp3.Play(X.a8l6);
    }//GEN-LAST:event_b6MouseReleased

    private void b7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b7MouseReleased
        Wav.Sons(X.a8l7);
        Wav.tocarWav();
        Mp3.Play(X.a8l7);
    }//GEN-LAST:event_b7MouseReleased

    private void b4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseReleased
        Wav.Sons(X.a8l4);
        Wav.tocarWav();
        Mp3.Play(X.a8l4);
    }//GEN-LAST:event_b4MouseReleased

    private void b8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b8MouseReleased
        Wav.Sons(X.a8l8);
        Wav.tocarWav();
        Mp3.Play(X.a8l8);
    }//GEN-LAST:event_b8MouseReleased

    private void b9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b9MouseReleased
        Wav.Sons(X.a8l9);
        Wav.tocarWav();
        Mp3.Play(X.a8l9);
    }//GEN-LAST:event_b9MouseReleased

    private void b10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b10MouseReleased
        Wav.Sons(X.a8l10);
        Wav.tocarWav();
        Mp3.Play(X.a8l10);
    }//GEN-LAST:event_b10MouseReleased

    private void b13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b13MouseReleased
        Wav.Sons(X.a8l13);
        Wav.tocarWav();
        Mp3.Play(X.a8l13);
    }//GEN-LAST:event_b13MouseReleased

    private void b14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b14MouseReleased
        Wav.Sons(X.a8l14);
        Wav.tocarWav();
        Mp3.Play(X.a8l14);
    }//GEN-LAST:event_b14MouseReleased

    private void b15MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b15MouseReleased
        Wav.Sons(X.a8l15);
        Wav.tocarWav();
        Mp3.Play(X.a8l15);
    }//GEN-LAST:event_b15MouseReleased

    private void b11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b11MouseReleased
        Wav.Sons(X.a8l11);
        Wav.tocarWav();
        Mp3.Play(X.a8l11);
    }//GEN-LAST:event_b11MouseReleased

    private void b12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b12MouseReleased
        Wav.Sons(X.a8l12);
        Wav.tocarWav();
        Mp3.Play(X.a8l2);
    }//GEN-LAST:event_b12MouseReleased

    private void b16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b16MouseReleased
        Wav.Sons(X.a8l16);
        Wav.tocarWav();
        Mp3.Play(X.a8l16);
    }//GEN-LAST:event_b16MouseReleased

    private void b5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseReleased
        Wav.Sons(X.a8l5);
        Wav.tocarWav();
        Mp3.Play(X.a8l5);
    }//GEN-LAST:event_b5MouseReleased

    private void b1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_b1InputMethodTextChanged


    }//GEN-LAST:event_b1InputMethodTextChanged

    private void b2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseReleased
        Wav.Sons(X.a8l2);
        Wav.tocarWav();
        Mp3.Play(X.a8l2);
    }//GEN-LAST:event_b2MouseReleased

    private void b2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_b2InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_b2InputMethodTextChanged

    private void EsqMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EsqMouseReleased
Tela7 tl = new Tela7();
        tl.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_EsqMouseReleased

    private void DirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DirMouseReleased
Tela9 tl = new Tela9();
        tl.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_DirMouseReleased

    private void pauseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pauseMouseReleased
    Mp3.close();
    Wav.close();
        // TODO add your handling code here:
    }//GEN-LAST:event_pauseMouseReleased

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
            java.util.logging.Logger.getLogger(Tela8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dir;
    private javax.swing.JLabel Esq;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b10;
    private javax.swing.JLabel b11;
    private javax.swing.JLabel b12;
    private javax.swing.JLabel b13;
    private javax.swing.JLabel b14;
    private javax.swing.JLabel b15;
    private javax.swing.JLabel b16;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JLabel b5;
    private javax.swing.JLabel b6;
    private javax.swing.JLabel b7;
    private javax.swing.JLabel b8;
    private javax.swing.JLabel b9;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l14;
    private javax.swing.JLabel l15;
    private javax.swing.JLabel l16;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JLabel pag;
    private javax.swing.JLabel pause;
    // End of variables declaration//GEN-END:variables
}
