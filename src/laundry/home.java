/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

import java.awt.Desktop;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author INDES
 */
public class home extends javax.swing.JFrame {
    
    private static final DateTimeFormatter smpdtfmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDateTime tglsekarang = LocalDateTime.now();
    private final String ltanggal = smpdtfmt.format(tglsekarang);

    String pel;
    private int xx;
    private int xy;

    public home(String parameter){
        initComponents();
        wel.setText(parameter);
        }
    /**
     * Creates new form home
     */
   
    public home() {
        initComponents();
        
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        wel = new javax.swing.JLabel();
        tanggalnya = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        pelanggan = new javax.swing.JMenu();
        jenis_cucian = new javax.swing.JMenu();
        penerimaan = new javax.swing.JMenu();
        transaksi = new javax.swing.JMenu();
        laporan = new javax.swing.JMenu();
        tentang = new javax.swing.JMenu();
        exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setBackground(new java.awt.Color(255, 204, 0));
        setLocation(new java.awt.Point(321, 74));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        wel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wel.setText(".");

        tanggalnya.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tanggalnya.setForeground(new java.awt.Color(204, 0, 0));
        tanggalnya.setText("tgl");

        jLabel3.setBackground(new java.awt.Color(51, 255, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Jl. Raya Sukowati No 20. Sragen. Jawa-Tengah");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(wel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tanggalnya)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1015, 1015, 1015))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanggalnya)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(wel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Californian FB", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Laundry YUSNITA");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundry/Icon/icon mesin2.jpeg"))); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 153));

        pelanggan.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 153)));
        pelanggan.setText("Pelanggan");
        pelanggan.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        pelanggan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pelanggan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pelanggan.setIconTextGap(8);
        pelanggan.setMaximumSize(new java.awt.Dimension(153, 32767));
        pelanggan.setPreferredSize(new java.awt.Dimension(119, 60));
        pelanggan.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                pelangganMenuSelected(evt);
            }
        });
        pelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pelangganMousePressed(evt);
            }
        });
        jMenuBar1.add(pelanggan);

        jenis_cucian.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 153)));
        jenis_cucian.setText("Jenis Cucian");
        jenis_cucian.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jenis_cucian.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jenis_cucian.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jenis_cucian.setIconTextGap(8);
        jenis_cucian.setMaximumSize(new java.awt.Dimension(160, 32767));
        jenis_cucian.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jenis_cucianMenuSelected(evt);
            }
        });
        jenis_cucian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jenis_cucianMousePressed(evt);
            }
        });
        jMenuBar1.add(jenis_cucian);

        penerimaan.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 153)));
        penerimaan.setText("Order Masuk");
        penerimaan.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        penerimaan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        penerimaan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        penerimaan.setIconTextGap(8);
        penerimaan.setMargin(new java.awt.Insets(0, 3, 0, 0));
        penerimaan.setMaximumSize(new java.awt.Dimension(160, 32767));
        penerimaan.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                penerimaanMenuSelected(evt);
            }
        });
        penerimaan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                penerimaanMousePressed(evt);
            }
        });
        jMenuBar1.add(penerimaan);

        transaksi.setBackground(new java.awt.Color(204, 255, 153));
        transaksi.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 153)));
        transaksi.setText("Transaksi");
        transaksi.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        transaksi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        transaksi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        transaksi.setIconTextGap(8);
        transaksi.setMaximumSize(new java.awt.Dimension(160, 32767));
        transaksi.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
                transaksiMenuCanceled(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                transaksiMenuSelected(evt);
            }
        });
        transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                transaksiMousePressed(evt);
            }
        });
        jMenuBar1.add(transaksi);

        laporan.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 153)));
        laporan.setText("Laporan");
        laporan.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        laporan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laporan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        laporan.setIconTextGap(8);
        laporan.setMaximumSize(new java.awt.Dimension(160, 32767));
        laporan.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                laporanMenuSelected(evt);
            }
        });
        laporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                laporanMousePressed(evt);
            }
        });
        jMenuBar1.add(laporan);

        tentang.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 153)));
        tentang.setText("Tentang");
        tentang.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        tentang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tentang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tentang.setIconTextGap(8);
        tentang.setMaximumSize(new java.awt.Dimension(160, 32767));
        tentang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tentangMousePressed(evt);
            }
        });
        jMenuBar1.add(tentang);

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 153)));
        exit.setText("Keluar");
        exit.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit.setIconTextGap(8);
        exit.setMaximumSize(new java.awt.Dimension(160, 32767));
        exit.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                exitMenuSelected(evt);
            }
        });
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenuBar1.add(exit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(135, 135, 135)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        
    }//GEN-LAST:event_exitActionPerformed

    private void exitMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_exitMenuSelected
        
    }//GEN-LAST:event_exitMenuSelected

    private void pelangganMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_pelangganMenuSelected
        
    }//GEN-LAST:event_pelangganMenuSelected

    private void jenis_cucianMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jenis_cucianMenuSelected
         
    }//GEN-LAST:event_jenis_cucianMenuSelected

    private void penerimaanMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_penerimaanMenuSelected
        
    }//GEN-LAST:event_penerimaanMenuSelected

    private void transaksiMenuCanceled(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_transaksiMenuCanceled
        
    }//GEN-LAST:event_transaksiMenuCanceled

    private void laporanMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_laporanMenuSelected
        
    }//GEN-LAST:event_laporanMenuSelected

    private void transaksiMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_transaksiMenuSelected
        
    }//GEN-LAST:event_transaksiMenuSelected

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tanggalnya.setText(ltanggal);
        
    }//GEN-LAST:event_formWindowOpened

    private void pelangganMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pelangganMousePressed
        this.setVisible(true);
        new pelanggan().setVisible(true);
    }//GEN-LAST:event_pelangganMousePressed

    private void jenis_cucianMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jenis_cucianMousePressed
        this.setVisible(true);
        new jenis_cucian().setVisible(true);
    }//GEN-LAST:event_jenis_cucianMousePressed

    private void penerimaanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_penerimaanMousePressed
        this.setVisible(true);
        new penerimaan().setVisible(true);
    }//GEN-LAST:event_penerimaanMousePressed

    private void transaksiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaksiMousePressed
        this.setVisible(true);
        new transaksi().setVisible(true);
    }//GEN-LAST:event_transaksiMousePressed

    private void laporanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laporanMousePressed
        if(Desktop.isDesktopSupported()){
            try{
                Desktop.getDesktop().browse(new URL("http://localhost/Laundry/laporan.php").toURI());
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_laporanMousePressed

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        int confirm = JOptionPane.showConfirmDialog(this,
           "Konfirmasi Keluar Aplikasi",
            "Yakin untuk keluar dari program",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

                if (confirm == JOptionPane.YES_OPTION) {
                 System.exit(0);
        }
    }//GEN-LAST:event_exitMousePressed

    private void tentangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tentangMousePressed
        JOptionPane.showMessageDialog(this,
           "-TUGAS PEMROGRAMAN OPEN SOURCE\n",
           "DESY YUSNITA",
                JOptionPane.YES_OPTION);

    }//GEN-LAST:event_tentangMousePressed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_jPanel1MouseDragged

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu jenis_cucian;
    private javax.swing.JMenu laporan;
    private javax.swing.JMenu pelanggan;
    private javax.swing.JMenu penerimaan;
    private javax.swing.JLabel tanggalnya;
    private javax.swing.JMenu tentang;
    private javax.swing.JMenu transaksi;
    public static javax.swing.JLabel wel;
    // End of variables declaration//GEN-END:variables

}
