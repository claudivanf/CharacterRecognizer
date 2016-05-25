/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recognizercharactersia;

import com.classifier.MyClassifier;
import com.classifier.RecognizerChar;
import com.serializer.ClassifierSerializer;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author claudivan
 */
public class TelaInicial extends javax.swing.JFrame {

    RecognizerChar myRecognizer = new RecognizerChar();
    
    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        imgLoadingTrain.setVisible(false);
        txtTraining.setVisible(false);
        for (String classifier : MyClassifier.classifiers) {
            boxTrain.addItem(classifier);
            boxTestImg.addItem(classifier);
            boxTestSet.addItem(classifier);
        }
        if (ClassifierSerializer.hasClassifier("MultilayerPerceptron")) {
            myRecognizer.NNCTrain = ClassifierSerializer.load("MultilayerPerceptron");
            txtDateLT.setText(myRecognizer.NNCTrain.last_train);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtPathImg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnPath = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        imgToTest = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        btnTestar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        boxTestImg = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtPathSet = new javax.swing.JTextField();
        btnPathSet = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSetResult = new javax.swing.JTextArea();
        btnTestarSet = new javax.swing.JButton();
        boxTestSet = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtPathTrain = new javax.swing.JTextField();
        btnPathTrain = new javax.swing.JButton();
        btnTreinar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtDateLT = new javax.swing.JTextField();
        imgLoadingTrain = new javax.swing.JLabel();
        txtTraining = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        boxTrain = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Inteligência Artificial - Reconhecedor de Caracteres");

        txtPathImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPathImgActionPerformed(evt);
            }
        });

        jLabel2.setText("Caminho Do Arquivo de Teste:");

        btnPath.setText("...");
        btnPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPathActionPerformed(evt);
            }
        });

        jLabel3.setText("Resultado:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setText("Visualização:");

        txtResult.setEnabled(false);

        btnTestar.setText("TESTAR");
        btnTestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestarActionPerformed(evt);
            }
        });

        jLabel13.setText("Classificador:");

        boxTestImg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        boxTestImg.setEnabled(false);
        boxTestImg.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxTestImgItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgToTest, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(boxTestImg, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTestar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPathImg, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPath, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPathImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxTestImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgToTest, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnTestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        imgToTest.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane1.addTab("Teste Imagem", jPanel1);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel5.setText("Inteligência Artificial - Reconhecedor de Caracteres");

        jLabel7.setText("Caminho Do Conjunto de Teste:");

        txtPathSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPathSetActionPerformed(evt);
            }
        });

        btnPathSet.setText("...");
        btnPathSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPathSetActionPerformed(evt);
            }
        });

        jLabel8.setText("Resultado:");

        txtSetResult.setColumns(20);
        txtSetResult.setRows(5);
        jScrollPane1.setViewportView(txtSetResult);

        btnTestarSet.setText("TESTAR");
        btnTestarSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestarSetActionPerformed(evt);
            }
        });

        boxTestSet.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        boxTestSet.setEnabled(false);
        boxTestSet.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxTestSetItemStateChanged(evt);
            }
        });

        jLabel12.setText("Classificador:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnTestarSet, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtPathSet, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPathSet, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jLabel12)
                                    .addComponent(boxTestSet, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPathSet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPathSet))
                .addGap(7, 7, 7)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxTestSet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTestarSet, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Teste Conjunto", jPanel2);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setText("Inteligência Artificial - Reconhecedor de Caracteres");

        jLabel9.setText("Caminho Do Conjunto de Treinamento:");

        txtPathTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPathTrainActionPerformed(evt);
            }
        });

        btnPathTrain.setText("...");
        btnPathTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPathTrainActionPerformed(evt);
            }
        });

        btnTreinar.setText("TREINAR");
        btnTreinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreinarActionPerformed(evt);
            }
        });

        jLabel10.setText("Data Último Treinamento:");

        txtDateLT.setEnabled(false);
        txtDateLT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateLTActionPerformed(evt);
            }
        });

        imgLoadingTrain.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        imgLoadingTrain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rocky-train.gif"))); // NOI18N
        imgLoadingTrain.setToolTipText("");
        imgLoadingTrain.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgLoadingTrain.setIconTextGap(20);

        txtTraining.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtTraining.setText("TREINANDO...");

        jLabel11.setText("Classificador:");

        boxTrain.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        boxTrain.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxTrainItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(txtPathTrain, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnPathTrain, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel9))
                            .addComponent(jLabel11)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(boxTrain, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDateLT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(btnTreinar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(imgLoadingTrain)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(txtTraining)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPathTrain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPathTrain))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxTrain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDateLT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btnTreinar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imgLoadingTrain, javax.swing.GroupLayout.PREFERRED_SIZE, 147, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTraining, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Treinamento", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPathActionPerformed
        JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    txtPathImg.setText(selectedFile.getPath());
                    ImageIcon icon = redimensionaImagem(selectedFile);
                    imgToTest.setIcon(icon);
                    txtResult.setText("");
            }
    }//GEN-LAST:event_btnPathActionPerformed

    private ImageIcon redimensionaImagem(File file) {
        BufferedImage img = null;
        Image dimg = null;
        ImageIcon icon = null;
        try {
            img = ImageIO.read(file);
            if (img.getWidth() > imgToTest.getWidth() ||
                    img.getHeight() > imgToTest.getHeight()) {
                dimg = img.getScaledInstance(
                imgToTest.getWidth(), imgToTest.getHeight(),
                Image.SCALE_DEFAULT);
                icon = new ImageIcon(dimg);
            } else {
                icon = new ImageIcon(file.getPath());
            }
        } catch (IOException e) {   
        }
        return icon;
    }
    
    private void txtPathImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPathImgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPathImgActionPerformed

    private void btnTestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestarActionPerformed
        try {
            String resultado = myRecognizer.classsifyImage(txtPathImg.getText());
            txtResult.setText(resultado);
        } catch (Exception ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTestarActionPerformed

    private void txtPathSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPathSetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPathSetActionPerformed

    private void btnPathSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPathSetActionPerformed
        JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    txtPathSet.setText(selectedFile.getPath());
                    myRecognizer.PATH_TEST_SET = selectedFile.getPath();
            }
    }//GEN-LAST:event_btnPathSetActionPerformed

    private void btnTestarSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestarSetActionPerformed
        try {
            String result = myRecognizer.runSetTest();
            txtSetResult.setText(result);
        } catch (Exception ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTestarSetActionPerformed

    private void txtPathTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPathTrainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPathTrainActionPerformed

    private void btnPathTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPathTrainActionPerformed
        JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    txtPathTrain.setText(selectedFile.getPath());
                    myRecognizer.PATH_TRAIN = selectedFile.getPath();
            }
    }//GEN-LAST:event_btnPathTrainActionPerformed

    private void btnTreinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreinarActionPerformed
        imgLoadingTrain.setIcon(
                new ImageIcon(getClass().getResource("/rocky-train.gif")));
        txtTraining.setText("TREINANDO...");
        imgLoadingTrain.setVisible(true);
        txtTraining.setVisible(true);
        Thread thread = new Thread(){
            @Override
            public void run(){
                try {
                    System.out.println((String) boxTrain.getSelectedItem());
                    myRecognizer.train((String) boxTrain.getSelectedItem());
                    myRecognizer.NNCTrain.last_train = 
                            new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date());
                    // salva o atual treinamento
                    ClassifierSerializer.save(myRecognizer.NNCTrain);
                    JOptionPane.showMessageDialog(TelaInicial.this, "Treinamento concluído");
                    imgLoadingTrain.setIcon(
                            new ImageIcon(getClass().getResource("/rocky-train-finish.gif")));
                    txtTraining.setText("TREINO OK!");
                    txtDateLT.setText(myRecognizer.NNCTrain.last_train);
                } catch (Exception ex) {
                    imgLoadingTrain.setVisible(false);
                    txtTraining.setVisible(false);
                    Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };

        thread.start();
        
    }//GEN-LAST:event_btnTreinarActionPerformed

    private void txtDateLTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateLTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateLTActionPerformed

    private void boxTestSetItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxTestSetItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String classifier = (String) evt.getItem();
            boxTestImg.setSelectedItem(evt.getItem());
            boxTrain.setSelectedItem(evt.getItem());
            if (ClassifierSerializer.hasClassifier(classifier)) {
                myRecognizer.NNCTrain = ClassifierSerializer.load(classifier);
            }
        }
    }//GEN-LAST:event_boxTestSetItemStateChanged

    private void boxTestImgItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxTestImgItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) { 
            String classifier = (String) evt.getItem();
            boxTestSet.setSelectedItem(evt.getItem());
            boxTrain.setSelectedItem(evt.getItem());
            if (ClassifierSerializer.hasClassifier(classifier)) {
                myRecognizer.NNCTrain = ClassifierSerializer.load(classifier);
            }
        }
    }//GEN-LAST:event_boxTestImgItemStateChanged

    private void boxTrainItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxTrainItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) { 
            String classifier = (String) evt.getItem();
            boxTestImg.setSelectedItem(evt.getItem());
            boxTestSet.setSelectedItem(evt.getItem());
            if (ClassifierSerializer.hasClassifier(classifier)) {
                myRecognizer.NNCTrain = ClassifierSerializer.load(classifier);
                txtDateLT.setText(myRecognizer.NNCTrain.last_train);
            } else {
                txtDateLT.setText("");
            }
        }
    }//GEN-LAST:event_boxTrainItemStateChanged

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxTestImg;
    private javax.swing.JComboBox<String> boxTestSet;
    private javax.swing.JComboBox<String> boxTrain;
    private javax.swing.JButton btnPath;
    private javax.swing.JButton btnPathSet;
    private javax.swing.JButton btnPathTrain;
    private javax.swing.JButton btnTestar;
    private javax.swing.JButton btnTestarSet;
    private javax.swing.JButton btnTreinar;
    private javax.swing.JLabel imgLoadingTrain;
    private javax.swing.JLabel imgToTest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtDateLT;
    private javax.swing.JTextField txtPathImg;
    private javax.swing.JTextField txtPathSet;
    private javax.swing.JTextField txtPathTrain;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextArea txtSetResult;
    private javax.swing.JLabel txtTraining;
    // End of variables declaration//GEN-END:variables
}
