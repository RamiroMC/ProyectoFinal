/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterfacesApp;

import ArchivosCRUD.ClientesCRUD;
import Personas.Cliente;
import Trabajo.Oficios;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MADE
 */
public class Trabajos extends javax.swing.JPanel {

    private String idMecanico;

    public Trabajos() {
        initComponents();
    }

    public String getIdMecanico() {
        return idMecanico;
    }

    public void setIdMecanico(String idMecanico) {
        this.idMecanico = idMecanico;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buscarTrabajoTXT = new javax.swing.JTextField();
        Empezar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        buscarBTN = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTRABAJOS = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        mostrarBTN = new javax.swing.JLabel();

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));
        Contenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Contenedor.setPreferredSize(new java.awt.Dimension(800, 700));
        Contenedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContenedorMouseClicked(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ingreso.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECCION DE TRABAJO");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Buscar trabajos (id):");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buscarTrabajoTXT.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        buscarTrabajoTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarTrabajoTXTActionPerformed(evt);
            }
        });

        Empezar.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        Empezar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Empezar.setText("REGISTRAR nuevo trabajo");
        Empezar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Empezar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Empezar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpezarMouseClicked(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfacesApp/IMAGENES2/NUEVO.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buscarBTN.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        buscarBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarBTN.setText("BUSCAR");
        buscarBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buscarBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarBTNMouseClicked(evt);
            }
        });

        tablaTRABAJOS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tablaTRABAJOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Trabajo", "Id Cliente", "Id Mecanico", "Fecha Inicio", "Plazo", "Costo"
            }
        ));
        jScrollPane1.setViewportView(tablaTRABAJOS);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfacesApp/IMAGENES2/NUEVO.png"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        mostrarBTN.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        mostrarBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostrarBTN.setText("MOSTRAR TODOS LOS TRABAJOS");
        mostrarBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mostrarBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrarBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarBTNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Empezar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ContenedorLayout.createSequentialGroup()
                                .addComponent(buscarTrabajoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContenedorLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mostrarBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(19, 19, 19))
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscarTrabajoTXT)
                    .addComponent(buscarBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(Empezar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(mostrarBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buscarTrabajoTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTrabajoTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarTrabajoTXTActionPerformed

    private void EmpezarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpezarMouseClicked
        IniciarTrabajo p = new IniciarTrabajo();
        p.setIdMecanico(idMecanico);
        p.setSize(800, 700);
        Contenedor.removeAll();
        Contenedor.add(p);

        Contenedor.setSize(800, 700);
        Contenedor.setLocation(0, 0);
        Contenedor.revalidate();
        Contenedor.repaint();
    }//GEN-LAST:event_EmpezarMouseClicked

    private void buscarBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBTNMouseClicked

        String idTrabajoAUX = buscarTrabajoTXT.getText();

        ArrayList<Cliente> clientes = ClientesCRUD.Read();

        boolean trabajoEXiste = false;
        boolean mecanicoExiste = false;

        for (Cliente cliente : clientes) {

            for (Oficios oficio : cliente.getOficios()) {

                if (oficio.getIdTrabajo().equals(idTrabajoAUX)) {
                    trabajoEXiste = true;
                }

                if (oficio.getIdMecanico().equals(idMecanico)) {
                    mecanicoExiste = true;
                }

                if ((oficio.getIdTrabajo().equals(idTrabajoAUX) && oficio.getIdMecanico().equals(idMecanico))) {

                    Mecanica m = new Mecanica();
                    m.setIdTrabajoAUX(idTrabajoAUX);
                    m.setSize(800, 700);
                    Contenedor.removeAll();
                    Contenedor.add(m);

                    Contenedor.setSize(800, 700);
                    Contenedor.setLocation(0, 0);

                    Contenedor.revalidate();
                    Contenedor.repaint();

                    break;

                }

            }

        }

        if (trabajoEXiste == false) {
            JOptionPane.showMessageDialog(null, "id del trabajo no existe", "Alerta", JOptionPane.WARNING_MESSAGE);

        } else if (mecanicoExiste == false) {
            JOptionPane.showMessageDialog(null, "el mecanico " + idMecanico + " no tiene permiso para modificar este trabajo", "Alerta", JOptionPane.WARNING_MESSAGE);

        }

        buscarTrabajoTXT.setText("");


    }//GEN-LAST:event_buscarBTNMouseClicked

    private void mostrarBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarBTNMouseClicked
        // Supongamos que tienes un ArrayList bidimensional
        ArrayList<Cliente> datos = ClientesCRUD.Read();

        // Crear un DefaultTableModel con datos bidimensionales y establecerlo en la JTable
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Id Trabajo");
        model.addColumn("Id Cliente");
        model.addColumn("Id Mecanico");
        model.addColumn("Fecha inicio");
        model.addColumn("Plazo maximo");
        model.addColumn("Costo");

        // Agregar las filas al modelo
        for (Cliente fila : datos) {

            ArrayList<Oficios> trabajos = fila.getOficios();

            for (Oficios deuda : trabajos) {

                model.addRow(new Object[]{deuda.getIdTrabajo(), deuda.getIdCliente(), deuda.getIdMecanico(),
                    deuda.getFechaInicio().toString(), deuda.getPlazoMaximo(), deuda.cotizarPrecio()});

            }

        }

        tablaTRABAJOS.setModel(model);
    }//GEN-LAST:event_mostrarBTNMouseClicked

    private void ContenedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContenedorMouseClicked
       this.requestFocus();
    }//GEN-LAST:event_ContenedorMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JLabel Empezar;
    private javax.swing.JLabel buscarBTN;
    private javax.swing.JTextField buscarTrabajoTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mostrarBTN;
    private javax.swing.JTable tablaTRABAJOS;
    // End of variables declaration//GEN-END:variables
}
