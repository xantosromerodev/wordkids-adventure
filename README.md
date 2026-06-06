# **WordKids Adventure**

Juego educativo desarrollado en Java y JavaFX orientado al aprendizaje de vocabulario básico en inglés para niños entre 6 y 12 años.

---

# **Descripción del Proyecto**

WordKids Adventure es un videojuego educativo interactivo que permite a los niños aprender palabras en inglés mediante ejercicios visuales, niveles progresivos y retroalimentación inmediata.

El jugador deberá completar palabras incompletas observando imágenes relacionadas con:

- animales,
- frutas,
- colores,
- números,
- objetos escolares,
- partes del cuerpo.

Cada respuesta correcta suma puntos y permite avanzar en la aventura.

---

# **Objetivo del Proyecto**

Desarrollar un juego educativo utilizando:

- Java,
- JavaFX,
- Programación Orientada a Objetos,
- Programación dirigida por eventos,
- Arquitectura MVC,
- pruebas unitarias con JUnit.

---

# **Tecnologías Utilizadas**

| **Tecnología** | **Descripción** |
| --- | --- |
| Java 21 | Lenguaje principal |
| JavaFX | Interfaz gráfica |
| Maven | Gestión de dependencias |
| IntelliJ IDEA | IDE principal |
| Scene Builder | Diseño visual FXML |
| JUnit 5 | Pruebas unitarias |
| Git y GitHub | Control de versiones |

---

# **Arquitectura del Proyecto**

El proyecto utiliza arquitectura MVC (Model View Controller).

## **Estructura**

```
src/
│
├── main/
│   ├── java/
│   │   └── com.wordkids/
│   │       ├── app/
│   │       ├── controller/
│   │       ├── model/
│   │       ├── service/
│   │       ├── util/
│   │       └── view/
│   │
│   └── resources/
│       ├── audio/
│       ├── images/
│       └── fxml/
│
└── test/
    └── java/
```

---

# **Paradigmas Aplicados**

## **Programación Orientada a Objetos**

- Encapsulamiento
- Herencia
- Polimorfismo
- Abstracción

## **Programación Dirigida por Eventos**

- Eventos de botones
- Eventos de teclado
- Eventos de interacción del usuario

---

# **Mecánicas del Juego**

- Sistema de vidas
- Sistema de puntuación
- Niveles progresivos
- Retroalimentación visual
- Sonidos educativos
- Palabras incompletas
- Selección de respuestas

---

# **Flujo del Juego**

```
MENU PRINCIPAL
↓
INICIAR JUEGO
↓
CARGAR NIVEL
↓
MOSTRAR IMAGEN
↓
MOSTRAR PALABRA INCOMPLETA
↓
SELECCIONAR RESPUESTA
↓
VALIDAR RESPUESTA
↓
SUMAR PUNTOS O RESTAR VIDA
↓
SIGUIENTE PREGUNTA
↓
VICTORIA O GAME OVER
```

---

# **Requisitos del Sistema**

- Java 21
- Maven
- IntelliJ IDEA
- JavaFX

---

# **Instalación**

## **Clonar repositorio**

```bash
git clone <repositorio>
```

---

## **Ejecutar proyecto**

```bash
mvn javafx:run
```

---

# **Testing**

Las pruebas unitarias fueron desarrolladas utilizando:

- JUnit 5

Se realizaron pruebas para:

- validación de respuestas,
- puntuación,
- vidas,
- niveles,
- lógica del juego.

---

# **Patrones de Diseño Aplicados**

## **MVC**

Separación entre:

- lógica,
- interfaz,
- controladores.

## **State Pattern**

Control de estados:

- menú,
- jugando,
- pausa,
- game over.

## **Factory Pattern**

Creación dinámica de preguntas y niveles.

## **Singleton**

Gestión de audio y recursos globales.

---

# **Buenas Prácticas Implementadas**

- Separación de responsabilidades
- Arquitectura limpia
- Código modular
- Testing desacoplado
- Comentarios Javadoc
- Uso de Git
- Control de dependencias con Maven

---

# **Integrantes**

- Yirley Betancur Cartagena
- Maria Veronica Castiblanco Ramirez
- Camilo Fernando Guevara Anteliz
- Santiago Zarabanda Villamil
- Yuri Maryith Pallares Coronel

---

# **Referencias**

- https://openjfx.io/
- https://www.oracle.com/java/
- https://maven.apache.org/
- https://junit.org/junit5/
