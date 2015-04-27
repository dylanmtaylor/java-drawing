/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author dylan
 */
public class FreehandButton extends JButton {
    @Override
        public void paint(Graphics g) {
        super.paint(g);
        g.setColor(new Color(245, 184, 0));
        g.drawLine(5,5,15,10);
        g.drawLine(15,10,25,5);
        g.drawLine(25,5,35,10);
        g.drawLine(35,10,5,30);        
    }
}
