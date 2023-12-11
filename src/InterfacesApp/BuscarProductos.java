/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterfacesApp;

import InterfacesApp.*;

/**
 *
 * @author MADE
 */
public class BuscarProductos extends javax.swing.JPanel {

    /**
     * Creates new form Buscar
     */
    public BuscarProductos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContenedorRegistroIn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        RegresarBoton = new javax.swing.JLabel();
        RegresarBoton1 = new javax.swing.JLabel();

        ContenedorRegistroIn.setBackground(new java.awt.Color(255, 255, 255));
        ContenedorRegistroIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ContenedorRegistroIn.setPreferredSize(new java.awt.Dimension(799, 699));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUSCAR PRODUCTOS");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfacesApp/IMAGENES2/paquete-o-empaquetar_1.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ID DEL PRODUCTO: ");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("existencia:");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField2.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N

        RegresarBoton.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        RegresarBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegresarBoton.setText("REGRESAR");
        RegresarBoton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RegresarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresarBotonMouseClicked(evt);
            }
        });

        RegresarBoton1.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        RegresarBoton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegresarBoton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RegresarBoton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresarBoton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ContenedorRegistroInLayout = new javax.swing.GroupLayout(ContenedorRegistroIn);
        ContenedorRegistroIn.setLayout(ContenedorRegistroInLayout);
        ContenedorRegistroInLayout.setHorizontalGroup(
            ContenedorRegistroInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorRegistroInLayout.createSequentialGroup()
                .addGroup(ContenedorRegistroInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorRegistroInLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(ContenedorRegistroInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                        .addGroup(ContenedorRegistroInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorRegistroInLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RegresarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(ContenedorRegistroInLayout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(ContenedorRegistroInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                                    .addComponent(RegresarBoton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(ContenedorRegistroInLayout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        ContenedorRegistroInLayout.setVerticalGroup(
            ContenedorRegistroInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorRegistroInLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(ContenedorRegistroInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(ContenedorRegistroInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegresarBoton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(RegresarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ContenedorRegistroIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ContenedorRegistroIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarBotonMouseClicked
        TablonInventario p = new TablonInventario();
        p.setSize(800, 700);
        ContenedorRegistroIn.removeAll();
        ContenedorRegistroIn.add(p);
        ContenedorRegistroIn.revalidate();
        ContenedorRegistroIn.repaint();
        ContenedorRegistroIn.setSize(800, 700);
        ContenedorRegistroIn.setLocation(200, 0);
    }//GEN-LAST:event_RegresarBotonMouseClicked

    private void RegresarBoton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarBoton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RegresarBoton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContenedorRegistroIn;
    private javax.swing.JLabel RegresarBoton;
    private javax.swing.JLabel RegresarBoton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
