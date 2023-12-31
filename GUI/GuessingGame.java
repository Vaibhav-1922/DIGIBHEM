/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package GUI;

import Classes.GuessNumbers;
import Classes.Gui;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class GuessingGame extends javax.swing.JFrame {

    /** Creates new form GuessingGame */
   
    public GuessingGame() {
        initComponents();
        init();
        
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _reset = new javax.swing.JLabel();
        _score = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        _bestscore = new javax.swing.JLabel();
        _guess = new javax.swing.JLabel();
        _life = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        f_guess = new javax.swing.JTextField();
        _show = new javax.swing.JLabel();
        _unshow = new javax.swing.JLabel();
        _showrandom = new javax.swing.JLabel();
        btn_guess = new javax.swing.JButton();
        btn_newrandom = new javax.swing.JButton();
        _remarks = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GUESSING GAME");
        setResizable(false);

        _reset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/icons8-reset-24.png"))); // NOI18N
        _reset.setToolTipText("Reset");
        _reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _resetMouseClicked(evt);
            }
        });

        _score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _score.setText("Score: 0");
        _score.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("---Guessing Game---");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/icons8-search-160.png"))); // NOI18N

        _bestscore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _bestscore.setText("Best Score: 0");
        _bestscore.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        _guess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _guess.setText("Guesses: 0");
        _guess.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        _life.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _life.setText("Life: 10");
        _life.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Enter your number (1-100)");

        f_guess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_guessActionPerformed(evt);
            }
        });
        f_guess.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                f_guessKeyTyped(evt);
            }
        });

        _show.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        _show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/icons8-eye-24.png"))); // NOI18N
        _show.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        _show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _showMouseClicked(evt);
            }
        });

        _unshow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        _unshow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _unshow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/icons8-hide-24.png"))); // NOI18N
        _unshow.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        _unshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _unshowMouseClicked(evt);
            }
        });

        _showrandom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        _showrandom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _showrandom.setText("?");
        _showrandom.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_guess.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btn_guess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/icons8-check-30.png"))); // NOI18N
        btn_guess.setText("Guess");
        btn_guess.setToolTipText("Your Guess");
        btn_guess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guessActionPerformed(evt);
            }
        });

        btn_newrandom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/icons8-shuffle-24.png"))); // NOI18N
        btn_newrandom.setText("New Random Number");
        btn_newrandom.setToolTipText("Random Number ");
        btn_newrandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newrandomActionPerformed(evt);
            }
        });

        _remarks.setBackground(new java.awt.Color(255, 51, 51));
        _remarks.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        _remarks.setForeground(new java.awt.Color(255, 255, 255));
        _remarks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _remarks.setText("****************Try your luck :) ****************");
        _remarks.setToolTipText("");
        _remarks.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(_reset)
                                .addGap(18, 18, 18)
                                .addComponent(_bestscore, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(_score, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(_guess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(_life, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(f_guess, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(_showrandom, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btn_newrandom, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 8, Short.MAX_VALUE)
                                                .addComponent(_show, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(_unshow, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btn_guess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                    .addComponent(_remarks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(_bestscore, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_score, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_guess, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_life, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_show, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_unshow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(f_guess, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(_showrandom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_newrandom)
                            .addComponent(btn_guess)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_remarks, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void f_guessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_guessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f_guessActionPerformed

    private void btn_guessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guessActionPerformed
          guess();
    }//GEN-LAST:event_btn_guessActionPerformed

    private void btn_newrandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newrandomActionPerformed
       randomNew();  
    }//GEN-LAST:event_btn_newrandomActionPerformed

    private void _showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__showMouseClicked
        _show.setEnabled(false);
        _unshow.setEnabled(true);
        _showrandom.setText(String.valueOf(random));
    }//GEN-LAST:event__showMouseClicked

    private void _unshowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__unshowMouseClicked
        _show.setEnabled(true);
        _unshow.setEnabled(false);
        _showrandom.setText("?");
    }//GEN-LAST:event__unshowMouseClicked

    private void f_guessKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_f_guessKeyTyped
       Gui._integerOnly(evt);
    }//GEN-LAST:event_f_guessKeyTyped

    private void _resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__resetMouseClicked
        Object[] options = {"YES", "NO"};
        int x = JOptionPane.showOptionDialog(this, "Are you sure you want to reset (Yes/No)?","MESSAGE",
       JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, null,options ,null);
        
        if(x == JOptionPane.YES_OPTION){
            reset();
        }
    }//GEN-LAST:event__resetMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuessingGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel _bestscore;
    private javax.swing.JLabel _guess;
    private javax.swing.JLabel _life;
    private javax.swing.JLabel _remarks;
    private javax.swing.JLabel _reset;
    private javax.swing.JLabel _score;
    private javax.swing.JLabel _show;
    private javax.swing.JLabel _showrandom;
    private javax.swing.JLabel _unshow;
    private javax.swing.JButton btn_guess;
    private javax.swing.JButton btn_newrandom;
    private javax.swing.JTextField f_guess;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    //Initialsize component
    
    Gui gui;
    //variable
    private int random = 0 ,bestscore = 0, yourScore = 0, addCorrectScore = 3;
    private byte guessCount = 0, lifeCount = 10, greaterThanError = 0, lessThanError = 0;
    
    
    private void init(){
        gui=new Gui();
        //center
        Gui._centerFrame(this);
        //icon
        gui.setIconFrame(this);
        //load random number
        random = GuessNumbers._randomNumber();
        //hide
        _unshow.setEnabled(false);
       //get best score
       bestscore= Gui.getCurrentBestScore();
       _bestscore.setText("Best Score: "+bestscore);
        
    }//end
    
    //create new random    
    private void randomNew(){   
            random = GuessNumbers._randomNumber();
            //clear field
            f_guess.setText("");
            f_guess.requestFocus();
            //
            _unshow.setEnabled(false);
            _show.setEnabled(true);
            _showrandom.setText("?");
}
    
    private void guess(){
            
//        validate user input
        
        if(f_guess.getText().equals("")){
        Gui._message("Please enter your number",0);
        f_guess.requestFocus();
        }else if(Integer.parseInt(f_guess.getText()) >= 101 || Integer.parseInt(f_guess.getText())<1){
              Gui._message("Please enter number from 1-100!",0);
              f_guess.setText("");//clear
              f_guess.requestFocus();
        }else{
            int yourNumber = Integer.parseInt(f_guess.getText());
            
            if( yourNumber == random){
                Gui._message("YOU WON\nadditional 3 life was added!",1);
                yourScore++; //increment correct number
                _score.setText("Score: "+yourScore);
                //add life
                lifeCount+=addCorrectScore;
                _life.setText("Life: "+lifeCount);
                //
                updateBestScore();
                //encourage user to play again
                  Object[] options = {"YES I WANT NOW", "NO, I'M TIRED"};
                  int x = JOptionPane.showOptionDialog(this, "Want to play again  (Yes/No)?","MESSAGE",
         JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, null,options ,null);
        
                 if(x == JOptionPane.YES_OPTION){
                     newGame();
                 reset();
                 }else{
                 System.exit(0);
                }
                
                
            }
            else{
                lifeCount--;//Count the error
                _life.setText("Life: "+lifeCount);
                //creating warning icon is less than 5.
                if(lifeCount<=4){
                    _life.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Asset/warning.png"))));
                    
                }else{
                     _life.setIcon(null);
                    
                }
                //creating hint
                hint(random, yourNumber);
                
                
                //check if lifecount reached to 0.
                if(lifeCount==0){
                    Gui._message("You've used all your life!,\n Please try again later",0);
                    Object[] options = {"YES I WANT NOW", "NO, I'M TIRED"};
                  int x = JOptionPane.showOptionDialog(this, "Want to play again  (Yes/No)?","MESSAGE",
                 JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, null,options ,null);
        
                 if(x == JOptionPane.YES_OPTION){
                     newGame();
                 reset();
                 }else{
                 System.exit(0);
                 }
              }
          }
            //count the guess
            guessCount++;//increment guess
            _guess.setText("Guesses: "+guessCount);
        }
        
   
    }//end
    private void hint(int _randomNum, int yourNumber ){//start function
        String mes;
        if(_randomNum > yourNumber){
            
       //count
         lessThanError++;
          mes= messageHint(lessThanError,(byte)1,yourNumber);
         _remarks.setText(mes);
       
        }else{
            
          greaterThanError++;
           mes= messageHint(greaterThanError,(byte)0 ,yourNumber);
         _remarks.setText(mes);
          
        }
       
    }//end function
    private String messageHint(byte errorCount , byte errorCatcher, int numGuess){//start
         String message;
         switch(errorCatcher){
             //for less than hint
             case 1:
                      String messageCat[]={String.valueOf(numGuess)+ " is less than the number! please be observant!",
                      String.valueOf(numGuess)+ " is less than the number! don't you know how to compute?!",
                      String.valueOf(numGuess)+ " is less than the number! Ohh! Come ON!",
                      String.valueOf(numGuess)+ " is less than the number! I'm tired of reminding!"};//0-3
                      
                      
                      /* User onlu allows 2 errors to have the default message
                         otherwise , the next message will be dynamic.
                      */
                      if(errorCount < 2){
                         message = String.valueOf(numGuess)+" is less than the random number!";
                          
                      }else{
                          //make it dynamic
                          int randomMes = (int) Math.round(Math.random() * 3 );
                          message = messageCat[randomMes];
                          
                      }
                  break;
               //for greater than hint
             default:
                  //Just change less to Greater
                  String messageCat1[]={String.valueOf(numGuess)+ " is Greater than the number! please be observant!",
                      String.valueOf(numGuess) + " is Greater than the number! don't you know how to compute?!",
                      String.valueOf(numGuess) + " is Greater than the number! Ohh! Come ON!",
                      String.valueOf(numGuess) + " is Greater than the number! I'm tired of reminding!"};//0-3
                      
                      
                      /* User onlu allows 2 errors to have the default message
                         otherwise , the next message will be dynamic.
                      */
                      if(errorCount < 3){
                         message = String.valueOf(numGuess)+" is Greater than the random number!";
                          
                      }else{
                          //make it dynamic
                          int randomMes = (int) Math.round(Math.random() * 3 );
                          message = messageCat1[randomMes];
                       }
                      break;
               }
         
         return message;
         
    }//end
    
    //update the best score
    private void updateBestScore(){
        if(yourScore > bestscore){
            Gui._message("Congratulations! New Best Score!  ",1);
            Gui.setNewBestScore("bestScore["+yourScore+"]");
            bestscore = yourScore;
            _bestscore.setText("Best Score: "+bestscore);
        
        }
    }
    
    private void newGame(){
        
        f_guess.setText("");
        f_guess.requestFocus();
        //
        _remarks.setText("****************Try your luck :) ****************");
        _unshow.setEnabled(false);
        _show.setEnabled(true);
        _showrandom.setText("?");
        _guess.setText("Guesses: 0");
        guessCount = 0;
        //
        _life.setText("Life: 10");
        _life.setIcon(null);
        lifeCount = 10;
        //
        greaterThanError = 0;
        lessThanError = 0;
        //
        random = GuessNumbers._randomNumber();
        
    }
    
    private void reset(){
        
        f_guess.setText("");
        f_guess.requestFocus();
        //
        _remarks.setText("****************Try your luck :) ****************");
        _unshow.setEnabled(false);
        _show.setEnabled(true);
        _showrandom.setText("?");
        _guess.setText("Guesses: 0");
        guessCount = 0;
        //
        _life.setText("Life: 10");
         _life.setIcon(null);
        lifeCount = 10;
        //
        greaterThanError = 0;
        lessThanError = 0;
        //
        random = GuessNumbers._randomNumber();
        _score.setText("Score: 0");
        yourScore = 0;
        //include best score to reset
        bestscore = 0;
        Gui.setNewBestScore("bestScore["+bestscore+"]");
        _bestscore.setText("Best Score: 0");
        
        
    } 
}//end class
