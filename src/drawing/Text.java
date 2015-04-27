/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author dmt5235
 */
public class Text extends Shape {
    private String t;

    @Override
    void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(getStroke());
        g2d.setColor(c);
        g.drawString(t, s.x, s.y);
    }

    Text(Color col, String txt, Coordinate start) {
        t = txt;
        s = start;
        c = col;
    }

}
