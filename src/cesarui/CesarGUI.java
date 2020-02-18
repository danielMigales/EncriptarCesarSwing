package cesarui;

import controlador.Controlador;
import util.CommandName;

import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CesarGUI extends javax.swing.JFrame {

    private Controlador controlador;

    public CesarGUI() {
        initComponents();
        myInitComponentes();
        initControlador();
    }

    private void myInitComponentes() {
        controlador = Controlador.fromUserInterface(this);
    }

    private void initControlador() {
        btnCodificar.setActionCommand(CommandName.CODIFICAR_BTN.toString());
        btnCodificar.addActionListener(controlador);

        btnDecodificar.setActionCommand(CommandName.DECODIFICAR_BTN.toString());
        btnDecodificar.addActionListener(controlador);

        btnFuerza.setActionCommand(CommandName.FUERZA_BTN.toString());
        btnFuerza.addActionListener(controlador);
    }

    public JSpinner getjClave() {
        return jClave;
    }

    public JComboBox<String> getSelAlfabeto() {
        return selAlfabeto;
    }

    public JTextArea getTxtAResultado() {
        return txtAResultado;
    }

    public JTextField getTxtFAlfabetoCustom() {
        return txtFAlfabetoCustom;
    }

    public JTextArea getTxtAEntrada() {
        return txtAEntrada;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAEntrada = new javax.swing.JTextArea();
        jClave = new javax.swing.JSpinner();
        selAlfabeto = new javax.swing.JComboBox<>();
        btnCodificar = new javax.swing.JButton();
        btnDecodificar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAResultado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnFuerza = new javax.swing.JButton();
        txtFAlfabetoCustom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtAEntrada.setColumns(20);
        txtAEntrada.setRows(5);
        jScrollPane1.setViewportView(txtAEntrada);

        selAlfabeto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "Inglés" }));
        selAlfabeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selAlfabetoActionPerformed(evt);
            }
        });

        btnCodificar.setText("Codificar");
        btnCodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodificarActionPerformed(evt);
            }
        });

        btnDecodificar.setText("Decodificar");
        btnDecodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecodificarActionPerformed(evt);
            }
        });

        txtAResultado.setColumns(20);
        txtAResultado.setRows(5);
        jScrollPane2.setViewportView(txtAResultado);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Método de encriptación de Cesar");

        jLabel2.setText("Resultado");

        jLabel3.setText("Clave");

        jLabel4.setText("Alfabeto");

        btnFuerza.setText("Fuerza bruta");
        btnFuerza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuerzaActionPerformed(evt);
            }
        });

        txtFAlfabetoCustom.setText("jTextField1");
        txtFAlfabetoCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFAlfabetoCustomActionPerformed(evt);
            }
        });

        jLabel5.setText("Alfabeto Customizado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jClave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(selAlfabeto, 0, 167, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addComponent(txtFAlfabetoCustom))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnCodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDecodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFuerza)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(selAlfabeto)
                    .addComponent(jClave))
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFAlfabetoCustom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDecodificar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCodificar)
                        .addComponent(btnFuerza)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtFAlfabetoCustom.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void txtFAlfabetoCustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFAlfabetoCustomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFAlfabetoCustomActionPerformed

    private void btnDecodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecodificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDecodificarActionPerformed

    private void btnFuerzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuerzaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFuerzaActionPerformed

    private void btnCodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCodificarActionPerformed

    private void selAlfabetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selAlfabetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selAlfabetoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCodificar;
    private javax.swing.JButton btnDecodificar;
    private javax.swing.JButton btnFuerza;
    private javax.swing.JSpinner jClave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> selAlfabeto;
    private javax.swing.JTextArea txtAEntrada;
    private javax.swing.JTextArea txtAResultado;
    private javax.swing.JTextField txtFAlfabetoCustom;
    // End of variables declaration//GEN-END:variables
}
