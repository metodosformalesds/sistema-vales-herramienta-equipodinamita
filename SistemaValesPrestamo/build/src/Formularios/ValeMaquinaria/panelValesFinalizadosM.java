package Formularios.ValeMaquinaria;

import Formularios.ValeHerramienta.*;
import ElementosSistema.ValeHerramienta;
import ElementosSistema.ValeMaquinaria;
import SQL.metodosSQL;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class panelValesFinalizadosM extends javax.swing.JPanel {
    public panelValesFinalizadosM() {
        initComponents();
        CargarDatos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVales = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1366, 758));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Vales Activos");

        tblVales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblVales);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(637, 637, 637)
                .addComponent(jLabel1)
                .addContainerGap(626, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    DefaultTableModel tabla;
    String tituloColumna[] = {"Folio","Hora Entrada","Fecha","condicionInicial","condicionFinal","Nombre Solicitante","Matricula Solicitante", "Becario Entrega", "Becario Recibe"};
    String filas[] = new String[9];
    metodosSQL metodoSQL = new metodosSQL();                     
    
    private void CargarDatos(){
        ArrayList<ValeMaquinaria> lista =  new ArrayList<>();
        tabla = new DefaultTableModel(null, tituloColumna);
        lista = metodoSQL.BuscarValesFinalizadosM();
        
        for(ValeMaquinaria valeM : lista){
            filas[0] = Integer.toString(valeM.getFolio());
            filas[1] = valeM.getHoraEntrada();
            filas[2] = valeM.getFecha();
            filas[3] = valeM.getCondicionInicial();
            filas[4] = valeM.getCondicionFinal();
            filas[5] = valeM.getNombreSolicitante();
            filas[6] = Integer.toString(valeM.getMatriculaSolicitante());
            filas[7] = Integer.toString(valeM.getMatEntrega());
            filas[8] = Integer.toString(valeM.getMatRecibe());
            tabla.addRow(filas);
        }
        tblVales.setModel(tabla);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVales;
    // End of variables declaration//GEN-END:variables
}
