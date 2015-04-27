package drawing;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

/**
 *
 * @author Dylan Taylor
 */
public class PrintableDrawing implements Printable {

    Image im;

    public PrintableDrawing(Image img) {
        this.im = img;
    }
    
    public int print(Graphics grphcs, PageFormat pf, int i) throws PrinterException {
        grphcs.drawImage(im, 0, 0, null);
        return Printable.PAGE_EXISTS;
    }
}
