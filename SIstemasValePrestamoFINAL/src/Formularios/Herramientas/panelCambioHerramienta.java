package Formularios.Herramientas;

import SQL.metodosSQL;
import ElementosSistema.Herramientas;
import ElementosSistema.Maquinarias;
import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class panelCambioHerramienta extends javax.swing.JPanel {
    //Atributos de la clase
    metodosSQL metodoSQL = new metodosSQL();
    Herramientas herramienta = new Herramientas();
    
   //Metodos de la clase
    
    //Constructor de la clase
    public panelCambioHerramienta() {
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
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCar = new javax.swing.JTextField();
        lblNumInv = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1366, 758));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cambios Herramienta");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Inserte Num.Inventario para actualizar datos:");

        txtNumInv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumInvKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad:");

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Características:");

        txtCar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCarKeyReleased(evt);
            }
        });

        btnActualizar.setText("Actualizar Datos");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(252, 252, 252)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(257, 257, 257)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtCar)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumInv, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnActualizar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNumInv, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(jLabel1)))
                .addContainerGap(508, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar)
                .addContainerGap(408, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    //Evento de caja de busqueda
    private void txtNumInvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumInvKeyReleased
        BusquedaInventario();
        if(txtNumInv.getText().isEmpty()){
                txtNumInv.setText("");
                lblNumInv.setText("");
            }
    }//GEN-LAST:event_txtNumInvKeyReleased

    //Evento del boton de actualizar
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        ModificarDatos();
        LimpiarFormulario();
        ValidacionDatos();
        Bloquear();
    }//GEN-LAST:event_btnActualizarActionPerformed

    //Evento de caja de nombre
    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        ValidacionDatos();
    }//GEN-LAST:event_txtNombreKeyReleased

    //Evento de caja de cantidad
    private void txtCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyReleased
        ValidacionDatos();
    }//GEN-LAST:event_txtCantidadKeyReleased

    //Evento de caja de caracteristicas
    private void txtCarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCarKeyReleased
        ValidacionDatos();
    }//GEN-LAST:event_txtCarKeyReleased
    
    //Metodo que bloquea las cajas de texto y el boton
    public void Bloquear(){
        
        txtNombre.setEnabled(false);
        txtCantidad.setEnabled(false);
        txtCar.setEnabled(false);
        btnActualizar.setEnabled(false);
    }
    
    //Metodo que desbloque las cajas de texto y el boton 
    public void Desbloquear(){
        
        txtNombre.setEnabled(true);
        txtCantidad.setEnabled(true);
        txtCar.setEnabled(true);
        btnActualizar.setEnabled(true);
        ValidacionDatos();
    }
    
    //Metodo que limpia la informacion del formulario
    public void LimpiarFormulario(){
        //Limpia los campos del formulario
        //txtInventario.setText("");
        txtNombre.setText("");
        txtCantidad.setText("");
        txtCar.setText("");
    }
    
    //Metodo que busca la informacion de la caja de busqueda
    public void LimpiarBuscador(){
        txtNumInv.setText("");
        lblNumInv.setText("");
    }
    
    //Metodo que busca en el inventario si existe la herramienta a modificar
    public void BusquedaInventario(){
        
        String numInv = txtNumInv.getText();
        String mensaje = metodosSQL.BuscarNumInv(numInv);
        
        if(mensaje.equals("Num Inv Existe")){
            lblNumInv.setForeground(Color.GREEN);
            lblNumInv.setText("Num Inv Encontrado.");
            
            EscribirDatos(numInv);
            Desbloquear();
            
        }else{
            lblNumInv.setForeground(Color.red);
            lblNumInv.setText("Sin resultados.");
            Bloquear();
            LimpiarFormulario();
        }     
    }
    
    //Metodo que modifica los datos en la BD
    public void ModificarDatos(){
        
        herramienta.setNumInventario(Integer.parseInt(txtNumInv.getText()));
        herramienta.setNombre(txtNombre.getText());
        herramienta.setCantidad(Integer.parseInt(txtCantidad.getText()));
        
        
        
        metodoSQL.ModificarDatos(herramienta.getNumInventario(), herramienta.getNombre(),
                herramienta.getCaracteristicas(), herramienta.getCantidad());
                
        txtNumInv.setText("");
        lblNumInv.setText("");
        
    }
    
    //Metodo que valida que no se hayan dejado cajas de texto vacias
    public void ValidacionDatos(){
        
        if(txtNombre.getText().isEmpty() || txtCantidad.getText().isEmpty() || txtCar.getText().isEmpty()){
            btnActualizar.setEnabled(false);
        }else{
            btnActualizar.setEnabled(true);
        }
        
    }

    //Metodo que escribe en las cajas los atributos de la herramienta a modificar
    public void EscribirDatos(String numInv){
         herramienta = metodoSQL.RecolectarDatos(numInv);
         txtNombre.setText(herramienta.getNombre());
         txtCantidad.setText(Integer.toString(herramienta.getCantidad()));
         txtCar.setText(herramienta.getCaracteristicas());
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblNumInv;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumInv;
    // End of variables declaration//GEN-END:variables
}
