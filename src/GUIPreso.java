
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hp
 */
public class GUIPreso extends javax.swing.JFrame {

    //Variables
    Preso p1;
    ArrayList<Preso> misPresos = new ArrayList();
    DefaultTableModel tablaInformacion;

    //Constructores
    public GUIPreso() {
        initComponents();
    }

    public GUIPreso(ArrayList<Preso> misPresos) {
        initComponents();
        this.misPresos = misPresos;

        //Variables
        String mat[][] = new String[misPresos.size()][3];

        //Presentación de datos
        for (int i = 0; i < misPresos.size(); i++) {
            mat[i][0] = String.valueOf(misPresos.get(i).getDocumentoDeIdentidad());
            mat[i][1] = misPresos.get(i).getNombre();
            mat[i][2] = misPresos.get(i).getApellido();
        }
    }
    
    public void limpiar () {
        //Limpia los registros ingresados
        txtNombre.setText("");
        txtApellido.setText("");
        txtNacionalidad.setText("");
        txtDelito.setText("");
        txtDocumentoDeIdentidad.setText("");
        btgDocumentoDeIdentidad.clearSelection();
        btgReincidencia.clearSelection();
        cmbEstadoDeSentencia.setSelectedIndex(0);
        cmbNivelDePeligrosidad.setSelectedIndex(0);
        rscFechaDeIngreso.setDatoFecha(null);
        rscFechaDeNacimiento.setDatoFecha(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgDocumentoDeIdentidad = new javax.swing.ButtonGroup();
        btgReincidencia = new javax.swing.ButtonGroup();
        rSDateChooserBeanInfo1 = new rojeru_san.componentes.RSDateChooserBeanInfo();
        lblTitulo = new javax.swing.JLabel();
        pnlDatos = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtDelito = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        lblNacionalidad = new javax.swing.JLabel();
        lblDelito = new javax.swing.JLabel();
        rscFechaDeIngreso = new rojeru_san.componentes.RSDateChooser();
        rscFechaDeNacimiento = new rojeru_san.componentes.RSDateChooser();
        pnlIdentificacion = new javax.swing.JPanel();
        rdbCedula = new javax.swing.JRadioButton();
        rdbPasaporte = new javax.swing.JRadioButton();
        txtDocumentoDeIdentidad = new javax.swing.JTextField();
        pnlReincidencia = new javax.swing.JPanel();
        rdbSi = new javax.swing.JRadioButton();
        rdbNo = new javax.swing.JRadioButton();
        pnlNivelDePeligrosidad = new javax.swing.JPanel();
        cmbNivelDePeligrosidad = new javax.swing.JComboBox<>();
        pnlEstadoDeSentencia = new javax.swing.JPanel();
        cmbEstadoDeSentencia = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnDatos = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblTitulo.setText("Sistema Penitenciario");

        pnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre");

        lblApellido.setText("Apellido");

        lblNacionalidad.setText("Nacionalidad");

        lblDelito.setText("Delito");

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDelito)
                    .addComponent(lblNacionalidad)
                    .addComponent(lblApellido)
                    .addComponent(lblNombre))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(txtApellido)
                    .addComponent(txtNacionalidad)
                    .addComponent(txtDelito, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 7, Short.MAX_VALUE))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNacionalidad)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDelito)
                    .addComponent(txtDelito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        rscFechaDeIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha de Ingreso"));
        rscFechaDeIngreso.setColorBackground(new java.awt.Color(0, 0, 0));
        rscFechaDeIngreso.setColorButtonHover(new java.awt.Color(0, 0, 0));

        rscFechaDeNacimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha de Nacimiento"));
        rscFechaDeNacimiento.setColorBackground(new java.awt.Color(0, 0, 0));
        rscFechaDeNacimiento.setColorButtonHover(new java.awt.Color(0, 0, 0));

        pnlIdentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Identificación"));

        btgDocumentoDeIdentidad.add(rdbCedula);
        rdbCedula.setText("Cedula");

        btgDocumentoDeIdentidad.add(rdbPasaporte);
        rdbPasaporte.setText("Pasaporte");

        txtDocumentoDeIdentidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoDeIdentidadActionPerformed(evt);
            }
        });
        txtDocumentoDeIdentidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDocumentoDeIdentidadKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlIdentificacionLayout = new javax.swing.GroupLayout(pnlIdentificacion);
        pnlIdentificacion.setLayout(pnlIdentificacionLayout);
        pnlIdentificacionLayout.setHorizontalGroup(
            pnlIdentificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdentificacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIdentificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDocumentoDeIdentidad)
                    .addGroup(pnlIdentificacionLayout.createSequentialGroup()
                        .addComponent(rdbCedula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdbPasaporte)))
                .addContainerGap())
        );
        pnlIdentificacionLayout.setVerticalGroup(
            pnlIdentificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdentificacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIdentificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbCedula)
                    .addComponent(rdbPasaporte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDocumentoDeIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnlReincidencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Reincidencia"));

        btgReincidencia.add(rdbSi);
        rdbSi.setText("SI");

        btgReincidencia.add(rdbNo);
        rdbNo.setText("NO");

        javax.swing.GroupLayout pnlReincidenciaLayout = new javax.swing.GroupLayout(pnlReincidencia);
        pnlReincidencia.setLayout(pnlReincidenciaLayout);
        pnlReincidenciaLayout.setHorizontalGroup(
            pnlReincidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReincidenciaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(rdbSi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdbNo)
                .addGap(39, 39, 39))
        );
        pnlReincidenciaLayout.setVerticalGroup(
            pnlReincidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReincidenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlReincidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbSi)
                    .addComponent(rdbNo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlNivelDePeligrosidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Nivel De Peligrosidad"));

        cmbNivelDePeligrosidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Baja", "Media", "Alta" }));
        cmbNivelDePeligrosidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNivelDePeligrosidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNivelDePeligrosidadLayout = new javax.swing.GroupLayout(pnlNivelDePeligrosidad);
        pnlNivelDePeligrosidad.setLayout(pnlNivelDePeligrosidadLayout);
        pnlNivelDePeligrosidadLayout.setHorizontalGroup(
            pnlNivelDePeligrosidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNivelDePeligrosidadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbNivelDePeligrosidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlNivelDePeligrosidadLayout.setVerticalGroup(
            pnlNivelDePeligrosidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNivelDePeligrosidadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbNivelDePeligrosidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlEstadoDeSentencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado De Sentencia"));

        cmbEstadoDeSentencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Prision Preventiva", "Condena Aplicada", "En Ejecucion", "Proceso de Libertad Condicional", "Proceso de Libertad" }));
        cmbEstadoDeSentencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoDeSentenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEstadoDeSentenciaLayout = new javax.swing.GroupLayout(pnlEstadoDeSentencia);
        pnlEstadoDeSentencia.setLayout(pnlEstadoDeSentenciaLayout);
        pnlEstadoDeSentenciaLayout.setHorizontalGroup(
            pnlEstadoDeSentenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEstadoDeSentenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbEstadoDeSentencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlEstadoDeSentenciaLayout.setVerticalGroup(
            pnlEstadoDeSentenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstadoDeSentenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbEstadoDeSentencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnDatos.setText("Datos");
        btnDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btnNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDatos)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rscFechaDeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(pnlIdentificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(pnlNivelDePeligrosidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(pnlEstadoDeSentencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(pnlReincidencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rscFechaDeIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(lblTitulo)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlNivelDePeligrosidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlEstadoDeSentencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlReincidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rscFechaDeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rscFechaDeIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnDatos)
                    .addComponent(btnSalir)
                    .addComponent(btnNuevo))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDocumentoDeIdentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoDeIdentidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoDeIdentidadActionPerformed

    private void cmbEstadoDeSentenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoDeSentenciaActionPerformed
        // TODO add your handling code here:     

    }//GEN-LAST:event_cmbEstadoDeSentenciaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:

        //Cédula
        String cedula = txtDocumentoDeIdentidad.getText();

        //Variables
        String nombre = "";
        String apellido = "";
        String nacionalidad = "";
        int documentoDeIdentidad = 0;
        String delito = "";
        String reincidencia = "";
        String estadoDeSentencia = "";
        int nivelDePeligrosidad = 0;

        //Jueces
        String juezEncargadoLC = "";
        double tiempoCondena = 0;
        String juezEncargadoCA = "";

        try {
            if (valida(cedula) == true) {
                //Datos
                nombre = txtNombre.getText();
                apellido = txtApellido.getText();
                nacionalidad = txtNacionalidad.getText();
                documentoDeIdentidad = Integer.parseInt(cedula);
                Date fechaDeNacimiento = rscFechaDeNacimiento.getDatoFecha();
                Date fechaDeIngreso = rscFechaDeIngreso.getDatoFecha();
                delito = txtDelito.getText();

                //Reincidencia
                if (rdbSi.isSelected()) {
                    reincidencia = "SI";
                } else {
                    reincidencia = "NO";
                }

                //Nivel de peligrosidad
                String peligrosidad = cmbNivelDePeligrosidad.getSelectedItem().toString();
                switch (peligrosidad) {
                    case "Baja":
                        nivelDePeligrosidad = 1;
                    case "Media":
                        nivelDePeligrosidad = 2;
                    case "Alta":
                        nivelDePeligrosidad = 3;
                }

                //Estado de sentencia
                estadoDeSentencia = cmbEstadoDeSentencia.getSelectedItem().toString();
                switch (estadoDeSentencia) {
                    case "Prision Preventiva":
                        juezEncargadoLC = JOptionPane.showInputDialog(rootPane,
                                "Ingreso el nombre completo del encargado de dictar la prision "
                                + "preventiva al sujeto ");
                    case "Condena Aplicada":
                        tiempoCondena = Integer.parseInt(JOptionPane.showInputDialog(rootPane,
                                "Ingrese el número de años que el preso fue condenado"));
                        juezEncargadoCA = JOptionPane.showInputDialog(rootPane,
                                "Ingreso el nombre completo del encargado de dictar la prision "
                                + "preventiva al sujeto ");
                    case "En Ejecucion":

                    case "Proceso de Libertad Condicional":

                    case "Proceso de Libertad":
                }

                //Creación de preso
                p1 = new Preso(nombre, apellido, nacionalidad,
                        documentoDeIdentidad, fechaDeNacimiento, fechaDeIngreso,
                        reincidencia, estadoDeSentencia, nivelDePeligrosidad,
                        delito) {
                    @Override
                    protected String arresto() {
                        String arresto = "";
                        arresto = "Motivo de arresto: ";
                        return arresto;
                    }
                };

                //Añadir p1 a misPresos
                misPresos.add(p1);
                GUIPreso preso = new GUIPreso(misPresos);
                System.out.println(misPresos.get(misPresos.size() - 1).getNombre());

            } else {
                JOptionPane.showMessageDialog(null, "Cédula incorrecta");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos válidos");
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbNivelDePeligrosidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNivelDePeligrosidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNivelDePeligrosidadActionPerformed

    private void txtDocumentoDeIdentidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocumentoDeIdentidadKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDocumentoDeIdentidadKeyTyped

    private void btnDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosActionPerformed
        // TODO add your handling code here:

        //Abre el sistema
        GUIBusqueda search = new GUIBusqueda(misPresos);

        //Desaparece el sistema de autenticación
        search.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDatosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        //FIN
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(GUIPreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPreso().setVisible(true);
            }
        });
    }

    public static boolean valida(String x) {
        int suma = 0;
        if (x.length() < 10) {
            return false;
        } else {
            int a[] = new int[x.length() / 2];
            int b[] = new int[(x.length() / 2)];
            int c = 0;
            int d = 1;
            for (int i = 0; i < x.length() / 2; i++) {
                a[i] = Integer.parseInt(String.valueOf(x.charAt(c)));
                c = c + 2;
                if (i < (x.length() / 2) - 1) {
                    b[i] = Integer.parseInt(String.valueOf(x.charAt(d)));
                    d = d + 2;
                }
            }

            for (int i = 0; i < a.length; i++) {
                a[i] = a[i] * 2;
                if (a[i] > 9) {
                    a[i] = a[i] - 9;
                }
                suma = suma + a[i] + b[i];
            }
            int aux = suma / 10;
            int dec = (aux + 1) * 10;
            if ((dec - suma) == Integer.parseInt(String.valueOf(x.charAt(x.length() - 1)))) {
                return true;
            } else if (suma % 10 == 0 && x.charAt(x.length() - 1) == '0') {
                return true;
            } else {
                return false;
            }

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgDocumentoDeIdentidad;
    private javax.swing.ButtonGroup btgReincidencia;
    private javax.swing.JButton btnDatos;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbEstadoDeSentencia;
    private javax.swing.JComboBox<String> cmbNivelDePeligrosidad;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDelito;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlEstadoDeSentencia;
    private javax.swing.JPanel pnlIdentificacion;
    private javax.swing.JPanel pnlNivelDePeligrosidad;
    private javax.swing.JPanel pnlReincidencia;
    private rojeru_san.componentes.RSDateChooserBeanInfo rSDateChooserBeanInfo1;
    private javax.swing.JRadioButton rdbCedula;
    private javax.swing.JRadioButton rdbNo;
    private javax.swing.JRadioButton rdbPasaporte;
    private javax.swing.JRadioButton rdbSi;
    private rojeru_san.componentes.RSDateChooser rscFechaDeIngreso;
    private rojeru_san.componentes.RSDateChooser rscFechaDeNacimiento;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDelito;
    private javax.swing.JTextField txtDocumentoDeIdentidad;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
