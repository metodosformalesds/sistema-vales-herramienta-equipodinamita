package Formularios;

import login.Log;
import Formularios.ValeHerramienta.panelAltaValeH;
import Formularios.ValeHerramienta.panelBajaValesH;
import Formularios.ValeHerramienta.panelEditarValeH;
import Formularios.ValeHerramienta.panelValesActivosH;
import Formularios.ValeHerramienta.panelValesFinalizadosH;
import Formularios.ValeHerramienta.panelValesH;
import Formularios.ValeMaquinaria.panelAltaValeM;
import Formularios.ValeMaquinaria.panelEditarValeM;
import Formularios.ValeMaquinaria.panelEliminarValeM;
import Formularios.ValeMaquinaria.panelValesActivosM;
import Formularios.ValeMaquinaria.panelValesFinalizadosM;
import java.awt.CardLayout;
import javax.swing.SwingUtilities;

public class MenuPrincipalBecario extends javax.swing.JFrame {
    
    //Paneles vale Herramienta
    panelValesH pnlValesH = new panelValesH();
    panelAltaValeH pnlAltaValeH = new panelAltaValeH();
    panelEditarValeH pnlEditarValeH = new panelEditarValeH();
    panelBajaValesH pnlBajaValesH = new panelBajaValesH();
    panelValesActivosH pnlValesActivosH = new panelValesActivosH();
    panelValesFinalizadosH pnlValesFinalizadosH = new panelValesFinalizadosH();
    
    //Paneles vale Maquinaria
    panelAltaValeM pnlAltaValeM = new panelAltaValeM();
    panelEditarValeM pnlEditarValeM = new panelEditarValeM();
    panelEliminarValeM pnlEliminarValeM = new panelEliminarValeM();
    panelValesActivosM pnlValesActivosM = new panelValesActivosM();
    panelValesFinalizadosM pnlValesFinalizadosM = new panelValesFinalizadosM();
    
    CardLayout vista;
    
