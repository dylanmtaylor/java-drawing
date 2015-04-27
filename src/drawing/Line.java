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
public class Line extends Shape {

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
        g2d.drawLine(s.x, s.y, e.x, e.y);
    }

    Line(Color col, Coordinate start, Coordinate end, int thick, boolean dash, boolean fill,
            float alphaValue, GradientPaint gp, TexturePaint tp) { //used for lines
        s = start;
        e = end;
        c = col;
        thickness = thick;
        dashed = dash;
        filled = fill;
        alphaVal = alphaValue;
        setupPaints(gp, tp);
    }
}
