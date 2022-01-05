/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Calculadora extends javax.swing.JFrame {

    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
    
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 30, 30);
AWTUtilities.setWindowShape(this, forma);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textoOperacion = new javax.swing.JLabel();
        textoResultado = new javax.swing.JLabel();
        btn_oscuro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_igual = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_borrarUnDigito = new javax.swing.JButton();
        btn_porcentaje = new javax.swing.JButton();
        btn_dividir = new javax.swing.JButton();
        btn_multiplicar = new javax.swing.JButton();
        btn_restar = new javax.swing.JButton();
        btn_sumar = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        textoOperacion.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        textoOperacion.setForeground(new java.awt.Color(55, 62, 71));
        textoOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        textoResultado.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        textoResultado.setForeground(new java.awt.Color(55, 62, 71));
        textoResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btn_oscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_black_mode.png"))); // NOI18N
        btn_oscuro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_oscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oscuroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("•");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("•");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textoOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(textoResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 130));

        jPanel2.setBackground(new java.awt.Color(245, 239, 233));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_igual.setFont(new java.awt.Font("Trebuchet MS", 0, 32)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_5.png"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setFocusPainted(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_2.png"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel2.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 50, 50));

        btn_9.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btn_9.setForeground(new java.awt.Color(55, 62, 71));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_3.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_4.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 50, 50));

        btn_borrarUnDigito.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        btn_borrarUnDigito.setForeground(new java.awt.Color(55, 62, 71));
        btn_borrarUnDigito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_borrarUnDigito.setText("CE");
        btn_borrarUnDigito.setFocusPainted(false);
        btn_borrarUnDigito.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_borrarUnDigito.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_borrarUnDigito.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_2.png"))); // NOI18N
        btn_borrarUnDigito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarUnDigitoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_borrarUnDigito, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, 50));

        btn_porcentaje.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btn_porcentaje.setForeground(new java.awt.Color(55, 62, 71));
        btn_porcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_porcentaje.setText("%");
        btn_porcentaje.setFocusPainted(false);
        btn_porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_porcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_porcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_2.png"))); // NOI18N
        btn_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 50, 50));

        btn_dividir.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btn_dividir.setForeground(new java.awt.Color(55, 62, 71));
        btn_dividir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_dividir.setText("/");
        btn_dividir.setFocusPainted(false);
        btn_dividir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dividir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_dividir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_2.png"))); // NOI18N
        btn_dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dividirActionPerformed(evt);
            }
        });
        jPanel2.add(btn_dividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 50, 50));

        btn_multiplicar.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btn_multiplicar.setForeground(new java.awt.Color(55, 62, 71));
        btn_multiplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_multiplicar.setText("X");
        btn_multiplicar.setFocusPainted(false);
        btn_multiplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_multiplicar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_multiplicar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_2.png"))); // NOI18N
        btn_multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_multiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 50, 50));

        btn_restar.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btn_restar.setForeground(new java.awt.Color(55, 62, 71));
        btn_restar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_restar.setText("-");
        btn_restar.setFocusPainted(false);
        btn_restar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_restar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_restar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_2.png"))); // NOI18N
        btn_restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_restar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 50, 50));

        btn_sumar.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btn_sumar.setForeground(new java.awt.Color(55, 62, 71));
        btn_sumar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_sumar.setText("+");
        btn_sumar.setFocusPainted(false);
        btn_sumar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_sumar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_sumar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_2.png"))); // NOI18N
        btn_sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 50, 50));

        btn_c.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        btn_c.setForeground(new java.awt.Color(55, 62, 71));
        btn_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_c.setText("C");
        btn_c.setFocusPainted(false);
        btn_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_c.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_c.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_2.png"))); // NOI18N
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });
        jPanel2.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        btn_7.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btn_7.setForeground(new java.awt.Color(55, 62, 71));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_3.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_4.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, 50));

        btn_8.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btn_8.setForeground(new java.awt.Color(55, 62, 71));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_3.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_4.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 50, 50));

        btn_4.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btn_4.setForeground(new java.awt.Color(55, 62, 71));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_3.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_4.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 50, 50));

        btn_5.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btn_5.setForeground(new java.awt.Color(55, 62, 71));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_3.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_4.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 50, 50));

        btn_6.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btn_6.setForeground(new java.awt.Color(55, 62, 71));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_3.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_4.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 50, 50));

        btn_2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btn_2.setForeground(new java.awt.Color(55, 62, 71));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_3.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_4.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 50, 50));

        btn_1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btn_1.setForeground(new java.awt.Color(55, 62, 71));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_3.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_4.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, 50));

        btn_3.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btn_3.setForeground(new java.awt.Color(55, 62, 71));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_3.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_4.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 50, 50));

        btn_0.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btn_0.setForeground(new java.awt.Color(55, 62, 71));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_3.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_4.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 50, 50));

        btn_punto.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btn_punto.setForeground(new java.awt.Color(55, 62, 71));
        btn_punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_3.png"))); // NOI18N
        btn_punto.setText(".");
        btn_punto.setFocusPainted(false);
        btn_punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_1.png"))); // NOI18N
        btn_punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_4.png"))); // NOI18N
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 330, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
        textoOperacion.setText("");
        textoResultado.setText("");
    }//GEN-LAST:event_btn_cActionPerformed
        
    
    
    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        addNumber("7");       
        btn_igual.doClick();
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        addNumber("8"); 
        btn_igual.doClick();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
       addNumber("9"); 
       btn_igual.doClick();
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        addNumber("4");  
        btn_igual.doClick();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        addNumber("5"); 
        btn_igual.doClick();
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        addNumber("6"); 
        btn_igual.doClick();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        addNumber("1"); 
        btn_igual.doClick();
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        addNumber("2"); 
        btn_igual.doClick();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        addNumber("3"); 
        btn_igual.doClick();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        addNumber("0"); 
        btn_igual.doClick();
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_borrarUnDigitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarUnDigitoActionPerformed
        String texto = textoOperacion.getText().substring(0,textoOperacion.getText().length()-1);
        textoOperacion.setText(texto);
        btn_igual.doClick();
    }//GEN-LAST:event_btn_borrarUnDigitoActionPerformed

    private void btn_porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcentajeActionPerformed
        addNumber("%");
    }//GEN-LAST:event_btn_porcentajeActionPerformed

    private void btn_dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dividirActionPerformed
        addNumber("/");
    }//GEN-LAST:event_btn_dividirActionPerformed

    private void btn_multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicarActionPerformed
        addNumber("*");
    }//GEN-LAST:event_btn_multiplicarActionPerformed

    private void btn_restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restarActionPerformed
        addNumber("-");
    }//GEN-LAST:event_btn_restarActionPerformed

    private void btn_sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumarActionPerformed
        addNumber("+");
       
    }//GEN-LAST:event_btn_sumarActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
    try{
        String resultado = se.eval(textoOperacion.getText()).toString();
        textoResultado.setText(resultado);
    } catch(Exception e){
        
    }
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        addNumber(".");
        
    }//GEN-LAST:event_btn_puntoActionPerformed

    boolean modoOscuro = false;
    
    private void btn_oscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oscuroActionPerformed
        
        if (!modoOscuro) {   
        jPanel1.setBackground(Color.decode("#212b41"));
        jPanel2.setBackground(Color.decode("#2e3951"));
        textoOperacion.setForeground(Color.decode("#C0CBC6"));
        textoResultado.setForeground(Color.decode("#C0CBC6"));
        
        cambiarColorBtn1(btn_multiplicar);
        cambiarColorBtn1(btn_sumar);
        cambiarColorBtn1(btn_restar);
        cambiarColorBtn1(btn_borrarUnDigito);
        cambiarColorBtn1(btn_dividir);
        cambiarColorBtn1(btn_c);
        cambiarColorBtn1(btn_porcentaje);
        cambiarColorBtn1(btn_igual);
        cambiarColorBtn2(btn_0);
        cambiarColorBtn2(btn_1);
        cambiarColorBtn2(btn_2);
        cambiarColorBtn2(btn_3);
        cambiarColorBtn2(btn_4);
        cambiarColorBtn2(btn_5);
        cambiarColorBtn2(btn_6);
        cambiarColorBtn2(btn_7);
        cambiarColorBtn2(btn_8);
        cambiarColorBtn2(btn_9);
        cambiarColorBtn2(btn_punto);
        
        btn_oscuro.setIcon(new ImageIcon(getClass().getResource("/images/btn_light_mode.png")));
        btn_igual.setIcon(new ImageIcon(getClass().getResource("/images/btn_7.png")));
        btn_igual.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn_8.png")));
        btn_igual.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn_9.png")));
        btn_igual.setForeground(Color.decode("#FFFFFF"));
        modoOscuro = true;
        } else{
            Calculadora frame = new Calculadora();
            this.dispose();
            frame.setVisible(true);
        } 
           
        
    }//GEN-LAST:event_btn_oscuroActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    
    
    
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    
    public void cambiarColorBtn1(JButton btn){
        btn.setIcon(new ImageIcon(getClass().getResource("/images/btn_9.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn_8.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn_7.png")));
        btn.setForeground(Color.decode("#90e8d3"));
    }
    
    public void cambiarColorBtn2(JButton btn){
        btn.setIcon(new ImageIcon(getClass().getResource("/images/btn_6.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn_6.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn_8.png")));
        btn.setForeground(Color.decode("#96a8a0"));
    }
    
    public void addNumber(String digito){
        textoOperacion.setText(textoOperacion.getText()+digito);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_borrarUnDigito;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_dividir;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multiplicar;
    private javax.swing.JButton btn_oscuro;
    private javax.swing.JButton btn_porcentaje;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_restar;
    private javax.swing.JButton btn_sumar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel textoOperacion;
    private javax.swing.JLabel textoResultado;
    // End of variables declaration//GEN-END:variables
}
