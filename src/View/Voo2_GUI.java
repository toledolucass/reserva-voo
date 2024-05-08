package View;

/**
 *
 * @author LUCAS
 */
public class Voo2_GUI extends javax.swing.JFrame {

    public Voo2_GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        numAssento2_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        assento2_1_txt = new javax.swing.JLabel();
        assento2_2_txt = new javax.swing.JLabel();
        assento2_3_txt = new javax.swing.JLabel();
        assento2_4_txt = new javax.swing.JLabel();
        assento2_5_txt = new javax.swing.JLabel();
        assento2_6_txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(222, 232, 237));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Vôo 04617 para Toronto saindo de São Paulo");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 30, 320, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aviao.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(390, 10, 100, 100);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setText("Assentos Disponíveis: ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 80, 180, 30);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 28)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("5 [   ]          6 [   ]");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 210, 270, 30);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 28)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("1 [   ]          2 [   ]");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 130, 270, 30);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 28)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("3 [   ]          4 [   ]");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 170, 270, 30);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel7.setText("Qual acento deseja reservar?");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(320, 260, 190, 20);

        numAssento2_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numAssento2_txtActionPerformed(evt);
            }
        });
        jPanel1.add(numAssento2_txt);
        numAssento2_txt.setBounds(320, 290, 180, 20);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/voltar.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 280, 50, 40);

        assento2_1_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(assento2_1_txt);
        assento2_1_txt.setBounds(170, 130, 60, 30);

        assento2_2_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(assento2_2_txt);
        assento2_2_txt.setBounds(300, 130, 60, 30);

        assento2_3_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(assento2_3_txt);
        assento2_3_txt.setBounds(170, 170, 60, 30);

        assento2_4_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(assento2_4_txt);
        assento2_4_txt.setBounds(300, 170, 60, 30);

        assento2_5_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(assento2_5_txt);
        assento2_5_txt.setBounds(170, 210, 60, 30);

        assento2_6_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(assento2_6_txt);
        assento2_6_txt.setBounds(300, 210, 60, 30);

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

        setSize(new java.awt.Dimension(534, 348));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new Tela_GUI().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void numAssento2_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numAssento2_txtActionPerformed
        Model.Funcoes_DAO.reservarVoo2();
    }//GEN-LAST:event_numAssento2_txtActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voo2_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel assento2_1_txt;
    public static javax.swing.JLabel assento2_2_txt;
    public static javax.swing.JLabel assento2_3_txt;
    public static javax.swing.JLabel assento2_4_txt;
    public static javax.swing.JLabel assento2_5_txt;
    public static javax.swing.JLabel assento2_6_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField numAssento2_txt;
    // End of variables declaration//GEN-END:variables
}
