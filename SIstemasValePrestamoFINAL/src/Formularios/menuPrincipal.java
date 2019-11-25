package Formularios;

import Formularios.Herramientas.panelCambioHerramienta;
import Formularios.Herramientas.panelBajaHerramienta;
import Formularios.Herramientas.panelHerramienta;
import Formularios.Herramientas.panelAltaHerramienta;
import Formularios.Maquinarias.panelAltaMaquinaria;
import Formularios.Maquinarias.panelBajaMaquinaria;
import Formularios.Maquinarias.panelCambioMaquinaria;
import Formularios.Maquinarias.panelMaquinaria;
import java.awt.CardLayout;
import javax.swing.SwingUtilities;
import login.Log;

public class menuPrincipal extends javax.swing.JFrame {
    
    //Paneles Herramienta
    panelHerramienta pnlHerramienta = new panelHerramienta();
    panelAltaHerramienta pnlAltaHerramienta = new panelAltaHerramienta();
    panelCambioHerramienta pnlCambioHerramienta = new panelCambioHerramienta();
    panelBajaHerramienta pnlBajaHerramienta = new panelBajaHerramienta();
    
    //Paneles Maquinaria
    panelMaquinaria pnlMaquinaria = new panelMaquinaria();
    panelAltaMaquinaria pnlAltaMaquinaria = new panelAltaMaquinaria();
    panelCambioMaquinaria pnlCambioMaquinaria = new panelCambioMaquinaria();
    panelBajaMaquinaria pnlBajaMaquinaria = new panelBajaMaquinaria();
    

    
    CardLayout vista;
    
