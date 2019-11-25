package Formularios.ValeHerramienta;

import Formularios.Maquinarias.*;
import Formularios.Herramientas.*;
import SQL.metodosSQL;
import ElementosSistema.Herramientas;
import ElementosSistema.Maquinarias;
import ElementosSistema.ValeHerramienta;
import SQL.conexionBD;
import java.awt.Color;
import java.io.File;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class panelEditarValeH extends javax.swing.JPanel {
    
    //Atributos de la clase
    metodosSQL metodoSQL = new metodosSQL();
    ValeHerramienta valeHerramienta = new ValeHerramienta();
  
    
    Connection conexion;
    PreparedStatement sentencia;
    ResultSet resultado;
    DefaultTableModel tabla, tablaHerramienta;
    String tituloColumna[] = {"Numero Inventario", "Nombre", "Características", "Cantidad"};
    String filas[] = new String[4];
    
    //Constructor de la clase
    public panelEditarValeH() {
        initComponents();     
        CargarDatos();
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
        jLabel9 = new javax.swing.JLabel();
        txtClase = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPractica = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtObs = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtRecibe = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtEntrega = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVale = new javax.swing.JTable();
        cmbLab = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHerramientas = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblFolio = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtNomSolicitante = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtMatSolicitante = new javax.swing.JTextField();
        btnMarcarEntregada = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCerrarVale = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1366, 758));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Editar Vale Herramientas");

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

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Clase");

        txtClase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClaseKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Práctica");

        txtPractica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPracticaKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Num Lab");

        txtObs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtObsKeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Observaciones");

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

        tblVale.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num Inventario", "Nombre ", "Características", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tblVale);

        cmbLab.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Laboratorio", "D1-101", "D1-105", "D1-107", "D1-111", "D2-105" }));

        tblHerramientas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Num Inventario", "Nombre ", "Características", "Cantidad"
            }
        ));
        jScrollPane2.setViewportView(tblHerramientas);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Herramientas en el vale");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Buscar:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Lista de Herramientas");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        btnAgregar.setText("<<<");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel3.setText("Agregar");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Nombre Solicitante");

        txtNomSolicitante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomSolicitanteKeyReleased(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Matricula Solicitante");

        txtMatSolicitante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMatSolicitanteKeyReleased(evt);
            }
        });

        btnMarcarEntregada.setText("Marcar herramienta como entregada");
        btnMarcarEntregada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcarEntregadaActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar Cambios");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCerrarVale.setText("Cerrar Vale");
        btnCerrarVale.setEnabled(false);
        btnCerrarVale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarValeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(502, 502, 502)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(396, 396, 396)
                                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel17)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnMarcarEntregada)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAgregar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13))
                        .addContainerGap(193, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(txtNomSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(173, 173, 173))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cmbLab, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtClase, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel8))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPractica, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel19))
                                        .addGap(386, 386, 386)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtObs)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRecibe, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMatSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(251, 251, 251)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(btnCerrarVale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(301, 301, 301))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(txtDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtClase, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPractica, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbLab, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel19)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMarcarEntregada))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20)
                    .addComponent(btnCerrarVale, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRecibe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
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

    private void txtClaseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaseKeyReleased
        Validacion();
    }//GEN-LAST:event_txtClaseKeyReleased

    private void txtPracticaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPracticaKeyReleased
        Validacion();
    }//GEN-LAST:event_txtPracticaKeyReleased

    private void txtObsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtObsKeyReleased
        Validacion();
    }//GEN-LAST:event_txtObsKeyReleased

    private void txtRecibeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRecibeKeyReleased
        Validacion();
    }//GEN-LAST:event_txtRecibeKeyReleased

    private void txtEntregaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntregaKeyReleased
        Validacion();
    }//GEN-LAST:event_txtEntregaKeyReleased

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        CargarDatos(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        btnCerrarVale.setEnabled(false);
        EscribirDatos();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtNomSolicitanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomSolicitanteKeyReleased
        Validacion();
    }//GEN-LAST:event_txtNomSolicitanteKeyReleased

    private void txtMatSolicitanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatSolicitanteKeyReleased
        Validacion();
    }//GEN-LAST:event_txtMatSolicitanteKeyReleased

    private void btnMarcarEntregadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcarEntregadaActionPerformed
        MarcarHerramientaEntregada(txtFolio.getText());
        System.out.println("rows: " + tblVale.getRowCount());
    }//GEN-LAST:event_btnMarcarEntregadaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        AltaValeH();
        LimpiarFormulario();
        LimpiarBuscador();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCerrarValeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarValeActionPerformed
        EstablecerHoraSalida();
        CerrarValeH();
    }//GEN-LAST:event_btnCerrarValeActionPerformed

   
    public void EstablecerHoraSalida(){
        SimpleDateFormat hora = new SimpleDateFormat("HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        txtHoraSalida.setText(hora.format(calendar.getTime()));
    }
     
    public void LimpiarFormulario(){
        txtBuscar.setText("");
        txtClase.setText("");
        txtDocente.setText("");
        txtEntrega.setText("");
        txtObs.setText("");
        txtPractica.setText("");
        txtNomSolicitante.setText("");
        txtMatSolicitante.setText("");
        txtHoraEntrada.setText("");
        txtHoraSalida.setText("");
        txtFecha.setText("");
        cmbLab.setSelectedIndex(0);
        tablaHerramienta = new DefaultTableModel(null, tituloColumna);
        tblVale.setModel(tablaHerramienta);
    }
    
    public void LimpiarBuscador(){
        txtBuscar.setText("");
        txtFolio.setText("");
        lblFolio.setText("");
    }
    
    public void Bloquear(){
        txtBuscar.setEnabled(false);
        txtClase.setEnabled(false);
        txtDocente.setEnabled(false);
        txtEntrega.setEnabled(false);
        txtObs.setEnabled(false);
        txtPractica.setEnabled(false);
        cmbLab.setEnabled(false);
    }
    
    public void Desbloquear(){
        txtBuscar.setEnabled(true);
        txtClase.setEnabled(true);
        txtDocente.setEnabled(true);
        txtEntrega.setEnabled(true);
        txtObs.setEnabled(true);
        txtPractica.setEnabled(true);
        cmbLab.setEnabled(true);
    }
    
    
    public void CargarDatos() {

        tabla = new DefaultTableModel(null, tituloColumna);

        try {
            conexion = conexionBD.Conectar();
            String consulta = "SELECT * FROM herramientas";
            sentencia = conexion.prepareStatement(consulta);
            resultado = sentencia.executeQuery();

            while (resultado.next()) {
                filas[0] = resultado.getString(1);
                filas[1] = resultado.getString(2);
                filas[2] = resultado.getString(3);
                filas[3] = resultado.getString(4);
                tabla.addRow(filas);
            }

            tblHerramientas.setModel(tabla);

            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error" + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(panelHerramienta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
    public void CargarDatos(String nombre) {

        tabla = new DefaultTableModel(null, tituloColumna);

        try {
            conexion = conexionBD.Conectar();
            String consulta = "SELECT * FROM herramientas WHERE nombre LIKE" + '"' + nombre + "%" + '"';
            sentencia = conexion.prepareStatement(consulta);
            resultado = sentencia.executeQuery();

            while (resultado.next()) {
                filas[0] = resultado.getString(1);
                filas[1] = resultado.getString(2);
                filas[2] = resultado.getString(3);
                filas[3] = resultado.getString(4);
                tabla.addRow(filas);
            }

            tblHerramientas.setModel(tabla);

            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error" + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(panelHerramienta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
    public void EscribirDatos(){
        
        tabla = (DefaultTableModel)tblHerramientas.getModel();
        int selectedRow = tblHerramientas.getSelectedRow();
        
        DefaultTableModel tablaVale = (DefaultTableModel)tblVale.getModel();
        
        filas [0] = tabla.getValueAt(selectedRow, 0).toString();
        filas [1] = tabla.getValueAt(selectedRow, 1).toString();
        filas [2] = tabla.getValueAt(selectedRow, 2).toString();
        filas [3] = tabla.getValueAt(selectedRow, 3).toString();
        
        tablaVale.addRow(filas);
        tblVale.setModel(tablaVale);
        
    }    
    
    public void AltaValeH(){
        int folio = Integer.parseInt(txtFolio.getText());
        String horaEntrada = txtHoraEntrada.getText();
        String horaSalida = txtHoraSalida.getText();
        String fecha = txtFecha.getText();
        String docente = txtDocente.getText();
        String clase = txtClase.getText();
        String practica = txtPractica.getText();
        int idHerramienta;
        String lab = cmbLab.getSelectedItem().toString();
        String observaciones = txtObs.getText();
        int matEntrega = Integer.parseInt(txtEntrega.getText());
        int matRecibe = 0;
        String status = "Activo";
        String nomSolicitante = txtNomSolicitante.getText();
        int matSolicitante = Integer.parseInt(txtMatSolicitante.getText());
        
        int filas = tblVale.getModel().getRowCount();
        int columnas = tblVale.getModel().getColumnCount(); 
        for(int i = 0; i < filas; i++){
            System.out.println("NumInv" + tblVale.getModel().getValueAt(i, 0));
            idHerramienta = Integer.parseInt((String)tblVale.getModel().getValueAt(i, 0));
            
           metodoSQL.AltaValeH(folio, horaEntrada, horaSalida, fecha, docente, 
                    clase, practica, idHerramienta, lab, observaciones, 
                    matEntrega, matRecibe, status, nomSolicitante, matSolicitante);
        }  
    }
    
    public void Validacion(){
        String mensaje = metodoSQL.BuscarNumFolioH(txtFolio.getText());
        String folio = txtFolio.getText();
        
        if(mensaje.equals("Num Folio Existe")){
            lblFolio.setForeground(Color.GREEN);
            lblFolio.setText("Folio encontrado");
            Desbloquear();
        }else{
            lblFolio.setForeground(Color.red);
            lblFolio.setText("Sin resultados");
            Bloquear();
        }
        
        //Condiciones para guardar cambios.
        if(txtClase.getText().isEmpty() || txtDocente.getText().isEmpty()
                || txtEntrega.getText().isEmpty() || txtFolio.getText().isEmpty() || txtPractica.getText().isEmpty()){
            btnGuardar.setEnabled(false);
        }else{
            btnGuardar.setEnabled(true);
        }
        
        //Condiciones para cerrar el vale
        if(txtRecibe.getText().isEmpty()){
            btnGuardar.setEnabled(false);
        }else{
            btnGuardar.setEnabled(true);
        }
    }
    
    public void LlenarCampos(String folio){
        
      valeHerramienta = metodoSQL.RecolectarDatosValeH(folio);
      
      txtHoraEntrada.setText(valeHerramienta.getHoraEntrada());
      txtHoraSalida.setText(valeHerramienta.getHoraSalida());
      txtDocente.setText(valeHerramienta.getDocente());
      txtClase.setText(valeHerramienta.getClase());
      txtPractica.setText(valeHerramienta.getPractica());
      cmbLab.setSelectedItem(valeHerramienta.getLab());
      txtObs.setText(valeHerramienta.getObservaciones());
      txtNomSolicitante.setText(valeHerramienta.getNombreSolicitante());
      txtMatSolicitante.setText(Integer.toString(valeHerramienta.getMatriculaSolicitante()));
      txtEntrega.setText(Integer.toString(valeHerramienta.getMatEntrega()));
      txtRecibe.setText(Integer.toString(valeHerramienta.getMatRecibe()));
      obtenerHerramientasVale();
      
      String idHerramienta = Integer.toString(valeHerramienta.getIdHerramienta());
      
    }
    
    public void obtenerHerramientasVale(){
        
        ArrayList<String> lista = new ArrayList<String>();
        ArrayList<Herramientas> listaHerramientas = new ArrayList<Herramientas>();
        
        tabla = new DefaultTableModel(null, tituloColumna);
        
        //Desde la base de datos se recopilan los numeros de inventario
        //de la tabla de vales.
        lista = metodoSQL.RecopilarNumInv(txtFolio.getText());
        
        //Desde la base de datos se reocpila la informacion de las herramientas
        //de la tabla de herramientas.
        listaHerramientas = metodoSQL.RecopilarHerramienta(lista);
        
        for (Herramientas listaHerramienta : listaHerramientas) {
            //System.out.println("nombre" + listaHerramientas.get(i).getNombre());
            filas[0] = Integer.toString(listaHerramienta.getNumInventario());
            filas[1] = listaHerramienta.getNombre();
            filas[2] = listaHerramienta.getCaracteristicas();
            filas[3] = Integer.toString(listaHerramienta.getCantidad());
            tabla.addRow(filas);
        }
        
        tblVale.setModel(tabla);
    }
    
    public void ModificarDatos(String folio){
        valeHerramienta.setDocente(txtDocente.getText());
        valeHerramienta.setClase(txtClase.getText());
        valeHerramienta.setPractica(txtPractica.getText());
        valeHerramienta.setLab(cmbLab.getSelectedItem().toString());
        valeHerramienta.setObservaciones(txtObs.getText());
        valeHerramienta.setMatEntrega(Integer.parseInt(txtEntrega.getText()));
        valeHerramienta.setMatRecibe(Integer.parseInt(txtRecibe.getText()));
        valeHerramienta.setNombreSolicitante(txtNomSolicitante.getText());
        valeHerramienta.setMatriculaSolicitante(Integer.parseInt(txtMatSolicitante.getText()));
        
        metodoSQL.ModificarDatosvaleH(folio, valeHerramienta);
        
    }
    
    public void MarcarHerramientaEntregada(String folio){
        ArrayList<String> listaNumInv = new ArrayList<>();
        tabla = (DefaultTableModel)tblVale.getModel();
        int selectedRow = tblVale.getSelectedRow();
        String numInv = tabla.getValueAt(selectedRow, 0).toString();
        listaNumInv.add(numInv);
        tabla.removeRow(tblVale.getSelectedRow());
        metodoSQL.CambiarEstadoVale(folio, listaNumInv);
        
        if(tblVale.getRowCount() != 0){
            txtRecibe.setEnabled(true);
        }
    }
    
    public void CerrarValeH(){
        String folio = txtFolio.getText();
        String horaSalida = txtHoraSalida.getText();
        int matRecibe = Integer.parseInt(txtRecibe.getText());
        metodoSQL.CerrarVale(folio, horaSalida, matRecibe);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCerrarVale;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMarcarEntregada;
    private javax.swing.JComboBox cmbLab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFolio;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JTable tblHerramientas;
    private javax.swing.JTable tblVale;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtClase;
    private javax.swing.JTextField txtDocente;
    private javax.swing.JTextField txtEntrega;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtHoraEntrada;
    private javax.swing.JTextField txtHoraSalida;
    private javax.swing.JTextField txtMatSolicitante;
    private javax.swing.JTextField txtNomSolicitante;
    private javax.swing.JTextField txtObs;
    private javax.swing.JTextField txtPractica;
    private javax.swing.JTextField txtRecibe;
    // End of variables declaration//GEN-END:variables
}
