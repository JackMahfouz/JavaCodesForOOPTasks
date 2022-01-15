/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiClasses;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;
/**
 *
 * @author Jack Mahfouz
 */
public class Cyrcle extends JPanel{
    private int redius;
    private double i;
    private double j;
    public Cyrcle() {
        this.redius = 50;
        this.i=0;
        this.j=0;
    }
    public Cyrcle(int r, double i, double j) {
        this.redius = r;
        this.i = i;
        this.j = j;
    }
    public int setRedius() {
        return this.redius;
    }
    public void getRedius(int r) {
        this.redius = r;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.yellow);
        g.drawOval(getHeight()/2-redius, getWidth()/2-redius,2*redius,2*redius);
        g.setColor(Color.BLUE);
        g.drawLine((int)(getHeight()/2+(0.7*redius)*Math.cos(-(i/10))),(int)(getWidth()/2-(0.7*redius)*Math.sin(-(i/10))),getHeight()/2 , getWidth()/2);
        g.setColor(Color.RED);
        g.drawLine((int)(getHeight()/2+(0.4*redius)*Math.cos(-(j/10))),(int)(getWidth()/2-(0.4*redius)*Math.sin(-(j/10))), getHeight()/2, getWidth()/2);
        
 }
}
