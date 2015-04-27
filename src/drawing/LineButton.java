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
public class LineButton extends JButton {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(new Color(200, 50, 200));
        g.drawLine(5, 5, this.getWidth()-5, this.getHeight()-5);
    }
}
