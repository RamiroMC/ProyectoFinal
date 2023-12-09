/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterfacesApp;

/**
 *
 * @author MADE
 */
import ClasesApp.Automovil;
import ClasesApp.Bicicleta;
import ClasesApp.Cliente;
import ClasesApp.Moto;
import ClasesApp.Vehiculo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
public class RegistrarClientes extends javax.swing.JPanel {

    /**
     * Creates new form RegistrarClientes
     */
    public RegistrarClientes() {
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

        RegistroPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Color = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NombreCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Placa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Marca = new javax.swing.JTextField();
        RegistrarCliente = new javax.swing.JLabel();
        Volver = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        IdCliente = new javax.swing.JTextField();
        Moto = new javax.swing.JCheckBox();
        Automovil = new javax.swing.JCheckBox();
        Bicicleta = new javax.swing.JCheckBox();

        RegistroPanel.setBackground(new java.awt.Color(255, 255, 255));
        RegistroPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RegistroPanel.setPreferredSize(new java.awt.Dimension(800, 700));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE NUEVO CLIENTE");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfacesApp/ImagenesTablon/registro (2).png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("COLOR:");

        Color.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        Color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("IDENTIFICACION:");

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("VEHICULO:");

        NombreCliente.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        NombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreClienteActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("placa:");

        Placa.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MARCA:");

        Marca.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaActionPerformed(evt);
            }
        });

        RegistrarCliente.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        RegistrarCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegistrarCliente.setText("REGISTRAR");
        RegistrarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RegistrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarClienteMouseClicked(evt);
            }
        });

        Volver.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        Volver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Volver.setText("volver");
        Volver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolverMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("NOMBRE:");

        IdCliente.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        IdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdClienteActionPerformed(evt);
            }
        });

        Moto.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        Moto.setText("MOTO");
        Moto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Moto.setBorderPainted(true);
        Moto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotoActionPerformed(evt);
            }
        });

        Automovil.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        Automovil.setText("Automovil");
        Automovil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Automovil.setBorderPainted(true);
        Automovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutomovilActionPerformed(evt);
            }
        });

        Bicicleta.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        Bicicleta.setText("bicicleta");
        Bicicleta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bicicleta.setBorderPainted(true);
        Bicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BicicletaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegistroPanelLayout = new javax.swing.GroupLayout(RegistroPanel);
        RegistroPanel.setLayout(RegistroPanelLayout);
        RegistroPanelLayout.setHorizontalGroup(
            RegistroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroPanelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(RegistroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(289, 289, 289))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroPanelLayout.createSequentialGroup()
                        .addGroup(RegistroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(RegistroPanelLayout.createSequentialGroup()
                                .addGroup(RegistroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(RegistroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(RegistroPanelLayout.createSequentialGroup()
                                .addGroup(RegistroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(RegistroPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(RegistroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Color, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(RegistroPanelLayout.createSequentialGroup()
                                        .addComponent(Moto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Automovil, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(76, 76, 76)
                                        .addComponent(Bicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(RegistroPanelLayout.createSequentialGroup()
                                .addComponent(RegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49))))
        );
        RegistroPanelLayout.setVerticalGroup(
            RegistroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(55, 55, 55)
                .addGroup(RegistroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RegistroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(RegistroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Automovil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Moto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(RegistroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(Marca))
                .addGap(18, 18, 18)
                .addGroup(RegistroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Color, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(RegistroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RegistroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreClienteActionPerformed

    private void VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseClicked
        TablaClientes p = new TablaClientes();
        p.setSize(800, 700);
        RegistroPanel.removeAll();
        RegistroPanel.add(p);
        RegistroPanel.revalidate();
        RegistroPanel.repaint();
        RegistroPanel.setSize(800, 700);
        RegistroPanel.setLocation(200, 0);
    }//GEN-LAST:event_VolverMouseClicked

    private void MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarcaActionPerformed

    private void ColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColorActionPerformed

    private void IdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdClienteActionPerformed

    private void MotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotoActionPerformed
        
    }//GEN-LAST:event_MotoActionPerformed

    private void AutomovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutomovilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AutomovilActionPerformed

    private void BicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BicicletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BicicletaActionPerformed

    private void RegistrarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarClienteMouseClicked
       String nombreCliente = NombreCliente.getText();
        String idCliente = IdCliente.getText();
        String placaVehiculo = Placa.getText();
        String marcaVehiculo = Marca.getText();
        String colorVehiculo = Color.getText();

    try {
        //Validaciones
        if (nombreCliente.isEmpty() || idCliente.isEmpty() || placaVehiculo.isEmpty()
                || marcaVehiculo.isEmpty() || colorVehiculo.isEmpty()) {
            throw new IllegalArgumentException("Todos los campos deben llenarse.");
        }

            //Crear un objeto Cliente
            Cliente cliente = new Cliente(Integer.parseInt(idCliente), nombreCliente);

            //Determinar el tipo de vehículo seleccionado
            String tipoVehiculo = "";
            if (Automovil.isSelected()) {
                tipoVehiculo = "Automovil";
            } else if (Bicicleta.isSelected()) {
                tipoVehiculo = "Bicicleta";
            } else if (Moto.isSelected()) {
                tipoVehiculo = "Moto";
            }

            //Crear un objeto Vehiculo del tipo correspondiente
            Vehiculo vehiculo = null;
            switch (tipoVehiculo) {
                case "Automovil":
                    vehiculo = new Automovil(placaVehiculo, marcaVehiculo, colorVehiculo, tipoVehiculo);
                    break;
                case "Bicicleta":
                    vehiculo = new Bicicleta(placaVehiculo, marcaVehiculo, colorVehiculo, tipoVehiculo);
                    break;
                case "Moto":
                    vehiculo = new Moto(placaVehiculo, marcaVehiculo, colorVehiculo, tipoVehiculo);
                    break;
                default:
                    throw new IllegalArgumentException("Por favor, selecciona un tipo de vehículo.");
            }

            //Asignar el vehículo al cliente
            cliente.setVehiculo(vehiculo);

            //Guardar el cliente en el archivo binario
            escribirBinarioClientes("clientes.dat", cliente);

            //Imprimir el contenido del archivo binario en la consola
            imprimirContenidoBinarioClientes("clientes.dat");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    
    }//GEN-LAST:event_RegistrarClienteMouseClicked

    private void escribirBinarioClientes(String ruta, Cliente cliente) {
    try {
        // Leer todos los objetos existentes en el archivo binario
        Cliente[] clientes = leerBinarioClientes(ruta);

        // Verificar si clientes es nulo y asignar un array vacío si es el caso
        if (clientes == null) {
            clientes = new Cliente[0];
        }

        // Agregar el nuevo Cliente al array existente
        clientes = Arrays.copyOf(clientes, clientes.length + 1);
        clientes[clientes.length - 1] = cliente;

        // Crear un FileOutputStream para escribir en el archivo binario en la ruta especificada
        try (ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream(ruta))) {
            file.writeObject(clientes);
        }

    } catch (IOException ex) {
        System.out.println(ex);
    }
}

    
    private static Cliente[] leerBinarioClientes(String ruta) {
        try {
            //Crear un ObjectInputStream para leer el archivo binario en la ruta especificada
            try (ObjectInputStream file = new ObjectInputStream(new FileInputStream(ruta))) {
                //Leer el objeto del archivo
                Object obj = file.readObject();

                //Verificar si el objeto leído es un array de Cliente
                if (obj instanceof Cliente[] clientes) {
                    return clientes;
                } else {
                    System.out.println("El archivo no contiene un array de objetos Cliente.");
                }
            }
        } catch (ClassNotFoundException | IOException ex) {
            System.out.println(ex);
        }

        //En caso de error o archivo vacío, devolver null
        return null;
    }
    
    //Método auxiliar para verificar que se están guardando los datos en el archivo de clientes
    public static void imprimirContenidoBinarioClientes(String ruta) {
        Cliente[] clientes = leerBinarioClientes(ruta);

        if (clientes != null) {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        } else {
            System.out.println("No hay datos en el archivo de clientes.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Automovil;
    private javax.swing.JCheckBox Bicicleta;
    private javax.swing.JTextField Color;
    private javax.swing.JTextField IdCliente;
    private javax.swing.JTextField Marca;
    private javax.swing.JCheckBox Moto;
    private javax.swing.JTextField NombreCliente;
    private javax.swing.JTextField Placa;
    private javax.swing.JLabel RegistrarCliente;
    private javax.swing.JPanel RegistroPanel;
    private javax.swing.JLabel Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
