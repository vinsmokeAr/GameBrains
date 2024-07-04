/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package nbackgame;

/**
 *
 * @author Arleth
 */
public class PanelNBack extends javax.swing.JPanel {
    private int n;
    private int puntos;
    private HiloBack hilo;
    /**
     * Creates new form PanelNBack
     */
    public PanelNBack() {
        n=2;
        puntos=5;
        initComponents();
        hilo = new HiloBack(lbNumeros);
        hilo.start();
        actualizarPuntos();
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        lbNumeros = new javax.swing.JLabel();
        btnDiferente = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        lblPuntos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        lbNumeros.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lbNumeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnDiferente.setText("Diferente");
        btnDiferente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiferenteActionPerformed(evt);
            }
        });

        btnIgual.setText("Igual");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        lblPuntos.setText("jLabel1");

        jLabel1.setText("Puntos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btnDiferente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnIgual)
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPuntos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(lbNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPuntos)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(lbNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDiferente)
                    .addComponent(btnIgual))
                .addGap(68, 68, 68))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDiferenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiferenteActionPerformed
        if (hilo.getNumActual() != hilo.getNBack(n)) {
            puntos ++;
        }else{
            puntos --;
        }
        actualizarPuntos();
    }//GEN-LAST:event_btnDiferenteActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
         if (hilo.getNumActual() == hilo.getNBack(n)) {
            puntos ++;
        }else{
            puntos --;
        }
        actualizarPuntos();
        
    }//GEN-LAST:event_btnIgualActionPerformed

    
    private void actualizarPuntos(){
        lblPuntos.setText(String.valueOf(puntos));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiferente;
    private javax.swing.JButton btnIgual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lbNumeros;
    private javax.swing.JLabel lblPuntos;
    // End of variables declaration//GEN-END:variables
}
