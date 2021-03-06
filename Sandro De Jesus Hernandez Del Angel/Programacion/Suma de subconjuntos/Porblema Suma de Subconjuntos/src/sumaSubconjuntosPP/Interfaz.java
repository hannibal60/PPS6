/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaSubconjuntosPP;

import java.awt.Dimension;
import java.util.Arrays;

/**
 * @author saipr
 */
public class Interfaz extends javax.swing.JFrame
{

    /**
     * Creates new form Interfaz
     */
    public Interfaz()
    {
        initComponents();
        btnIniciar.requestFocus();
        redimensionaVentana(1);
        jpnlSubconjuntos.setVisible(true);
    }

    /**
     * Redimensiona la ventana segun la parte en la que esté
     *
     * @Param opc 1.- Solo formulario con los datos 2.- Formulario y
     * Subconjuntos *
     */
    private void redimensionaVentana(int opc)
    {
        switch (opc)
        {
            case 1:
                this.setSize(new Dimension(716, 230));
                break;
            case 2:
                jtaTodos.setText("");
                jtaNoSuman.setText("");
                jtaSuman.setText("");
                this.setSize(new Dimension(716, 835));
                break;
        }
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

        opciones = new javax.swing.ButtonGroup();
        jpnlPrincipal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpnlFormularioDatos = new javax.swing.JPanel();
        lblError = new javax.swing.JLabel();
        btnIniciar = new java.awt.Button();
        jtfConjunto = new javax.swing.JTextField();
        jtfSumaDeseada = new javax.swing.JTextField();
        jpnlSubconjuntos = new javax.swing.JPanel();
        scpConjunto = new javax.swing.JScrollPane();
        jtaConjunto = new javax.swing.JTextArea();
        jpnlSubSuman = new javax.swing.JPanel();
        lblTmpSuman = new javax.swing.JLabel();
        lblResultSuman = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtaSuman = new javax.swing.JTextArea();
        lblSum0 = new javax.swing.JLabel();
        jpnlSubNoSuman = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtaNoSuman = new javax.swing.JTextArea();
        lblNSum0 = new javax.swing.JLabel();
        lblResultNoSuman = new javax.swing.JLabel();
        lblTmpNoSuman = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtaTodos = new javax.swing.JTextArea();
        lblTodosSubconjuntos = new javax.swing.JLabel();
        lblTmpNoSuman1 = new javax.swing.JLabel();
        lblAllSubsets = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jpnlPrincipal.setBackground(new java.awt.Color(161, 64, 68));
        jpnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Problema de la suma de subconjuntos ");
        jpnlPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 17, -1, -1));

        jpnlFormularioDatos.setBackground(new java.awt.Color(161, 64, 72));
        jpnlFormularioDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblError.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 153, 51));
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jpnlFormularioDatos.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 330, 32));

        btnIniciar.setActionCommand("Adelante");
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciar.setFont(new java.awt.Font("TI Uni", 1, 12)); // NOI18N
        btnIniciar.setLabel("Adelante");
        btnIniciar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnIniciarActionPerformed(evt);
            }
        });
        jpnlFormularioDatos.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, 38));

        jtfConjunto.setBackground(new java.awt.Color(24, 23, 28));
        jtfConjunto.setFont(new java.awt.Font("TI Uni", 1, 16)); // NOI18N
        jtfConjunto.setForeground(new java.awt.Color(204, 204, 204));
        jtfConjunto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfConjunto.setText("Tamaño del conjunto");
        jtfConjunto.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                jtfConjuntoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                jtfConjuntoFocusLost(evt);
            }
        });
        jtfConjunto.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jtfConjuntoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jtfConjuntoKeyTyped(evt);
            }
        });
        jpnlFormularioDatos.add(jtfConjunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 249, 38));

        jtfSumaDeseada.setBackground(new java.awt.Color(24, 23, 28));
        jtfSumaDeseada.setFont(new java.awt.Font("TI Uni", 1, 16)); // NOI18N
        jtfSumaDeseada.setForeground(new java.awt.Color(204, 204, 204));
        jtfSumaDeseada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfSumaDeseada.setText("Suma deseada");
        jtfSumaDeseada.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                jtfSumaDeseadaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                jtfSumaDeseadaFocusLost(evt);
            }
        });
        jtfSumaDeseada.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jtfSumaDeseadaKeyTyped(evt);
            }
        });
        jpnlFormularioDatos.add(jtfSumaDeseada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 249, 38));

        jpnlPrincipal.add(jpnlFormularioDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 380, -1));

        jpnlSubconjuntos.setBackground(new java.awt.Color(161, 64, 68));

        scpConjunto.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jtaConjunto.setEditable(false);
        jtaConjunto.setBackground(new java.awt.Color(161, 64, 68));
        jtaConjunto.setColumns(20);
        jtaConjunto.setFont(new java.awt.Font("TI Uni", 1, 16)); // NOI18N
        jtaConjunto.setForeground(new java.awt.Color(204, 204, 204));
        jtaConjunto.setRows(5);
        jtaConjunto.setText("Conjunto:");
        jtaConjunto.setBorder(null);
        jtaConjunto.setCaretColor(new java.awt.Color(161, 64, 68));
        jtaConjunto.setDisabledTextColor(new java.awt.Color(161, 64, 68));
        jtaConjunto.setSelectedTextColor(new java.awt.Color(161, 64, 68));
        jtaConjunto.setSelectionColor(new java.awt.Color(204, 204, 204));
        scpConjunto.setViewportView(jtaConjunto);

        jpnlSubSuman.setBackground(new java.awt.Color(161, 64, 72));
        jpnlSubSuman.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTmpSuman.setFont(new java.awt.Font("TI-83p Mini Sans", 0, 14)); // NOI18N
        lblTmpSuman.setForeground(new java.awt.Color(204, 204, 204));
        lblTmpSuman.setText("Tiempo: ");
        jpnlSubSuman.add(lblTmpSuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 242, 309, -1));

        lblResultSuman.setFont(new java.awt.Font("TI-83p Mini Sans", 0, 14)); // NOI18N
        lblResultSuman.setForeground(new java.awt.Color(204, 204, 204));
        lblResultSuman.setText("No. Resultados: ");
        jpnlSubSuman.add(lblResultSuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 219, 309, -1));

        jtaSuman.setEditable(false);
        jtaSuman.setBackground(new java.awt.Color(214, 214, 214));
        jtaSuman.setColumns(20);
        jtaSuman.setFont(new java.awt.Font("TI Uni", 1, 18)); // NOI18N
        jtaSuman.setForeground(new java.awt.Color(102, 102, 102));
        jtaSuman.setRows(5);
        jtaSuman.setAutoscrolls(false);
        jScrollPane4.setViewportView(jtaSuman);

        jpnlSubSuman.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 38, 309, 174));

        lblSum0.setFont(new java.awt.Font("TI Uni", 1, 18)); // NOI18N
        lblSum0.setForeground(new java.awt.Color(204, 204, 204));
        lblSum0.setText("Subconjuntos que suman");
        jpnlSubSuman.add(lblSum0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 270, -1));

        jpnlSubNoSuman.setBackground(new java.awt.Color(161, 64, 72));
        jpnlSubNoSuman.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtaNoSuman.setEditable(false);
        jtaNoSuman.setBackground(new java.awt.Color(214, 214, 214));
        jtaNoSuman.setColumns(20);
        jtaNoSuman.setFont(new java.awt.Font("TI Uni", 1, 18)); // NOI18N
        jtaNoSuman.setForeground(new java.awt.Color(102, 102, 102));
        jtaNoSuman.setRows(5);
        jtaNoSuman.setAutoscrolls(false);
        jScrollPane5.setViewportView(jtaNoSuman);

        jpnlSubNoSuman.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 38, 309, 174));

        lblNSum0.setFont(new java.awt.Font("TI Uni", 1, 18)); // NOI18N
        lblNSum0.setForeground(new java.awt.Color(204, 204, 204));
        lblNSum0.setText("Subconjuntos que no suman");
        jpnlSubNoSuman.add(lblNSum0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 309, -1));

        lblResultNoSuman.setFont(new java.awt.Font("TI-83p Mini Sans", 0, 14)); // NOI18N
        lblResultNoSuman.setForeground(new java.awt.Color(204, 204, 204));
        lblResultNoSuman.setText("No. Resultados: ");
        jpnlSubNoSuman.add(lblResultNoSuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 221, 309, -1));

        lblTmpNoSuman.setFont(new java.awt.Font("TI-83p Mini Sans", 0, 14)); // NOI18N
        lblTmpNoSuman.setForeground(new java.awt.Color(204, 204, 204));
        lblTmpNoSuman.setText("Tiempo");
        jpnlSubNoSuman.add(lblTmpNoSuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 244, 309, -1));

        jPanel1.setBackground(new java.awt.Color(161, 64, 72));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtaTodos.setEditable(false);
        jtaTodos.setBackground(new java.awt.Color(214, 214, 214));
        jtaTodos.setColumns(20);
        jtaTodos.setFont(new java.awt.Font("TI Uni", 1, 18)); // NOI18N
        jtaTodos.setForeground(new java.awt.Color(102, 102, 102));
        jtaTodos.setRows(5);
        jtaTodos.setAutoscrolls(false);
        jScrollPane3.setViewportView(jtaTodos);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 38, 309, 174));

        lblTodosSubconjuntos.setFont(new java.awt.Font("TI-83p Mini Sans", 0, 14)); // NOI18N
        lblTodosSubconjuntos.setForeground(new java.awt.Color(204, 204, 204));
        lblTodosSubconjuntos.setText("No. Resultados: ");
        jPanel1.add(lblTodosSubconjuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 218, 309, -1));

        lblTmpNoSuman1.setFont(new java.awt.Font("TI-83p Mini Sans", 0, 14)); // NOI18N
        lblTmpNoSuman1.setForeground(new java.awt.Color(204, 204, 204));
        lblTmpNoSuman1.setText("Tiempo:");
        jPanel1.add(lblTmpNoSuman1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 241, 309, -1));

        lblAllSubsets.setFont(new java.awt.Font("TI Uni", 1, 18)); // NOI18N
        lblAllSubsets.setForeground(new java.awt.Color(204, 204, 204));
        lblAllSubsets.setText("Subconjuntos");
        jPanel1.add(lblAllSubsets, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        javax.swing.GroupLayout jpnlSubconjuntosLayout = new javax.swing.GroupLayout(jpnlSubconjuntos);
        jpnlSubconjuntos.setLayout(jpnlSubconjuntosLayout);
        jpnlSubconjuntosLayout.setHorizontalGroup(
            jpnlSubconjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlSubconjuntosLayout.createSequentialGroup()
                .addGroup(jpnlSubconjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlSubconjuntosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpnlSubSuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpnlSubNoSuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlSubconjuntosLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(scpConjunto, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlSubconjuntosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
        );
        jpnlSubconjuntosLayout.setVerticalGroup(
            jpnlSubconjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlSubconjuntosLayout.createSequentialGroup()
                .addComponent(scpConjunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlSubconjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnlSubSuman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnlSubNoSuman, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpnlPrincipal.add(jpnlSubconjuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 198, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnIniciarActionPerformed
    {//GEN-HEADEREND:event_btnIniciarActionPerformed
        int set[];
        lblResultNoSuman.setText("");
        if (!(jtfConjunto.getText().equals("Tamaño del conjunto") || jtfConjunto.getText().equals("Ingrese conjunto")) && (!jtfSumaDeseada.getText().equals("Suma deseada")) && (!jtfConjunto.getText().endsWith(",") && !jtfConjunto.getText().startsWith(",")))
        {
            int tSet = Integer.parseInt(jtfConjunto.getText());
            int sumD = Integer.parseInt(jtfSumaDeseada.getText());
            if (tSet > 2 && tSet <= 20)
            {
                redimensionaVentana(2);
                scpConjunto.setVisible(true);
                set = PPSubconjuntos.llenarArray(tSet);
                jtaConjunto.setText("Conjunto: " + Arrays.toString(set));
                //Comienza la ejecucion de los hilos
                //Hilo que calcula los subconjuntos que cumplen la suma
                SumaSub sSub = new SumaSub(set, sumD);
                Thread t = new Thread(sSub);
                t.start();
                NoSumaSub nsSub = new NoSumaSub(set, sumD);
                t = new Thread(nsSub);
                t.start();
                Subconjuntos subs = new Subconjuntos(set, sumD);
                t = new Thread(subs);
                t.start();
            } else
            {
                scpConjunto.setVisible(false);
                lblError(6); //Error tamaño del conjunto
            }
        } else
        {
            lblError(3);
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void jtfConjuntoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfConjuntoKeyTyped
    {//GEN-HEADEREND:event_jtfConjuntoKeyTyped
        //Metodo para que solo se ingresen numeros
        if (!Character.isDigit(evt.getKeyChar()))
        {
            evt.consume();
            lblError(1); //Mensaje de error de Aleatorio
        } else
        {
            lblError.setText("");
        }
    }//GEN-LAST:event_jtfConjuntoKeyTyped

    private void jtfSumaDeseadaKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfSumaDeseadaKeyTyped
    {//GEN-HEADEREND:event_jtfSumaDeseadaKeyTyped
        //Metodo para que solo se ingresen numeros
        char k = evt.getKeyChar();
        System.out.println("k == " + k);
        if (!Character.isDigit(evt.getKeyChar()))
        {
            evt.consume();
            lblError(1);
        } else
        {
            lblError.setText("");
        }
    }//GEN-LAST:event_jtfSumaDeseadaKeyTyped

    private void jtfConjuntoFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jtfConjuntoFocusGained
    {//GEN-HEADEREND:event_jtfConjuntoFocusGained
        if (jtfConjunto.getText().equals("Tamaño del conjunto"))
        {
            jtfConjunto.setText("");
        }
    }//GEN-LAST:event_jtfConjuntoFocusGained

    private void jtfSumaDeseadaFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jtfSumaDeseadaFocusGained
    {//GEN-HEADEREND:event_jtfSumaDeseadaFocusGained
        if (jtfSumaDeseada.getText().equals("Suma deseada"))
        {
            jtfSumaDeseada.setText("");
        }
    }//GEN-LAST:event_jtfSumaDeseadaFocusGained

    private void jtfConjuntoFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jtfConjuntoFocusLost
    {//GEN-HEADEREND:event_jtfConjuntoFocusLost
        if (jtfConjunto.getText().isEmpty())
        {
            jtfConjunto.setText("Tamaño del conjunto");
        }
    }//GEN-LAST:event_jtfConjuntoFocusLost

    private void jtfSumaDeseadaFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jtfSumaDeseadaFocusLost
    {//GEN-HEADEREND:event_jtfSumaDeseadaFocusLost
        if (jtfSumaDeseada.getText().isEmpty())
        {
            jtfSumaDeseada.setText("Suma deseada");
        }
    }//GEN-LAST:event_jtfSumaDeseadaFocusLost

    private void jtfConjuntoKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfConjuntoKeyReleased
    {//GEN-HEADEREND:event_jtfConjuntoKeyReleased

    }//GEN-LAST:event_jtfConjuntoKeyReleased

    /**
     * Coloca el mensaje de error en lblError
     *
     * @param opc 1 = "Ingrese numeros" 2 = Separe los elementos con una \",\" .
     * 3 = "Rellene los campos"
     */
    public void lblError(int opc)
    {
        switch (opc)
        {
            case 1: //Mensaje de error de ALEATORIO y SumaDeseada
                lblError.setText("Ingrese numeros");
                break;
            case 2: //Mensaje de error de MANUAL
                lblError.setText("Separe los elementos con una \",\"");
                break;
            case 3:
                lblError.setText("Rellene los campos");
                break;
            case 4:
                lblError.setText("");
                break;
            case 5:
                lblError.setText("Solo una \",\" para separar");
                break;
            case 6:
                lblError.setText("Tamaño de ser mayor a 2");
                break;
        }
    }

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static java.awt.Button btnIniciar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel jpnlFormularioDatos;
    private javax.swing.JPanel jpnlPrincipal;
    private javax.swing.JPanel jpnlSubNoSuman;
    private javax.swing.JPanel jpnlSubSuman;
    private javax.swing.JPanel jpnlSubconjuntos;
    private javax.swing.JTextArea jtaConjunto;
    public static javax.swing.JTextArea jtaNoSuman;
    public static javax.swing.JTextArea jtaSuman;
    public static javax.swing.JTextArea jtaTodos;
    private javax.swing.JTextField jtfConjunto;
    private javax.swing.JTextField jtfSumaDeseada;
    private javax.swing.JLabel lblAllSubsets;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblNSum0;
    public static javax.swing.JLabel lblResultNoSuman;
    public static javax.swing.JLabel lblResultSuman;
    private javax.swing.JLabel lblSum0;
    public static javax.swing.JLabel lblTmpNoSuman;
    public static javax.swing.JLabel lblTmpNoSuman1;
    public static javax.swing.JLabel lblTmpSuman;
    public static javax.swing.JLabel lblTodosSubconjuntos;
    private javax.swing.ButtonGroup opciones;
    private javax.swing.JScrollPane scpConjunto;
    // End of variables declaration//GEN-END:variables
}
