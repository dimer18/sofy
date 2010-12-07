/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UIVentanaPrincipal.java
 *
 * Created on 19/05/2010, 01:20:48
 */

package vista;

import distribuciones.Empirica;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.JOptionPane;
import javax.swing.text.Caret;
import vista.util.Datos;
import vista.util.UIVentanaPrincipalUtil;

/**
 *
 * @author Carolina
 */
public class UIVentanaPrincipal extends javax.swing.JFrame
{

    private UIVentanaPrincipalUtil util = new UIVentanaPrincipalUtil(this);
    private Collection distribucionesAGenerar = new ArrayList();
    private Empirica empirica = new Empirica();
    


    /** Creates new form UIVentanaPrincipal */
    public UIVentanaPrincipal() {
        initComponents();
        this.inicializar();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBoxDistribuciones = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNombreVariable = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabelParametro4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldParametro1 = new javax.swing.JTextField();
        jTextFieldParametro2 = new javax.swing.JTextField();
        jTextFieldParametro3 = new javax.swing.JTextField();
        jTextFieldSemilla = new javax.swing.JTextField();
        jLabelParametro1 = new javax.swing.JLabel();
        jLabelParametro2 = new javax.swing.JLabel();
        jLabelParametro3 = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jCheckBoxSemilla = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonGenerar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemNuevo = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuConfiguracion = new javax.swing.JMenu();
        jMenuItemTest = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccion Distribucion"));

        jComboBoxDistribuciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "UNIFORME", "NORMAL", "BINOMIAL", "TRIANGULAR", "EXPONENCIAL", "ERLANG", "POISSON", "WEIBULL", "DIST. EMPIRICA" }));
        jComboBoxDistribuciones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxDistribucionesItemStateChanged(evt);
            }
        });
        jComboBoxDistribuciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDistribucionesActionPerformed(evt);
            }
        });

        jLabel1.setText("Distribuciones");

        jTextFieldNombreVariable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNombreVariableFocusLost(evt);
            }
        });
        jTextFieldNombreVariable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNombreVariableKeyReleased(evt);
            }
        });

        jLabel2.setText("Nombre de la Variable Aleatoria");

        jTextFieldCantidad.setText("0");
        jTextFieldCantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldCantidadFocusGained(evt);
            }
        });
        jTextFieldCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCantidadKeyReleased(evt);
            }
        });

        jLabelParametro4.setText("Cantidad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxDistribuciones, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNombreVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelParametro4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabelParametro4))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDistribuciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombreVariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccion de Parametros"));

        jTextFieldParametro1.setText("0");
        jTextFieldParametro1.setEnabled(false);
        jTextFieldParametro1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldParametro1FocusGained(evt);
            }
        });
        jTextFieldParametro1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldParametro1KeyReleased(evt);
            }
        });

        jTextFieldParametro2.setText("0");
        jTextFieldParametro2.setEnabled(false);
        jTextFieldParametro2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldParametro2FocusGained(evt);
            }
        });
        jTextFieldParametro2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldParametro2KeyReleased(evt);
            }
        });

        jTextFieldParametro3.setText("0");
        jTextFieldParametro3.setEnabled(false);
        jTextFieldParametro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldParametro3ActionPerformed(evt);
            }
        });
        jTextFieldParametro3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldParametro3FocusGained(evt);
            }
        });

        jTextFieldSemilla.setText("1");
        jTextFieldSemilla.setEnabled(false);

        jLabelParametro1.setText("Parametro 1");

        jLabelParametro2.setText("Parametro 2");

        jLabelParametro3.setText("Parametro 3");

        jButtonAceptar.setText("Agregar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jCheckBoxSemilla.setText("Semilla");
        jCheckBoxSemilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSemillaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldParametro1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelParametro1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelParametro2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldParametro2, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelParametro3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldParametro3, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldSemilla, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                        .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBoxSemilla))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelParametro1)
                    .addComponent(jLabelParametro2)
                    .addComponent(jLabelParametro3)
                    .addComponent(jCheckBoxSemilla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldParametro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldParametro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldParametro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSemilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAceptar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Variables a Generar"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Variable", "Distribucion", "Parametro 1", "Parametro 2", "Parametro 3", "Cantidad", "Semilla"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonGenerar.setText("Generar");
        jButtonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jMenuArchivo.setText("Archivo");

        jMenuItemNuevo.setText("Nuevo...");
        jMenuArchivo.add(jMenuItemNuevo);

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemSalir);

        jMenuBar1.add(jMenuArchivo);

        jMenuConfiguracion.setText("Configuracion");

        jMenuItemTest.setText("Test...");
        jMenuItemTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTestActionPerformed(evt);
            }
        });
        jMenuConfiguracion.add(jMenuItemTest);

        jMenuBar1.add(jMenuConfiguracion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jButtonGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGenerar)
                    .addComponent(jButtonNuevo)
                    .addComponent(jButtonSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxDistribucionesItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_jComboBoxDistribucionesItemStateChanged
    {//GEN-HEADEREND:event_jComboBoxDistribucionesItemStateChanged
        // TODO add your handling code here:
        this.seleccionarParametros();
        this.jTextFieldNombreVariable.requestFocus();
    }//GEN-LAST:event_jComboBoxDistribucionesItemStateChanged

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSalirActionPerformed
    {//GEN-HEADEREND:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        this.salir();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItemSalirActionPerformed
    {//GEN-HEADEREND:event_jMenuItemSalirActionPerformed
        // TODO add your handling code here:
        this.salir();
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jCheckBoxSemillaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBoxSemillaActionPerformed
    {//GEN-HEADEREND:event_jCheckBoxSemillaActionPerformed
        // TODO add your handling code here:
        if(this.jCheckBoxSemilla.isSelected())
        {
            this.jTextFieldSemilla.setCaretPosition(0);
            this.jTextFieldSemilla.moveCaretPosition(1);
            this.jTextFieldSemilla.setEnabled(true);
        }
            
        else
            this.jTextFieldSemilla.setEnabled(false);
    }//GEN-LAST:event_jCheckBoxSemillaActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonAceptarActionPerformed
    {//GEN-HEADEREND:event_jButtonAceptarActionPerformed
        // TODO add your handling code here:
        if(this.util.verificarNombreRepetido(distribucionesAGenerar, this.jTextFieldNombreVariable.getText()))
            if(this.util.validarCantidad(jTextFieldCantidad))
                if(this.jCheckBoxSemilla.isSelected())
                {
                    if(this.util.validarSemilla(this.jTextFieldSemilla))
                        this.agregar();
                    else
                    {
                        JOptionPane.showMessageDialog(null, "La semilla debe ser un valor entero", "Error de parametros", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else
                {
                    this.agregar();
                }
                
            else
                JOptionPane.showMessageDialog(null, "La cantidad a generar debe ser mayor que cero", "Error de parametros", JOptionPane.ERROR_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Ya existe una variable con ese nombre, escoja otro nombre de variable aleatoria", "Nombre de variable repetida", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonNuevoActionPerformed
    {//GEN-HEADEREND:event_jButtonNuevoActionPerformed
        // TODO add your handling code here:
        this.nuevo();
        this.jTextFieldNombreVariable.requestFocus();
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonGenerarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonGenerarActionPerformed
    {//GEN-HEADEREND:event_jButtonGenerarActionPerformed
        // TODO add your handling code here:
        this.generar();
    }//GEN-LAST:event_jButtonGenerarActionPerformed

    private void jMenuItemTestActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItemTestActionPerformed
    {//GEN-HEADEREND:event_jMenuItemTestActionPerformed
        // TODO add your handling code here:
        this.Test();
    }//GEN-LAST:event_jMenuItemTestActionPerformed

    private void jComboBoxDistribucionesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxDistribucionesActionPerformed
    {//GEN-HEADEREND:event_jComboBoxDistribucionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDistribucionesActionPerformed

    private void jTextFieldNombreVariableKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextFieldNombreVariableKeyReleased
    {//GEN-HEADEREND:event_jTextFieldNombreVariableKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == 10)
        {
            this.jTextFieldCantidad.requestFocus();
        }
            
    }//GEN-LAST:event_jTextFieldNombreVariableKeyReleased

    private void jTextFieldCantidadKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextFieldCantidadKeyReleased
    {//GEN-HEADEREND:event_jTextFieldCantidadKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == 10)
            if(this.jTextFieldParametro1.isEnabled())
            {
                this.jTextFieldParametro1.requestFocus();
            }
                
    }//GEN-LAST:event_jTextFieldCantidadKeyReleased

    private void jTextFieldParametro1KeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextFieldParametro1KeyReleased
    {//GEN-HEADEREND:event_jTextFieldParametro1KeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == 10)
            if(this.jTextFieldParametro2.isEnabled())
            {
                this.jTextFieldParametro2.requestFocus();
            }
    }//GEN-LAST:event_jTextFieldParametro1KeyReleased

    private void jTextFieldParametro2KeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextFieldParametro2KeyReleased
    {//GEN-HEADEREND:event_jTextFieldParametro2KeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == 10)
            if(this.jTextFieldParametro3.isEnabled())
            {
                this.jTextFieldParametro3.requestFocus();
            }
    }//GEN-LAST:event_jTextFieldParametro2KeyReleased

    private void jTextFieldNombreVariableFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTextFieldNombreVariableFocusLost
    {//GEN-HEADEREND:event_jTextFieldNombreVariableFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreVariableFocusLost

    private void jTextFieldCantidadFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTextFieldCantidadFocusGained
    {//GEN-HEADEREND:event_jTextFieldCantidadFocusGained
        // TODO add your handling code here:
        this.jTextFieldCantidad.setCaretPosition(0);
        this.jTextFieldCantidad.moveCaretPosition(1);
    }//GEN-LAST:event_jTextFieldCantidadFocusGained

    private void jTextFieldParametro3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldParametro3ActionPerformed
    {//GEN-HEADEREND:event_jTextFieldParametro3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldParametro3ActionPerformed

    private void jTextFieldParametro3FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTextFieldParametro3FocusGained
    {//GEN-HEADEREND:event_jTextFieldParametro3FocusGained
        // TODO add your handling code here:
        this.jTextFieldParametro3.setCaretPosition(0);
        this.jTextFieldParametro3.moveCaretPosition(1);
    }//GEN-LAST:event_jTextFieldParametro3FocusGained

    private void jTextFieldParametro2FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTextFieldParametro2FocusGained
    {//GEN-HEADEREND:event_jTextFieldParametro2FocusGained
        // TODO add your handling code here:
        this.jTextFieldParametro2.setCaretPosition(0);
        this.jTextFieldParametro2.moveCaretPosition(1);
    }//GEN-LAST:event_jTextFieldParametro2FocusGained

    private void jTextFieldParametro1FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTextFieldParametro1FocusGained
    {//GEN-HEADEREND:event_jTextFieldParametro1FocusGained
        // TODO add your handling code here:
        this.jTextFieldParametro1.setCaretPosition(0);
        this.jTextFieldParametro1.moveCaretPosition(1);
    }//GEN-LAST:event_jTextFieldParametro1FocusGained

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == 127)
            this.distribucionesAGenerar = this.util.quitar(distribucionesAGenerar, jTable1);
    }//GEN-LAST:event_jTable1KeyPressed

//    /**
//    * @param args the command line arguments
//    */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new UIVentanaPrincipal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonGenerar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JCheckBox jCheckBoxSemilla;
    private javax.swing.JComboBox jComboBoxDistribuciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelParametro1;
    private javax.swing.JLabel jLabelParametro2;
    private javax.swing.JLabel jLabelParametro3;
    private javax.swing.JLabel jLabelParametro4;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConfiguracion;
    private javax.swing.JMenuItem jMenuItemNuevo;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenuItem jMenuItemTest;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldNombreVariable;
    private javax.swing.JTextField jTextFieldParametro1;
    private javax.swing.JTextField jTextFieldParametro2;
    private javax.swing.JTextField jTextFieldParametro3;
    private javax.swing.JTextField jTextFieldSemilla;
    // End of variables declaration//GEN-END:variables

    private void inicializar()
    {
        this.centrar();
    }
    private void salir()
    {
        System.exit(0);
    }

    private void centrar()
    {
        Dimension pantalla, cuadro;
	pantalla = Toolkit.getDefaultToolkit().getScreenSize();
	cuadro = this.getSize();
	this.setLocation(((pantalla.width - cuadro.width)/2), (pantalla.height - cuadro.height)/2);
    }

    private void desactivar()
    {
        this.jTextFieldParametro1.setEnabled(false);
        this.jTextFieldParametro2.setEnabled(false);
        this.jTextFieldParametro3.setEnabled(false);
        this.jTextFieldParametro1.setText("0");
        this.jTextFieldParametro2.setText("0");
        this.jTextFieldParametro3.setText("0");
        this.jTextFieldSemilla.setText("1");
        this.jLabelParametro1.setText("Parametro 1");
        this.jLabelParametro2.setText("Parametro 2");
        this.jLabelParametro3.setText("Parametro 3");
//        this.jComboBoxDistribuciones.setSelectedIndex(0);
    }

    private void limpiar()
    {
        this.jTextFieldParametro1.setEnabled(false);
        this.jTextFieldParametro2.setEnabled(false);
        this.jTextFieldParametro3.setEnabled(false);
        this.jTextFieldParametro1.setText("0");
        this.jTextFieldParametro2.setText("0");
        this.jTextFieldParametro3.setText("0");
        this.jTextFieldNombreVariable.setText("");
        this.jTextFieldCantidad.setText("0");
        this.jTextFieldSemilla.setText("1");
        this.jLabelParametro1.setText("Parametro 1");
        this.jLabelParametro2.setText("Parametro 2");
        this.jLabelParametro3.setText("Parametro 3");
        this.jComboBoxDistribuciones.setSelectedIndex(0);
    }

    private void seleccionarParametros()
    {
        this.desactivar();
        this.util.seleccionarParametros(jComboBoxDistribuciones, this.jTextFieldParametro1, this.jTextFieldParametro2, this.jTextFieldParametro3, this.jLabelParametro1, this.jLabelParametro2, this.jLabelParametro3);
    }

    private void agregar()
    {
        if(String.valueOf(this.jComboBoxDistribuciones.getSelectedItem()).equals("DIST. EMPIRICA"))
        {
            Datos dato = new Datos();
            dato.setNombreVariable(this.jTextFieldNombreVariable.getText().trim().toUpperCase());
            dato.setDistribucion(String.valueOf(this.jComboBoxDistribuciones.getSelectedItem()).trim());
            dato.setR(this.empirica.getR());
            dato.setX(this.empirica.getX());
            dato.setA(this.empirica.getA());
            dato.setParametro1("No Usado");
            dato.setParametro2("No Usado");
            dato.setParametro3("No Usado");
            dato.setSemilla("AUTOGENERADA");
            dato.setCantidad(Integer.parseInt(this.jTextFieldCantidad.getText()));
            this.distribucionesAGenerar = this.util.agregar(dato, this.distribucionesAGenerar, this.jTable1, jCheckBoxSemilla);
            this.limpiar();
        }
        else
        {
            if(String.valueOf(this.jComboBoxDistribuciones.getSelectedItem()).trim().equals("..."))
                JOptionPane.showMessageDialog(null, "Debe seleccionar una distribucion a generar","Falta distribucion",JOptionPane.ERROR_MESSAGE);
            else
            {
                if(this.util.validar(this.jTextFieldParametro1, this.jTextFieldParametro2, this.jTextFieldParametro3, this.jTextFieldSemilla, this.jTextFieldNombreVariable, this.jTextFieldCantidad, this.jComboBoxDistribuciones))
                {
                    Datos dato = new Datos();
                    dato.setNombreVariable(this.jTextFieldNombreVariable.getText().trim().toUpperCase());
                    dato.setDistribucion(String.valueOf(this.jComboBoxDistribuciones.getSelectedItem()).trim());
                    dato.setParametro1(this.jTextFieldParametro1.getText().trim());
                    dato.setParametro2(this.jTextFieldParametro2.getText().trim());
                    dato.setParametro3(this.jTextFieldParametro3.getText().trim());
                    if(this.jCheckBoxSemilla.isSelected())
                        dato.setSemilla(this.jTextFieldSemilla.getText().trim());
                    else
                        dato.setSemilla("AUTOGENERADA");
                    dato.setCantidad(Integer.parseInt(this.jTextFieldCantidad.getText()));
                    this.distribucionesAGenerar = this.util.agregar(dato, this.distribucionesAGenerar, this.jTable1, jCheckBoxSemilla);
                    this.limpiar();
                }
                else
                    JOptionPane.showMessageDialog(null, "Asegurese de que los campos esten llenos","Hay campos en blancos",JOptionPane.ERROR_MESSAGE);
            }
        }
    }


    private void generar()
    {
        if(this.jTable1.getRowCount() != 0)
        {
            UIMostrarNumeros mostrar = new UIMostrarNumeros(this.util.generarNumeros(this.distribucionesAGenerar));
            mostrar.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(null, "No hay datos de distribuciones a generar","Seleccione distribucion",JOptionPane.ERROR_MESSAGE);
    }

    private void Test()
    {
        UIReporteTest uiTest = new UIReporteTest();
        uiTest.setVisible(true);
    }

    public void agregarEmpirica(Empirica e, String nombre, int cantidad)
    {
        this.empirica = e;
        this.jTextFieldNombreVariable.setText(nombre);
        this.jTextFieldCantidad.setText(String.valueOf(cantidad));
    }

    private void nuevo()
    {
        // desactivando y limpiando los campos
        this.desactivar();
        this.limpiar();

        //limpiando la tabla
        this.util.limpiar(this.jTable1);

        //vaciando los vectores
        this.distribucionesAGenerar.clear();
    }
}
