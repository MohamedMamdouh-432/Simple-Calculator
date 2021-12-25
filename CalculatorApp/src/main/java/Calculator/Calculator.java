package Calculator ;
import javax.swing.* ;

@SuppressWarnings("serial")
public class Calculator extends JFrame
{
    String input = "" ;
    public Calculator() 
    {
        initComponents();
        TextInput.setText("0") ;
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton20 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextInput = new javax.swing.JTextField();
        twoButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        dotButton = new javax.swing.JButton();
        PIButton = new javax.swing.JButton();
        subtractButton = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        reminderButton = new javax.swing.JButton();
        equalButton = new javax.swing.JButton();
        leftRoundCurseButton = new javax.swing.JButton();
        rigthRoundCurseButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        undoButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        reciprocalButton = new javax.swing.JButton();
        squareButton = new javax.swing.JButton();
        cubeButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jButton20.setText("<");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Calclator App");
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("CalculatoFrame"); // NOI18N

        twoButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        twoButton.setText("2");
        twoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoButtonActionPerformed(evt);
            }
        });

        oneButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        oneButton.setText("1");
        oneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneButtonActionPerformed(evt);
            }
        });

        threeButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        threeButton.setText("3");
        threeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeButtonActionPerformed(evt);
            }
        });

        fourButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        fourButton.setText("4");
        fourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourButtonActionPerformed(evt);
            }
        });

        fiveButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        fiveButton.setText("5");
        fiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveButtonActionPerformed(evt);
            }
        });

        sixButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        sixButton.setText("6");
        sixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixButtonActionPerformed(evt);
            }
        });

        sevenButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        sevenButton.setText("7");
        sevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenButtonActionPerformed(evt);
            }
        });

        eightButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        eightButton.setText("8");
        eightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightButtonActionPerformed(evt);
            }
        });

        nineButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        nineButton.setText("9");
        nineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineButtonActionPerformed(evt);
            }
        });

        zeroButton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        zeroButton.setText("0");
        zeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroButtonActionPerformed(evt);
            }
        });

        dotButton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        dotButton.setText(".");
        dotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotButtonActionPerformed(evt);
            }
        });

        PIButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        PIButton.setText("PI");
        PIButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PIButtonActionPerformed(evt);
            }
        });

        subtractButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        subtractButton.setText("-");
        subtractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractButtonActionPerformed(evt);
            }
        });

        plusButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        plusButton.setText("+");
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });

        multiplyButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        multiplyButton.setText("x");
        multiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyButtonActionPerformed(evt);
            }
        });

        divideButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        divideButton.setText("/");
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });

        reminderButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        reminderButton.setText("%");
        reminderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reminderButtonActionPerformed(evt);
            }
        });

        equalButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        equalButton.setText("=");
        equalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalButtonActionPerformed(evt);
            }
        });

        leftRoundCurseButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        leftRoundCurseButton.setText("(");
        leftRoundCurseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftRoundCurseButtonActionPerformed(evt);
            }
        });

        rigthRoundCurseButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rigthRoundCurseButton.setText(")");
        rigthRoundCurseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rigthRoundCurseButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        clearButton.setText("cls");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        undoButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        undoButton.setText("<");
        undoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Standard Calculator");

        reciprocalButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        reciprocalButton.setText("1/x");
        reciprocalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reciprocalButtonActionPerformed(evt);
            }
        });

        squareButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        squareButton.setText("x^2");
        squareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareButtonActionPerformed(evt);
            }
        });

        cubeButton.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        cubeButton.setText("x^3");
        cubeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cubeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextInput, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(subtractButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(fourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(reciprocalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(squareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cubeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PIButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(multiplyButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(divideButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reminderButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(equalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(leftRoundCurseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rigthRoundCurseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(undoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextInput, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reciprocalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reminderButton)
                            .addComponent(clearButton)
                            .addComponent(squareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cubeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(divideButton)
                            .addComponent(undoButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multiplyButton)
                            .addComponent(rigthRoundCurseButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subtractButton)
                            .addComponent(leftRoundCurseButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PIButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plusButton)
                            .addComponent(equalButton)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotButtonActionPerformed
        input = TextInput.getText() ;
        if(input.equals("0") || input.equals("")) {} 
        else
        {
            input += "." ;
            TextInput.setText(input) ;
        }
    }//GEN-LAST:event_dotButtonActionPerformed

    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroButtonActionPerformed
        input = TextInput.getText() ;
        if(input.equals("0")) {} 
        else
        {
            input += "0" ;
            TextInput.setText(input) ;
        }
    }//GEN-LAST:event_zeroButtonActionPerformed

    private void PIButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PIButtonActionPerformed
        input = TextInput.getText() ;
        if(input.equals("0")) 
        {
            input = "3.14" ;
            TextInput.setText(input) ;
        }
        else
        {
            input += "3.14" ;
            TextInput.setText(input) ;
        }
    }//GEN-LAST:event_PIButtonActionPerformed

    private void oneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneButtonActionPerformed
        input = TextInput.getText() ;
        if(input.equals("0")) 
        {
            input = "1" ;
            TextInput.setText(input) ;
        }
        else
        {
            input += "1" ;
            TextInput.setText(input) ;
        }
    }//GEN-LAST:event_oneButtonActionPerformed

    private void twoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoButtonActionPerformed
        input = TextInput.getText() ;
        if(input.equals("0")) 
        {
            input = "2" ;
            TextInput.setText(input) ;
        }
        else
        {
            input += "2" ;
            TextInput.setText(input) ;
        }
    }//GEN-LAST:event_twoButtonActionPerformed

    private void threeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeButtonActionPerformed
        input = TextInput.getText() ;
        if(input.equals("0")) 
        {
            input = "3" ;
            TextInput.setText(input) ;
        }
        else
        {
            input += "3" ;
            TextInput.setText(input) ;
        }
    }//GEN-LAST:event_threeButtonActionPerformed

    private void fourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourButtonActionPerformed
        input = TextInput.getText() ;
        if(input.equals("0")) 
        {
            input = "4" ;
            TextInput.setText(input) ;
        }
        else
        {
            input += "4" ;
            TextInput.setText(input) ;
        }
    }//GEN-LAST:event_fourButtonActionPerformed

    private void fiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveButtonActionPerformed
        input = TextInput.getText() ;
        if(input.equals("0")) 
        {
            input = "5" ;
            TextInput.setText(input) ;
        }
        else
        {
            input += "5" ;
            TextInput.setText(input) ;
        }
    }//GEN-LAST:event_fiveButtonActionPerformed

    private void sixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixButtonActionPerformed
        input = TextInput.getText() ;
        if(input.equals("0")) 
        {
            input = "6" ;
            TextInput.setText(input) ;
        }
        else
        {
            input += "6" ;
            TextInput.setText(input) ;
        }
    }//GEN-LAST:event_sixButtonActionPerformed

    private void sevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenButtonActionPerformed
        input = TextInput.getText() ;
        if(input.equals("0")) 
        {
            input = "7" ;
            TextInput.setText(input) ;
        }
        else
        {
            input += "7" ;
            TextInput.setText(input) ;
        }
    }//GEN-LAST:event_sevenButtonActionPerformed

    private void eightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightButtonActionPerformed
        input = TextInput.getText() ;
        if(input.equals("0")) 
        {
            input = "8" ;
            TextInput.setText(input) ;
        }
        else
        {
            input += "8" ;
            TextInput.setText(input) ;
        }
    }//GEN-LAST:event_eightButtonActionPerformed

    private void nineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineButtonActionPerformed
        input = TextInput.getText() ;
        if(input.equals("0")) 
        {
            input = "9" ;
            TextInput.setText(input) ;
        }
        else
        {
            input += "9" ;
            TextInput.setText(input) ;
        }
    }//GEN-LAST:event_nineButtonActionPerformed

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
        input = TextInput.getText() ;
        if(input.equals("0")) {}
        else
        {
            input += "+" ;
            TextInput.setText(input) ;
        }
    }//GEN-LAST:event_plusButtonActionPerformed

    private void subtractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractButtonActionPerformed
        input = TextInput.getText() ;
        if(input.equals("0")) {}
        else
        {
            input += "-" ;
            TextInput.setText(input) ;
        }
    }//GEN-LAST:event_subtractButtonActionPerformed

    private void multiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyButtonActionPerformed
        input = TextInput.getText() ;
        if(input.equals("0")) {}
        else
        {
            input += "x" ;
            TextInput.setText(input) ;
        }
    }//GEN-LAST:event_multiplyButtonActionPerformed

    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideButtonActionPerformed
        input = TextInput.getText() ;
        if(input.equals("0")) {}
        else
        {
            input += "/" ;
            TextInput.setText(input) ;
        }
    }//GEN-LAST:event_divideButtonActionPerformed

    private void reminderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reminderButtonActionPerformed
        input = TextInput.getText() ;
        if(input.equals("0")) {}
        else
        {
            input += "%" ;
            TextInput.setText(input) ;
        }
    }//GEN-LAST:event_reminderButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        input = "" ;
        TextInput.setText("0") ;
    }//GEN-LAST:event_clearButtonActionPerformed

    private void undoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoButtonActionPerformed
        if(input.length() == 1)
        {
            input = "" ;
            TextInput.setText("0") ;
        }
        else
        {
            input = input.substring(0, input.length()-1) ;
            TextInput.setText(input) ;
        }
    }//GEN-LAST:event_undoButtonActionPerformed

    private void rigthRoundCurseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rigthRoundCurseButtonActionPerformed
        input += ")" ;
        TextInput.setText(input) ;
    }//GEN-LAST:event_rigthRoundCurseButtonActionPerformed

    private void leftRoundCurseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftRoundCurseButtonActionPerformed
        input += "(" ;
        TextInput.setText(input) ;
    }//GEN-LAST:event_leftRoundCurseButtonActionPerformed

    private void equalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalButtonActionPerformed
        input = TextInput.getText() ;
        int result = MathEvaluator.evaluate(input) ;
        TextInput.removeAll() ;
        TextInput.setText(result+"") ;
    }//GEN-LAST:event_equalButtonActionPerformed

    private void reciprocalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reciprocalButtonActionPerformed
        input = TextInput.getText() ;
        int x = Integer.parseInt(String.valueOf(input.charAt(input.length()-1))) ;
        input = input.substring(0, input.length()-1) ;
        input += (float)1/x ;
        TextInput.setText(input) ;
    }//GEN-LAST:event_reciprocalButtonActionPerformed

    private void squareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareButtonActionPerformed
        input = TextInput.getText() ;
        int x = Integer.parseInt(String.valueOf(input.charAt(input.length()-1))) ;
        input = input.substring(0, input.length()-1) ;
        input += x*x ;
        TextInput.setText(input) ;
    }//GEN-LAST:event_squareButtonActionPerformed

    private void cubeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cubeButtonActionPerformed
        input = TextInput.getText() ;
        int x = Integer.parseInt(String.valueOf(input.charAt(input.length()-1))) ;
        input = input.substring(0, input.length()-1) ;
        input += x*x*x ;
        TextInput.setText(input) ;
    }//GEN-LAST:event_cubeButtonActionPerformed

    public static void main(String args[]) 
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PIButton;
    private javax.swing.JTextField TextInput;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton cubeButton;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton dotButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton equalButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JButton jButton20;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton leftRoundCurseButton;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JButton reciprocalButton;
    private javax.swing.JButton reminderButton;
    private javax.swing.JButton rigthRoundCurseButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton squareButton;
    private javax.swing.JButton subtractButton;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton undoButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables
}
