package demo.generadorpdf2.gui;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Principal extends javax.swing.JFrame {

    // Variables
    java.io.File pdfSeleccionado;
    DefaultListModel<String> partnersModel = new DefaultListModel<>();
    DefaultListModel<String> partnersIncluidosModel = new DefaultListModel<>();
    List<String> partnersSeleccionados = new ArrayList<>();

    public Principal() {

        initComponents();

        // Inicializar listas
        jListPartners.setModel(partnersModel);
        jListPartnersIncluidos.setModel(partnersIncluidosModel);

        // Ejemplo de partners
        partnersModel.addElement("acronis");
        partnersModel.addElement("adobe");
        partnersModel.addElement("cisco");
        partnersModel.addElement("dell");
        partnersModel.addElement("hp");
        partnersModel.addElement("masbe");
        partnersModel.addElement("microsoft");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelInsertarPortada = new javax.swing.JLabel();
        jTextBuscarPDF = new javax.swing.JTextField();
        jLabelBuscarPDF = new javax.swing.JLabel();
        jCheckBoxInsertarPortada = new javax.swing.JCheckBox();
        jButtonBuscarPDF = new javax.swing.JButton();
        jTextNumeroPaginas = new javax.swing.JTextField();
        jLabelPartners = new javax.swing.JLabel();
        jLabelNumeroPaginas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPartners = new javax.swing.JList<>();
        jLabelInsertarFInal = new javax.swing.JLabel();
        jCheckBoxInsertarFinal = new javax.swing.JCheckBox();
        jButtonSalir = new javax.swing.JButton();
        jButtonGenerar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListPartnersIncluidos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabelNombreEmpresa = new javax.swing.JLabel();
        jTextNombreEmpresa = new javax.swing.JTextField();
        jLabelLogo = new javax.swing.JLabel();
        jButtonAgregarPartner = new javax.swing.JButton();
        jButtonQuitarPartner = new javax.swing.JButton();
        jButtonVerPDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Sylfaen", 0, 48)); // NOI18N
        jLabelTitulo.setText("Generador PDF");

        jLabelInsertarPortada.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelInsertarPortada.setText("Insertar portada de Inmasan");

        jTextBuscarPDF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextBuscarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscarPDFActionPerformed(evt);
            }
        });

        jLabelBuscarPDF.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelBuscarPDF.setText("Buscar PDF");

        jCheckBoxInsertarPortada.setMaximumSize(new java.awt.Dimension(22, 22));
        jCheckBoxInsertarPortada.setMinimumSize(new java.awt.Dimension(22, 22));
        jCheckBoxInsertarPortada.setPreferredSize(new java.awt.Dimension(22, 22));
        jCheckBoxInsertarPortada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxInsertarPortadaActionPerformed(evt);
            }
        });

        jButtonBuscarPDF.setText("Buscar");
        jButtonBuscarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPDFActionPerformed(evt);
            }
        });

        jTextNumeroPaginas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextNumeroPaginas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNumeroPaginasActionPerformed(evt);
            }
        });

        jLabelPartners.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelPartners.setText("Incluir partners");

        jLabelNumeroPaginas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelNumeroPaginas.setText("Nº de páginas a copiar (Ej: 3-4)");

        jListPartners.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListPartners);

        jLabelInsertarFInal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelInsertarFInal.setText("Insertar página final de Inmasan");

        jCheckBoxInsertarFinal.setMaximumSize(new java.awt.Dimension(22, 22));
        jCheckBoxInsertarFinal.setMinimumSize(new java.awt.Dimension(22, 22));
        jCheckBoxInsertarFinal.setPreferredSize(new java.awt.Dimension(22, 22));
        jCheckBoxInsertarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxInsertarFinalActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonGenerar.setText("Generar");
        jButtonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarActionPerformed(evt);
            }
        });

        jListPartnersIncluidos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jListPartnersIncluidos);

        jLabelNombreEmpresa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelNombreEmpresa.setText("Nombre de la empresa");

        jTextNombreEmpresa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextNombreEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreEmpresaActionPerformed(evt);
            }
        });

        jLabelLogo.setIcon(new javax.swing.ImageIcon("D:\\NetBeansProjects\\generadorpdf2\\inmasan-logo.png")); // NOI18N

        jButtonAgregarPartner.setText("Agregar");
        jButtonAgregarPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarPartnerActionPerformed(evt);
            }
        });

        jButtonQuitarPartner.setText("Quitar");
        jButtonQuitarPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitarPartnerActionPerformed(evt);
            }
        });

        jButtonVerPDF.setText("Ver PDF");
        jButtonVerPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelInsertarPortada)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxInsertarPortada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelInsertarFInal)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxInsertarFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(104, 104, 104)
                            .addComponent(jButtonGenerar)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonSalir))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelNumeroPaginas)
                            .addGap(18, 18, 18)
                            .addComponent(jTextNumeroPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNombreEmpresa)
                        .addGap(18, 18, 18)
                        .addComponent(jTextNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelBuscarPDF)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscarPDF))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextBuscarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVerPDF)))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelLogo)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(89, 89, 89)
                                    .addComponent(jLabelPartners))))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAgregarPartner)
                        .addGap(80, 80, 80)
                        .addComponent(jButtonQuitarPartner)
                        .addGap(77, 77, 77))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLogo)
                    .addComponent(jLabelTitulo))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(jLabelPartners)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAgregarPartner)
                            .addComponent(jButtonQuitarPartner)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelInsertarPortada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBoxInsertarPortada, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelInsertarFInal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBoxInsertarFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombreEmpresa)
                            .addComponent(jTextNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBuscarPDF)
                            .addComponent(jButtonBuscarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextBuscarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonVerPDF))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextNumeroPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNumeroPaginas))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarPartnerActionPerformed

        // Obtener el elemento seleccionado en la lista de partners
        String partnerSeleccionado = jListPartners.getSelectedValue();

        // Verificar si se selecciono un partner
        if (partnerSeleccionado != null) {

            // Agregar el partner a la lista de partners incluidos
            partnersIncluidosModel.addElement(partnerSeleccionado);

            // Remover el partner de la lista de partners
            partnersModel.removeElement(partnerSeleccionado);

            // Agregar el partner a la lista de partners seleccionados
            partnersSeleccionados.add(partnerSeleccionado);

        }

    }//GEN-LAST:event_jButtonAgregarPartnerActionPerformed

    private void jButtonQuitarPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitarPartnerActionPerformed

        // Obtener el elemento seleccionado en la lista de partners incluidos
        String partnerSeleccionado = jListPartnersIncluidos.getSelectedValue();

        // Verificar si se seleccionó un partner
        if (partnerSeleccionado != null) {

            // Agregar el partner a la lista de partners
            partnersModel.addElement(partnerSeleccionado);

            // Remover el partner de la lista de partners incluidos
            partnersIncluidosModel.removeElement(partnerSeleccionado);

            // Remover el partner de la lista de partners seleccionados
            partnersSeleccionados.remove(partnerSeleccionado);
        }
    }//GEN-LAST:event_jButtonQuitarPartnerActionPerformed

    private void jButtonVerPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerPDFActionPerformed

        try {
            // Se obtiene el archivo PDF seleccionado
            File archivoPDF = pdfSeleccionado;
            // Se verifica que el archivo existe
            if (archivoPDF.exists() && archivoPDF.isFile()) {
                // Se sustituye la ruta por la ruta absoluta obtenida del objeto File
                Process p = Runtime.getRuntime().exec("rundll32 SHELL32.DLL,"
                        + "ShellExec_RunDLL " + archivoPDF.getAbsolutePath());
            } else {
                JOptionPane.showMessageDialog(null, "El archivo seleccionado no es válido", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception evvv) {
            JOptionPane.showMessageDialog(null, "No se puede abrir el archivo de ayuda", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonVerPDFActionPerformed

    private void jTextBuscarPDFActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextBuscarPDFActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_jTextBuscarPDFActionPerformed

    private void jCheckBoxInsertarPortadaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBoxInsertarPortadaActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jCheckBoxInsertarPortadaActionPerformed

    private void jButtonBuscarPDFActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonBuscarPDFActionPerformed

        try {
            JFileChooser fileChooser = new JFileChooser();

            int resultado = fileChooser.showOpenDialog(null);

            if (resultado == JFileChooser.APPROVE_OPTION) {
                File archivoSeleccionado = fileChooser.getSelectedFile();
                String nombrePDF = archivoSeleccionado.getName();

                // Verificar si es un archivo PDF
                if (nombrePDF.toLowerCase().endsWith(".pdf")) {
                    pdfSeleccionado = archivoSeleccionado;
                    jTextBuscarPDF.setText(nombrePDF);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, seleccione un archivo PDF.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al seleccionar el archivo: " + e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_jButtonBuscarPDFActionPerformed

    private void jTextNumeroPaginasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextNumeroPaginasActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextNumeroPaginasActionPerformed

    private void jCheckBoxInsertarFinalActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBoxInsertarFinalActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jCheckBoxInsertarFinalActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonSalirActionPerformed

        // Cierra la ventana principal y termina la aplicación
        this.dispose(); // Cierra la ventana actual
        System.exit(0); // Termina la aplicación

    }// GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonGenerarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonGenerarActionPerformed

        try {

            /**
             * NOMBRE EMPRESA
             */
            String nombreEmpresa = jTextNombreEmpresa.getText();

            // Comprobamos que el nombre no este vacio
            if (nombreEmpresa.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Inserte un nombre de empresa por favor.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

            String rutaArchivo = System.getProperty("user.home") + "\\Desktop\\Inmasan-Propuesta-" + nombreEmpresa
                    + ".pdf";

            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(rutaArchivo));
            document.open();

            /**
             * PORTADA
             */
            if (jCheckBoxInsertarPortada.isSelected()) {

                String rutaImagen = "inmasan-portada.png";
                Image imagen = Image.getInstance(rutaImagen);

                imagen.scaleToFit(PageSize.A4.getWidth(), PageSize.A4.getHeight());

                imagen.setAbsolutePosition((PageSize.A4.getWidth() - imagen.getScaledWidth()) / 2,
                        (PageSize.A4.getHeight() - imagen.getScaledHeight()) / 2);

                document.add(imagen);

                document.newPage();
            }

            /**
             * NUMERO DE DIAPOSITIVAS A COPIAR
             */
            String rangoPaginas = jTextNumeroPaginas.getText();

            String[] numeros = rangoPaginas.split("-");

            int paginaInicio, paginaFin;

            if (numeros.length == 2) {
                paginaInicio = Integer.parseInt(numeros[0]);
                paginaFin = Integer.parseInt(numeros[1]);
            } else if (numeros.length == 1) {
                paginaInicio = Integer.parseInt(numeros[0]);
                paginaFin = paginaInicio; // Tratarlo como una sola página
            } else {
                JOptionPane.showMessageDialog(this,
                        "El formato del rango de páginas es inválido. Use el formato 'inicio-fin' o 'página única'.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return; // Salir del método
            }

            PdfReader reader = new PdfReader(pdfSeleccionado.getAbsolutePath());
            int numeroTotalPaginas = reader.getNumberOfPages();

            // Verificar si el rango de páginas está dentro del límite
            if (paginaInicio >= 1 && paginaFin <= numeroTotalPaginas && paginaInicio <= paginaFin) {
                for (int i = paginaInicio; i <= paginaFin; i++) {
                    document.newPage();
                    PdfImportedPage pagina = writer.getImportedPage(reader, i);
                    writer.getDirectContent().addTemplate(pagina, 0, 0);
                }
            } else {
                JOptionPane.showMessageDialog(this, "El rango de páginas especificado es inválido. El documento tiene "
                        + numeroTotalPaginas + " páginas.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            /**
             * LISTA DE PARTNERS SELECCIONADOS
             */
            // Crear una nueva página para los logos de los partners seleccionados
            document.newPage();

            // Insertamos un titulo
            Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 36);
            Paragraph title = new Paragraph("Partners", titleFont);
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);

            // Damos espacio
            document.add(Chunk.NEWLINE);

            // Crear una tabla para organizar los logos en filas y columnas
            // Num de columnas igual a la cantidad de logos
            PdfPTable table = new PdfPTable(partnersSeleccionados.size());
            table.setWidthPercentage(100);

            for (String partner : partnersSeleccionados) {
                Image logo = Image.getInstance("partners/" + partner + ".png");
                logo.scaleAbsolute(100, 100);

                PdfPCell cell = new PdfPCell();
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cell.addElement(logo);

                table.addCell(cell);
            }

            document.add(table);

            /**
             * PÁGINA FINAL
             */
            if (jCheckBoxInsertarFinal.isSelected()) {
                String paginaFinal = "inmasan-final.pdf";
                reader = new PdfReader(paginaFinal);
                int numPaginas = reader.getNumberOfPages();

                for (int i = 1; i <= numPaginas; i++) {
                    document.newPage();
                    PdfImportedPage pagina = writer.getImportedPage(reader, i);
                    writer.getDirectContent().addTemplate(pagina, 0, 0);
                }
            }

            document.close();

            JOptionPane.showMessageDialog(null, "PDF generado correctamente.\nRuta: " + rutaArchivo);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }// GEN-LAST:event_jButtonGenerarActionPerformed

    private void jTextNombreEmpresaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextNombreEmpresaActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextNombreEmpresaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarPartner;
    private javax.swing.JButton jButtonBuscarPDF;
    private javax.swing.JButton jButtonGenerar;
    private javax.swing.JButton jButtonQuitarPartner;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonVerPDF;
    private javax.swing.JCheckBox jCheckBoxInsertarFinal;
    private javax.swing.JCheckBox jCheckBoxInsertarPortada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBuscarPDF;
    private javax.swing.JLabel jLabelInsertarFInal;
    private javax.swing.JLabel jLabelInsertarPortada;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNombreEmpresa;
    private javax.swing.JLabel jLabelNumeroPaginas;
    private javax.swing.JLabel jLabelPartners;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList<String> jListPartners;
    private javax.swing.JList<String> jListPartnersIncluidos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextBuscarPDF;
    private javax.swing.JTextField jTextNombreEmpresa;
    private javax.swing.JTextField jTextNumeroPaginas;
    // End of variables declaration//GEN-END:variables

}
