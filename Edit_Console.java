/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toolkit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author root
 */
public class Edit_Console extends javax.swing.JPanel {

    /**
     * Creates new form Edit_Console
     */
    public Edit_Console() {
        initComponents();
    }
    
    
    public class ListenerClose implements ActionListener{
        @Override
        public void actionPerformed (ActionEvent e){
            Interface.p_EditConsole.setVisible(false);
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

        jPanel13 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.gray));

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel1.setText("Edit Console Colours");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.gray));

        jLabel11.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jLabel11.setText("Background");

        jComboBox1.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Black", "Blue", "Green", "Red", "Gray", "White", "Yellow" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox1FocusGained(evt);
            }
        });
        jComboBox1.setLightWeightPopupEnabled(false);

        jComboBox2.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Black", "Blue", "Green", "Red", "Gray", "White", "Yellow" }));
        jComboBox2.setLightWeightPopupEnabled(false);

        jLabel12.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jLabel12.setText("Font");

        jButton4.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jButton4.setText("Save");
        jButton4.addActionListener(new ListenerClose());
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(6, 6, 6)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(6, 6, 6)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(54, 54, 54)
                .addComponent(jButton4)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        String background = (String) jComboBox1.getSelectedItem();
        String font = (String) jComboBox2.getSelectedItem();
        switch (background) {
            case "Black":  Interface.cleanPassword.setBackground(java.awt.Color.black);;
                           Interface.jTextArea2.setBackground(java.awt.Color.black);;
            break;
            case "Blue":  Interface.cleanPassword.setBackground(java.awt.Color.blue);;
                          Interface.jTextArea2.setBackground(java.awt.Color.blue);;
            break;
            case "Cyan":  Interface.cleanPassword.setBackground(java.awt.Color.cyan);;
                          Interface.jTextArea2.setBackground(java.awt.Color.cyan);;
            break;
            case "Green":  Interface.cleanPassword.setBackground(java.awt.Color.green);;
                           Interface.jTextArea2.setBackground(java.awt.Color.green);;
            break;
            case "Gray":  Interface.cleanPassword.setBackground(java.awt.Color.gray);;
                          Interface.jTextArea2.setBackground(java.awt.Color.gray);;
            break;
            case "Red":  Interface.cleanPassword.setBackground(java.awt.Color.red);;
                         Interface.jTextArea2.setBackground(java.awt.Color.red);;
            break;
            case "White":  Interface.cleanPassword.setBackground(java.awt.Color.white);;
                           Interface.jTextArea2.setBackground(java.awt.Color.white);;
            break;
            case "Yellow": Interface.cleanPassword.setBackground(java.awt.Color.yellow);;
                           Interface.jTextArea2.setBackground(java.awt.Color.yellow);;
            break;
        }

        switch (font) {
            case "Black":  Interface.cleanPassword.setForeground(java.awt.Color.black);;
                           Interface.jTextArea2.setForeground(java.awt.Color.black);;
            break;
            case "Blue":  Interface.cleanPassword.setForeground(java.awt.Color.blue);;
                           Interface.jTextArea2.setForeground(java.awt.Color.blue);;
            break;
            case "Cyan":  Interface.cleanPassword.setForeground(java.awt.Color.cyan);;
                           Interface.jTextArea2.setForeground(java.awt.Color.cyan);;
            break;
            case "Green":  Interface.cleanPassword.setForeground(java.awt.Color.green);;
                           Interface.jTextArea2.setForeground(java.awt.Color.green);;
            break;
            case "Gray":  Interface.cleanPassword.setForeground(java.awt.Color.gray);;
                           Interface.jTextArea2.setForeground(java.awt.Color.gray);;
            break;
            case "Red":  Interface.cleanPassword.setForeground(java.awt.Color.red);;
                           Interface.jTextArea2.setForeground(java.awt.Color.red);;
            break;
            case "White":  Interface.cleanPassword.setForeground(java.awt.Color.white);;
                           Interface.jTextArea2.setForeground(java.awt.Color.white);;
            break;
            case "Yellow":  Interface.cleanPassword.setForeground(java.awt.Color.yellow);;
                           Interface.jTextArea2.setForeground(java.awt.Color.yellow);;
            break;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1FocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    public static javax.swing.JComboBox jComboBox1;
    public static javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    // End of variables declaration//GEN-END:variables
}
