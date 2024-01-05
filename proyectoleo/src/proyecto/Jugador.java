package proyecto;

class Jugador {

    private String nombre;
    private int posicion;
    private boolean ignorante;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.posicion = 0;
        this.ignorante = false;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public boolean isIgnorante() {
        return ignorante;
    }

    public void avanzar(int pasos) {
        posicion += pasos;
        if (posicion > Mesa.CASILLAS_FINALES) {
            posicion = Mesa.CASILLAS_FINALES;
        }
    }

    public void retroceder(int pasos) {
        posicion -= pasos;
        if (posicion < 0) {
            posicion = 0;
        }
    }

    public void hacerIgnorante() {
        ignorante = true;
    }
}
