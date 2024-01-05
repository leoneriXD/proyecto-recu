package proyecto;

import java.util.ArrayList;
import java.util.List;

public class Preguntas {

    private String enunciado;
    private List<String> opciones;
    private int respuestaCorrecta;

    public Preguntas(String enunciado, List<String> opciones, int respuestaCorrecta) {
        this.enunciado = enunciado;
        this.opciones = opciones;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public List<String> getOpciones() {
        return opciones;
    }

    public int getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public static List<Preguntas> obtenerPreguntasPredeterminadas() {
        List<Preguntas> preguntas = new ArrayList<>();

        // Pregunta 1
        List<String> opciones1 = new ArrayList<>();
        opciones1.add("A. Un paradigma de programación basado en eventos y callbacks.");
        opciones1.add("B. Un lenguaje de programación.");
        opciones1.add("C. Un tipo de base de datos.");
        opciones1.add("D. Un sistema operativo.");
        preguntas.add(new Preguntas("¿Qué es la programación orientada a eventos?", opciones1, 0));

        // Pregunta 2
        List<String> opciones2 = new ArrayList<>();
        opciones2.add("A. Aplicaciones de interfaz gráfica de usuario (GUI).");
        opciones2.add("B. Aplicaciones de línea de comandos.");
        opciones2.add("C. Sistemas operativos.");
        opciones2.add("D. Navegadores web.");
        preguntas.add(new Preguntas("¿En qué tipo de aplicaciones se utiliza comúnmente la programación orientada a eventos?", opciones2, 0));

        // Pregunta 3
        List<String> opciones3 = new ArrayList<>();
        opciones3.add("A. Una acción o suceso, como un clic del mouse o una pulsación de tecla.");
        opciones3.add("B. Una variable.");
        opciones3.add("C. Una función.");
        opciones3.add("D. Un bucle.");
        preguntas.add(new Preguntas("¿Qué es un evento en la programación orientada a eventos?", opciones3, 0));

        // Pregunta 4
        List<String> opciones4 = new ArrayList<>();
        opciones4.add("A. Un procedimiento o función que espera a que ocurra un evento.");
        opciones4.add("B. Un tipo de evento.");
        opciones4.add("C. Un tipo de base de datos.");
        opciones4.add("D. Un lenguaje de programación.");
        preguntas.add(new Preguntas("¿Qué es un oyente de eventos (event listener)?", opciones4, 0));

        // Pregunta 5
        List<String> opciones5 = new ArrayList<>();
        opciones5.add("A. Una función que se ejecuta en respuesta a un evento.");
        opciones5.add("B. Un tipo de evento.");
        opciones5.add("C. Un tipo de base de datos.");
        opciones5.add("D. Un lenguaje de programación.");
        preguntas.add(new Preguntas("¿Qué es un manejador de eventos (event handler)?", opciones5, 0));

        // Pregunta 6
        List<String> opciones6 = new ArrayList<>();
        opciones6.add("A. Node.js.");
        opciones6.add("B. C++.");
        opciones6.add("C. Java.");
        opciones6.add("D. Python.");
        preguntas.add(new Preguntas("¿Qué lenguaje de programación popular utiliza la programación orientada a eventos en su modelo de entrada y salida (I/O)?", opciones6, 0));

        // Pregunta 7
        List<String> opciones7 = new ArrayList<>();
        opciones7.add("A. Un ciclo de procesamiento que espera eventos y los despacha para ser manejados.");
        opciones7.add("B. Un tipo de evento.");
        opciones7.add("C. Un tipo de base de datos.");
        opciones7.add("D. Un lenguaje de programación.");
        preguntas.add(new Preguntas("¿Qué es un bucle de eventos (event loop)?", opciones7, 0));

        // Pregunta 8
        List<String> opciones8 = new ArrayList<>();
        opciones8.add("A. Una función que se pasa a otra función para ser ejecutada en respuesta a un evento.");
        opciones8.add("B. Un tipo de evento.");
        opciones8.add("C. Un tipo de base de datos.");
        opciones8.add("D. Un lenguaje de programación.");
        preguntas.add(new Preguntas("¿Qué es un callback en la programación orientada a eventos?", opciones8, 0));

        // Pregunta 9
        List<String> opciones9 = new ArrayList<>();
        opciones9.add("A. El proceso por el cual un evento se propaga a través de los elementos anidados en el DOM.");
        opciones9.add("B. Un tipo de evento.");
        opciones9.add("C. Un tipo de base de datos.");
        opciones9.add("D. Un lenguaje de programación.");
        preguntas.add(new Preguntas("¿Qué es la propagación de eventos (event propagation)?", opciones9, 0));

        // Pregunta 10
        List<String> opciones10 = new ArrayList<>();
        opciones10.add("A. Una técnica en la que se añade un oyente de eventos a un elemento padre en lugar de añadirlo a los elementos hijos individualmente.");
        opciones10.add("B. Un tipo de evento.");
        opciones10.add("C. Un tipo de base de datos.");
        opciones10.add("D. Un lenguaje de programación.");
        preguntas.add(new Preguntas("¿Qué es la delegación de eventos (event delegation)?", opciones10, 0));

        // Pregunta 11
        List<String> opciones11 = new ArrayList<>();
        opciones11.add("A. Un objeto que contiene información sobre el evento, como el tipo de evento y el objetivo del evento.");
        opciones11.add("B. Un tipo de evento.");
        opciones11.add("C. Un tipo de base de datos.");
        opciones11.add("D. Un lenguaje de programación.");
        preguntas.add(new Preguntas("¿Qué es un objeto de evento (event object)?", opciones11, 0));

        // Pregunta 12
        List<String> opciones12 = new ArrayList<>();
        opciones12.add("A. Un objeto de evento que encapsula el comportamiento del evento nativo del navegador.");
        opciones12.add("B. Un tipo de evento.");
        opciones12.add("C. Un tipo de base de datos.");
        opciones12.add("D. Un lenguaje de programación.");
        preguntas.add(new Preguntas("¿Qué es un evento sintético (synthetic event)?", opciones12, 0));

        // Pregunta 13
        List<String> opciones13 = new ArrayList<>();
        opciones13.add("A. Un evento definido por el programador que no es un evento estándar del navegador.");
        opciones13.add("B. Un tipo de evento.");
        opciones13.add("C. Un tipo de base de datos.");
        opciones13.add("D. Un lenguaje de programación.");
        preguntas.add(new Preguntas("¿Qué es un evento personalizado (custom event)?", opciones13, 0));

        // Pregunta 14
        List<String> opciones14 = new ArrayList<>();
        opciones14.add("A. Un evento que se dispara después de un cierto período de tiempo, como los generados por setTimeout o setInterval.");
        opciones14.add("B. Un tipo de evento.");
        opciones14.add("C. Un tipo de base de datos.");
        opciones14.add("D. Un lenguaje de programación.");
        preguntas.add(new Preguntas("¿Qué es un evento de tiempo (timer event)?", opciones14, 0));

        // Pregunta 15
        List<String> opciones15 = new ArrayList<>();
        opciones15.add("A. Un evento que se dispara en respuesta a una interacción del usuario, como un clic del mouse o una pulsación de tecla.");
        opciones15.add("B. Un tipo de evento.");
        opciones15.add("C. Un tipo de base de datos.");
        opciones15.add("D. Un lenguaje de programación.");
        preguntas.add(new Preguntas("¿Qué es un evento de interfaz de usuario (UI event)?", opciones15, 0));

        // Pregunta 16
        List<String> opciones16 = new ArrayList<>();
        opciones16.add("A. Un evento que se dispara en respuesta a una actividad de red, como la finalización de una solicitud HTTP.");
        opciones16.add("B. Un tipo de evento.");
        opciones16.add("C. Un tipo de base de datos.");
        opciones16.add("D. Un lenguaje de programación.");
        preguntas.add(new Preguntas("¿Qué es un evento de red (network event)?", opciones16, 0));

        // Pregunta 17
        List<String> opciones17 = new ArrayList<>();
        opciones17.add("A. Un evento que se dispara cuando el valor de un elemento de entrada cambia.");
        opciones17.add("B. Un tipo de evento.");
        opciones17.add("C. Un tipo de base de datos.");
        opciones17.add("D. Un lenguaje de programación.");
        preguntas.add(new Preguntas("¿Qué es un evento de cambio (change event)?", opciones17, 0));

        // Pregunta 18
        List<String> opciones18 = new ArrayList<>();
        opciones18.add("A. Un evento que se dispara cuando un elemento recibe o pierde el foco.");
        opciones18.add("B. Un tipo de evento.");
        opciones18.add("C. Un tipo de base de datos.");
        opciones18.add("D. Un lenguaje de programación.");
        preguntas.add(new Preguntas("¿Qué es un evento de foco (focus event)?", opciones18, 0));

        // Pregunta 19
        List<String> opciones19 = new ArrayList<>();
        opciones19.add("A. Un evento que se dispara cuando el usuario se desplaza en una página o en un elemento.");
        opciones19.add("B. Un tipo de evento.");
        opciones19.add("C. Un tipo de base de datos.");
        opciones19.add("D. Un lenguaje de programación.");
        preguntas.add(new Preguntas("¿Qué es un evento de desplazamiento (scroll event)?", opciones19, 0));

        // Pregunta 20
        List<String> opciones20 = new ArrayList<>();
        opciones20.add("A. Un evento que se dispara durante la acción de arrastrar y soltar elementos en una interfaz gráfica.");
        opciones20.add("B. Un tipo de evento.");
        opciones20.add("C. Un tipo de base de datos.");
        opciones20.add("D. Un lenguaje de programación.");
        preguntas.add(new Preguntas("¿Qué es un evento de arrastre y suelta (drag and drop event)?", opciones20, 0));

        // Pregunta 21
        List<String> opciones21 = new ArrayList<>();
        opciones21.add("A. Evitar que un evento se propague a través de los elementos anidados en el DOM.");
        opciones21.add("B. Un tipo de evento.");
        opciones21.add("C. Un tipo de base de datos.");
        opciones21.add("D. Un lenguaje de programación.");
        preguntas.add(new Preguntas("¿Cuál es el propósito de la prevención de la propagación de eventos (event propagation)?", opciones21, 0));

        // Pregunta 22
        List<String> opciones22 = new ArrayList<>();
        opciones22.add("A. La fase inicial en la que el evento se propaga desde el elemento superior hacia abajo en el árbol del DOM.");
        opciones22.add("B. Un tipo de evento.");
        opciones22.add("C. Un tipo de base de datos.");
        opciones22.add("D. Un lenguaje de programación.");
        preguntas.add(new Preguntas("¿En qué consiste la captura de eventos (event capturing) en la programación orientada a eventos?", opciones22, 0));

        // Pregunta 23
        List<String> opciones23 = new ArrayList<>();
        opciones23.add("A. La fase en la que el evento se propaga desde el elemento objetivo hacia arriba en el árbol del DOM.");
        opciones23.add("B. Un tipo de evento.");
        opciones23.add("C. Un tipo de base de datos.");
        opciones23.add("D. Un lenguaje de programación.");
        preguntas.add(new Preguntas("¿Qué es la bubbling de eventos (event bubbling)?", opciones23, 0));

        // Pregunta 24
        List<String> opciones24 = new ArrayList<>();
        opciones24.add("A. La secuencia en la que los eventos son manejados en la interfaz de usuario.");
        opciones24.add("B. Un tipo de evento.");
        opciones24.add("C. Un tipo de base de datos.");
        opciones24.add("D. Un lenguaje de programación.");
        preguntas.add(new Preguntas("¿Qué es el flujo de eventos (event flow) en la programación orientada a eventos?", opciones24, 0));

        // Pregunta 25
        List<String> opciones25 = new ArrayList<>();
        opciones25.add("A. Verdadero.");
        opciones25.add("B. Falso.");
        preguntas.add(new Preguntas("Verdadero o Falso: La programación orientada a eventos se centra en la idea de que los eventos son el resultado de acciones que ocurren en un sistema y que los programas deben responder a estos eventos.", opciones25, 0));

        return preguntas;
    }
    
    public static Preguntas obtenerPreguntaPorDado(int valorDado) {
        List<Preguntas> preguntas = obtenerPreguntasPredeterminadas();

        if (valorDado >= 1 && valorDado <= preguntas.size()) {
            return preguntas.get(valorDado - 1);
        } else {
            return null;
        }
    }
}