
package Vista.Prestamo;

import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class ModificarPrestamo extends javax.swing.JFrame {

    /**
     * Creates new form ModificarPrestamo
     */
    public ModificarPrestamo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonVisualizar = new javax.swing.JButton();
        txtRecursos_A_Entregar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonFinalizar = new javax.swing.JButton();
        botonEntregar = new javax.swing.JButton();
        txtRecursos_Para_Entregar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonVisualizar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botonVisualizar.setText("VISUALIZAR");
        botonVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVisualizarActionPerformed(evt);
            }
        });

        txtRecursos_A_Entregar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtRecursos_A_Entregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecursos_A_EntregarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Recursos pendientes para entregar:");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setText("MODIFICAR PRESTAMO");

        botonFinalizar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botonFinalizar.setText("FINALIZAR");
        botonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFinalizarActionPerformed(evt);
            }
        });

        botonEntregar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botonEntregar.setText("ENTREGAR");
        botonEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntregarActionPerformed(evt);
            }
        });

        txtRecursos_Para_Entregar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtRecursos_Para_Entregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecursos_Para_EntregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(botonFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtRecursos_A_Entregar, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRecursos_Para_Entregar, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonEntregar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRecursos_Para_Entregar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRecursos_A_Entregar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEntregar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(botonFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVisualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVisualizarActionPerformed

    private void txtRecursos_A_EntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecursos_A_EntregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecursos_A_EntregarActionPerformed

    private void botonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFinalizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonFinalizarActionPerformed

    private void botonEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEntregarActionPerformed

    private void txtRecursos_Para_EntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecursos_Para_EntregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecursos_Para_EntregarActionPerformed

    public JTextField getTxtRecursos_A_Entregar() {
        return txtRecursos_A_Entregar;
    }

    public JTextField getTxtRecursos_Para_Entregar() {
        return txtRecursos_Para_Entregar;
    }
     public void addbotonFinalizarListener(ActionListener listenControles){
        botonFinalizar.addActionListener(listenControles);
    }
     public void addbotonVisualizarListener(ActionListener listenControles){
        botonVisualizar.addActionListener(listenControles);
    }
     public void addbotonEntregarListener(ActionListener listenControles){
        botonEntregar.addActionListener(listenControles);
    }

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEntregar;
    private javax.swing.JButton botonFinalizar;
    private javax.swing.JButton botonVisualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtRecursos_A_Entregar;
    private javax.swing.JTextField txtRecursos_Para_Entregar;
    // End of variables declaration//GEN-END:variables
}
