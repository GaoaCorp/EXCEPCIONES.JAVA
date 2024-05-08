//Excepciones en Java

        Introducción
        En el mundo de la Programación Orientada a Objetos en Java, manejar excepciones no es solo un método de control de errores; es un arte que distingue a un programador competente de uno excepcional. Mientras que algunos ven las excepciones como un obstáculo, los programadores avanzados las utilizan para construir aplicaciones robustas y a prueba de fallos.

        Qué son las excepciones en Java
        Las excepciones en Java son eventos anómalos que pueden ocurrir durante la ejecución de un programa y que alteran el flujo normal de ejecución. Estos eventos representan situaciones inesperadas o errores que deben ser manejados de manera adecuada para garantizar que el programa continúe ejecutándose de y evitar así interrupciones.

        Vamos a explorar este concepto a través de un ejemplo cotidiano que seguro todos hemos experimentado. Imagina que estás utilizando una aplicación que requiere que ingreses una contraseña para acceder a tu cuenta. Al introducir la contraseña, puede haber diferentes escenarios, si ingresas la contraseña correcta, la aplicación te permite acceder a tu cuenta y continua sus funciones de manera normal. Este sería el flujo esperado y no genera una excepción.

        En cambio, si ingresaras una contraseña incorrecta, en lugar de que la aplicación se cierre o falle, es probable que veas un mensaje de error indicando que la contraseña es incorrecta y te dé la oportunidad de intentarlo nuevamente. En este caso, la aplicación ha detectado una excepción y ha manejado esta situación de forma elegante sin detenerse.

        Este manejo de excepciones en la aplicación es vital para una buena experiencia de usuario, ya que permite que la aplicación continúe funcionando a pesar de errores predecibles y proporciona información útil al usuario para corregir el problema.


        Importancia de las excepciones

        Las excepciones son elementos fundamentales en la construcción de programas robustos y fiables en cualquier lenguaje de programación, su importancia radica en varios aspectos:
        •	Manejo de errores de manera estructurada: Las excepciones brindan una forma estructurada de manejar errores y situaciones excepcionales. Esto permite separar el código de manejo de errores del código funcional, lo que resulta en un código más limpio y fácil de entender.

        •	Mejora de la robustez y confiabilidad: Al anticipar y manejar situaciones excepcionales de forma adecuada, podemos hacer que nuestras aplicaciones sean más resistentes y confiables. Esto es esencial para garantizar que el programa funcione de manera predecible y sin interrupciones.

        •	Retroalimentación al usuario: Mediante el uso de excepciones, podemos proporcionar mensajes de error significativos y detallados al usuario, lo que facilita la comprensión de lo que salió mal y cómo corregirlo. Esto mejora la experiencia del usuario y facilita la resolución de problemas.

        •	Flexibilidad y adaptabilidad: El manejo adecuado de excepciones permite a los desarrolladores adaptar el comportamiento de la aplicación según las circunstancias. Esto significa que podemos cambiar la forma en que se manejan las excepciones en diferentes partes del programa para adaptarse a los requisitos específicos de cada sección.



        Tipos de excepciones en Java
        Las excepciones se dividen en tres categorías principales, cada una heredada de la clase base Throwable. Estas categorías son:

        Checked exceptions: Son excepciones que se deben declarar en la firma del método o capturar explícitamente en un bloque try-catch. Si una excepción comprobada no se maneja correctamente, el código no se compilará. Estas excepciones se heredan de la clase Exception.

        Unchecked exceptions: Son excepciones que no están obligadas a ser manejadas explícitamente. Estas excepciones ocurren durante la ejecución del programa y no se requiere que sean declaradas en la firma del método o capturadas mediante un bloque try-catch. Se heredan de la clase RuntimeException.

        Errors: Son problemas graves que generalmente están fuera del control del programador y no deben manejarse explícitamente. Estos errores indican problemas serios que deberían detener la ejecución del programa. Se heredan de la clase Error.

        Manejo de excepciones en Java
        El manejo de excepciones en Java es fundamental. A continuación, veremos cómo manejar excepciones utilizando bloques try, catch y finally.

        El bloque try se utiliza para envolver el código que puede generar una excepción. Si se produce una excepción dentro del bloque try, se captura en uno o más bloques catch asociados.

        try {
        // Código que puede generar una excepción
        int resultado = 10 / 0; // Esto generará una excepción de división por cero (ArithmeticException)
        } catch (ArithmeticException e) {
        // Captura de la excepción específica
        System.out.println("Ocurrió una excepción: " + e.getMessage());
        }


        1.	Ejemplos comunes incluyen IOException, SQLException, etc.

import java.io.*;

public class CheckedExceptionExample {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("file.txt");
        BufferedReader fileInput = new BufferedReader(file);

        // Reading file line by line
        String line;
        while ((line = fileInput.readLine()) != null) {
            System.out.println(line);
        }
        fileInput.close();
    }
}

