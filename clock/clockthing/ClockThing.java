/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockthing;

import javax.swing.JFrame;
import GuiClasses.Cyrcle;
import java.awt.BorderLayout;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Jack Mahfouz
 */
public class ClockThing extends JFrame {

    /**
     * @param args the command line arguments
     */
    ClockThing() {
        this.setTitle("Clock");
        this.setLocationRelativeTo(null);
        this.setLocation(0,0);
        this.setSize(800, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ClockThing CK = new ClockThing();
        Timer time = new Timer();
        
         Cyrcle cr ;
         int i = 0;
         int j = 0;
        while(i<=360) {
                    try {
                        long times = System.currentTimeMillis();
                        cr = new Cyrcle(300,i,j);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            break;
                        }
                        i++;
                        if(i==60) {
                            i=0;
                            j++;
                        }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            break;
                        }
                        CK.add(cr,BorderLayout.CENTER);
                        CK.setVisible(true);
                        long wait = times + 1000 - System.currentTimeMillis();
                        if(wait>0)
                            Thread.sleep(wait);
                    } catch (InterruptedException ex) {
                Logger.getLogger(ClockThing.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
