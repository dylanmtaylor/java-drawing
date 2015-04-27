/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.TexturePaint;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author dmt5235
 */
public abstract class Shape implements Serializable {
    //The following line is currently used only for switching current drawing mode.

    public static final int LINE = 100, OVAL = 200, RECTANGLE = 300, ROUND_RECTANGLE = 400, TEXT = 500, FREEHAND = 600;
    public Coordinate s, e;
    public int type;
    public Color c, gradPaint1, gradPaint2;
    float alphaVal;
    int thickness = 1;
    boolean dashed;
    boolean filled;
    ImageIcon imageIcon;
    Rectangle2D textureDimensions;

    abstract void draw(Graphics g);

    protected BasicStroke getStroke() {
        if (!dashed) {
            return new BasicStroke(thickness);
        } else {
            float fa[] = {10, 10, 10};
            return new BasicStroke(thickness, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 10, fa, 10);
        }
    }
    
    protected void setupPaints(GradientPaint gp, TexturePaint tp) {
        try {
            gradPaint1 = gp.getColor1();
            gradPaint2 = gp.getColor2();
        } catch (Exception ex) {
            gradPaint1 = null;
            gradPaint2 = null;
        }
        try {
            imageIcon = new ImageIcon(tp.getImage());
            textureDimensions = tp.getAnchorRect();
        } catch (Exception ex) {
            imageIcon = null;
            textureDimensions = null;
        }
    }

    protected GradientPaint getGradPaint() {
        //GradientPaint is not serializable. We need to work around this short-coming, unfortunately.
        return new GradientPaint(Drawing.drawPanel.getWidth() / 2, 0F, gradPaint1, Drawing.drawPanel.getWidth() / 2, Drawing.drawPanel.getHeight(), gradPaint2);
    }

    protected TexturePaint getTexturePaint() {
        BufferedImage bi = new BufferedImage((int)textureDimensions.getWidth(), (int)textureDimensions.getHeight(), BufferedImage.TYPE_BYTE_INDEXED);
        Graphics biGraphics = bi.createGraphics();
        biGraphics.drawImage(imageIcon.getImage(), 0, 0, null);
        return new TexturePaint(bi, textureDimensions);
    }
}
