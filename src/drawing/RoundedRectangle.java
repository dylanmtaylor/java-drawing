/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.TexturePaint;
import javax.swing.ImageIcon;

/**
 *
 * @author Dylan Taylor
 */
public class RoundedRectangle extends Shape {

    @Override
    void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(getStroke());
        if ((gradPaint1 != null) && (gradPaint2 != null)) {
            g2d.setPaint(getGradPaint());
        }
        if (imageIcon != null) {
            g2d.setPaint(getTexturePaint());
        }
        if (filled) {
            g.fillRoundRect(s.x, s.y, Math.abs(e.x - s.x), Math.abs(e.y - s.y), 30, 30);
        } else {
            g.drawRoundRect(s.x, s.y, Math.abs(e.x - s.x), Math.abs(e.y - s.y), 30, 30);
        }
    }

    RoundedRectangle(Color col, Coordinate start, int width, int height, int thick, boolean dash, boolean fill,
            float alphaValue, GradientPaint gp, TexturePaint tp) {
        s = start;
        e = new Coordinate(s.x + width, s.y + height);
        c = col;
        thickness = thick;
        dashed = dash;
        filled = fill;
        alphaVal = alphaValue;
        setupPaints(gp, tp);
    }
}
