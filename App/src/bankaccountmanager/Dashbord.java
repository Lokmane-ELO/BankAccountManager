/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bankaccountmanager;

import java.awt.Color;

/**
 *
 * @author lokma
 */
public class Dashbord extends javax.swing.JFrame {

    /**
     * Creates new form Dashbord
     */
    Color Default = new Color(193,92,50);
    Color Selected = new Color(251,152,61);
    private String accountNumber;
    private String employeeId;
    public Dashbord() {
        initComponents();
        this.setLocationRelativeTo(null);
        InfoBtn.setBackground(Default);
        despositBtn.setBackground(Default);
        statisticsBtn.setBackground(Default);
        transferBtn.setBackground(Default);
        witdrawBtn.setBackground(Default);
       
       
        
    }
        public void setaccountNumber(String str){
        accountNumber = str;   
        
        //searchClientInfo();
        }
        public void setEmployee(String eId){
            employeeId = eId;
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
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        despositBtn = new javax.swing.JButton();
        witdrawBtn = new javax.swing.JButton();
        statisticsBtn = new javax.swing.JButton();
        InfoBtn = new javax.swing.JButton();
        transferBtn = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(22, 116, 95));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1043, 700));

        jPanel4.setBackground(new java.awt.Color(193, 92, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.jpg"))); // NOI18N

        despositBtn.setBackground(new java.awt.Color(193, 92, 50));
        despositBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        despositBtn.setForeground(new java.awt.Color(201, 221, 255));
        despositBtn.setText("Dépot de fond");
        despositBtn.setToolTipText("");
        despositBtn.setBorder(null);
        despositBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despositBtnActionPerformed(evt);
            }
        });

        witdrawBtn.setBackground(new java.awt.Color(193, 92, 50));
        witdrawBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        witdrawBtn.setForeground(new java.awt.Color(201, 221, 255));
        witdrawBtn.setText("Retrait de fond");
        witdrawBtn.setToolTipText("");
        witdrawBtn.setBorder(null);
        witdrawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                witdrawBtnActionPerformed(evt);
            }
        });

        statisticsBtn.setBackground(new java.awt.Color(193, 92, 50));
        statisticsBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        statisticsBtn.setForeground(new java.awt.Color(201, 221, 255));
        statisticsBtn.setText("Consulter les statitiques");
        statisticsBtn.setToolTipText("");
        statisticsBtn.setBorder(null);
        statisticsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statisticsBtnActionPerformed(evt);
            }
        });

        InfoBtn.setBackground(new java.awt.Color(251, 152, 61));
        InfoBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        InfoBtn.setForeground(new java.awt.Color(201, 221, 255));
        InfoBtn.setText("Consulter le solde");
        InfoBtn.setToolTipText("");
        InfoBtn.setBorder(null);
        InfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoBtnActionPerformed(evt);
            }
        });

        transferBtn.setBackground(new java.awt.Color(193, 92, 50));
        transferBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        transferBtn.setForeground(new java.awt.Color(201, 221, 255));
        transferBtn.setText("Virement");
        transferBtn.setToolTipText("");
        transferBtn.setBorder(null);
        transferBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(witdrawBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statisticsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(despositBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InfoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transferBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(InfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(despositBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(witdrawBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(transferBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statisticsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(853, 700));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void despositBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despositBtnActionPerformed
        // TODO add your handling code here:
        InfoBtn.setBackground(Default);
        despositBtn.setBackground(Selected);
        statisticsBtn.setBackground(Default);
        transferBtn.setBackground(Default);
        witdrawBtn.setBackground(Default);

        DepositLayout depLayout = new DepositLayout();
        jDesktopPane1.removeAll();
        depLayout.setAccountNumber(accountNumber);
        depLayout.setEmployee(employeeId);
        jDesktopPane1.add(depLayout).setVisible(true);
    }//GEN-LAST:event_despositBtnActionPerformed

    private void witdrawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_witdrawBtnActionPerformed
        // TODO add your handling code here:
        InfoBtn.setBackground(Default);
        despositBtn.setBackground(Default);
        statisticsBtn.setBackground(Default);
        transferBtn.setBackground(Default);
        witdrawBtn.setBackground(Selected);

        WithdrawLayout witLayout = new WithdrawLayout();
        jDesktopPane1.removeAll();
        witLayout.setAccountNumber(accountNumber);
        witLayout.setEmployeeId(employeeId);
        jDesktopPane1.add(witLayout).setVisible(true);
    }//GEN-LAST:event_witdrawBtnActionPerformed

    private void statisticsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statisticsBtnActionPerformed
        // TODO add your handling code here:
        InfoBtn.setBackground(Default);
        despositBtn.setBackground(Default);
        statisticsBtn.setBackground(Selected);
        transferBtn.setBackground(Default);
        witdrawBtn.setBackground(Default);

        StatisticsLayout StatisticsL = new StatisticsLayout();
        jDesktopPane1.removeAll();
        StatisticsL.setAccountNumber(accountNumber);
        jDesktopPane1.add(StatisticsL).setVisible(true);
    }//GEN-LAST:event_statisticsBtnActionPerformed

    private void InfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoBtnActionPerformed
        // TODO add your handling code here:
        InfoBtn.setBackground(Selected);
        despositBtn.setBackground(Default);
        statisticsBtn.setBackground(Default);
        transferBtn.setBackground(Default);
        witdrawBtn.setBackground(Default);

        AccountDetails AccDet = new AccountDetails();
        jDesktopPane1.removeAll();
        AccDet.setaccountNumber(accountNumber);
        jDesktopPane1.add(AccDet).setVisible(true);
    }//GEN-LAST:event_InfoBtnActionPerformed

    private void transferBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferBtnActionPerformed
        // TODO add your handling code here:
        InfoBtn.setBackground(Default);
        despositBtn.setBackground(Default);
        statisticsBtn.setBackground(Default);
        transferBtn.setBackground(Selected);
        witdrawBtn.setBackground(Default);

        TransferLayout transferL = new TransferLayout();
        jDesktopPane1.removeAll();
        transferL.setAccountNumber(accountNumber);
        transferL.setEmployeeId(employeeId);
        jDesktopPane1.add(transferL).setVisible(true);
    }//GEN-LAST:event_transferBtnActionPerformed

     
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
            java.util.logging.Logger.getLogger(Dashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashbord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InfoBtn;
    private javax.swing.JButton despositBtn;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton statisticsBtn;
    private javax.swing.JButton transferBtn;
    private javax.swing.JButton witdrawBtn;
    // End of variables declaration//GEN-END:variables
}
