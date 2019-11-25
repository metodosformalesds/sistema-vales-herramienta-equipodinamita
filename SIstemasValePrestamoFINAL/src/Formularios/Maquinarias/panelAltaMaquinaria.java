package Formularios.Maquinarias;

import Formularios.Herramientas.*;
import SQL.metodosSQL;
import ElementosSistema.Herramientas;
import ElementosSistema.Maquinarias;
import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class panelAltaMaquinaria extends javax.swing.JPanel {
    
    //Atributos de la clase
    metodosSQL metodoSQL = new metodosSQL();
    Maquinarias maquinaria = new Maquinarias();
    
    //Constructor de la clase
    public panelAltaMaquinaria() {
        initComponents();     
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtSerie = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();
        cmbNum = new javax.swing.JComboBox();

        setPreferredSize(new java.awt.Dimension(1366, 758));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Alta Maquinaria");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Número de serie:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Número de Máquina:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        txtSerie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSerieKeyReleased(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblInfo.setBackground(new java.awt.Color(255, 255, 255));
        lblInfo.setPreferredSize(new java.awt.Dimension(6, 20));

        cmbNum.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "#", "1", "2", "3", "4", "5" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(332, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(338, 338, 338))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbNum, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(624, 624, 624)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addComponent(btnGuardar)
                .addContainerGap(345, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    //Evento del boton guardar
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        //El texto de los txtbox es asignado a los atributos del objeto        
        maquinaria.setNumSerie(Integer.parseInt(txtSerie.getText()));
        maquinaria.setNombre(txtNombre.getText());
        maquinaria.setNumMaquina(cmbNum.getSelectedIndex());
        
                
        //Metodo para crear la sentencia de SQL que guardará los datos en la BD.
        metodoSQL.GuardarDatosMaquinaria(maquinaria.getNumSerie(), maquinaria.getNombre(), maquinaria.getNumMaquina());
        
        LimpiarFormulario();
    }//GEN-LAST:event_btnGuardarActionPerformed

    //Evento de la caja de inventario
    private void txtSerieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerieKeyReleased
       Validacion();
       if(txtSerie.getText().isEmpty()){
                txtSerie.setText("");
                lblInfo.setText("");
            }
    }//GEN-LAST:event_txtSerieKeyReleased

   
    //Evento de la caja de nombre
    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        Validacion();
    }//GEN-LAST:event_txtNombreKeyReleased

    
     public void Validacion(){
        
       String mensaje = metodosSQL.BuscarNumSerie(txtSerie.getText());
       
       if(mensaje.equals("Num Serie Existe")){
           lblInfo.setForeground(Color.RED);
           lblInfo.setText("N.Inventario Registrado");
           Bloquear();
       }else{
           lblInfo.setForeground(Color.GREEN);
           lblInfo.setText("N.Serie no Registrado");
           Desbloquear();
       }
       
       if(txtSerie.getText().isEmpty() || txtNombre.getText().isEmpty() 
                ){
           btnGuardar.setEnabled(false);
       }else{
           btnGuardar.setEnabled(true);
       }
           
       
        
    }
     
    public void LimpiarFormulario(){
        //Limpia los campos del formulario
        txtSerie.setText("");
        txtNombre.setText("");
        cmbNum.setSelectedIndex(0);
        
    }
    
    public void LimpiarBuscador(){
        lblInfo.setText("");
    }
    
    public void Bloquear(){
        txtNombre.setEnabled(false);
        cmbNum.setEnabled(false);
        btnGuardar.setEnabled(false);
    }
    
    public void Desbloquear(){
       txtNombre.setEnabled(true);
       cmbNum.setEnabled(true);
       btnGuardar.setEnabled(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox cmbNum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSerie;
    // End of variables declaration//GEN-END:variables
}
