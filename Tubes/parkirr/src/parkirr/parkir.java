package parkirr;

import javax.swing.JOptionPane;

public class parkir extends javax.swing.JFrame {
        int jml_harga;
        int jml_bayar;
        int bayar;
        Motor mtr;
        Mobil mbl;
        
    public parkir() {
        initComponents();
        buttonGroup1.add(motor);
        buttonGroup1.add(mobil);      
    }
    
    Motor motor1 = new Motor("123", 3000);
    Mobil mobil1 = new Mobil("123", 5000);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        psn_berhasil = new javax.swing.JOptionPane();
        eror = new javax.swing.JOptionPane();
        motor = new javax.swing.JRadioButton();
        mobil = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        plat_no = new javax.swing.JTextField();
        jml_kembalian = new javax.swing.JTextField();
        harga_parkir = new javax.swing.JTextField();
        jml_pembayaran = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        hitung = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(564, 564));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        motor.setText("Motor");
        motor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorActionPerformed(evt);
            }
        });
        getContentPane().add(motor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 60, -1));

        mobil.setText("Mobil");
        mobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobilActionPerformed(evt);
            }
        });
        getContentPane().add(mobil, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        jLabel2.setText("Plat Nomor              :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jLabel1.setText("Jenis Kendaraan       :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jLabel3.setText("Harga Parkir             : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        plat_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plat_noActionPerformed(evt);
            }
        });
        getContentPane().add(plat_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 230, 30));

        jml_kembalian.setEditable(false);
        jml_kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jml_kembalianActionPerformed(evt);
            }
        });
        getContentPane().add(jml_kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 170, 30));

        harga_parkir.setEditable(false);
        harga_parkir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harga_parkirActionPerformed(evt);
            }
        });
        getContentPane().add(harga_parkir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 230, 30));

        jml_pembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jml_pembayaranActionPerformed(evt);
            }
        });
        getContentPane().add(jml_pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 230, 30));

        jLabel5.setText("Jumlah Kembalian   :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        jButton2.setText("Bayar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, -1, -1));

        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });
        getContentPane().add(hitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, -1));

        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, -1, -1));

        jLabel4.setText("PARKIRAN PASAR SEGAR");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 150, 20));

        jLabel7.setText("Jumlah Pembayaran :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\ROG STRIX\\Downloads\\Desain tanpa judul (1).png")); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -7, 590, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void motorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorActionPerformed

        harga_parkir.setText(String.valueOf(motor1.getBiayaParkirMotor()));
    }//GEN-LAST:event_motorActionPerformed

    private void plat_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plat_noActionPerformed

    }//GEN-LAST:event_plat_noActionPerformed

    private void jml_kembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jml_kembalianActionPerformed

    }//GEN-LAST:event_jml_kembalianActionPerformed

    private void harga_parkirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harga_parkirActionPerformed

    }//GEN-LAST:event_harga_parkirActionPerformed

    private void jml_pembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jml_pembayaranActionPerformed

    }//GEN-LAST:event_jml_pembayaranActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
         if (plat_no.getText().equals("") || jml_pembayaran.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Harap Isi Bagian yang Kosong");
        } else  { 
             if (jml_kembalian.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Harap Hitung Jumlah Kembalian");
        } else {
             psn_berhasil.showMessageDialog(this, "Pembayaran Untuk Plat Nomor" + " " + plat_no.getText() + (" ") + ("Berhasil"));
            plat_no.setText("");
            harga_parkir.setText("");
            jml_pembayaran.setText("");
            jml_kembalian.setText("");
            buttonGroup1.clearSelection();   
             }           
         }              
    }//GEN-LAST:event_jButton2ActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        // TODO add your handling code here:
        if (jml_pembayaran.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Masukkan Nominal Pembayaran");
        } else {
            jml_bayar = Integer.parseInt(jml_pembayaran.getText());
        jml_harga = Integer.parseInt(harga_parkir.getText());
        bayar = jml_bayar-jml_harga;
        jml_kembalian.setText(""+Integer.toString(bayar));
        }                 
    }//GEN-LAST:event_hitungActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed

        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void mobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobilActionPerformed
       
        harga_parkir.setText(String.valueOf(mobil1.getBiayaParkirMobil()));
    }//GEN-LAST:event_mobilActionPerformed

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
            java.util.logging.Logger.getLogger(parkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(parkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(parkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(parkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new parkir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JOptionPane eror;
    private javax.swing.JTextField harga_parkir;
    private javax.swing.JButton hitung;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jml_kembalian;
    private javax.swing.JTextField jml_pembayaran;
    private javax.swing.JButton keluar;
    private javax.swing.JRadioButton mobil;
    private javax.swing.JRadioButton motor;
    private javax.swing.JTextField plat_no;
    private javax.swing.JOptionPane psn_berhasil;
    // End of variables declaration//GEN-END:variables
}