    public MenuPrincipalBecario() {
        initComponents();
        vista = (CardLayout) pnlContenido.getLayout();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        btnAltaHerramienta = new javax.swing.JButton();
        btnEditarValeH = new javax.swing.JButton();
        btnCambioHerramienta = new javax.swing.JButton();
        btnAltaMaquinaria = new javax.swing.JButton();
        btnBajaMaquinaria = new javax.swing.JButton();
        btnCambioMaquinaria = new javax.swing.JButton();
        btnValesActivosH = new javax.swing.JButton();
        bntValesFinalizadosH = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnValesActivosM = new javax.swing.JButton();
        bntValesFinalizadosH1 = new javax.swing.JButton();
        pnlContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));

        pnlMenu.setBackground(new java.awt.Color(51, 51, 51));
        pnlMenu.setForeground(new java.awt.Color(51, 51, 51));
        pnlMenu.setPreferredSize(new java.awt.Dimension(150, 429));

        btnAltaHerramienta.setText("Crear");
        btnAltaHerramienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaHerramientaActionPerformed(evt);
            }
        });

        btnEditarValeH.setText("Editar");
        btnEditarValeH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarValeHActionPerformed(evt);
            }
        });

        btnCambioHerramienta.setText("Eliminar");
        btnCambioHerramienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioHerramientaActionPerformed(evt);
            }
        });

        btnAltaMaquinaria.setText("Crear");
        btnAltaMaquinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaMaquinariaActionPerformed(evt);
            }
        });

        btnBajaMaquinaria.setText("Editar");
        btnBajaMaquinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaMaquinariaActionPerformed(evt);
            }
        });

        btnCambioMaquinaria.setText("Eliminar");
        btnCambioMaquinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioMaquinariaActionPerformed(evt);
            }
        });

        btnValesActivosH.setText("Vales Activos");
        btnValesActivosH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValesActivosHActionPerformed(evt);
            }
        });

        bntValesFinalizadosH.setText("Vales Finalizados");
        bntValesFinalizadosH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntValesFinalizadosHActionPerformed(evt);
            }
        });

        jButton4.setText("Cerrar Sesión");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vales de Herramientas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("   Vales de Maquinarias");

        btnValesActivosM.setText("Vales Activos");
        btnValesActivosM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValesActivosMActionPerformed(evt);
            }
        });

        bntValesFinalizadosH1.setText("Vales Finalizados");
        bntValesFinalizadosH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntValesFinalizadosH1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(23, 23, 23))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAltaHerramienta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarValeH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCambioHerramienta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnValesActivosH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntValesFinalizadosH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(btnAltaMaquinaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBajaMaquinaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCambioMaquinaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnValesActivosM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntValesFinalizadosH1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnAltaHerramienta)
                .addGap(22, 22, 22)
                .addComponent(btnEditarValeH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCambioHerramienta)
                .addGap(18, 18, 18)
                .addComponent(btnValesActivosH)
                .addGap(18, 18, 18)
                .addComponent(bntValesFinalizadosH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(btnAltaMaquinaria)
                .addGap(18, 18, 18)
                .addComponent(btnBajaMaquinaria)
                .addGap(18, 18, 18)
                .addComponent(btnCambioMaquinaria)
                .addGap(18, 18, 18)
                .addComponent(btnValesActivosM)
                .addGap(18, 18, 18)
                .addComponent(bntValesFinalizadosH1)
                .addGap(115, 115, 115))
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
       pnlContenido.add(pnlAltaValeH, "altaValeHerramienta");
       vista.show(pnlContenido, "altaValeHerramienta");
       SwingUtilities.updateComponentTreeUI(this);
       this.repaint();
       
       pnlAltaValeH.LimpiarFormulario();
       pnlAltaValeH.LimpiarBuscador();
       
    }//GEN-LAST:event_btnAltaHerramientaActionPerformed

    private void btnCambioHerramientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioHerramientaActionPerformed
       pnlContenido.add(pnlBajaValesH, "bajaValeH");
       vista.show(pnlContenido, "bajaValeH");
       SwingUtilities.updateComponentTreeUI(this);
       this.repaint();
    }//GEN-LAST:event_btnCambioHerramientaActionPerformed

    private void btnEditarValeHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarValeHActionPerformed
       pnlContenido.add(pnlEditarValeH, "editarValeH");
       vista.show(pnlContenido, "editarValeH");
       SwingUtilities.updateComponentTreeUI(this);
       this.repaint();
       
       pnlEditarValeH.LimpiarFormulario();
       pnlEditarValeH.LimpiarBuscador();
    }//GEN-LAST:event_btnEditarValeHActionPerformed

    private void btnAltaMaquinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaMaquinariaActionPerformed
       pnlContenido.add(pnlAltaValeM, "altaValeMaquinaria");
       vista.show(pnlContenido, "altaValeMaquinaria");
       SwingUtilities.updateComponentTreeUI(this);
       this.repaint();
    }//GEN-LAST:event_btnAltaMaquinariaActionPerformed

    private void btnBajaMaquinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaMaquinariaActionPerformed
       pnlContenido.add(pnlEditarValeM, "editarValeM");
       vista.show(pnlContenido, "editarValeM");
       SwingUtilities.updateComponentTreeUI(this);
       this.repaint();
    }//GEN-LAST:event_btnBajaMaquinariaActionPerformed

    private void btnCambioMaquinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioMaquinariaActionPerformed
       pnlContenido.add(pnlEliminarValeM, "eliminarValeM");
       vista.show(pnlContenido, "eliminarValeM");
       SwingUtilities.updateComponentTreeUI(this);
       this.repaint();
    }//GEN-LAST:event_btnCambioMaquinariaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
        new Log().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnValesActivosHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValesActivosHActionPerformed
       pnlContenido.add(pnlValesActivosH, "valesActivosH");
       vista.show(pnlContenido, "valesActivosH");
       SwingUtilities.updateComponentTreeUI(this);
       this.repaint();
    }//GEN-LAST:event_btnValesActivosHActionPerformed

    private void bntValesFinalizadosHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntValesFinalizadosHActionPerformed
       pnlContenido.add(pnlValesFinalizadosH, "valesFinalizadosH");
       vista.show(pnlContenido, "valesFinalizadosH");
       SwingUtilities.updateComponentTreeUI(this);
       this.repaint();
    }//GEN-LAST:event_bntValesFinalizadosHActionPerformed

    private void btnValesActivosMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValesActivosMActionPerformed
       pnlContenido.add(pnlValesActivosM, "valesActivosM");
       vista.show(pnlContenido, "valesActivosM");
       SwingUtilities.updateComponentTreeUI(this);
       this.repaint();       this.repaint();    }//GEN-LAST:event_btnValesActivosMActionPerformed

    private void bntValesFinalizadosH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntValesFinalizadosH1ActionPerformed
       pnlContenido.add(pnlValesFinalizadosM, "valesFinalizadosM");
       vista.show(pnlContenido, "valesFinalizadosM");
       SwingUtilities.updateComponentTreeUI(this);
       this.repaint();
    }//GEN-LAST:event_bntValesFinalizadosH1ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalBecario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntValesFinalizadosH;
    private javax.swing.JButton bntValesFinalizadosH1;
    private javax.swing.JButton btnAltaHerramienta;
    private javax.swing.JButton btnAltaMaquinaria;
    private javax.swing.JButton btnBajaMaquinaria;
    private javax.swing.JButton btnCambioHerramienta;
    private javax.swing.JButton btnCambioMaquinaria;
    private javax.swing.JButton btnEditarValeH;
    private javax.swing.JButton btnValesActivosH;
    private javax.swing.JButton btnValesActivosM;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}
