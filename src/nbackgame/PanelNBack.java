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
        puntos = 5;
        initComponents();
        hilo = new HiloBack(lbNumeros);       
    }

    public void start(int nBack) {
        n = nBack;
        lblIndicacion.setText("Memoriza los "+nBack+" números anteriores.");
        
        hilo.start();
        actualizarPuntos();
    }
    
    public void stop(){
        hilo.stop();
    }
    public boolean getStatus(){
        return hilo.isAlive();
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
        lblIndicacion = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        lbNumeros.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lbNumeros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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

        lblPuntos.setText("0");

        jLabel1.setText("Puntos:");

        lblIndicacion.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPuntos))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDiferente, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnIgual)))))
                        .addGap(0, 83, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblIndicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPuntos)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIndicacion)
                .addGap(19, 19, 19)
                .addComponent(lbNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDiferente)
                    .addComponent(btnIgual))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDiferenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiferenteActionPerformed
        if (hilo.getNumActual() != hilo.getNBack(n)) {
            puntos++;
        } else {
            puntos--;
        }
        actualizarPuntos();
    }//GEN-LAST:event_btnDiferenteActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        if (hilo.getNumActual() == hilo.getNBack(n)) {
            puntos++;
        } else {
            puntos--;
        }
        actualizarPuntos();

    }//GEN-LAST:event_btnIgualActionPerformed

    private void actualizarPuntos() {
        lblPuntos.setText(String.valueOf(puntos));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiferente;
    private javax.swing.JButton btnIgual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lbNumeros;
    private javax.swing.JLabel lblIndicacion;
    private javax.swing.JLabel lblPuntos;
    // End of variables declaration//GEN-END:variables
}
