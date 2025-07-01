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