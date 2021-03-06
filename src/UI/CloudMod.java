/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import java.awt.Color;

/**
 *
 * @author Tamojit9
 */
public class CloudMod extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;

    /**
     * Creates new form CloudMod
     */
    public CloudMod() {
        initComponents();
        getContentPane().setBackground(Color.white);
        datacenters.setText("DATA CENTER");
        vm.setText("      VM");
        cloudlet.setText(" CLOUDLET");
        datacenters.setBackground(Color.white);
        vm.setBackground(Color.white);
        datacenters.setBackGroundColor(Colors.GREEN3);
        vm.setBackGroundColor(Colors.GREEN3);
        cloudlet.setBackGroundColor(Colors.GREEN3);
        cloudlet.setBackground(Color.white);
        jScrollPane1.setViewportView(dcp);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dcPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cloudlet = new UI.Button();
        datacenters = new UI.Button();
        vm = new UI.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N

        dcPanel.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout dcPanelLayout = new javax.swing.GroupLayout(dcPanel);
        dcPanel.setLayout(dcPanelLayout);
        dcPanelLayout.setHorizontalGroup(
            dcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        dcPanelLayout.setVerticalGroup(
            dcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        cloudlet.setFont(new java.awt.Font("Segoe UI Light", 1, 30)); // NOI18N
        cloudlet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cloudletMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cloudletLayout = new javax.swing.GroupLayout(cloudlet);
        cloudlet.setLayout(cloudletLayout);
        cloudletLayout.setHorizontalGroup(
            cloudletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );
        cloudletLayout.setVerticalGroup(
            cloudletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        datacenters.setFont(new java.awt.Font("Segoe UI Light", 1, 30)); // NOI18N
        datacenters.setOpaque(false);
        datacenters.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datacentersMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout datacentersLayout = new javax.swing.GroupLayout(datacenters);
        datacenters.setLayout(datacentersLayout);
        datacentersLayout.setHorizontalGroup(
            datacentersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
        );
        datacentersLayout.setVerticalGroup(
            datacentersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        vm.setFont(new java.awt.Font("Segoe UI Light", 1, 30)); // NOI18N
        vm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vmMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout vmLayout = new javax.swing.GroupLayout(vm);
        vm.setLayout(vmLayout);
        vmLayout.setHorizontalGroup(
            vmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
        );
        vmLayout.setVerticalGroup(
            vmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datacenters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(vm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(cloudlet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
            .addComponent(dcPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(datacenters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cloudlet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dcPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    VmPanel vmp = new VmPanel();
    DataCenter dcp = new DataCenter();
    volatile boolean busy = false;
    private void vmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vmMouseClicked
        // TODO add your handling code here:
        if(busy) return;
        busy = true;
        jScrollPane1.setViewportView(vmp);
        busy = false;
    }//GEN-LAST:event_vmMouseClicked

    private void datacentersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datacentersMouseClicked
        // TODO add your handling code here:
        if(busy) return;
        busy = true;
        jScrollPane1.setViewportView(dcp);
        busy = false;
    }//GEN-LAST:event_datacentersMouseClicked

    private void cloudletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cloudletMouseClicked
        // TODO add your handling code here:
        if(busy) return;
        busy = true;
        jScrollPane1.setViewportView(new CloudletPanel());
        busy = false;
    }//GEN-LAST:event_cloudletMouseClicked

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
            java.util.logging.Logger.getLogger(CloudMod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CloudMod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CloudMod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CloudMod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CloudMod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private UI.Button cloudlet;
    private UI.Button datacenters;
    private javax.swing.JPanel dcPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private UI.Button vm;
    // End of variables declaration//GEN-END:variables
}
