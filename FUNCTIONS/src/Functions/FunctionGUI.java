
//PACKAGE
package Functions;

//IMPORTS
import java.awt.Color;
import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/* **********************************************************
* Programmer:      Erika Tvaskis
* Class:           CS30S
* Assignment 5:    GUI View
* Description:     View and its methods
* *************************************************************
*/

public class FunctionGUI extends javax.swing.JFrame 
 { //Begin class
	
//DELCARATION OF INSTANCE VARAIBLES AND OBJECTS
	
protected Controller c; //Controller object
protected DefaultListModel BookListModel = new DefaultListModel();
protected DefaultListModel patientListModel = BookListModel;
protected int Index = 0;
private String[] tokens;   
int x,y;

//CREATES NEW FORM FunctionGUI
public FunctionGUI() {
    initComponents();
    YourNameText.setEnabled(false);
    xValueOne.setEnabled(false);
    xValueTwo.setEnabled(false);
    aValue.setEnabled(false);
    bValue.setEnabled(false);
    cValue.setEnabled(false);
} //End FunctionGUI()

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EnterInformationPanel = new javax.swing.JPanel();
        aValue = new javax.swing.JSpinner();
        FunctionTypeCombo = new javax.swing.JComboBox<>();
        aValueLabel = new javax.swing.JLabel();
        FunctionTypeLabel = new javax.swing.JLabel();
        EnterInformationLabel = new javax.swing.JLabel();
        bValue = new javax.swing.JSpinner();
        bValueLabel = new javax.swing.JLabel();
        cValueLabel = new javax.swing.JLabel();
        cValue = new javax.swing.JSpinner();
        GeneralFormLabel = new javax.swing.JLabel();
        YourAnswerLabel = new javax.swing.JLabel();
        xValueOne = new javax.swing.JSpinner();
        xValueTwo = new javax.swing.JSpinner();
        ClearButton = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();
        TheAnswersPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        try {
            BookInfoText =(javax.swing.JTextArea)java.beans.Beans.instantiate(getClass().getClassLoader(), "Functions.BookGUI_BookInfoText");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        BookListScrollPane = new javax.swing.JScrollPane();
        BookList = new javax.swing.JList<>();
        TheAnswersLabel = new javax.swing.JLabel();
        BookNameLabel1 = new javax.swing.JLabel();
        BookNameLabel2 = new javax.swing.JLabel();
        jTextFieldHelpDelete = new javax.swing.JTextField();
        GraphingCalcLabel = new javax.swing.JLabel();
        StorageJPanel = new javax.swing.JPanel();
        YourNameText = new javax.swing.JTextField();
        StoreYourAnswersLabel = new javax.swing.JLabel();
        EnterYourNameLabel = new javax.swing.JLabel();
        SubmitandStoreCheckBox = new javax.swing.JCheckBox();
        EnterInformationLabel1 = new javax.swing.JLabel();
        GraphingJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Function Information");
        setBackground(new java.awt.Color(0, 255, 102));

        EnterInformationPanel.setBackground(new java.awt.Color(255, 255, 153));
        EnterInformationPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EnterInformationPanel.setName("EnterInformationPanel"); // NOI18N

        aValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        FunctionTypeCombo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        FunctionTypeCombo.setMaximumRowCount(4);
        FunctionTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Linear", "Quadratic" }));
        FunctionTypeCombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FunctionTypeCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FunctionTypeComboItemStateChanged(evt);
            }
        });
        FunctionTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FunctionTypeComboActionPerformed(evt);
            }
        });

        aValueLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        aValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aValueLabel.setText("a Value:");

        FunctionTypeLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        FunctionTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FunctionTypeLabel.setText("Function Type:");

        EnterInformationLabel.setBackground(new java.awt.Color(255, 255, 255));
        EnterInformationLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EnterInformationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnterInformationLabel.setText("Enter Information:");
        EnterInformationLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EnterInformationLabel.setOpaque(true);

        bValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bValueLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        bValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bValueLabel.setText("b Value:");

        cValueLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cValueLabel.setText("c Value:");

        cValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        GeneralFormLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        GeneralFormLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GeneralFormLabel.setText("y = ax^2 + bx +c");

        YourAnswerLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        YourAnswerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        YourAnswerLabel.setText("Your Solution/s:");
        YourAnswerLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        YourAnswerLabel.setMaximumSize(new java.awt.Dimension(75, 15));
        YourAnswerLabel.setMinimumSize(new java.awt.Dimension(75, 15));
        YourAnswerLabel.setPreferredSize(new java.awt.Dimension(75, 15));

        xValueOne.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        xValueTwo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ClearButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        SubmitButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SubmitButton.setText("Submit");
        SubmitButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EnterInformationPanelLayout = new javax.swing.GroupLayout(EnterInformationPanel);
        EnterInformationPanel.setLayout(EnterInformationPanelLayout);
        EnterInformationPanelLayout.setHorizontalGroup(
            EnterInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnterInformationPanelLayout.createSequentialGroup()
                .addGroup(EnterInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EnterInformationPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(EnterInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FunctionTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(EnterInformationPanelLayout.createSequentialGroup()
                                .addComponent(FunctionTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(YourAnswerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(EnterInformationPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(EnterInformationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EnterInformationPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(EnterInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GeneralFormLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(EnterInformationPanelLayout.createSequentialGroup()
                                .addGroup(EnterInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(EnterInformationPanelLayout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(cValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(EnterInformationPanelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(EnterInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(bValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(aValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(EnterInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aValue, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cValue, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bValue, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(30, 30, 30)
                        .addGroup(EnterInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(xValueOne)
                            .addComponent(xValueTwo)
                            .addComponent(ClearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        EnterInformationPanelLayout.setVerticalGroup(
            EnterInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnterInformationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EnterInformationLabel)
                .addGap(10, 10, 10)
                .addComponent(FunctionTypeLabel)
                .addGroup(EnterInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EnterInformationPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(FunctionTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GeneralFormLabel))
                    .addGroup(EnterInformationPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(YourAnswerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(xValueOne, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EnterInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aValueLabel)
                    .addComponent(aValue, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xValueTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EnterInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EnterInformationPanelLayout.createSequentialGroup()
                        .addGroup(EnterInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bValueLabel)
                            .addComponent(bValue, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(EnterInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cValueLabel)
                            .addComponent(cValue, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(EnterInformationPanelLayout.createSequentialGroup()
                        .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        TheAnswersPanel.setBackground(new java.awt.Color(255, 153, 153));
        TheAnswersPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TheAnswersPanel.setName("TheAnswersPanel"); // NOI18N

        jScrollPane2.setViewportView(BookInfoText);

        BookList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BookList.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BookList.setModel(patientListModel);
        BookList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                BookListValueChanged(evt);
            }
        });
        BookListScrollPane.setViewportView(BookList);

        TheAnswersLabel.setBackground(new java.awt.Color(255, 255, 255));
        TheAnswersLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TheAnswersLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TheAnswersLabel.setText("The Answers:");
        TheAnswersLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TheAnswersLabel.setMaximumSize(new java.awt.Dimension(158, 19));
        TheAnswersLabel.setMinimumSize(new java.awt.Dimension(158, 19));
        TheAnswersLabel.setOpaque(true);
        TheAnswersLabel.setPreferredSize(new java.awt.Dimension(158, 19));

        BookNameLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BookNameLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BookNameLabel1.setText("Calculations:");
        BookNameLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BookNameLabel1.setMaximumSize(new java.awt.Dimension(75, 15));
        BookNameLabel1.setMinimumSize(new java.awt.Dimension(75, 15));
        BookNameLabel1.setPreferredSize(new java.awt.Dimension(75, 15));

        BookNameLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BookNameLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BookNameLabel2.setText("Quick Info:");
        BookNameLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BookNameLabel2.setMaximumSize(new java.awt.Dimension(75, 15));
        BookNameLabel2.setMinimumSize(new java.awt.Dimension(75, 15));
        BookNameLabel2.setPreferredSize(new java.awt.Dimension(75, 15));

        jTextFieldHelpDelete.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextFieldHelpDelete.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldHelpDelete.setToolTipText("");
        jTextFieldHelpDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout TheAnswersPanelLayout = new javax.swing.GroupLayout(TheAnswersPanel);
        TheAnswersPanel.setLayout(TheAnswersPanelLayout);
        TheAnswersPanelLayout.setHorizontalGroup(
            TheAnswersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TheAnswersPanelLayout.createSequentialGroup()
                .addGroup(TheAnswersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TheAnswersPanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(BookNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TheAnswersPanelLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(BookNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TheAnswersPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TheAnswersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TheAnswersPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(BookListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(325, 325, 325)
                        .addComponent(jTextFieldHelpDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TheAnswersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TheAnswersLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(299, 299, 299))
        );
        TheAnswersPanelLayout.setVerticalGroup(
            TheAnswersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TheAnswersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TheAnswersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(BookNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TheAnswersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TheAnswersPanelLayout.createSequentialGroup()
                        .addComponent(jTextFieldHelpDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(TheAnswersPanelLayout.createSequentialGroup()
                        .addComponent(BookListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BookNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        TheAnswersLabel.getAccessibleContext().setAccessibleName("EnterDesiredBookLabel");

        GraphingCalcLabel.setBackground(new java.awt.Color(255, 255, 153));
        GraphingCalcLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        GraphingCalcLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GraphingCalcLabel.setText("ERIKA'S GRAPHING CALCULATOR");
        GraphingCalcLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GraphingCalcLabel.setOpaque(true);

        StorageJPanel.setBackground(new java.awt.Color(231, 230, 230));
        StorageJPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        YourNameText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        YourNameText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        YourNameText.setMinimumSize(new java.awt.Dimension(75, 20));
        YourNameText.setPreferredSize(new java.awt.Dimension(75, 20));

        StoreYourAnswersLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        StoreYourAnswersLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StoreYourAnswersLabel.setText("Store Your Answers?");

        EnterYourNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        EnterYourNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnterYourNameLabel.setText("Enter Your Name:");
        EnterYourNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EnterYourNameLabel.setMaximumSize(new java.awt.Dimension(75, 15));
        EnterYourNameLabel.setMinimumSize(new java.awt.Dimension(75, 15));
        EnterYourNameLabel.setPreferredSize(new java.awt.Dimension(75, 15));

        SubmitandStoreCheckBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SubmitandStoreCheckBox.setText("Submit and Store");
        SubmitandStoreCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitandStoreCheckBoxActionPerformed(evt);
            }
        });

        EnterInformationLabel1.setBackground(new java.awt.Color(255, 255, 255));
        EnterInformationLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EnterInformationLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnterInformationLabel1.setText("Storage:");
        EnterInformationLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EnterInformationLabel1.setOpaque(true);

        javax.swing.GroupLayout StorageJPanelLayout = new javax.swing.GroupLayout(StorageJPanel);
        StorageJPanel.setLayout(StorageJPanelLayout);
        StorageJPanelLayout.setHorizontalGroup(
            StorageJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StorageJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StorageJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EnterInformationLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(StorageJPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(StorageJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StoreYourAnswersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(StorageJPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(SubmitandStoreCheckBox)))
                        .addGap(29, 29, 29)
                        .addGroup(StorageJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(YourNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(EnterYourNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        StorageJPanelLayout.setVerticalGroup(
            StorageJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StorageJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EnterInformationLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(StorageJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterYourNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StoreYourAnswersLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StorageJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitandStoreCheckBox)
                    .addComponent(YourNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        GraphingJPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GraphingJPanel.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                GraphingJPanelComponentAdded(evt);
            }
        });

        javax.swing.GroupLayout GraphingJPanelLayout = new javax.swing.GroupLayout(GraphingJPanel);
        GraphingJPanel.setLayout(GraphingJPanelLayout);
        GraphingJPanelLayout.setHorizontalGroup(
            GraphingJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
        );
        GraphingJPanelLayout.setVerticalGroup(
            GraphingJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GraphingCalcLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EnterInformationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(StorageJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TheAnswersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GraphingJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GraphingCalcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TheAnswersPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StorageJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnterInformationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(GraphingJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Function Information");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BookListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_BookListValueChanged
        try {
            getSetInputs();
        } //End try
        catch (FileNotFoundException ex) {
            Logger.getLogger(FunctionGUI.class.getName()).log(Level.SEVERE, null, ex);
        } //End catch 
        catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FunctionGUI.class.getName()).log(Level.SEVERE, null, ex);
        } //End catch
    }//GEN-LAST:event_BookListValueChanged

    private void FunctionTypeComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FunctionTypeComboItemStateChanged
        if(FunctionTypeCombo.getSelectedItem().toString().equals("Linear")){
            aValue.setEnabled(false);
            xValueTwo.setEnabled(false);
            bValue.setEnabled(true);
            cValue.setEnabled(true);
        } //End if Linear selected
        else if(FunctionTypeCombo.getSelectedItem().toString().equals("Quadratic")){
            xValueTwo.setEnabled(true);
            aValue.setEnabled(true);
            bValue.setEnabled(true);
            cValue.setEnabled(true);
        } //End if Quadratic selected
        else {
        //System.out.println("type was not selected");
        } //End else
    }//GEN-LAST:event_FunctionTypeComboItemStateChanged

    private void FunctionTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FunctionTypeComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FunctionTypeComboActionPerformed

    private void SubmitandStoreCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitandStoreCheckBoxActionPerformed
        if (SubmitandStoreCheckBox.isSelected()) {
            YourNameText.setText("");
            YourNameText.setEnabled(true);
            xValueOne.setEnabled(true);
            xValueTwo.setEnabled(true);
        } //End if 
        else {
            YourNameText.setText("");
             YourNameText.setEnabled(false);
            xValueOne.setEnabled(false);
            xValueTwo.setEnabled(false);
        } //End else
    }//GEN-LAST:event_SubmitandStoreCheckBoxActionPerformed

    private void GraphingJPanelComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_GraphingJPanelComponentAdded

    }//GEN-LAST:event_GraphingJPanelComponentAdded

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        reSetInputs();
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        String Name = YourNameText.getText();
        int aa = getaValue();
        int bb = getbValue();
        int cc = getcValue();
        int x1 = getxValueOne();
        int x2 = getxValueTwo();
        
        c.submitButtonClickedInView(Name, aa, bb, cc, x1, x2);
        reSetInputs();
    }//GEN-LAST:event_SubmitButtonActionPerformed

//METHODS I CREATED    
    
/******************************************************
Purpose: Add functions to list model
In: None
Out: None
/******************************************************/      
protected void loadBookListModel(ArrayList<Function> list){
    for(Function p: list){
        BookListModel.addElement(p);        
    } //End for loop
} //End load BookListModel
    
/******************************************************
Purpose: Get the inputs the selected function has
In: None
Out: None
/******************************************************/  
private void getSetInputs() throws FileNotFoundException, UnsupportedEncodingException{
    int n = BookList.getSelectedIndex();
    tokens = c.getFunction(n).split(":|\\\n");
    YourNameText.setText(tokens[1]);
        
    try {
    BookInfoText.setText(c.getFunction(n));
    } //End try
    catch (FileNotFoundException ex) {
        Logger.getLogger(FunctionGUI.class.getName()).log(Level.SEVERE, null, ex);
    } //End catch
    catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FunctionGUI.class.getName()).log(Level.SEVERE, null, ex);
    } //End catch
} //End getSetInputs
        
/******************************************************
Purpose: Reset inputs
In: None
Out: None
/******************************************************/       
private void reSetInputs(){
    YourNameText.setText(YourNameText.getText());
    aValue.setEnabled(true);
    aValue.setValue(0);
    bValue.setValue(0);
    cValue.setValue(0);
    xValueOne.setEnabled(true);
    xValueTwo.setEnabled(true);
    xValueOne.setValue(0);
    xValueTwo.setValue(0);
    xValueTwo.setEnabled(false);
    FunctionTypeCombo.setSelectedIndex(0);
} //End reSetInputs
    
/******************************************************
Purpose: GraphApp: creating the grid and its dimensions
In: Graphics g
Out: None
/******************************************************/ 
public void GraphApp(Graphics g) {
    g.drawLine(300, 0, 300, 600);
    g.drawLine(0, 300, 600, 300);
    g.setColor(Color.blue);
} //End GraphApp()
	
//GETTERS

/******************************************************
Purpose: Get entered a value
In: None
Out: a value (integer)
/******************************************************/         
public int getaValue(){
    return Integer.parseInt(aValue.getValue().toString());
} //End getaValue()
    
/******************************************************
Purpose: Get entered b value
In: None
Out: b value (integer)
/******************************************************/ 
private int getbValue(){
    return Integer.parseInt(bValue.getValue().toString());
} //End getbValue()
   
/******************************************************
Purpose: Get entered c value
In: None
Out: c value (integer)
/******************************************************/ 
private int getcValue(){
    return Integer.parseInt(cValue.getValue().toString());
} //End getcValue()
    
/******************************************************
Purpose: Get entered first solution
In: None
Out: first solution (integer)
/******************************************************/ 
private int getxValueOne(){
    return Integer.parseInt(xValueOne.getValue().toString());
} //End getxValueOne()
    
/******************************************************
Purpose: Get entered second solution
In: None
Out: second solution (integer)
/******************************************************/ 
private int getxValueTwo(){
    return Integer.parseInt(xValueTwo.getValue().toString());
} //End getxValueTwo()
	
//SETTERS
	
/******************************************************
Purpose: Add a controller object to this ui
In: Controller object c
Out: None
/******************************************************/    
protected void addController(Controller c){
    this.c = c;
} //End addController	

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea BookInfoText;
    private javax.swing.JList<String> BookList;
    private javax.swing.JScrollPane BookListScrollPane;
    private javax.swing.JLabel BookNameLabel1;
    private javax.swing.JLabel BookNameLabel2;
    private javax.swing.JButton ClearButton;
    private javax.swing.JLabel EnterInformationLabel;
    private javax.swing.JLabel EnterInformationLabel1;
    private javax.swing.JPanel EnterInformationPanel;
    private javax.swing.JLabel EnterYourNameLabel;
    private javax.swing.JComboBox<String> FunctionTypeCombo;
    private javax.swing.JLabel FunctionTypeLabel;
    private javax.swing.JLabel GeneralFormLabel;
    private javax.swing.JLabel GraphingCalcLabel;
    private javax.swing.JPanel GraphingJPanel;
    private javax.swing.JPanel StorageJPanel;
    private javax.swing.JLabel StoreYourAnswersLabel;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JCheckBox SubmitandStoreCheckBox;
    private javax.swing.JLabel TheAnswersLabel;
    private javax.swing.JPanel TheAnswersPanel;
    private javax.swing.JLabel YourAnswerLabel;
    private javax.swing.JTextField YourNameText;
    private javax.swing.JSpinner aValue;
    private javax.swing.JLabel aValueLabel;
    private javax.swing.JSpinner bValue;
    private javax.swing.JLabel bValueLabel;
    private javax.swing.JSpinner cValue;
    private javax.swing.JLabel cValueLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldHelpDelete;
    private javax.swing.JSpinner xValueOne;
    private javax.swing.JSpinner xValueTwo;
    // End of variables declaration//GEN-END:variables

} //End class
