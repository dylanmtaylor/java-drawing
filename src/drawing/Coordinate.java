package drawing;

import java.io.Serializable;

/**
 *
 * @author Dylan Taylor
 */
public class Coordinate implements Serializable {
    public int x;
    public int y;

    Coordinate(int cx, int cy) {
        x = cx; y = cy;
    }
}
