/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planta;

import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Kevin Benitez
 */
public class PanelCrecimiento extends javax.swing.JFrame
{

    private boolean estado = true;
    boolean abonado = false;
    private String horas;
    private String minutos;
    private String segundos;
    private int semanas = 1;
    private int dias = 1;
    int marchitas = 0;
    Icon icono;
    Propiedades rosa = new Propiedades();

    Thread aguamas;
    Thread abonomas;
    Thread hora;
    Thread aguawav;
    Thread abonowav;

    public void iniciar()
    {
        hora = new Thread();
        estado = true;
        hora.start();
    }

    /**
     * Creates new form PanelCrecimiento
     */
    public PanelCrecimiento()
    {
        setLocationRelativeTo(null);
        setUndecorated(true);

        this.hora = new Thread()
        {
            @Override
            public void run()
            {
                Calendar fecha = new GregorianCalendar();
                int h = fecha.get(Calendar.HOUR_OF_DAY);
                int m = fecha.get(Calendar.MINUTE);
                int s = fecha.get(Calendar.SECOND);

                while (estado == true)
                {
                    if (jProgressBar1.getValue() <= 20)
                    {
                        Agua.setText("Nivel de agua bajo");
                        Agua.setForeground(Color.red);
                        try
                        {
                            alarmaagua();
                        } catch (IOException ex)
                        {
                            Logger.getLogger(PanelCrecimiento.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else
                    {
                        Agua.setText("");
                    }

                    if (semanas == 1)
                    {
                        jTCrecimiento.setText("Inicial");
                        icono = new ImageIcon(getClass().getResource("/imagenes/1.jpg"));
                        muestra.setIcon(icono);
                    } else
                    {
                        if (semanas == 2)
                        {
                            jTCrecimiento.setText("Medio");
                            icono = new ImageIcon(getClass().getResource("/imagenes/2.jpg"));
                            muestra.setIcon(icono);
                        } else
                        {
                            if (semanas == 4)
                            {
                                jTCrecimiento.setText("Intermedio");
                                icono = new ImageIcon(getClass().getResource("/imagenes/3.jpg"));
                                muestra.setIcon(icono);
                            } else
                            {
                                if (semanas == 6)
                                {
                                    jTCrecimiento.setText("Avanzado");
                                    icono = new ImageIcon(getClass().getResource("/imagenes/4.jpg"));
                                    muestra.setIcon(icono);
                                } else
                                {
                                    if (semanas == 8)
                                    {
                                        jTCrecimiento.setText("Marchitado");
                                        icono = new ImageIcon(getClass().getResource("/imagenes/5.jpg"));
                                        muestra.setIcon(icono);

                                    }
                                }
                            }
                        }
                    }

                    if (jProgressBar2.getValue() <= 20)
                    {
                        Agua1.setText("Nivel de abono bajo");
                        Agua1.setForeground(Color.red);
                        try
                        {
                            alarmaagua();
                        } catch (Exception e)
                        {
                        }

                    } else
                    {
                        Agua1.setText("");
                    }

                    //Aqui es donde se descuenta el abono de la barra
                    if (semanas == 2 || semanas == 4 || semanas == 6)
                    {
                        if (abonado == false)
                        {
                            jProgressBar2.setValue(jProgressBar2.getValue() - 40);
                            jTAbon.setText(String.valueOf(jProgressBar2.getValue()));
                            abonado = true;
                        }
                    }
                    if (jProgressBar1.getValue() == 100)
                    {
                        aguamas = null;
                        jButton1.setEnabled(false);
                        jTHumedad.setText("100%");
                        aguawav = null;
                    } else
                    {
                        jButton1.setEnabled(true);
                    }
                    if (jProgressBar2.getValue() == 100)
                    {
                        abonomas = null;
                        jButton2.setEnabled(false);
                    } else
                    {
                        jButton2.setEnabled(true);
                    }

                    if (h == 0 || h == 1 || h == 2 || h == 3 || h == 4 || h == 5 || h == 6 || h == 7 || h == 8 || h == 9)
                    {
                        horas = "0" + Integer.toString(h);
                    } else
                    {
                        horas = Integer.toString(h);
                    }

                    if (h >= 23)
                    {
                        if (semanas != 8)
                        {
                            jProgressBar1.setValue(jProgressBar1.getValue() - 8);
                            jTAgua.setText(String.valueOf(jProgressBar1.getValue()));
                            jTHumedad.setText(String.valueOf(jProgressBar1.getValue()));
                        }
                        dias++;
                        h = 0;
                    }
                    if (dias > 7)
                    {
                        semanas++; /// aqui se hace el cambio de dia
                        abonado = false; //cuando se cambia de dia el abonado se cancela
                        dias = 1;
                    }

                    if (semanas > 8)
                    {
                        marchitas++;
                        semanas = 1;
                    }

                    jTSemana.setText(String.valueOf(semanas));
                    jTDia.setText(String.valueOf(dias));
                    jTHora.setText(horas);
                    jTMarchitas.setText(String.valueOf(marchitas));

                    h++;
                    try
                    {
                        Thread.sleep(200);

                    } catch (InterruptedException ex)
                    {
                        Logger.getLogger(PanelCrecimiento.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        initComponents();
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 30, 30);
        setShape(forma);
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

        jPanel1 = new javax.swing.JPanel();
        jTSemana = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jTAgua = new javax.swing.JTextField();
        jProgressBar2 = new javax.swing.JProgressBar();
        jTAbon = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTHumedad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTCrecimiento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTMarchitas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Agua = new javax.swing.JLabel();
        Agua1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        muestra = new javax.swing.JLabel();
        jTDia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTHora = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(927, 629));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        jTSemana.setEditable(false);
        jTSemana.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTSemana.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTSemana);
        jTSemana.setBounds(450, 10, 110, 39);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dia");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(750, 10, 59, 39);

        jPanel2.setBackground(new java.awt.Color(255, 210, 105));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setForeground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nivel de agua:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nivel de abono:");

        jTAgua.setEditable(false);
        jTAgua.setBackground(new java.awt.Color(255, 255, 255));
        jTAgua.setForeground(new java.awt.Color(0, 0, 0));

        jTAbon.setEditable(false);
        jTAbon.setBackground(new java.awt.Color(255, 255, 255));
        jTAbon.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/awa.png"))); // NOI18N
        jButton1.setText("Regar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abono.png"))); // NOI18N
        jButton2.setText("Abonar");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Humedad:");

        jTHumedad.setEditable(false);
        jTHumedad.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Etapa de Crecimiento:");

        jTCrecimiento.setEditable(false);
        jTCrecimiento.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Rosas Marchitadas:");

        jTMarchitas.setEditable(false);
        jTMarchitas.setBackground(new java.awt.Color(255, 255, 255));
        jTMarchitas.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Centro de Control");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Advertencias");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        jButton3.setText("Salir");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTCrecimiento))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTHumedad, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(2, 2, 2)
                                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTAbon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(3, 3, 3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jTMarchitas, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(1, 1, 1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Agua1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agua, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTAbon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTHumedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTCrecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel10)))
                .addGap(7, 7, 7)
                .addComponent(Agua, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Agua1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTMarchitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(15, 15, 15))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 10, 340, 600);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        muestra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(muestra, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(muestra, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(550, 178, 235, 340);

        jTDia.setEditable(false);
        jTDia.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTDia.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTDia);
        jTDia.setBounds(810, 10, 110, 39);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Semana:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(380, 10, 70, 40);

        jTHora.setBackground(new java.awt.Color(255, 255, 255));
        jTHora.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jTHora.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTHora);
        jTHora.setBounds(630, 50, 70, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Hora");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(650, 20, 30, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/30913375-navidad-de-fondo-en-una-mesa-vieja-de-madera-rústica.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 930, 630);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        this.aguamas = new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    for (int nivel = jProgressBar1.getValue(); nivel <= 100; nivel++)
                    {
                        jProgressBar1.setValue(nivel);
                        jTAgua.setText(String.valueOf(jProgressBar1.getValue()));
                        //rosa.setNivelagua(jProgressBar1.getValue());
                        //System.out.println("entre");
                        Thread.sleep(50);
                    }
                } catch (InterruptedException e)
                {

                }
            }
        };
        aguamas.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        hora.start();
        jButton1ActionPerformed(null);
        jButton2ActionPerformed(null);
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        this.abonomas = new Thread()
        {
            @Override
            public void run()
            {

                try
                {
                    for (int nivel = jProgressBar2.getValue(); nivel <= 100; nivel++)
                    {
                        jProgressBar2.setValue(nivel);
                        jTAbon.setText(String.valueOf(jProgressBar2.getValue()));
                        //rosa.setNivelagua(jProgressBar1.getValue());
                        Thread.sleep(50);
                    }
                } catch (InterruptedException e)
                {

                }
            }
        };
        abonomas.start();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void alarmaagua() throws IOException
    {
        this.aguawav = new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    Clip sonido = AudioSystem.getClip();
                    sonido.open(AudioSystem.getAudioInputStream(getClass().getResource("/sonidos/agua.wav")));
                    sonido.start();

                    while (sonido.isRunning())
                    {
                        Thread.sleep(1000);
                    }
                } catch (LineUnavailableException ex)
                {
                    Logger.getLogger(PanelCrecimiento.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedAudioFileException ex)
                {
                    Logger.getLogger(PanelCrecimiento.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex)
                {
                    Logger.getLogger(PanelCrecimiento.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex)
                {
                    Logger.getLogger(PanelCrecimiento.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        aguawav.start();
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
            java.util.logging.Logger.getLogger(PanelCrecimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(PanelCrecimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(PanelCrecimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(PanelCrecimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new PanelCrecimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agua;
    private javax.swing.JLabel Agua1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JTextField jTAbon;
    private javax.swing.JTextField jTAgua;
    private javax.swing.JTextField jTCrecimiento;
    private javax.swing.JTextField jTDia;
    private javax.swing.JTextField jTHora;
    private javax.swing.JTextField jTHumedad;
    private javax.swing.JTextField jTMarchitas;
    private javax.swing.JTextField jTSemana;
    private javax.swing.JLabel muestra;
    // End of variables declaration//GEN-END:variables
}
