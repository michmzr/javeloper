package eu.cyberhu.query;

import java.io.Serializable;
import java.util.Random;

/**
 * 80MB
 */
public class BigObject implements Serializable {
    public byte[] largeArray = new byte[30 * 1024 * 1024];
    public int nb;

    public BigObject(int nb) {
        this.nb = nb;
        new Random().nextBytes(largeArray);
    }

    public String funnyString() {
        try {
            Thread.sleep(70);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return "Hue hue hue - byte[0]=" + largeArray[0];
    }
}
