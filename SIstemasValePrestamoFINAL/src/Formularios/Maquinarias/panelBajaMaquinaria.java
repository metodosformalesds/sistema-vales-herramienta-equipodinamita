package Formularios.Maquinarias;
import Formularios.Herramientas.*;
import SQL.conexionBD;
import SQL.metodosSQL;
import ElementosSistema.Herramientas;
import ElementosSistema.Maquinarias;
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

public class panelBajaMaquinaria extends javax.swing.JPanel {
    
    private static Connection conexion;
    private static PreparedStatement sentencia;
    private static ResultSet resultado;
    metodosSQL metodoSQL = new metodosSQL();
    Maquinarias maquinaria = new Maquinarias();
    
    public panelBajaMaquinaria() {
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
        jLabel4 = new javax.swing.JLabel();
        lblNumInv = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtNumMaq = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1366, 758));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Eliminar Maquinaria");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Inserte Num. Serie para actualizar datos:");

        txtNumSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumSerieActionPerformed(evt);
            }
        });
        txtNumSerie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumSerieKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("# Maquina:");

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
                        .addComponent(txtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminar)
                                    .addComponent(txtNumMaq, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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
                        .addComponent(txtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNumInv, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtNumMaq, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnEliminar)
                .addContainerGap(512, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumSerieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumSerieKeyReleased
        //BusquedaInventario();
        BuscarMaquinariaEliminar();
        if(txtNumSerie.getText().isEmpty()){
                txtNumSerie.setText("");
                lblNumInv.setText("");
            }
    }//GEN-LAST:event_txtNumSerieKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       /* ModificarDatos();
        LimpiarFormulario();
        ValidacionDatos();
        Bloquear();*/
        
        EliminarHerramienta();
        
                
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtNumSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumSerieActionPerformed

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
        txtNumMaq.setText("");
    }
    
    public void LimpiarBuscador(){
                txtNumSerie.setText("");
                lblNumInv.setText("");
    }
    
    //Metodo que busca en el inventario si existe la herramienta a modificar
    public void BuscarMaquinariaEliminar(){
        
        String numSerie = txtNumSerie.getText();
        String mensaje = metodosSQL.BuscarNumSerie(numSerie);
        
        if(mensaje.equals("Num Serie Existe")){
            lblNumInv.setForeground(Color.yellow);       
            lblNumInv.setText("ATENCION NUM REGISTRADO");
            
            EscribirDatos(numSerie);
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
         maquinaria = metodoSQL.RecolectarDatosMaquinaria(numInv);
         lblNombre.setText(maquinaria.getNombre());
         txtNumMaq.setText(Integer.toString(maquinaria.getNumMaquina()));
    }
    
    
    
    
    public void EliminarHerramienta(){
        
        int opcion;
        opcion = JOptionPane.showConfirmDialog(null, "¿Quiere eliminar la herramienta?", "Confirmar Eliminado", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        
        if(opcion == 0){ //Opcion es SI
            metodoSQL.EliminarMaquinaria(Integer.parseInt(txtNumSerie.getText()));
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
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumInv;
    private javax.swing.JLabel txtNumMaq;
    private javax.swing.JTextField txtNumSerie;
    // End of variables declaration//GEN-END:variables
}
