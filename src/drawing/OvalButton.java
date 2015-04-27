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
 * @author dmt5235
 */
public class OvalButton extends JButton {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(new Color(255,70,70));
        g.drawOval(3,3,this.getWidth()-8, this.getHeight()-8);
    }
}
