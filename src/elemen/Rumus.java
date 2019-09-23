/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elemen;

import javax.swing.JOptionPane;

/**
 *
 * @author nishom
 */
public class Rumus extends javax.swing.JFrame {

    /**
     * Creates new form Rumus
     */
    public Rumus() {
        initComponents();
        //testLAF();
    }
    
    private void testLAF(){
        for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
            System.out.println(""+info.getName());
            System.out.println("===============");
            System.out.println(""+info.getClassName());
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

        lbl_alas = new javax.swing.JLabel();
        txt_alas = new javax.swing.JTextField();
        btn_hitung_luas = new javax.swing.JButton();
        btn_hitung_keliling = new javax.swing.JButton();
        lbl_hasil = new javax.swing.JLabel();
        txt_hasil = new javax.swing.JTextField();
        txt_tinggi = new javax.swing.JTextField();
        lbl_tinggi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Elemen Dasar Java");

        lbl_alas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_alas.setText("Alas");

        btn_hitung_luas.setText("Hitung Luas");
        btn_hitung_luas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hitung_luasActionPerformed(evt);
            }
        });

        btn_hitung_keliling.setText("Hitung Keliling");
        btn_hitung_keliling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hitung_kelilingActionPerformed(evt);
            }
        });

        lbl_hasil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_hasil.setText("Hasil");

        lbl_tinggi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_tinggi.setText("Tinggi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_alas, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_hitung_keliling, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(btn_hitung_luas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_alas)
                    .addComponent(txt_hasil)
                    .addComponent(txt_tinggi))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_alas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_alas, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_tinggi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_tinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_hitung_luas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_hitung_keliling)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_hasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_hitung_luasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hitung_luasActionPerformed
        // TODO add your handling code here:
        String a = txt_alas.getText();
        String t = txt_tinggi.getText();
        if(a.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nilai alas harus diisi!");
            txt_alas.requestFocus();
        }else if(t.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nilai tinggi harus diisi!");
            txt_tinggi.requestFocus();
        }else{
            double alas = Double.valueOf(a);
            double tinggi = Double.valueOf(t);
            double luas = Fungsi.luas_segitiga(alas, tinggi);
            txt_hasil.setText(""+luas); 
        }       
    }//GEN-LAST:event_btn_hitung_luasActionPerformed

    private void btn_hitung_kelilingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hitung_kelilingActionPerformed
        // TODO add your handling code here:
        String a = txt_alas.getText();
        if(a.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nilai alas harus diisi!");
            txt_alas.requestFocus();
        }else{
            double alas = Double.valueOf(a);
            double keliling = Fungsi.keliling_segitiga(alas);
            txt_hasil.setText(""+keliling); 
        } 
    }//GEN-LAST:event_btn_hitung_kelilingActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Rumus().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hitung_keliling;
    private javax.swing.JButton btn_hitung_luas;
    private javax.swing.JLabel lbl_alas;
    private javax.swing.JLabel lbl_hasil;
    private javax.swing.JLabel lbl_tinggi;
    private javax.swing.JTextField txt_alas;
    private javax.swing.JTextField txt_hasil;
    private javax.swing.JTextField txt_tinggi;
    // End of variables declaration//GEN-END:variables
}
