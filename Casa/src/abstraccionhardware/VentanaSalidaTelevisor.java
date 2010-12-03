/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaSalidaTelevisor.java
 *
 * Created on 22/04/2010, 11:21:20
 */

package abstraccionhardware;

import dominio.Canal;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class VentanaSalidaTelevisor extends javax.swing.JFrame
{

    private Kernel kernel;
    private Collection canales = new ArrayList();

    /** Creates new form VentanaSalidaTelevisor */
    public VentanaSalidaTelevisor() {
        initComponents();
    }

    public VentanaSalidaTelevisor(Kernel kernel)
    {
        this.kernel = kernel;
        initComponents();
        this.centrar();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCanales = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TelevisorSimpson.jpg"))); // NOI18N

        jTableCanales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCanales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCanalesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCanales);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableCanalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCanalesMouseClicked
        // TODO add your handling code here:
        this.mostrarImagen();
    }//GEN-LAST:event_jTableCanalesMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaSalidaTelevisor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCanales;
    // End of variables declaration//GEN-END:variables

    private void centrar()
    {
        Dimension pantalla, cuadro;
	pantalla = Toolkit.getDefaultToolkit().getScreenSize();
	cuadro = this.getSize();
	this.setLocation(((pantalla.width - cuadro.width)/2), (pantalla.height - cuadro.height)/2);
    }

    private void limpiar()
    {
        DefaultTableModel modelo = (DefaultTableModel)this.jTableCanales.getModel();
        while(this.jTableCanales.getRowCount() != 0)
                modelo.removeRow(0);
        modelo = null;
    }
    
    private void cargarCanales()
    {
       this.limpiar();
       Iterator it = this.canales.iterator();
       DefaultTableModel modelo = (DefaultTableModel)this.jTableCanales.getModel();
       String[] datos = new String[1];
       while(it.hasNext())
       {
           Canal c = (Canal)it.next();
           datos[0] = c.getNombre().trim();
           modelo.addRow(datos);
       }
       this.mostrar(0);
    }

    public void setCanales(Collection canales)
    {
        this.canales = canales;
        this.cargarCanales();
    }

    private void mostrarImagen()
    {
        String canal = String.valueOf(this.jTableCanales.getValueAt(this.jTableCanales.getSelectedRow(), this.jTableCanales.getSelectedColumn()));
        Iterator it = this.canales.iterator();
        while(it.hasNext())
        {
            Canal c = (Canal)it.next();
            if(c.getNombre().trim().equals(canal.trim()))
            {
                this.mostrar(c.getCodigo());
                break;
            }
            c = null;
        }
    }

    private void mostrar(int id)
    {
        String imagen = "";
        switch(id)
        {
            case 0:
                    imagen = "Televisor.jpg";
                    break;
            case 1:
                    imagen = "Cosmopolitan.jpg";
                    break;
            case 2:
                    imagen = "Sony.png";
                    break;
//            case 3:

            case 4:
                    imagen = "Axn.JPG";
                    break;
            case 5:
                    imagen = "Fox.png";
                    break;
            case 6:
                    imagen = "Fx.png";
                    break;
            case 7:
                    imagen = "Espn.jpg";
                    break;
            case 8:
                    imagen = "EspnMas.png";
                    break;
            case 9:
                    imagen = "Universal.jpg";
                    break;
            case 10:
                    imagen = "CineCanal.jpg";
                    break;
            case 11:
                    imagen = "Disney.jpg";
                    break;
            case 12:
                    imagen = "Discovery.jpg";
                    break;
            case 13:
                    imagen = "AanimalPlanet.png";
                    break;
            case 14:
                    imagen = "NationalGeographic.png";
                    break;
            case 15:
                    imagen = "Utilisima.jpg";
                    break;
            case 16:
                    imagen = "Tn.jpg";
                    break;
            case 17:
                    imagen = "Cronica.jpg";
                    break;
            case 18:
                    imagen = "C5n.png";
                    break;
        }

        ImageIcon i = createImageIcon("/imagenes/canales/"+imagen);
        ImageIcon tmpIcon = new ImageIcon(i.getImage().getScaledInstance(this.jLabel1.getWidth(), this.jLabel1.getHeight(), Image.SCALE_DEFAULT));
        this.jLabel1.setIcon(tmpIcon);
    }

    protected static ImageIcon createImageIcon(String path)
    {
        //FrmLogin es el nombre de la clase
        java.net.URL imgURL = VentanaPrincipal.class.getResource(path);
//        System.out.println("Path:" + imgURL.getPath());
        if (imgURL != null)
            return new ImageIcon(imgURL);
        else
            return null;
    }
}