    public menuPrincipal() {
        initComponents();
        vista = (CardLayout) pnlContenido.getLayout();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        btnAltaHerramienta = new javax.swing.JButton();
        btnBajaHerramienta = new javax.swing.JButton();
        btnCambioHerramienta = new javax.swing.JButton();
        btnHerramienta = new javax.swing.JButton();
        txtMaquinaria = new javax.swing.JButton();
        btnAltaMaquinaria = new javax.swing.JButton();
        btnBajaMaquinaria = new javax.swing.JButton();
        btnCambioMaquinaria = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        pnlContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));

        pnlMenu.setBackground(new java.awt.Color(51, 51, 51));
        pnlMenu.setForeground(new java.awt.Color(51, 51, 51));
        pnlMenu.setPreferredSize(new java.awt.Dimension(150, 429));

        btnAltaHerramienta.setText("Altas");
        btnAltaHerramienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaHerramientaActionPerformed(evt);
            }
        });

        btnBajaHerramienta.setText("Bajas");
        btnBajaHerramienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaHerramientaActionPerformed(evt);
            }
        });

        btnCambioHerramienta.setText("Cambios");
        btnCambioHerramienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioHerramientaActionPerformed(evt);
            }
        });

        btnHerramienta.setText("Herramienta");
        btnHerramienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHerramientaActionPerformed(evt);
            }
        });

        txtMaquinaria.setText("Maquinaria");
        txtMaquinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaquinariaActionPerformed(evt);
            }
        });

        btnAltaMaquinaria.setText("Altas");
        btnAltaMaquinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaMaquinariaActionPerformed(evt);
            }
        });

        btnBajaMaquinaria.setText("Bajas");
        btnBajaMaquinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaMaquinariaActionPerformed(evt);
            }
        });

        btnCambioMaquinaria.setText("Cambios");
        btnCambioMaquinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioMaquinariaActionPerformed(evt);
            }
        });

        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCambioHerramienta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBajaHerramienta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAltaHerramienta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
            .addComponent(btnHerramienta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtMaquinaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAltaMaquinaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCambioMaquinaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBajaMaquinaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btnHerramienta)
                .addGap(18, 18, 18)
                .addComponent(btnAltaHerramienta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBajaHerramienta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCambioHerramienta)
                .addGap(45, 45, 45)
                .addComponent(txtMaquinaria)
                .addGap(18, 18, 18)
                .addComponent(btnAltaMaquinaria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBajaMaquinaria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCambioMaquinaria)
                .addContainerGap(329, Short.MAX_VALUE))
        );

        getContentPane().add(pnlMenu, java.awt.BorderLayout.LINE_START);

        pnlContenido.setMaximumSize(new java.awt.Dimension(1366, 758));
        pnlContenido.setMinimumSize(new java.awt.Dimension(1366, 758));
        pnlContenido.setPreferredSize(new java.awt.Dimension(1366, 758));
        pnlContenido.setLayout(new java.awt.CardLayout());
        getContentPane().add(pnlContenido, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaHerramientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaHerramientaActionPerformed
       pnlContenido.add(pnlAltaHerramienta, "altaHerramienta");
       vista.show(pnlContenido, "altaHerramienta");
       SwingUtilities.updateComponentTreeUI(this);
       this.repaint();
       
       pnlAltaHerramienta.LimpiarFormulario();
       pnlAltaHerramienta.LimpiarBuscador();
    }//GEN-LAST:event_btnAltaHerramientaActionPerformed

    private void btnCambioHerramientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioHerramientaActionPerformed
       pnlContenido.add(pnlCambioHerramienta, "cambioHerramienta");
       vista.show(pnlContenido, "cambioHerramienta");
       SwingUtilities.updateComponentTreeUI(this);
       this.repaint();  
       
       pnlCambioHerramienta.LimpiarFormulario();
       pnlCambioHerramienta.LimpiarBuscador();
    }//GEN-LAST:event_btnCambioHerramientaActionPerformed

    private void btnBajaHerramientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaHerramientaActionPerformed
       pnlContenido.add(pnlBajaHerramienta, "bajaHerramienta");
       vista.show(pnlContenido, "bajaHerramienta");
       SwingUtilities.updateComponentTreeUI(this);
       this.repaint();  
       
       pnlBajaHerramienta.LimpiarBuscador();
       pnlBajaHerramienta.LimpiarFormulario();
    }//GEN-LAST:event_btnBajaHerramientaActionPerformed

    private void btnHerramientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHerramientaActionPerformed
       pnlContenido.add(pnlHerramienta, "herramienta");
       vista.show(pnlContenido, "herramienta");
       SwingUtilities.updateComponentTreeUI(this);
       this.repaint();
        
       pnlHerramienta.LimpiarBuscador();
       pnlHerramienta.CargarDatos();
    }//GEN-LAST:event_btnHerramientaActionPerformed

    private void txtMaquinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaquinariaActionPerformed
       pnlContenido.add(pnlMaquinaria, "maquinaria");
       vista.show(pnlContenido, "maquinaria");
       SwingUtilities.updateComponentTreeUI(this);
       this.repaint();
       
       pnlMaquinaria.CargarDatos();
    }//GEN-LAST:event_txtMaquinariaActionPerformed

    private void btnAltaMaquinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaMaquinariaActionPerformed
       pnlContenido.add(pnlAltaMaquinaria, "altaMaquinaria");
       vista.show(pnlContenido, "altaMaquinaria");
       SwingUtilities.updateComponentTreeUI(this);
       this.repaint();
    }//GEN-LAST:event_btnAltaMaquinariaActionPerformed

    private void btnBajaMaquinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaMaquinariaActionPerformed
       pnlContenido.add(pnlBajaMaquinaria, "bajaMaquinaria");
       vista.show(pnlContenido, "bajaMaquinaria");
       SwingUtilities.updateComponentTreeUI(this);
       this.repaint();
    }//GEN-LAST:event_btnBajaMaquinariaActionPerformed

    private void btnCambioMaquinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioMaquinariaActionPerformed
       pnlContenido.add(pnlCambioMaquinaria, "cambioMaquinaria");
       vista.show(pnlContenido, "cambioMaquinaria");
       SwingUtilities.updateComponentTreeUI(this);
       this.repaint();
    }//GEN-LAST:event_btnCambioMaquinariaActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        dispose();
        new Log().setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaHerramienta;
    private javax.swing.JButton btnAltaMaquinaria;
    private javax.swing.JButton btnBajaHerramienta;
    private javax.swing.JButton btnBajaMaquinaria;
    private javax.swing.JButton btnCambioHerramienta;
    private javax.swing.JButton btnCambioMaquinaria;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnHerramienta;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JButton txtMaquinaria;
    // End of variables declaration//GEN-END:variables
}
