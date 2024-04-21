
package paqueteprincipal;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;


public class ventanaprincipal extends javax.swing.JFrame {

    
    public ventanaprincipal() {
        initComponents();
        
        ConfiguracionVentana();
    }
    
    public void ConfiguracionVentana(){
        this.setSize(800,600);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInterno = new javax.swing.JDesktopPane();
        barraMenus = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuArchivoAbrir = new javax.swing.JMenuItem();
        menuArchivoCerrar = new javax.swing.JMenuItem();
        menuArchivoCerrarTodo = new javax.swing.JMenuItem();
        menuInfo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuArchivoSalir = new javax.swing.JMenuItem();
        menuVentana = new javax.swing.JMenu();
        menuArchivoCascada = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelInternoLayout = new javax.swing.GroupLayout(panelInterno);
        panelInterno.setLayout(panelInternoLayout);
        panelInternoLayout.setHorizontalGroup(
            panelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        panelInternoLayout.setVerticalGroup(
            panelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        getContentPane().add(panelInterno, java.awt.BorderLayout.CENTER);

        menuArchivo.setText("Archivo");
        menuArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoActionPerformed(evt);
            }
        });

        menuArchivoAbrir.setText("Abrir");
        menuArchivoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoAbrirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuArchivoAbrir);

        menuArchivoCerrar.setText("Cerrar");
        menuArchivoCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoCerrarActionPerformed(evt);
            }
        });
        menuArchivo.add(menuArchivoCerrar);

        menuArchivoCerrarTodo.setText("Cerrar Todo");
        menuArchivoCerrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoCerrarTodoActionPerformed(evt);
            }
        });
        menuArchivo.add(menuArchivoCerrarTodo);

        menuInfo.setText("Info");
        menuInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInfoActionPerformed(evt);
            }
        });
        menuArchivo.add(menuInfo);
        menuArchivo.add(jSeparator1);

        menuArchivoSalir.setText("Salir");
        menuArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuArchivoSalir);

        barraMenus.add(menuArchivo);

        menuVentana.setText("Ventana");

        menuArchivoCascada.setText("Cascada");
        menuArchivoCascada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoCascadaActionPerformed(evt);
            }
        });
        menuVentana.add(menuArchivoCascada);

        barraMenus.add(menuVentana);

        setJMenuBar(barraMenus);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuArchivoCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoCerrarActionPerformed
        ventanainterna vactiva = (ventanainterna) panelInterno.getSelectedFrame();
        if (vactiva!=null){
           vactiva.dispose();
            
        }
    }//GEN-LAST:event_menuArchivoCerrarActionPerformed

    private void menuArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuArchivoSalirActionPerformed

    private void menuArchivoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoAbrirActionPerformed
        JFileChooser abrir = new JFileChooser();
        int boton = abrir.showOpenDialog(null);
        if (boton==JFileChooser.APPROVE_OPTION) {
            //Creacion de la ventana interna
            ventanainterna vi = new ventanainterna();
            vi.setResizable(true);
            vi.setMaximizable(true);
            vi.setIconifiable(true);
            vi.setClosable(true);
            
            panelInterno.add(vi);
            
            String camino = abrir.getSelectedFile().toString();
            vi.setImagen(camino);
            vi.setTitle(camino);
            vi.setVisible(true);
            
        }
    }//GEN-LAST:event_menuArchivoAbrirActionPerformed

    private void menuArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuArchivoActionPerformed

    private void menuInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInfoActionPerformed
        ventanainterna vactiva = (ventanainterna) panelInterno.getSelectedFrame();
         if (vactiva!=null){
            String titulo = vactiva.getTitle();
            JOptionPane.showMessageDialog(null,"Camino de la imgen:\n"+titulo);
            
        } else {
            JOptionPane.showMessageDialog(null,"No hay ninguna imagen seleccionada");
        }
           
    }//GEN-LAST:event_menuInfoActionPerformed

    private void menuArchivoCerrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoCerrarTodoActionPerformed
        int i;
        JInternalFrame v[] = panelInterno.getAllFrames();
        
        for(i=0; i<v.length;i++){
            v[i].dispose();
        }
    }//GEN-LAST:event_menuArchivoCerrarTodoActionPerformed

    private void menuArchivoCascadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoCascadaActionPerformed
         int i;
         int x,y;
         
         JInternalFrame v[] = panelInterno.getAllFrames();
         
         x=0;
         y=0;
         
         for (i=v.length-1;i>=0;i--){
             v[i].setSize(600,400);
             v[i].setLocation(x,y);
             x=x+30;
             y=y+30;
         } 
    }//GEN-LAST:event_menuArchivoCascadaActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenus;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuArchivoAbrir;
    private javax.swing.JMenuItem menuArchivoCascada;
    private javax.swing.JMenuItem menuArchivoCerrar;
    private javax.swing.JMenuItem menuArchivoCerrarTodo;
    private javax.swing.JMenuItem menuArchivoSalir;
    private javax.swing.JMenuItem menuInfo;
    private javax.swing.JMenu menuVentana;
    private javax.swing.JDesktopPane panelInterno;
    // End of variables declaration//GEN-END:variables
}
