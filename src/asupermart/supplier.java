package asupermart;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class supplier extends javax.swing.JFrame {

    /**
     * Creates new form supplier
     */
    public supplier() {
        initComponents();
        KosongForm();
        TampilData();
    }

    
    public void KosongForm() {
        txtIdSupplier.setEditable(true);
        txtIdSupplier.setText(null);
        txtNamaSupplier.setText(null);
        txtTelepon.setText(null);
        jTextAreaAlamat.setText(null);
        jDateChooserSupplier.setCalendar(null);
    }
    
    public void TampilData(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("ID Supplier");
        model.addColumn("Nama Supplier");
        model.addColumn("Telepon");
        model.addColumn("Alamat");
        model.addColumn("Tanggal");
        
        //Menampilkan data pada database ke dalam table
        try {
            int no=1;
            String sql="SELECT * FROM supplier";
            java.sql.Connection conn=(Connection)Konfig.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[] {
                    no++,
                    res.getString(1),
                    res.getString(2),
                    res.getString(3),
                    res.getString(4),
                    res.getString(5)
                            });
                }
            jTable2.setModel(model);
            
            } catch(SQLException e) {
                System.out.println("Error "+e.getMessage());
        }
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
        jPanel2 = new javax.swing.JPanel();
        btnDashboard = new javax.swing.JButton();
        btnBarang = new javax.swing.JButton();
        btnTransaksi = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        btnPembeli = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblJudul = new javax.swing.JLabel();
        lblTanggal = new javax.swing.JLabel();
        lblIdSupplier = new javax.swing.JLabel();
        lblNamaSupplier = new javax.swing.JLabel();
        lblTelepon = new javax.swing.JLabel();
        lblAlamat = new javax.swing.JLabel();
        jDateChooserSupplier = new com.toedter.calendar.JDateChooser();
        txtIdSupplier = new javax.swing.JTextField();
        txtNamaSupplier = new javax.swing.JTextField();
        txtTelepon = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaAlamat = new javax.swing.JTextArea();
        btnEdit = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 102)));

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        btnDashboard.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btnDashboard.setText("Dashboard");
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnBarang.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btnBarang.setText("Barang");
        btnBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarangActionPerformed(evt);
            }
        });

        btnTransaksi.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btnTransaksi.setText("Transaksi");
        btnTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaksiActionPerformed(evt);
            }
        });

        btnKeluar.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        btnPembeli.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btnPembeli.setText("Pembeli");
        btnPembeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPembeliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnPembeli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDashboard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTransaksi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnKeluar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(82, 82, 82))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(btnDashboard)
                .addGap(18, 18, 18)
                .addComponent(btnBarang)
                .addGap(18, 18, 18)
                .addComponent(btnPembeli)
                .addGap(18, 18, 18)
                .addComponent(btnTransaksi)
                .addGap(18, 18, 18)
                .addComponent(btnKeluar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));

        lblJudul.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        lblJudul.setText("DATA SUPPLIER");

        lblTanggal.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblTanggal.setText("Tanggal Pengiriman");

        lblIdSupplier.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblIdSupplier.setText("ID Supplier");

        lblNamaSupplier.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblNamaSupplier.setText("Nama Supplier");

        lblTelepon.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblTelepon.setText("Telepon");

        lblAlamat.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblAlamat.setText("Alamat");

        txtIdSupplier.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txtNamaSupplier.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        txtTelepon.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        btnSimpan.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jTextAreaAlamat.setColumns(20);
        jTextAreaAlamat.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jTextAreaAlamat.setRows(5);
        jScrollPane2.setViewportView(jTextAreaAlamat);

        btnEdit.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnBatal.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnTambah.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(lblJudul))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(btnTambah)
                        .addGap(56, 56, 56)
                        .addComponent(btnEdit)
                        .addGap(71, 71, 71)
                        .addComponent(btnBatal)
                        .addGap(61, 61, 61)
                        .addComponent(btnHapus))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTanggal)
                            .addComponent(lblNamaSupplier)
                            .addComponent(lblIdSupplier)
                            .addComponent(lblTelepon)
                            .addComponent(lblAlamat))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSimpan)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtIdSupplier)
                                .addComponent(txtNamaSupplier)
                                .addComponent(txtTelepon)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                                .addComponent(jDateChooserSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(lblJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdSupplier))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNamaSupplier))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelepon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblAlamat)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addComponent(jDateChooserSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSimpan)
                .addGap(54, 54, 54)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnBatal)
                    .addComponent(btnHapus)
                    .addComponent(btnTambah))
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1193, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        
        String dob=""+jDateChooserSupplier.getDate(); 
        SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            String sql="INSERT INTO supplier VALUES('"+txtIdSupplier.getText()+"',"
                    + "'"+txtNamaSupplier.getText()+"',"
                    + "'"+txtTelepon.getText()+"',"
                    + "'"+jTextAreaAlamat.getText()+"',"
                    + "'"+Date_Format.format(jDateChooserSupplier.getDate())+"')";
            
            
            java.sql.Connection conn=(Connection)Konfig.configDB();
            java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Simpan Data Baru Berhasil");
            TampilData();
            KosongForm();
                    
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaksiActionPerformed
        new transaksi().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTransaksiActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        KosongForm();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        
        
        txtIdSupplier.setEditable(false);
        
        int baris=jTable2.rowAtPoint(evt.getPoint());
        String id_supplier=jTable2.getValueAt(baris, 1).toString();
        txtIdSupplier.setText(id_supplier);
        String nama_supplier=jTable2.getValueAt(baris, 2).toString();
        txtNamaSupplier.setText(nama_supplier);
        String telp=jTable2.getValueAt(baris, 3).toString();
        txtTelepon.setText(telp);
        String alamat=jTable2.getValueAt(baris, 4).toString();
        jTextAreaAlamat.setText(alamat);
        
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String dob=""+jDateChooserSupplier.getDate(); 
        SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            String sql="UPDATE supplier SET id_supplier='"+txtIdSupplier.getText()+"',"
                    + "nama_supplier='"+txtNamaSupplier.getText()+"',"
                    + "telepon='"+txtTelepon.getText()+"',"
                    + "alamat='"+jTextAreaAlamat.getText()+"',"
                    + "tanggal='"+Date_Format.format(jDateChooserSupplier.getDate())+"' WHERE id_supplier='"+txtIdSupplier.getText()+"'";
            
          
            java.sql.Connection conn=(Connection)Konfig.configDB();
            java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Update Data Berhasil");
            TampilData();
            KosongForm();
        }
        catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
            String sql="DELETE FROM supplier WHERE id_supplier='"+txtIdSupplier.getText()+"'";
            
            java.sql.Connection conn=(Connection)Konfig.configDB();
            java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
            TampilData();
            KosongForm();
        }
        catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        KosongForm();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarangActionPerformed
        new menu_utama().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBarangActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        new dashboard().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnPembeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPembeliActionPerformed
        new pembeli().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPembeliActionPerformed

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
            java.util.logging.Logger.getLogger(supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBarang;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnPembeli;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTransaksi;
    private com.toedter.calendar.JDateChooser jDateChooserSupplier;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextAreaAlamat;
    private javax.swing.JLabel lblAlamat;
    private javax.swing.JLabel lblIdSupplier;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblNamaSupplier;
    private javax.swing.JLabel lblTanggal;
    private javax.swing.JLabel lblTelepon;
    private javax.swing.JTextField txtIdSupplier;
    private javax.swing.JTextField txtNamaSupplier;
    private javax.swing.JTextField txtTelepon;
    // End of variables declaration//GEN-END:variables

    
}
