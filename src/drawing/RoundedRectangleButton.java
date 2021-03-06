package drawing;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author Dylan Taylor
 */
public class RoundedRectangleButton extends JButton {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(new Color(0, 50, 200));
        g.drawRoundRect(3, 4, this.getWidth() - 8, this.getHeight() - 9, 5, 5);
    }
}
