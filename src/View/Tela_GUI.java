package View;

import javax.swing.JOptionPane;

public class Tela_GUI extends javax.swing.JFrame {

    public Tela_GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        caption = new javax.swing.JLabel();
        voo2_btn = new javax.swing.JButton();
        voo1_btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(222, 232, 237));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 30)); // NOI18N
        jLabel1.setText("Agência de Viagens");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 30, 260, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aviao.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 10, 100, 110);

        caption.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        caption.setText("Vôos Disponíveis:");
        jPanel1.add(caption);
        caption.setBounds(50, 120, 140, 30);

        voo2_btn.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 17)); // NOI18N
        voo2_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/seta.png"))); // NOI18N
        voo2_btn.setText("Vôo 04617 - De: São Paulo - Guarulhos     Para: Canadá - Toronto");
        voo2_btn.setToolTipText("Passagem de Guarulhos para Toronto");
        voo2_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        voo2_btn.setContentAreaFilled(false);
        voo2_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voo2_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voo2_btnActionPerformed(evt);
            }
        });
        jPanel1.add(voo2_btn);
        voo2_btn.setBounds(30, 220, 480, 50);

        voo1_btn.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 17)); // NOI18N
        voo1_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/seta.png"))); // NOI18N
        voo1_btn.setText("Vôo 04515 - De: São Paulo - Guarulhos     Para: EUA - Los Angeles");
        voo1_btn.setToolTipText("Passagem de Guarulhos para Los Angeles");
        voo1_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        voo1_btn.setContentAreaFilled(false);
        voo1_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voo1_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voo1_btnActionPerformed(evt);
            }
        });
        jPanel1.add(voo1_btn);
        voo1_btn.setBounds(30, 160, 480, 50);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(470, 20, 40, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(534, 348));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voo2_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voo2_btnActionPerformed
        new Voo2_GUI().setVisible(true);
    }//GEN-LAST:event_voo2_btnActionPerformed

    private void voo1_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voo1_btnActionPerformed
        new Voo1_GUI().setVisible(true);
    }//GEN-LAST:event_voo1_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Model.Funcoes_DAO.fechar();
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel caption;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton voo1_btn;
    private javax.swing.JButton voo2_btn;
    // End of variables declaration//GEN-END:variables
}
