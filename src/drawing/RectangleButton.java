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
public class RectangleButton extends JButton {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(new Color(50, 200, 0));
        g.drawRect(4, 4, this.getWidth() - 9, this.getHeight() - 9);
    }
}
