/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pou.presentacion;

import java.util.List;
import mx.itson.pou.entidades.Producto;
import mx.itson.pou.negocio.Negocio;
import mx.itson.pou.persistencia.Persistencia;

/**
 *
 * @author SaulUrias
 */
public final class Estante extends javax.swing.JFrame {

    /**
     * Creates new form Estante
     */
    public Estante() {
        initComponents();
        this.setSize(365, 300);
        MostrarProductos();
    }
    Persistencia persistencia = new Persistencia();
    List<Producto> productos = persistencia.obtenerProductos();
    Negocio negocio = new Negocio();
    
    
    public void MostrarProductos(){
        lblPrimeraImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+productos.get(0).getNombre()+".png")));
        lblPrimera.setText(productos.get(0).getNombre() + " X " + productos.get(0).getCantidad());
        
        lblSegundaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+productos.get(1).getNombre()+".png")));
        lblSegunda.setText(productos.get(1).getNombre() + " X " + productos.get(1).getCantidad());
        
        lblTerceraImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+productos.get(2).getNombre()+".png")));
        lblTercera.setText(productos.get(2).getNombre() + " X " + productos.get(2).getCantidad());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEstante = new javax.swing.JPanel();
        lblPrimera = new javax.swing.JLabel();
        lblSegunda = new javax.swing.JLabel();
        lblTercera = new javax.swing.JLabel();
        lblPrimeraImagen = new javax.swing.JLabel();
        lblSegundaImagen = new javax.swing.JLabel();
        lblTerceraImagen = new javax.swing.JLabel();
        lblImageEstante = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panelEstante.setLayout(null);

        lblPrimera.setFont(new java.awt.Font("Seravek", 1, 18)); // NOI18N
        lblPrimera.setForeground(new java.awt.Color(255, 255, 255));
        lblPrimera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelEstante.add(lblPrimera);
        lblPrimera.setBounds(10, 130, 170, 20);

        lblSegunda.setFont(new java.awt.Font("Seravek", 1, 18)); // NOI18N
        lblSegunda.setForeground(new java.awt.Color(255, 255, 255));
        lblSegunda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelEstante.add(lblSegunda);
        lblSegunda.setBounds(180, 130, 180, 20);

        lblTercera.setFont(new java.awt.Font("Seravek", 1, 18)); // NOI18N
        lblTercera.setForeground(new java.awt.Color(255, 255, 255));
        lblTercera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelEstante.add(lblTercera);
        lblTercera.setBounds(0, 210, 190, 20);

        lblPrimeraImagen.setToolTipText("");
        panelEstante.add(lblPrimeraImagen);
        lblPrimeraImagen.setBounds(50, 80, 90, 50);

        lblSegundaImagen.setToolTipText("");
        panelEstante.add(lblSegundaImagen);
        lblSegundaImagen.setBounds(230, 80, 70, 50);

        lblTerceraImagen.setToolTipText("");
        panelEstante.add(lblTerceraImagen);
        lblTerceraImagen.setBounds(50, 160, 90, 50);

        lblImageEstante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/estante.jpg"))); // NOI18N
        panelEstante.add(lblImageEstante);
        lblImageEstante.setBounds(0, 0, 370, 300);

        getContentPane().add(panelEstante);
        panelEstante.setBounds(0, 0, 365, 289);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Estante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblImageEstante;
    private javax.swing.JLabel lblPrimera;
    private javax.swing.JLabel lblPrimeraImagen;
    private javax.swing.JLabel lblSegunda;
    private javax.swing.JLabel lblSegundaImagen;
    private javax.swing.JLabel lblTercera;
    private javax.swing.JLabel lblTerceraImagen;
    private javax.swing.JPanel panelEstante;
    // End of variables declaration//GEN-END:variables
}
