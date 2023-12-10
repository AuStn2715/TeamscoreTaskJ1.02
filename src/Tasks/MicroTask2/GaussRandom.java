package Tasks.MicroTask2;

import java.util.Random;

public class GaussRandom extends Random {
    Random rnd;
    public GaussRandom(int seed) {
        rnd = new Random(seed);
    }
    public GaussRandom() {
        rnd = new Random();
    }

    public double nextNormal(double m, double sigma) {
        double r = rnd.nextGaussian();
        double phi = rnd.nextGaussian();

        double z = Math.cos(2 * Math.PI * phi) * Math.sqrt(-2 * Math.log(r));

        return m + sigma * z;
    }

}
