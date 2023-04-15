/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.zonacontrolador;
import javax.swing.DefaultListModel;
import modelo.zona;

/**
 *
 * @author ANDREA
 */
public class vistazona extends javax.swing.JFrame {

    private zonacontrolador controlador = new zonacontrolador();
    private DefaultListModel model = new DefaultListModel();

    public vistazona() {
        initComponents();
        this.jList1.setModel(model);
        this.jList1.removeAll();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IDZONA = new javax.swing.JLabel();
        NOMBREZONA = new javax.swing.JLabel();
        DESCRIPCIONZONA = new javax.swing.JLabel();
        LISTACURSOSZONA = new javax.swing.JLabel();
        TEXT1 = new javax.swing.JTextField();
        TEXT2 = new javax.swing.JTextField();
        TEXT3 = new javax.swing.JTextField();
        TEXT4 = new javax.swing.JTextField();
        AGREGARZONA = new javax.swing.JButton();
        LISTARZONA = new javax.swing.JButton();
        BUSCARZONA = new javax.swing.JButton();
        EDITARZONA = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        IDZONA.setText("ID");

        NOMBREZONA.setText("NOMBRE");

        DESCRIPCIONZONA.setText("DESCRIPCION");

        LISTACURSOSZONA.setText("LISTA  DE CURSOS");

        AGREGARZONA.setText("AGREGAR");
        AGREGARZONA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AGREGARZONAMouseClicked(evt);
            }
        });

        LISTARZONA.setText("LISTAR");
        LISTARZONA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LISTARZONAMouseClicked(evt);
            }
        });

        BUSCARZONA.setText("BUSCAR");
        BUSCARZONA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BUSCARZONAMouseClicked(evt);
            }
        });

        EDITARZONA.setText("EDITAR");
        EDITARZONA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EDITARZONAMouseClicked(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LISTACURSOSZONA, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AGREGARZONA, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(LISTARZONA)))
                        .addGap(77, 77, 77)
                        .addComponent(BUSCARZONA))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DESCRIPCIONZONA, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(NOMBREZONA, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(47, 47, 47)
                                    .addComponent(IDZONA, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TEXT1)
                            .addComponent(TEXT2)
                            .addComponent(TEXT3)
                            .addComponent(TEXT4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(EDITARZONA))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IDZONA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TEXT1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NOMBREZONA, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TEXT2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DESCRIPCIONZONA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TEXT3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(LISTACURSOSZONA, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(TEXT4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AGREGARZONA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LISTARZONA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BUSCARZONA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EDITARZONA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(191, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AGREGARZONAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AGREGARZONAMouseClicked
        zona z = new zona(this.TEXT1.getText(), this.TEXT2.getText(), this.TEXT3.getText(), this.TEXT4.getText());
        controlador.addzona(z);
        this.TEXT1.setText("");
        this.TEXT2.setText("");
        this.TEXT3.setText("");
        this.TEXT4.setText("");
        System.out.println("zona: " + controlador.getzonalista().toString());

    }//GEN-LAST:event_AGREGARZONAMouseClicked

    private void LISTARZONAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LISTARZONAMouseClicked
        DefaultListModel model = new DefaultListModel();
        this.jList1.removeAll();
        for (int i = 0; i < this.controlador.getzonalista().size(); i++) {
            zona z = this.controlador.getzonalista().get(i);
            model.addElement(z.getNombre());
        }
        this.jList1.setModel(model);

    }//GEN-LAST:event_LISTARZONAMouseClicked

    private void BUSCARZONAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BUSCARZONAMouseClicked
        System.out.println(this.jList1.getSelectedIndex());
        int indice = this.jList1.getSelectedIndex();
        zona z = this.controlador.getzonalista().get(indice);
        this.TEXT1.setText(z.getID());
        this.TEXT2.setText(z.getNombre());
        this.TEXT3.setText(z.getDescripcion());
        this.TEXT4.setText(z.getListacursos());
      

    }//GEN-LAST:event_BUSCARZONAMouseClicked

    private void EDITARZONAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EDITARZONAMouseClicked
       zona z = new zona(this.TEXT1.getText(), this.TEXT2.getText(), this.TEXT3.getText(), this.TEXT4.getText());
        this.TEXT1.setText(z.getID());
        this.TEXT2.setText(z.getNombre());
        this.TEXT3.setText(z.getDescripcion());
        this.TEXT4.setText(z.getListacursos());
         this.controlador.actualizarzona(z);
    }//GEN-LAST:event_EDITARZONAMouseClicked

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
            java.util.logging.Logger.getLogger(vistazona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistazona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistazona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistazona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistazona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AGREGARZONA;
    private javax.swing.JButton BUSCARZONA;
    private javax.swing.JLabel DESCRIPCIONZONA;
    private javax.swing.JButton EDITARZONA;
    private javax.swing.JLabel IDZONA;
    private javax.swing.JLabel LISTACURSOSZONA;
    private javax.swing.JButton LISTARZONA;
    private javax.swing.JLabel NOMBREZONA;
    private javax.swing.JTextField TEXT1;
    private javax.swing.JTextField TEXT2;
    private javax.swing.JTextField TEXT3;
    private javax.swing.JTextField TEXT4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
