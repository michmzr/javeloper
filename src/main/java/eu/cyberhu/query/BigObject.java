package eu.cyberhu.query;

import java.io.Serializable;

/**
 * 80MB
 */
public class BigObject implements Serializable {
    private int[] largeArray = new int[20 * 1024 * 1024]; // x 4 bytes/int
    public String pureFun = "Hue hue hue";

    public String funnyString() {
        return pureFun;
    }
}
