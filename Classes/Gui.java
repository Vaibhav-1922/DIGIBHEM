/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;

import java.lang.System.Logger.Level;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Gui {//start

    /*Center Jframe*/
    public static void _centerFrame(JFrame frame) {//Start
        Rectangle rec = frame.getBounds();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((dim.width - rec.width) / 2, (dim.height - rec.height) / 2);

    }//END

    //Asign icon to frame
    public void setIconFrame(JFrame frame) {//Start
            
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Asset/logo.png")));
       
    }//end
    
    //allowing integer only when user enter his/her guessed number
    public static void _integerOnly(KeyEvent evt){//start
        
        char _character=evt.getKeyChar();
        if(Character.isDigit(_character)
            || _character == KeyEvent.VK_SPACE
            ||_character == KeyEvent.VK_DELETE
           || _character == KeyEvent.VK_SLASH){
    }else{
             evt.consume();
            //creating beep notification sound
            Toolkit.getDefaultToolkit().beep();   
        }
   }//end
    
    //Creating prompt message
    public static void _message(String message, int errorTye){//start
        
        switch(errorTye){
           
            case 0:
                JOptionPane.showMessageDialog(null, message , "ERROR",JOptionPane.ERROR_MESSAGE);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, message , "SUCCESS",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, message , "WARNING",JOptionPane.WARNING_MESSAGE);
                break;
            default:
                
                break;
        }
     
    }//end
    
//    create and update best score
    //dir
    private static String patFileBestScore = System.getProperty("user.dir")+"/src/GUI/bestscore.ini";
//    get the current best score
    public static int getCurrentBestScore(){//start
        
         int bestScore;
         String line, newLine="";
         try{
             BufferedReader buff = new BufferedReader(new FileReader(patFileBestScore));
             while((line = buff.readLine()) != null){
                 newLine = line;
                 
             }
         }catch(FileNotFoundException e){
         }catch(IOException ex){
           
          
         }
         //here we get the value bestScore[0]from index [ and ] using substring
         bestScore =    Integer.parseInt( newLine.substring(newLine.indexOf("[")+1,newLine.indexOf("]")));
        return bestScore;
        
       
        
    }//end
    
    //Check for new best score and write to the existing file
    public static void setNewBestScore(String newContent){
        try{
            File fileToUpdate =new File(patFileBestScore);
            try(FileWriter fileWrite = new FileWriter(fileToUpdate)){
                fileWrite.write(newContent);
                fileWrite.close();
                }
           }catch(Exception e){
           }
        }
    
}//end

