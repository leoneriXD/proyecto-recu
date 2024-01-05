package proyecto;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Juego {

    public static void main(String[] args) {
        List<Preguntas> preguntas = Preguntas.obtenerPreguntasPredeterminadas();
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador("Jugador 1"));
        PanelDados panelDados = new PanelDados();

        Mesa mesa = new Mesa(preguntas, jugadores, panelDados);
    }
}

class Mesa {

    public static final int FILAS = 6;
    public static final int COLUMNAS = 7;
    static final int CASILLAS_FINALES = FILAS * COLUMNAS;

    private final List<Jugador> jugadoresEnJuego;
    private final PanelDados panelDados;

    private JFrame frame;
    private JPanel tableroPanel;
    private JLabel[][] casillaLabels;
    private JLabel[] jugadorLabels;

    private final InterfazPreguntas interfazPreguntas;

    public Mesa(List<Preguntas> preguntasDisponibles, List<Jugador> jugadores, PanelDados panelDados) {
        this.jugadoresEnJuego = jugadores;
        this.panelDados = panelDados;
        interfazPreguntas = new InterfazPreguntas(this);
        inicializarTablero();
        crearInterfaz();
    }

    public List<Jugador> getJugadoresEnJuego() {
    return jugadoresEnJuego;
}
    
    private void mostrarNuevaPregunta() {
        interfazPreguntas.mostrarNuevaPregunta();
    }

    private void inicializarTablero() {
        casillaLabels = new JLabel[FILAS][COLUMNAS];

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                casillaLabels[i][j] = new JLabel("", JLabel.CENTER);
                casillaLabels[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                casillaLabels[i][j].setBackground(Color.GREEN);  // Añade esta línea para cambiar el color a verde
                casillaLabels[i][j].setOpaque(true);  // Añade esta línea para asegurarte de que el fondo sea opaco
            }
        }
    }


    private void crearInterfaz() {
        frame = new JFrame("Juego de Maratón");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tableroPanel = new JPanel();
        tableroPanel.setLayout(new GridLayout(FILAS + 1, COLUMNAS));

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tableroPanel.add(casillaLabels[i][j]);
            }
        }

        jugadorLabels = new JLabel[jugadoresEnJuego.size()];

        for (int i = 0; i < jugadoresEnJuego.size(); i++) {
            Jugador jugador = jugadoresEnJuego.get(i);
            jugadorLabels[i] = new JLabel(jugador.getNombre(), JLabel.CENTER);
            jugadorLabels[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            tableroPanel.add(jugadorLabels[i]);
        }

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(tableroPanel, BorderLayout.CENTER);

        JButton btnResponder = new JButton("Responder");
        btnResponder.addActionListener(e -> {
            realizarTurno(jugadoresEnJuego.get(0));
        });
        frame.getContentPane().add(btnResponder, BorderLayout.SOUTH);

        frame.setSize(800, 400);
        frame.setVisible(true);
    }

    private void realizarTurno(Jugador jugador) {
        JOptionPane.showMessageDialog(frame, "Turno de " + jugador.getNombre());

        int valorDado = panelDados.lanzarDados();
        JOptionPane.showMessageDialog(frame, "Número obtenido en el dado: " + valorDado);

        int posicionAnterior = jugador.getPosicion();
        jugador.avanzar(valorDado);

        actualizarTablero(posicionAnterior, jugador.getPosicion());

        if (jugador.getPosicion() == CASILLAS_FINALES) {
            JOptionPane.showMessageDialog(frame, "¡El jugador " + jugador.getNombre() + " ha llegado a la casilla final y ha ganado!");
            frame.dispose();
            return;
        }

        mostrarNuevaPregunta();

        if (hayGanador()) {
            Jugador ganador = determinarGanador();
            JOptionPane.showMessageDialog(frame, "¡El jugador " + ganador.getNombre() + " ha ganado!");
            frame.dispose();
        }
    }
    
    // En la clase Mesa
