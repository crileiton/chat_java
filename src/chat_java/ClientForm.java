/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat_java;

import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author crileiton
 */
public class ClientForm extends javax.swing.JFrame {

    /**
     * Inicializa las variables
     *
     */
    Socket server = null;

    /**
     * Segunda guía
     */
    DataInputStream dis = null;
    DataOutputStream dos = null;

    /**
     * Creates new form ClientForm
     */
    public ClientForm() {
        initComponents();
        this.llenar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_conectar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_RecMsg = new javax.swing.JTextArea();
        txt_msg = new javax.swing.JTextField();
        btn_enviar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_base_datos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente");

        btn_conectar.setText("Connect");
        btn_conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_conectarActionPerformed(evt);
            }
        });

        txt_RecMsg.setColumns(20);
        txt_RecMsg.setRows(5);
        jScrollPane1.setViewportView(txt_RecMsg);

        btn_enviar.setText("Enviar");
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        txt_base_datos.setColumns(20);
        txt_base_datos.setRows(5);
        txt_base_datos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txt_base_datosAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(txt_base_datos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btn_conectar)
                        .addGap(99, 99, 99)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(txt_msg))
                        .addGap(56, 56, 56)
                        .addComponent(btn_enviar)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_buscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_guardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_eliminar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btn_conectar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_buscar)
                            .addComponent(btn_guardar)
                            .addComponent(btn_eliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_enviar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_conectarActionPerformed
        // TODO add your handling code here:
        try {
            server = new Socket("127.0.0.1", 6969);
            JOptionPane.showMessageDialog(null, "Conectado al Servidor");
            dis = new DataInputStream(server.getInputStream());
            dos = new DataOutputStream(server.getOutputStream());
            ReceiveMessage clientThread = new ReceiveMessage(dis, txt_RecMsg);
            clientThread.setDaemon(true);
            clientThread.setName("Server :");
            clientThread.start();
        } catch (UnknownHostException ex) {
            JOptionPane.showMessageDialog(null, "Conexión Fallida");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Conexión Fallida");
        }
    }//GEN-LAST:event_btn_conectarActionPerformed

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
        // TODO add your handling code here:
        try{
            dos.writeUTF(txt_msg.getText());
            
        }catch(IOException ex){
            Logger.getLogger(ClientForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_enviarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        Chat_Servicio_Cliente chat = new Chat_Servicio_Cliente();
        ConexionCliente con = new ConexionCliente();

        try {
            Chat_Java_Cliente respuesta = chat.recuperarPorNombre(con.obtener(), txt_nombre.getText().toString());

            if (respuesta == null) {
                txt_nombre.setText(null);
                JOptionPane.showMessageDialog(null, "Nombre NO encontrado");
            } else {
                txt_nombre.setText(null);
                txt_msg.setText(respuesta.getNombre());
                JOptionPane.showMessageDialog(null, "Nombre encontrado");
            }

        } catch (SQLException ex) {
            Logger.getLogger(ServerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        Chat_Servicio_Cliente chat = new Chat_Servicio_Cliente();
        ConexionCliente con = new ConexionCliente();

        try {
            chat.guardar(con.obtener(), txt_nombre.getText());
            txt_nombre.setText(null);
            txt_base_datos.setText(null);
            this.llenar();
            JOptionPane.showMessageDialog(null, "Nombre agregado a la base de datos.");

        } catch (SQLException ex) {
            Logger.getLogger(ServerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_base_datosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txt_base_datosAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_base_datosAncestorAdded

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        Chat_Servicio_Cliente chat = new Chat_Servicio_Cliente();
        ConexionCliente con = new ConexionCliente();

        try {
            chat.eliminar(con.obtener(), txt_nombre.getText());
            txt_nombre.setText(null);
            txt_base_datos.setText(null);
            this.llenar();
            JOptionPane.showMessageDialog(null, "Nombre eliminado de la base de datos.");

        } catch (SQLException ex) {
            Logger.getLogger(ServerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(ClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientForm().setVisible(true);
            }
        });
    }
    
    public void llenar(){
        Chat_Servicio_Cliente chat = new Chat_Servicio_Cliente();
        ConexionCliente con = new ConexionCliente();

        try {
            txt_base_datos.setEditable(false);
            List<Chat_Java_Cliente> q = chat.recuperarTodas(con.obtener());

            for (int i = 0; i < q.size(); i++) {
                txt_base_datos.append(q.get(i).getNombre() + "\n");
            }

        } catch (SQLException ex) {
            Logger.getLogger(ServerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_conectar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_enviar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txt_RecMsg;
    private javax.swing.JTextArea txt_base_datos;
    private javax.swing.JTextField txt_msg;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
