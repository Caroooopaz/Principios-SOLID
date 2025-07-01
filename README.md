

// Clase que implementa la forma Rectángulo
class Rectangulo implements Forma {
    double ancho, alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double area() {
        return ancho * alto;
    }
}

// Clase que implementa la forma Círculo
class Circulo implements Forma {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
}

// Clase principal que calcula el área total de cualquier forma
public class LetraO {

    // Método que calcula el área total de un arreglo de formas
    public static double calcularAreaTotal(Forma[] formas) {
        double areaTotal = 0;
        for (Forma forma : formas) {
            areaTotal += forma.area();
        }
        return areaTotal;
    }

    public static void main(String[] args) {
        // Crear instancias de diferentes formas
        Forma rectangulo = new Rectangulo(4, 5);
        Forma circulo = new Circulo(3);

        // Calcular área total
        double total = calcularAreaTotal(new Forma[]{rectangulo, circulo});

        // Mostrar resultado
        System.out.println("Área total: " + total);
    }
}O – Open/Closed Principle (Principio Abierto/Cerrado)

Definición:
"Las entidades deben estar abiertas para extensión, pero cerradas para modificación." — Bertrand Meyer 

Esto significa que el comportamiento de una clase, módulo o función debe poder extenderse sin modificar su código fuente original .

Este principio promueve un diseño flexible y mantenible. Al seguirlo, puedes agregar nuevas funcionalidades sin alterar clases ya existentes, lo cual reduce el riesgo de introducir errores en código que ya funciona.

Ejemplo en Java: Usar interfaces o clases abstractas para evitar modificar código existente al agregar funcionalidad nueva.

// Interface que define el contrato para todas las formas
interface Forma {
    double area();
}

// Clase que implementa la forma Rectángulo
class Rectangulo implements Forma {
    double ancho, alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double area() {
        return ancho * alto;
    }
}

// Clase que implementa la forma Círculo
class Circulo implements Forma {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
}

// Clase principal que calcula el área total de cualquier forma
public class LetraO {

    // Método que calcula el área total de un arreglo de formas
    public static double calcularAreaTotal(Forma[] formas) {
        double areaTotal = 0;
        for (Forma forma : formas) {
            areaTotal += forma.area();
        }
        return areaTotal;
    }

    public static void main(String[] args) {
        // Crear instancias de diferentes formas
        Forma rectangulo = new Rectangulo(4, 5);
        Forma circulo = new Circulo(3);

        // Calcular área total
        double total = calcularAreaTotal(new Forma[]{rectangulo, circulo});

        // Mostrar resultado
        System.out.println("Área total: " + total);
    }
}