Por otro lado, el bloque finally se utiliza para ejecutar código que debe ejecutarse, independientemente de si se ha producido una excepción o no. Se usa para liberar recursos que deben cerrarse, como conexiones a bases de datos o archivos.


try {
        // Código que puede generar una excepción
        // ...
        } catch (Exception e) {
        // Captura de cualquier excepción
        System.out.println("Ocurrió una excepción: " + e.getMessage());
        } finally {
        // Código que se ejecutará siempre, incluso si se produjo una excepción
        // Liberar recursos
        }

Podemos tener varios bloques catch para manejar diferentes tipos de excepciones de manera específica.

try {
        // Código que puede generar una excepción
        // ...
        } catch (ArithmeticException e) {
        // Captura de excepción de división por cero
        System.out.println("Ocurrió una excepción de división por cero: " + e.getMessage());
        } catch (Exception e) {
        // Captura de cualquier otra excepción
        System.out.println("Ocurrió una excepción: " + e.getMessage());
        }

Excepciones de Ejecución (Runtime Exceptions):
        •	Son excepciones que no es necesario manejar explícitamente o declarar. Estas excepciones son subclases de RuntimeException.
        •	Ejemplos incluyen NullPointerException, ArrayIndexOutOfBoundsException, etc.
public class RuntimeExceptionExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        try {
            // Trying to access an element out of array bounds
            int value = array[5];
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
    }
}

Clases de excepciones en Java
        A continuación, os presentamos algunas de las clases de excepciones más comunes en cada categoría:

Checked Exceptions:

        •	IOException: Indica un error en una operación de entrada o salida (E/S).
        •	FileNotFoundException: Se lanza cuando se intenta acceder a un archivo que no se encuentra en el sistema.
        •	ParseException: Ocurre al intentar analizar una cadena para convertirla en un formato específico.
        •	SQLException: Representa una excepción específica de la base de datos que ocurre durante la interacción con una base de datos.


Unchecked Exceptions:

        •	RuntimeException: Clase base para excepciones no comprobadas.
        •	NullPointerException: Ocurre cuando intentas acceder a un objeto que es null.
        •	ArrayIndexOutOfBoundsException: Se lanza cuando intentas acceder a un índice fuera del rango válido de un arreglo.
•	ArithmeticException: Indica un error aritmético, como la división por cero.

Además de estas, existen muchas otras excepciones específicas para situaciones particulares. Es importante conocerlas y entender cuándo y cómo manejarlas para escribir un código robusto y confiable.

Ejemplos con clases de excepciones
        A continuación, te mostraré ejemplos de cada tipo de excepción en Java, empezando por las Checked Exceptions:

        import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExample {
    public static void main(String[] args) {
        try {
            File file = new File("archivo.txt");
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se encontró.");
        }
    }
}

En esta ocasión, el código intenta abrir un archivo llamado “archivo.txt” para lectura utilizando un FileReader. Si el archivo no se encuentra, se captura la excepción FileNotFoundException y se imprime un mensaje indicando que el archivo no se encontró.

        Tras esto, veamos un ejemplo de Unchecked Exceptions:

public class UncheckedExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]);  // Genera ArrayIndexOutOfBoundsException
    }
}
Este código intenta imprimir el valor en la posición 5 del array. Sin embargo, el array solo tiene índices 0, 1 y 2, por lo que intentar acceder al índice 5 generará una excepción ArrayIndexOutOfBoundsException debido a que está fuera del rango válido para este array.

La excepción ArrayIndexOutOfBoundsException es una excepción no verificada en Java, lo que significa que no es obligatorio manejarla explícitamente utilizando un bloque try-catch. Esto se debe a que es responsabilidad del programador garantizar que se acceda a los elementos del array dentro de sus límites válidos.

Errores (Errors):
        •	Representan problemas graves que no deberían manejarse en tiempo de ejecución. Son subclases de Error.
        •	Ejemplos incluyen OutOfMemoryError, StackOverflowError, etc.

public class ErrorExample {
    public static void main(String[] args) {
        try {
            // Infinite recursion causing StackOverflowError
            infiniteRecursion();
        } catch (StackOverflowError e) {
            System.out.println("Stack Overflow Error occurred");
        }
    }

    public static void infiniteRecursion() {
        infiniteRecursion();
    }
}

Excepciones Declarativas (Declarative Exceptions):
        •	Son excepciones que el código de usuario debe manejar o declarar explícitamente mediante la cláusula throws.
        •	Ejemplo: IOException.

import java.io.*;

public class DeclarativeExceptionExample {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("file.txt");
        BufferedReader fileInput = new BufferedReader(file);

        // Reading file line by line
        String line;
        while ((line = fileInput.readLine()) != null) {
            System.out.println(line);
        }
        fileInput.close();
    }
}

Creación de excepciones personalizadas
La creación de excepciones personalizadas en Java es útil cuando necesitas representar situaciones excepcionales específicas en tu aplicación que no están cubiertas por las excepciones predefinidas.

