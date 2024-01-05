package proyecto;

import java.util.Random;

class PanelDados {

    private final Random random;

    public PanelDados() {
        random = new Random();
    }

    public int lanzarDados() {
        return random.nextInt(6) + 1;
    }
}