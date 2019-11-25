package Formularios.Maquinarias;

import Formularios.Herramientas.*;
import SQL.metodosSQL;
import ElementosSistema.Herramientas;
import ElementosSistema.Maquinarias;
import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class panelCambioMaquinaria extends javax.swing.JPanel {
    //Atributos de la clase
    metodosSQL metodoSQL = new metodosSQL();
    Maquinarias maquinaria = new Maquinarias();
    
   //Metodos de la clase
    
    //Constructor de la clase
    public panelCambioMaquinaria() {
        initComponents();
        Bloquear();
    }

    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumSerie = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNumMaq = new javax.swing.JTextField();
        lblNumInv = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1366, 758));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cambios Maquinaria");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Inserte Num. Serie para actualizar datos:");

        txtNumSerie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumSerieKeyReleased(evt);
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
        jLabel4.setText("# Máquina:");

        txtNumMaq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumMaqKeyReleased(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(252, 252, 252)
                                .addComponent(txtNumMaq, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnActualizar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNumInv, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(jLabel1)))
                .addContainerGap(498, Short.MAX_VALUE))
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
                        .addComponent(txtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNumInv, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNumMaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnActualizar)
                .addContainerGap(514, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    //Evento de caja de busqueda
    private void txtNumSerieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumSerieKeyReleased
        BusquedaInventario();
    }//GEN-LAST:event_txtNumSerieKeyReleased

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
    private void txtNumMaqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumMaqKeyReleased
        ValidacionDatos();
    }//GEN-LAST:event_txtNumMaqKeyReleased
    
    //Metodo que bloquea las cajas de texto y el boton
    public void Bloquear(){
        
        txtNombre.setEnabled(false);
        txtNumMaq.setEnabled(false);
        btnActualizar.setEnabled(false);
    }
    
    //Metodo que desbloque las cajas de texto y el boton 
    public void Desbloquear(){
        
        txtNombre.setEnabled(true);
        txtNumMaq.setEnabled(true);
        btnActualizar.setEnabled(true);
        ValidacionDatos();
    }
    
    //Metodo que limpia la informacion del formulario
    public void LimpiarFormulario(){
        //Limpia los campos del formulario
        //txtInventario.setText("");
        txtNombre.setText("");
        txtNumMaq.setText("");
    }
    
    //Metodo que busca la informacion de la caja de busqueda
    public void LimpiarBuscador(){
        txtNumSerie.setText("");
        lblNumInv.setText("");
    }
    
    //Metodo que busca en el inventario si existe la herramienta a modificar
    public void BusquedaInventario(){
        
        String numSerie = txtNumSerie.getText();
        String mensaje = metodosSQL.BuscarNumSerie(numSerie);
        
        if(mensaje.equals("Num Serie Existe")){
            lblNumInv.setForeground(Color.GREEN);
            lblNumInv.setText("Num Inv Encontrado.");
            
            EscribirDatos(numSerie);
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
        
        maquinaria.setNumSerie(Integer.parseInt(txtNumSerie.getText()));
        maquinaria.setNombre(txtNombre.getText());
        maquinaria.setNumMaquina(Integer.parseInt(txtNumMaq.getText()));
        
        metodoSQL.ModificarDatosMaquinaria(maquinaria.getNumSerie(), maquinaria.getNombre(),
                maquinaria.getNumMaquina());
                
        txtNumSerie.setText("");
        lblNumInv.setText("");
        
    }
    
    //Metodo que valida que no se hayan dejado cajas de texto vacias
    public void ValidacionDatos(){
        
        if(txtNombre.getText().isEmpty() || txtNumMaq.getText().isEmpty()){
            btnActualizar.setEnabled(false);
        }else{
            btnActualizar.setEnabled(true);
        }
        
    }

    //Metodo que escribe en las cajas los atributos de la herramienta a modificar
    public void EscribirDatos(String numInv){
         maquinaria = metodoSQL.RecolectarDatosMaquinaria(numInv);
         txtNombre.setText(maquinaria.getNombre());
         txtNumMaq.setText(Integer.toString(maquinaria.getNumMaquina()));
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblNumInv;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumMaq;
    private javax.swing.JTextField txtNumSerie;
    // End of variables declaration//GEN-END:variables
}