Esto te permite crear jerarquías de excepciones que reflejen de manera precisa y detallada las situaciones inusuales que pueden ocurrir en tu aplicación.

Cómo crear y lanzar excepciones personalizadas
        A continuación, te mostraremos cómo puedes crear tu propia excepción personalizada en Java:

public class MiExcepcionPersonalizada extends Exception {
    public MiExcepcionPersonalizada(String mensaje) {
        super(mensaje);
    }
}

Aquí se crea una clase llamada MiExcepcionPersonalizada que extiende de Exception. Además, se proporciona un constructor que acepta un mensaje como argumento y lo pasa al constructor de la clase base Exception usando super(mensaje).

public class Ejemplo {
    public static void main(String[] args) {
        try {
            throw new MiExcepcionPersonalizada("Este es un mensaje de excepción personalizada.");
        } catch (MiExcepcionPersonalizada e) {
            System.out.println("Se ha producido una excepción personalizada: " + e.getMessage());
        }
    }
}

En el método main, se intenta lanzar una instancia de MiExcepcionPersonalizada utilizando throw. Luego, se captura esta excepción usando un bloque try-catch y se imprime el mensaje asociado a la excepción.
        ClassNotFoundException: Esta excepción se lanza cuando una aplicación intenta cargar una clase a través de su nombre, pero no se puede encontrar la clase en el classpath.
public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada: " + e.getMessage());
        }
    }
}

ArrayIndexOutOfBoundsException: Se lanza cuando se accede a un índice fuera del rango de un array.
public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        try {
            int value = array[5]; // Intenta acceder a un índice que está fuera del rango del array
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fuera de límites: " + e.getMessage());
        }
    }
}
ArithmeticException: Se lanza cuando ocurre un error aritmético, como la división por cero.
public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Intenta dividir por cero
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: " + e.getMessage());
        }
    }
}

NullPointerException: Se lanza cuando se intenta acceder a un objeto que es null.
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length(); // Intenta acceder a un método de un objeto nulo
        } catch (NullPointerException e) {
            System.out.println("Referencia nula encontrada: " + e.getMessage());
        }
    }
}

Buenas prácticas para manejar excepciones
        A continuación, te presentamos algunas buenas prácticas para manejar excepciones en Java y en la mayoría de los lenguajes de programación:
        •	Captura las excepciones en el nivel donde puedas manejarlas de manera adecuada. No captures excepciones en un nivel donde no puedas hacer algo significativo para resolver el problema.
        •	Incluye información relevante en el mensaje de la excepción que pueda ayudar a diagnosticar el problema, como detalles del contexto y de las operaciones que llevaron a la excepción.
        •	Siempre que se trabaje con recursos que necesiten ser liberados (como conexiones a bases de datos o archivos), utiliza bloques finally para asegurarte de que esos recursos se liberen adecuadamente.
•	Evita simplemente imprimir un mensaje de error y seguir adelante sin manejar la excepción de manera adecuada. Asegúrate de registrar, informar o manejar adecuadamente todas las excepciones.
•	Documenta claramente las excepciones que puede lanzar un método, incluyendo las excepciones predefinidas y cualquier excepción personalizada. Esto ayuda a los usuarios de tu código a entender cómo manejarlas correctamente.

Beneficios del manejo de Excepciones en Java
El manejo de excepciones proporciona varios beneficios, a continuación, te presentamos algunos de ellos:
        •	Separa la lógica de manejo de errores del código principal, mejorando la legibilidad y manteniendo un código más limpio y organizado. El código que maneja errores se concentra en bloques catch, lo que facilita la identificación y comprensión de cómo se manejan las excepciones.
•	Proporcionan un mecanismo para comunicar detalles específicos sobre el error, incluyendo mensajes descriptivos, ubicaciones y causas. Esto facilita la identificación y resolución de problemas, tanto para los desarrolladores como para los usuarios finales.
        •	Se mejora la escalabilidad y el mantenimiento del código. Una jerarquía de excepciones bien definida y documentada facilita la adición de nuevas excepciones para casos específicos y simplifica el mantenimiento del código existente.
        •	Contribuye a diseñar aplicaciones seguras y eficientes al permitir una respuesta controlada a situaciones excepcionales, evitando posibles fugas de recursos y garantizando una adecuada limpieza de los recursos utilizados.



Conclusiones
La Programación Orientada a Objetos proporciona una representación organizada y estructurada de objetos, y las excepciones son herramientas esenciales para manejar situaciones inesperadas o errores que pueden surgir durante la ejecución de un programa.
Las excepciones son importantes en la construcción de programas robustos y confiables, permiten un manejo estructurado de errores, mejoran la robustez y confiabilidad de las aplicaciones, brindan retroalimentación útil al usuario y fomentan la flexibilidad y adaptabilidad en el comportamiento de la aplicación.
La creación de excepciones personalizadas, permite representar situaciones excepcionales específicas en la aplicación. Presentamos cómo crear y lanzar excepciones personalizadas, y cuándo es útil hacerlo para comunicar detalles precisos sobre los errores.

