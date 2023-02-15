/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Perpustakaan;


/**
 *
 * @author Kelompok 4 TIC P2K
 */
public class PagePinjam extends javax.swing.JFrame {

    BtMahasiswa cm = new BtMahasiswa();
    Mahasiswa mhsw = null;
   
    public PagePinjam() {
        initComponents();
        setTitle("Peminjaman Buku Perpustakaan Kelompok 4");
    }
    
    public void clearText(){
        txtNama.setText("");
        txtNim.setText("");
        txtProdi.setText("");
        txtPinjam.setText("");
        txtKembali.setText("");
        txtJudulBuku.setText("");
        txtPengarang.setText("");
        txtPenerbit.setText("");
        txtTahunTerbit.setText("");
        txtHalaman.setText("");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtNim = new javax.swing.JTextField();
        txtProdi = new javax.swing.JTextField();
        txtPinjam = new javax.swing.JTextField();
        txtKembali = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtJudulBuku = new javax.swing.JTextField();
        txtPengarang = new javax.swing.JTextField();
        txtPenerbit = new javax.swing.JTextField();
        txtTahunTerbit = new javax.swing.JTextField();
        txtHalaman = new javax.swing.JTextField();
        kode_buku = new javax.swing.JComboBox<>();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(218, 226, 182));

        jPanel1.setBackground(new java.awt.Color(204, 214, 166));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 251, 233));
        jLabel1.setText("Peminjaman Buku Perpustakaan Kelompok 4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jLabel4.setText("Nama");

        jLabel5.setText("NIM");

        jLabel6.setText("Prodi");

        jLabel7.setText("Tanggal Peminjaman");

        jLabel8.setText("Tanggal Pengembalian");

        txtKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKembaliActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(215, 233, 185));
        jTable1.setModel(cm);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel9.setText("Kode Buku");

        jLabel10.setText("Judul Buku");

        jLabel11.setText("Pengarang");

        jLabel12.setText("Penerbit");

        jLabel13.setText("Tahun terbit");

        jLabel14.setText("Halaman");

        txtJudulBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJudulBukuActionPerformed(evt);
            }
        });

        txtTahunTerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTahunTerbitActionPerformed(evt);
            }
        });

        txtHalaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHalamanActionPerformed(evt);
            }
        });

        kode_buku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih-", "B101", "B102", "B103", "B104", "B105", "B106", "B107", "B108", "B109" }));
        kode_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kode_bukuActionPerformed(evt);
            }
        });

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtKembali))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProdi))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNim))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNama)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 289, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kode_buku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJudulBuku)
                            .addComponent(txtPengarang)
                            .addComponent(txtTahunTerbit, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(txtPenerbit)
                            .addComponent(txtHalaman, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(kode_buku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtJudulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txtPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtTahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnHapus))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        Mahasiswa mahasiswa = new Mahasiswa(txtNama.getText(), txtNim.getText(), txtProdi.getText(), 
                        txtJudulBuku.getText(), txtPinjam.getText(), txtKembali.getText());
        cm.add(mahasiswa);
        clearText();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void txtTahunTerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTahunTerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTahunTerbitActionPerformed

    private void kode_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kode_bukuActionPerformed
        String kodebuku = (String)kode_buku.getSelectedItem();
        switch(kodebuku){
            case "B101" :
                txtJudulBuku.setText("Super Star Student");
                txtPengarang.setText("Ayudya Wida");
                txtPenerbit.setText("Laksana");
                txtTahunTerbit.setText("2020");
                txtHalaman.setText("172");
                break;
            case "B102" :
                txtJudulBuku.setText("Artificial Intelligence");
                txtPengarang.setText("Imam Robandi");
                txtPenerbit.setText("Andi Offset");
                txtTahunTerbit.setText("2019");
                txtHalaman.setText("564");
                break;
            case "B103" :
                txtJudulBuku.setText("Membuat Program Akuntansi dengan Ms Access VBA");
                txtPengarang.setText("Bambang Subroto");
                txtPenerbit.setText("Elex Media Komputindo");
                txtTahunTerbit.setText("2018");
                txtHalaman.setText("200");
                break;
            case "B104" :
                txtJudulBuku.setText("Rich Dad's - Increase Your Financial IQ");
                txtPengarang.setText("Robert T. Kiyosaki");
                txtPenerbit.setText("Gramedia Pustaka Utama");
                txtTahunTerbit.setText("2016");
                txtHalaman.setText("256");
                break;
            case "B105" :
                txtJudulBuku.setText("Atomic Habits: Perubahan Kecil yang Memberikan Hasil Luar Biasa");
                txtPengarang.setText("James Clear");
                txtPenerbit.setText("Gramedia Pustaka Utama");
                txtTahunTerbit.setText("2019");
                txtHalaman.setText("356");
                break;
            case "B106" :
                txtJudulBuku.setText("Pengenalan Machine Learning dengan Python");
                txtPengarang.setText("Dios Kurniawan");
                txtPenerbit.setText("Elex Media Komputindo");
                txtTahunTerbit.setText("2020");
                txtHalaman.setText("304");
                break;
            case "B107" :
                txtJudulBuku.setText("Membuat Aplikasi Antrean dengan Java NetBeans IDE 8.0.2 dan Database MySQL");
                txtPengarang.setText("Bay Haqi");
                txtPenerbit.setText("Elex Media Komputindo");
                txtTahunTerbit.setText("2017");
                txtHalaman.setText("136");
                break;
            case "B108" :
                txtJudulBuku.setText("Pedoman Praktis Pengembangan Aplikasi Web Database Menggunakan Java Server Page");
                txtPengarang.setText("Foenadioen & Samuel Prakoso");
                txtPenerbit.setText("Andi Publisher");
                txtTahunTerbit.setText("2021");
                txtHalaman.setText("306");
                break;
            case "B109" :
                txtJudulBuku.setText("Machine Learning Untuk Pemula");
                txtPengarang.setText("Irwansyah Saputra & Dinar Ajeng Kristiyanti");
                txtPenerbit.setText("Informatika");
                txtTahunTerbit.setText("2022");
                txtHalaman.setText("413");
                break;
            default :
                txtJudulBuku.setText("");
                txtPengarang.setText("");
                txtPenerbit.setText("");
                txtTahunTerbit.setText("");
                break;
        }
    }//GEN-LAST:event_kode_bukuActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        Mahasiswa mm = cm.getMhs(jTable1.getSelectedRow());
        cm.remove(mm);
    }//GEN-LAST:event_btnHapusActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKembaliActionPerformed

    private void txtJudulBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJudulBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJudulBukuActionPerformed

    private void txtHalamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHalamanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHalamanActionPerformed

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
            java.util.logging.Logger.getLogger(PagePinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagePinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagePinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagePinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagePinjam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> kode_buku;
    private javax.swing.JTextField txtHalaman;
    private javax.swing.JTextField txtJudulBuku;
    private javax.swing.JTextField txtKembali;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNim;
    private javax.swing.JTextField txtPenerbit;
    private javax.swing.JTextField txtPengarang;
    private javax.swing.JTextField txtPinjam;
    private javax.swing.JTextField txtProdi;
    private javax.swing.JTextField txtTahunTerbit;
    // End of variables declaration//GEN-END:variables
}
