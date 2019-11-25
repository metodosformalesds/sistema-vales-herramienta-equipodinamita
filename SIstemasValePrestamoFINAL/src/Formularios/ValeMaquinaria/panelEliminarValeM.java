package Formularios.ValeMaquinaria;

import Formularios.ValeHerramienta.*;
import Formularios.Maquinarias.*;
import Formularios.Herramientas.*;
import SQL.metodosSQL;
import ElementosSistema.Herramientas;
import ElementosSistema.Maquinarias;
import ElementosSistema.ValeMaquinaria;
import SQL.conexionBD;
import java.awt.Color;
import java.io.File;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class panelEliminarValeM extends javax.swing.JPanel {
    
    //Atributos de la clase
    metodosSQL metodoSQL = new metodosSQL();
    Herramientas herramienta = new Herramientas();
  
    
    Connection conexion;
    PreparedStatement sentencia;
    ResultSet resultado;
    DefaultTableModel tablaMaquinaria;
    String tituloColumna[] = {"# Serie", "Nombre", "# Máquina"};
    String filas[] = new String[3];
    
    //Constructor de la clase
    public panelEliminarValeM() {
        initComponents(); 
        Bloquear();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        lblInfo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtHoraEntrada = new javax.swing.JTextField();
        txtHoraSalida = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDocente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtRecibe = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtEntrega = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblFolio = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtMatSolicitante = new javax.swing.JTextField();
        txtNomSolicitante = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbCondicionInicial = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        cmbCondicionFinal = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtNumMaquina = new javax.swing.JTextField();
        txtNumSerieMaquina = new javax.swing.JTextField();
        txtNombreMaquina = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1366, 758));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Eliminar Vale ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Folio");

        txtFolio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFolioKeyReleased(evt);
            }
        });

        lblInfo.setBackground(new java.awt.Color(255, 255, 255));
        lblInfo.setPreferredSize(new java.awt.Dimension(6, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Hora Salida");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Hora Entrada");

        txtHoraEntrada.setEnabled(false);
        txtHoraEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHoraEntradaKeyReleased(evt);
            }
        });

        txtHoraSalida.setEnabled(false);
        txtHoraSalida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHoraSalidaKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Docente");

        txtDocente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDocenteKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Fecha");

        txtFecha.setEnabled(false);
        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFechaKeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Matricula Becario Recibe");

        txtRecibe.setEnabled(false);
        txtRecibe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRecibeKeyReleased(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Matricula Becario Entrega");

        txtEntrega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEntregaKeyReleased(evt);
            }
        });

        btnGuardar.setText("Eliminar Vale");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Matricula Solicitante");

        txtMatSolicitante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMatSolicitanteKeyReleased(evt);
            }
        });

        txtNomSolicitante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomSolicitanteKeyReleased(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Nombre Solicitante");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Condición Inicial");

        cmbCondicionInicial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una opción", "Limpia", "Sucia" }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Condición Final");

        cmbCondicionFinal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una opción", "Limpia", "Sucia" }));
        cmbCondicionFinal.setEnabled(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("# Serie");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Nombre");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("# Máquina");

        txtNumMaquina.setEnabled(false);

        txtNumSerieMaquina.setEnabled(false);

        txtNombreMaquina.setEnabled(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Maquinaria");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMatSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRecibe, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(329, 329, 329)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 319, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(173, 173, 173))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(8, 8, 8)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel8)
                                        .addGap(33, 33, 33)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(396, 396, 396)
                                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbCondicionInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbCondicionFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(437, 437, 437)
                                .addComponent(jLabel18)))
                        .addContainerGap(493, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(502, 502, 502)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreMaquina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumSerieMaquina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(lblFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cmbCondicionInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(cmbCondicionFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtNumSerieMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtNombreMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtNumMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMatSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRecibe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(142, 142, 142))))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    //Evento de la caja de inventario
    private void txtFolioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFolioKeyReleased
        LlenarCampos(txtFolio.getText());
        Validacion();
    }//GEN-LAST:event_txtFolioKeyReleased

    private void txtHoraEntradaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraEntradaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraEntradaKeyReleased

    private void txtHoraSalidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraSalidaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraSalidaKeyReleased

    private void txtDocenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocenteKeyReleased
        Validacion();
    }//GEN-LAST:event_txtDocenteKeyReleased

    private void txtFechaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaKeyReleased

    private void txtRecibeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRecibeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecibeKeyReleased

    private void txtEntregaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntregaKeyReleased
        Validacion();
    }//GEN-LAST:event_txtEntregaKeyReleased

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        EliminarVale();
        LimpiarFormulario();
        LimpiarBuscador();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtMatSolicitanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatSolicitanteKeyReleased
        Validacion();
    }//GEN-LAST:event_txtMatSolicitanteKeyReleased

    private void txtNomSolicitanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomSolicitanteKeyReleased
        Validacion();
    }//GEN-LAST:event_txtNomSolicitanteKeyReleased

   
    public void EstablecerHoraFecha(){
        SimpleDateFormat hora = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat fecha = new SimpleDateFormat("yyyy/MM/dd");
        Calendar calendar = Calendar.getInstance();
        txtHoraEntrada.setText(hora.format(calendar.getTime()));
        txtFecha.setText(fecha.format(calendar.getTime()));
    }
     
    public void LimpiarFormulario(){
        
        txtDocente.setText("");
        txtEntrega.setText("");
        txtNomSolicitante.setText("");
        txtMatSolicitante.setText("");
        txtHoraEntrada.setText("");
        txtHoraSalida.setText("");
        txtFecha.setText("");
        cmbCondicionInicial.setSelectedIndex(0);
        txtNumSerieMaquina.setText("");
        txtNombreMaquina.setText("");
        txtNumMaquina.setText("");
    }
    
    public void LimpiarBuscador(){
        
        txtFolio.setText("");
        lblFolio.setText("");
    }
    
    public void Bloquear(){
       
        txtDocente.setEnabled(false);
        txtEntrega.setEnabled(false);
        txtNomSolicitante.setEnabled(false);
        txtMatSolicitante.setEnabled(false);
        cmbCondicionInicial.setEnabled(false);
        btnGuardar.setEnabled(false);
        
    }
    
  
    
    public void Validacion(){
        String mensaje = metodoSQL.BuscarNumFolioM(txtFolio.getText());
        
        if(mensaje.equals("Num Folio Existe")){
            lblFolio.setForeground(Color.YELLOW);
            lblFolio.setText("Folio registrado");
        }else{
            lblFolio.setForeground(Color.red);
            lblFolio.setText("Sin resultados");
        }
        
        if(txtDocente.getText().isEmpty() || txtEntrega.getText().isEmpty() 
                ||txtFolio.getText().isEmpty() ||txtNomSolicitante.getText().isEmpty() 
                || txtMatSolicitante.getText().isEmpty()){
            btnGuardar.setEnabled(false);
        }else{
            btnGuardar.setEnabled(true);
        }
    }
    
    public void LlenarCampos(String folio){
        
      ValeMaquinaria valeMaquinaria = new ValeMaquinaria();
      valeMaquinaria = metodoSQL.RecolectarDatosValeM(folio);
      
      txtHoraEntrada.setText(valeMaquinaria.getHoraEntrada());
      txtHoraSalida.setText(valeMaquinaria.getHoraSalida());
      txtFecha.setText(valeMaquinaria.getFecha());
      txtDocente.setText(valeMaquinaria.getDocente());
      
      txtNomSolicitante.setText(valeMaquinaria.getNombreSolicitante());
      txtMatSolicitante.setText(Integer.toString(valeMaquinaria.getMatriculaSolicitante()));
      txtEntrega.setText(Integer.toString(valeMaquinaria.getMatEntrega()));
      txtRecibe.setText(Integer.toString(valeMaquinaria.getMatRecibe()));
      cmbCondicionInicial.setSelectedItem(valeMaquinaria.getCondicionInicial());
      
      ObtenerMaquinariaVale(Integer.toString(valeMaquinaria.getIdMaquinaria()));
     
      //String idHerramienta = Integer.toString(valeHerramienta.getIdHerramienta());
      
    }
    
    public void ObtenerMaquinariaVale(String numSerie){
        Maquinarias maquinaria = new Maquinarias();
        maquinaria = metodoSQL.RecopilarMaquinaria(numSerie);
        
        txtNumSerieMaquina.setText(Integer.toString(maquinaria.getNumSerie()));
        txtNombreMaquina.setText(maquinaria.getNombre());
        txtNumMaquina.setText(Integer.toString(maquinaria.getNumMaquina()));
    }
    
    public void EliminarVale(){
        int opcion;
        opcion = JOptionPane.showConfirmDialog(null, "¿Quiere eliminar la herramienta?", "Confirmar Eliminado", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        
        if(opcion == 0){ //Opcion es SI
            metodoSQL.EliminarValeM(Integer.parseInt(txtFolio.getText()));
            LimpiarFormulario();
            LimpiarBuscador();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox cmbCondicionFinal;
    private javax.swing.JComboBox cmbCondicionInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblFolio;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JTextField txtDocente;
    private javax.swing.JTextField txtEntrega;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtHoraEntrada;
    private javax.swing.JTextField txtHoraSalida;
    private javax.swing.JTextField txtMatSolicitante;
    private javax.swing.JTextField txtNomSolicitante;
    private javax.swing.JTextField txtNombreMaquina;
    private javax.swing.JTextField txtNumMaquina;
    private javax.swing.JTextField txtNumSerieMaquina;
    private javax.swing.JTextField txtRecibe;
    // End of variables declaration//GEN-END:variables
}
