package Formularios.ValeHerramienta;

import Formularios.Maquinarias.*;
import Formularios.Herramientas.*;
import SQL.conexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class panelValesH extends javax.swing.JPanel {
    public panelValesH() {
        initComponents();
        
    }
    
    Connection conexion;
    PreparedStatement sentencia;
    ResultSet resultado;
    DefaultTableModel tabla;
    String tituloColumna[] = {"Folio","Hora Entrada","Hora Salida","Fecha","Becario Entrega","Becario Recibe","Estatus","Nombre Solicitante","Matricula Solicitante"};
    String filas[] = new String[9];
    
    public void CargarDatos(){
        
        tabla = new DefaultTableModel(null, tituloColumna);
        
        try {
            conexion = conexionBD.Conectar();
            String consulta = "SELECT Folio, HoraEntrada, HoraSalida, Fecha, MatriculaEntrega, MatriculaRecibe, Estatus, NombreSolicitante, MatriculaSolicitante FROM valeherramienta";
            sentencia = conexion.prepareStatement(consulta);
            resultado = sentencia.executeQuery();
            
            while(resultado.next()){
                filas[0] = resultado.getString(1);
                filas[1] = resultado.getString(2);
                filas[2] = resultado.getString(3);
                filas[3] = resultado.getString(4);
                filas[4] = resultado.getString(5);
                filas[5] = resultado.getString(6);
                filas[6] = resultado.getString(7);
                filas[7] = resultado.getString(8);
                filas[8] = resultado.getString(9);
                tabla.addRow(filas);
            }
            
            tblVales.setModel(tabla);
            
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error" + e);
        }finally{
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(panelValesH.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public void CargarDatos(String folio){
        
        tabla = new DefaultTableModel(null, tituloColumna);
        
        try {
            conexion = conexionBD.Conectar();
            String consulta = "SELECT Folio, HoraEntrada, HoraSalida, Fecha, MatriculaEntrega, MatriculaRecibe, Estatus, NombreSolicitante, MatriculaSolicitante FROM valeherramienta WHERE Folio LIKE" + '"' + folio + "%" + '"';
            sentencia = conexion.prepareStatement(consulta);
            resultado = sentencia.executeQuery();
            
            while(resultado.next()){
                filas[0] = resultado.getString(1);
                filas[1] = resultado.getString(2);
                filas[2] = resultado.getString(3);
                filas[3] = resultado.getString(4);
                filas[4] = resultado.getString(5);
                filas[5] = resultado.getString(6);
                filas[6] = resultado.getString(7);
                filas[7] = resultado.getString(8);
                filas[8] = resultado.getString(9);
                tabla.addRow(filas);
            }
            
            tblVales.setModel(tabla);
            
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error" + e);
        }finally{
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(panelValesH.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public void LimpiarBuscador(){
        txtFolio.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVales = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1366, 758));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Vales Herramienta");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Escriba el # folio para buscar el vale:");

        txtFolio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFolioKeyReleased(evt);
            }
        });

        tblVales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Folio", "Hora Entrada", "Hora Salida", "Fecha", "Becario Entrega", "Becario Recibe", "Estatus", "Nombre Solicitante", "Matricula Solicitante"
            }
        ));
        tblVales.setEnabled(false);
        jScrollPane1.setViewportView(tblVales);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
            .addGroup(layout.createSequentialGroup()
                .addGap(565, 565, 565)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(396, 396, 396)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFolioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFolioKeyReleased
        CargarDatos(txtFolio.getText());
    }//GEN-LAST:event_txtFolioKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVales;
    private javax.swing.JTextField txtFolio;
    // End of variables declaration//GEN-END:variables
}