void actualizarTablero(int posicionAnterior, int nuevaPosicion) {
    int filaAnterior = posicionAnterior / COLUMNAS;
    int columnaAnterior = posicionAnterior % COLUMNAS;

    int filaNueva = nuevaPosicion / COLUMNAS;
    int columnaNueva = nuevaPosicion % COLUMNAS;

    if (esIndiceValido(filaAnterior, columnaAnterior) && esIndiceValido(filaNueva, columnaNueva)) {
        // Restablecer la casilla anterior al color blanco
        casillaLabels[filaAnterior][columnaAnterior].setBackground(Color.WHITE);
        // Colorear la nueva casilla de verde oscuro
        casillaLabels[filaNueva][columnaNueva].setBackground(Color.WHITE);
        // Restablecer el texto de la casilla anterior
        casillaLabels[filaAnterior][columnaAnterior].setText(String.valueOf(posicionAnterior + 1));
        // Colocar el indicador "►" en la nueva casilla
        casillaLabels[filaNueva][columnaNueva].setText("►");
    }

    actualizarJugadores();
}



    private boolean esIndiceValido(int fila, int columna) {
        return fila >= 0 && fila < FILAS && columna >= 0 && columna < COLUMNAS;
    }

    private void actualizarJugadores() {
        for (int i = 0; i < jugadoresEnJuego.size(); i++) {
            Jugador jugador = jugadoresEnJuego.get(i);
            jugadorLabels[i].setText(jugador.getNombre() + " - Posición: " + (jugador.getPosicion() + 1)
                    + (jugador.isIgnorante() ? " - Ignorante" : ""));
        }
    }

    private boolean hayGanador() {
        for (Jugador jugador : jugadoresEnJuego) {
            if (jugador.getPosicion() == CASILLAS_FINALES) {
                return true;
            }
        }
        return false;
    }

    private Jugador determinarGanador() {
        Jugador ganador = jugadoresEnJuego.get(0);

        for (Jugador jugador : jugadoresEnJuego) {
            if (jugador.getPosicion() > ganador.getPosicion()) {
                ganador = jugador;
            }
        }

        return ganador;
    }

    
}

class InterfazPreguntas {

    private final JFrame frame;
    private Preguntas preguntaActual;
    private final Mesa mesa;

    public InterfazPreguntas(Mesa mesa) {
        this.mesa = mesa;
        frame = new JFrame("Juego de Preguntas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
    }

    public void mostrarNuevaPregunta() {
        preguntaActual = Preguntas.obtenerPreguntaPorDado(1);

        JPanel panelPregunta = new JPanel(new BorderLayout(10, 10));

        JLabel labelPregunta = new JLabel(preguntaActual.getEnunciado());
        labelPregunta.setFont(new Font("Arial", Font.BOLD, 16));
        panelPregunta.add(labelPregunta, BorderLayout.NORTH);

        JPanel panelOpciones = new JPanel(new GridLayout(0, 1, 5, 5));

        ButtonGroup grupoOpciones = new ButtonGroup();
        for (String opcion : preguntaActual.getOpciones()) {
            JRadioButton radioButton = new JRadioButton(opcion);
            radioButton.setFont(new Font("Arial", Font.PLAIN, 14));
            grupoOpciones.add(radioButton);
            panelOpciones.add(radioButton);
        }

        panelPregunta.add(panelOpciones, BorderLayout.CENTER);

        JButton btnResponder = new JButton("Responder");
        btnResponder.setFont(new Font("Arial", Font.BOLD, 14));
        btnResponder.addActionListener(e -> {
            int respuestaSeleccionada = obtenerRespuestaSeleccionada(grupoOpciones);
            verificarRespuesta(respuestaSeleccionada);
        });

        JPanel panelBoton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelBoton.add(btnResponder);

        panelPregunta.add(panelBoton, BorderLayout.SOUTH);

        frame.getContentPane().removeAll();
        frame.getContentPane().add(panelPregunta, BorderLayout.CENTER);
        frame.revalidate();
        frame.repaint();
    }

    private int obtenerRespuestaSeleccionada(ButtonGroup grupoOpciones) {
    Enumeration<AbstractButton> elementos = grupoOpciones.getElements();
    for (int i = 0; i < preguntaActual.getOpciones().size(); i++) {
        if (elementos.hasMoreElements()) {
            AbstractButton radioButton = elementos.nextElement();
            if (radioButton.isSelected()) {
                return i;
            }
        }
    }
    return -1;
}


    private void verificarRespuesta(int respuestaSeleccionada) {
    if (respuestaSeleccionada == preguntaActual.getRespuestaCorrecta()) {
        JOptionPane.showMessageDialog(frame, "¡Respuesta correcta!");

        // Cambiar a una nueva pregunta
        mostrarNuevaPregunta();
    } else {
        JOptionPane.showMessageDialog(frame, "Respuesta incorrecta. Deberás retroceder una casilla.");
        retrocederCasilla();
    }
}

private void retrocederCasilla() {
    Jugador jugadorActual;
    jugadorActual = mesa.getJugadoresEnJuego().get(0);
    int posicionAnterior = jugadorActual.getPosicion();
    jugadorActual.retroceder(1);
    mesa.actualizarTablero(posicionAnterior, jugadorActual.getPosicion());

    // Cambiar a una nueva pregunta después de retroceder
    mostrarNuevaPregunta();
}
}