package drawing;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.TexturePaint;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dylan Taylor
 */
public class FreeHand extends Shape implements Serializable {

    ArrayList<Line> segs; //used for free hand

    @Override
    void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(getStroke());
//        AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.DST_IN, alphaVal);
//        g2d.setComposite(ac);
        if ((gradPaint1 != null) && (gradPaint2 != null)) {
            g2d.setPaint(getGradPaint());
        }
        if (imageIcon != null) {
            g2d.setPaint(getTexturePaint());
        }
        for (int i = 0; i < segs.size(); i++) {
            g2d.drawLine(segs.get(i).s.x, segs.get(i).s.y, segs.get(i).e.x, segs.get(i).e.y);
        }
    }

    FreeHand(Color col, ArrayList<Line> segments, int thick, boolean dash, boolean fill,
            float alphaValue, GradientPaint gp, TexturePaint tp) { //used for lines

        segs = new ArrayList<Line>();
        for (Line item : segments) {
            segs.add(item);
        }
        c = col;
        thickness = thick;
        dashed = dash;
        filled = fill;
        alphaVal = alphaValue;
        setupPaints(gp, tp);
    }
}
