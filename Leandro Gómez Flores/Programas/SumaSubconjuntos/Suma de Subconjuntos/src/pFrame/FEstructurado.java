/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pFrame;

import javax.swing.ImageIcon;
import pProcesoEstructural.CProcesosEstructurado;

/**
 *
 * @author leand
 */
public class FEstructurado extends javax.swing.JFrame
{

    /**
     * Creates new form Frame
     */
    public FEstructurado()
    {
        initComponents();
        vBotonDetener.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        vBotonGenerador = new javax.swing.JButton();
        vLabelTotal = new javax.swing.JLabel();
        vLabelTiempoEjec = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        vTextFileNumMax = new javax.swing.JTextField();
        vBotonDetener = new javax.swing.JButton();
        vScrollConjunto = new javax.swing.JScrollPane();
        vTextAreaConjunto = new javax.swing.JTextArea();
        vLabelNumConjunto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vTextFileNumExacto = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        vBotonRegresar = new javax.swing.JButton();
        vLabelNumConjuntoInfo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        vTextAreaTodoSubconjuntoL = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        vTextAreaSubconjuntos0L = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(750, 600));

        jPanel2.setBackground(new java.awt.Color(65, 77, 15));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel1.setBackground(new java.awt.Color(221, 167, 123));

        vBotonGenerador.setBackground(new java.awt.Color(0, 0, 0));
        vBotonGenerador.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        vBotonGenerador.setForeground(new java.awt.Color(240, 240, 240));
        vBotonGenerador.setText("Generar conjunto y resultados");
        vBotonGenerador.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                vBotonGeneradorActionPerformed(evt);
            }
        });

        vLabelTotal.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        vLabelTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vLabelTotal.setText("Total de subconjuntos: ");

        vLabelTiempoEjec.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        vLabelTiempoEjec.setText("Tiempo de ejecución:");

        jLabel1.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel1.setText("Longitud de forma random para generar: 3 al");

        vTextFileNumMax.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        vTextFileNumMax.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        vTextFileNumMax.setText("10");
        vTextFileNumMax.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                vTextFileNumMaxFocusGained(evt);
            }
        });
        vTextFileNumMax.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                vTextFileNumMaxKeyTyped(evt);
            }
        });

        vBotonDetener.setBackground(new java.awt.Color(0, 0, 0));
        vBotonDetener.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        vBotonDetener.setForeground(new java.awt.Color(245, 245, 245));
        vBotonDetener.setText("Detener");
        vBotonDetener.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                vBotonDetenerActionPerformed(evt);
            }
        });

        vScrollConjunto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Conjunto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        vScrollConjunto.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        vTextAreaConjunto.setEditable(false);
        vTextAreaConjunto.setColumns(20);
        vTextAreaConjunto.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        vTextAreaConjunto.setRows(5);
        vTextAreaConjunto.setToolTipText("");
        vTextAreaConjunto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        vScrollConjunto.setViewportView(vTextAreaConjunto);

        vLabelNumConjunto.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        vLabelNumConjunto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vLabelNumConjunto.setText("-");

        jLabel2.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel2.setText("Longitud exacta del conjunto:");

        vTextFileNumExacto.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        vTextFileNumExacto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        vTextFileNumExacto.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                vTextFileNumExactoFocusGained(evt);
            }
        });
        vTextFileNumExacto.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                vTextFileNumExactoKeyTyped(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOpaque(true);

        vBotonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/iRegresar32.png"))); // NOI18N
        vBotonRegresar.setBorderPainted(false);
        vBotonRegresar.setContentAreaFilled(false);
        vBotonRegresar.setPreferredSize(new java.awt.Dimension(40, 40));
        vBotonRegresar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                vBotonRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                vBotonRegresarMouseExited(evt);
            }
        });
        vBotonRegresar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                vBotonRegresarActionPerformed(evt);
            }
        });

        vLabelNumConjuntoInfo.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        vLabelNumConjuntoInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vLabelNumConjuntoInfo.setText("Longitud del conjunto: ");

        jLabel3.setFont(new java.awt.Font("Javanese Text", 1, 25)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Calculo de subconjuntos Estructural");

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Todos los subconjuntos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        vTextAreaTodoSubconjuntoL.setColumns(20);
        vTextAreaTodoSubconjuntoL.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        vTextAreaTodoSubconjuntoL.setRows(5);
        jScrollPane3.setViewportView(vTextAreaTodoSubconjuntoL);

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Subconjuntos que suman 0", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP));

        vTextAreaSubconjuntos0L.setColumns(20);
        vTextAreaSubconjuntos0L.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        vTextAreaSubconjuntos0L.setRows(5);
        jScrollPane4.setViewportView(vTextAreaSubconjuntos0L);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vTextFileNumMax)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vTextFileNumExacto)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(vLabelTiempoEjec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vBotonDetener)
                        .addContainerGap())
                    .addComponent(vLabelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(vScrollConjunto)
                        .addGap(12, 12, 12))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(vBotonGenerador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(234, 234, 234))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vBotonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vLabelNumConjunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vLabelNumConjuntoInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vBotonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(vTextFileNumExacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vTextFileNumMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(vBotonGenerador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vScrollConjunto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vLabelNumConjuntoInfo)
                .addGap(0, 0, 0)
                .addComponent(vLabelNumConjunto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vLabelTotal)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vLabelTiempoEjec)
                    .addComponent(vBotonDetener))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void vBotonGeneradorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_vBotonGeneradorActionPerformed
    {//GEN-HEADEREND:event_vBotonGeneradorActionPerformed
        vBotonDetener.setEnabled(true);
        vBotonGenerador.setEnabled(false);
        vPausar = false;
        setCursor(WAIT_CURSOR);
        if (vNumRandomE)
        {
            if (vTextFileNumMax.getText().length() == 0)
            {
                vTextFileNumMax.setText("10");
            } else
            {
                if (Long.valueOf(vTextFileNumMax.getText().trim()) <= 2)
                {
                    vTextFileNumMax.setText("3");
                }
            }
            vNumMax = Long.valueOf(vTextFileNumMax.getText().trim());
        } else
        {
            if (vTextFileNumExacto.getText().length() == 0)
            {
                vTextFileNumExacto.setText("10");
            } else
            {
                if (Long.valueOf(vTextFileNumExacto.getText().trim()) <= 2)
                {
                    vTextFileNumExacto.setText("3");
                }
            }
            vNumMax = Long.valueOf(vTextFileNumExacto.getText().trim());
        }
        vTextAreaConjunto.setText("================================Creando Conjunto================================");
        vTextAreaSubconjuntos0L.setText("");
        vTextAreaTodoSubconjuntoL.setText("");

        //////////
        vLabelTotal.setText("Total de subconjuntos: | Subconjuntos que suman 0: ");
        vLabelTiempoEjec.setText("Tiempo de ejecución: ");
        //////////

        Thread vHilo = new Thread(new CProcesosEstructurado());
        vHilo.start();

        setCursor(DEFAULT_CURSOR);
    }//GEN-LAST:event_vBotonGeneradorActionPerformed

    private void vBotonDetenerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_vBotonDetenerActionPerformed
    {//GEN-HEADEREND:event_vBotonDetenerActionPerformed

        vBotonDetener.setEnabled(false);
        vBotonGenerador.setEnabled(true);
        vPausar = true;

    }//GEN-LAST:event_vBotonDetenerActionPerformed

    private void vTextFileNumMaxKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_vTextFileNumMaxKeyTyped
    {//GEN-HEADEREND:event_vTextFileNumMaxKeyTyped
        if (vTextFileNumMax.getText().trim().length() >= 7)
        {
            evt.consume();
        }
    }//GEN-LAST:event_vTextFileNumMaxKeyTyped

    private void vTextFileNumExactoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_vTextFileNumExactoKeyTyped
    {//GEN-HEADEREND:event_vTextFileNumExactoKeyTyped
        if (vTextFileNumMax.getText().trim().length() >= 7)
        {
            evt.consume();
        }
    }//GEN-LAST:event_vTextFileNumExactoKeyTyped

    private void vTextFileNumMaxFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_vTextFileNumMaxFocusGained
    {//GEN-HEADEREND:event_vTextFileNumMaxFocusGained
        vTextFileNumExacto.setText(null);
        vNumRandomE = true;
    }//GEN-LAST:event_vTextFileNumMaxFocusGained

    private void vTextFileNumExactoFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_vTextFileNumExactoFocusGained
    {//GEN-HEADEREND:event_vTextFileNumExactoFocusGained
        vTextFileNumMax.setText(null);
        vNumRandomE = false;
    }//GEN-LAST:event_vTextFileNumExactoFocusGained

    private void vBotonRegresarMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_vBotonRegresarMouseEntered
    {//GEN-HEADEREND:event_vBotonRegresarMouseEntered
        vBotonRegresar.setIcon(new ImageIcon(getClass().getResource("/pImagenes/iRegresar40.png")));
    }//GEN-LAST:event_vBotonRegresarMouseEntered

    private void vBotonRegresarMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_vBotonRegresarMouseExited
    {//GEN-HEADEREND:event_vBotonRegresarMouseExited
        vBotonRegresar.setIcon(new ImageIcon(getClass().getResource("/pImagenes/iRegresar32.png")));
    }//GEN-LAST:event_vBotonRegresarMouseExited

    private void vBotonRegresarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_vBotonRegresarActionPerformed
    {//GEN-HEADEREND:event_vBotonRegresarActionPerformed
        vBotonDetener.setEnabled(false);
        vBotonGenerador.setEnabled(true);
        vPausar = true;
        dispose();
        new FSeleccion().setVisible(true);
    }//GEN-LAST:event_vBotonRegresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(FEstructurado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FEstructurado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FEstructurado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FEstructurado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new FEstructurado().setVisible(true);
            }
        });
    }

    public static long vNumMax = 0;
    public static boolean vNumRandomE = true;
    public static boolean vPausar = false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JButton vBotonDetener;
    public static javax.swing.JButton vBotonGenerador;
    private javax.swing.JButton vBotonRegresar;
    public static javax.swing.JLabel vLabelNumConjunto;
    public static javax.swing.JLabel vLabelNumConjuntoInfo;
    public static javax.swing.JLabel vLabelTiempoEjec;
    public static javax.swing.JLabel vLabelTotal;
    private javax.swing.JScrollPane vScrollConjunto;
    public static javax.swing.JTextArea vTextAreaConjunto;
    public static javax.swing.JTextArea vTextAreaSubconjuntos0L;
    public static javax.swing.JTextArea vTextAreaTodoSubconjuntoL;
    private javax.swing.JTextField vTextFileNumExacto;
    private javax.swing.JTextField vTextFileNumMax;
    // End of variables declaration//GEN-END:variables
}
