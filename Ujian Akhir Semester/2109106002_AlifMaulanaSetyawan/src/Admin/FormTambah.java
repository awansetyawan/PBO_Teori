package Admin;

import Koneksi.Koneksi;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

public class FormTambah extends javax.swing.JFrame {
    
    Connection conn;
    Statement stmt;
    
    public FormTambah() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rbLaki = new javax.swing.JRadioButton();
        rbPerempuan = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        cbxKeahlian = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtNoHP = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(175, 211, 226));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nama");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Gender");

        buttonGroup.add(rbLaki);
        rbLaki.setText("Laki-Laki");

        buttonGroup.add(rbPerempuan);
        rbPerempuan.setText("Perempuan");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Keahlian");

        cbxKeahlian.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Software", "Hardware" }));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nomor Handphone");

        btnSimpan.setBackground(new java.awt.Color(25, 167, 206));
        btnSimpan.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.setBorder(null);
        btnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSimpanMouseClicked(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(25, 167, 206));
        btnCancel.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.setBorder(null);
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(txtNama)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbLaki)
                                .addGap(18, 18, 18)
                                .addComponent(rbPerempuan))
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(cbxKeahlian, 0, 223, Short.MAX_VALUE)
                            .addComponent(txtNoHP)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbLaki)
                    .addComponent(rbPerempuan))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxKeahlian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNoHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseClicked
        String Nama, Gender, Keahlian, NomorHandphone;
        
        Nama = txtNama.getText();
        
        ButtonModel selectedModel = buttonGroup.getSelection();
        if (selectedModel == rbLaki.getModel()) {
            // Radio button "Laki-laki" yang dipilih
            Gender = "Laki-laki";
        } else if (selectedModel == rbPerempuan.getModel()) {
            // Radio button "Perempuan" yang dipilih
            Gender = "Perempuan";
        }else{
            Gender = "";
        }
        
        Keahlian = cbxKeahlian.getSelectedItem().toString();
        
        NomorHandphone = txtNoHP.getText();
        
        try {
            conn = Koneksi.getConnection();
            stmt = conn.createStatement();
            
            if (Nama.isEmpty()) {
                txtNama.requestFocus();
                JOptionPane.showMessageDialog(this, "Nama Tidak Boleh Kosong.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(selectedModel == null){
                JOptionPane.showMessageDialog(this, "Pilih Gender.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if (Keahlian.isEmpty()) {
                cbxKeahlian.requestFocus();
                JOptionPane.showMessageDialog(this, "Keahlian Tidak Boleh Kosong.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if (NomorHandphone.isEmpty()) {
                txtNoHP.requestFocus();
                JOptionPane.showMessageDialog(this, "Nomor Handphone Tidak Boleh Kosong.", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                
                // Query Simpan
                String sql = "INSERT INTO DataTeknisi (Nama, Gender, Keahlian, NoHp) VALUE('%s', '%s', '%s', '%s')";
                sql = String.format(sql, Nama, Gender, Keahlian, NomorHandphone);

                // Eksekusi
                stmt.execute(sql);

                JOptionPane.showMessageDialog(this, "Data Telah Berhasil Di Simpan!", "Informasi", JOptionPane.INFORMATION_MESSAGE); 

                setVisible(false);
                
            }
        
        }catch (Exception Error) {
            System.out.println("" + Error);
        }

    }//GEN-LAST:event_btnSimpanMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
      
        setVisible(false);
    }//GEN-LAST:event_btnCancelMouseClicked

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
            java.util.logging.Logger.getLogger(FormTambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTambah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSimpan;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JComboBox<String> cbxKeahlian;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbLaki;
    private javax.swing.JRadioButton rbPerempuan;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoHP;
    // End of variables declaration//GEN-END:variables
}
