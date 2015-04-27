/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package drawing;

import java.io.Serializable;

/**
 *
 * @author dmt5235
 */
public class Coordinate implements Serializable {
    public int x;
    public int y;

    Coordinate(int cx, int cy) {
        x = cx; y = cy;
    }
}
