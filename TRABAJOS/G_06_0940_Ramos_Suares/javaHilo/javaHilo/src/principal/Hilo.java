
package principal;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Hilo extends javax.swing.JFrame {

    
 
   
    public Hilo() {
        initComponents();
        Hora hilo = new Hora(lblHora);
        hilo.start();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHora = new javax.swing.JLabel();
        txtPalabra = new javax.swing.JTextField();
        btnUno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("THREADS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHora.setForeground(new java.awt.Color(51, 51, 255));
        lblHora.setText("Reloj");
        getContentPane().add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 140, 20));

        txtPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPalabraActionPerformed(evt);
            }
        });
        getContentPane().add(txtPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 170, 30));

        btnUno.setText("OK");
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });
        getContentPane().add(btnUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 160, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Reloj:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 50, 20));

        jToggleButton1.setText("EXIT");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPalabraActionPerformed
        javax.swing.JOptionPane.showMessageDialog(this, "Su  palabra es: "+txtPalabra.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPalabraActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
         javax.swing.JOptionPane.showMessageDialog(this, "Su  palabra es: "+txtPalabra.getText());
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnUnoActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Hilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hilo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblHora;
    private javax.swing.JTextField txtPalabra;
    // End of variables declaration//GEN-END:variables
}
