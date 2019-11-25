package Formularios.Herramientas;

import SQL.conexionBD;
import SQL.metodosSQL;
import ElementosSistema.Herramientas;
import java.awt.Color;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class panelBajaHerramienta extends javax.swing.JPanel {
    
    private static Connection conexion;
    private static PreparedStatement sentencia;
    private static ResultSet resultado;
    metodosSQL metodoSQL = new metodosSQL();
    Herramientas herramienta = new Herramientas();
    
    public panelBajaHerramienta() {
        initComponents();
        Bloquear();
    }

    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumInv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblNumInv = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblCar = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1366, 758));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Eliminar Herramienta");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Inserte Num.Inventario para actualizar datos:");

        txtNumInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumInvActionPerformed(evt);
            }
        });
        txtNumInv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumInvKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Características:");

        btnEliminar.setText("Eliminar Herramienta");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumInv, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNumInv, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblCar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(13, 13, 13)
                                    .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(btnEliminar)))
                .addContainerGap(500, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtNumInv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNumInv, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnEliminar)
                .addContainerGap(411, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumInvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumInvKeyReleased
        //BusquedaInventario();
        BuscarHerramientaEliminar();
        if(txtNumInv.getText().isEmpty()){
                txtNumInv.setText("");
                lblNumInv.setText("");
            }
    }//GEN-LAST:event_txtNumInvKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       /* ModificarDatos();
        LimpiarFormulario();
        ValidacionDatos();
        Bloquear();*/
        
        EliminarHerramienta();
        
                
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtNumInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumInvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumInvActionPerformed

    public void Bloquear(){
        btnEliminar.setEnabled(false);
    }
    
    public void Desbloquear(){
        btnEliminar.setEnabled(true);
        //ValidacionDatos();
    }
    
    public void LimpiarFormulario(){
        //Limpia los campos del formulario
        //txtInventario.setText("");
        lblNombre.setText("");
        lblCantidad.setText("");
        lblCar.setText("");
        
    }
    
    public void LimpiarBuscador(){
                txtNumInv.setText("");
                lblNumInv.setText("");
    }
    
    //Metodo que busca en el inventario si existe la herramienta a modificar
    public void BuscarHerramientaEliminar(){
        
        String numInv = txtNumInv.getText();
        String mensaje = metodosSQL.BuscarNumInv(numInv);
        
        if(mensaje.equals("Num Inv Existe")){
            lblNumInv.setForeground(Color.GREEN);
            lblNumInv.setText("Num Inv Encontrado.");
            lblNumInv.setForeground(Color.yellow);       
            lblNumInv.setText("ATENCION NUM REGISTRADO");
            
            EscribirDatos(numInv);
            Desbloquear();
            
        }else{
            lblNumInv.setForeground(Color.red);
            lblNumInv.setText("Sin resultados.");
            Bloquear();
            LimpiarFormulario();
        }     
    }
    
    //Metodo que escribe en las cajas los atributos de la herramienta a modificar
    public void EscribirDatos(String numInv){
         herramienta = metodoSQL.RecolectarDatos(numInv);
         lblNombre.setText(herramienta.getNombre());
         lblCantidad.setText(Integer.toString(herramienta.getCantidad()));
         lblCar.setText(herramienta.getCaracteristicas());
    }
    
    
    public void EliminarHerramienta(){
        
        int opcion;
        opcion = JOptionPane.showConfirmDialog(null, "¿Quiere eliminar la herramienta?", "Confirmar Eliminado", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        
        if(opcion == 0){ //Opcion es SI
            metodoSQL.EliminarHerramienta(Integer.parseInt(txtNumInv.getText()));
            LimpiarFormulario();
            LimpiarBuscador();
            Bloquear();
        }
    }
            
    
    
    

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumInv;
    private javax.swing.JTextField txtNumInv;
    // End of variables declaration//GEN-END:variables
}
