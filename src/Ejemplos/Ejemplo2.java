package Ejemplos;

public class Ejemplo2 {

        // Función para la cual queremos encontrar la raíz
        static double funcion(double x) {
            return Math.pow(x, 3) + 4 * Math.pow(x, 2) - 10;
        }

        // Derivada de la función
        static double derivada(double x) {
            return 3 * Math.pow(x, 2) + 8 * x;
        }

        // Método Newton-Raphson para encontrar la raíz
        static double newtonRaphson(double x0, int iteraciones) {
            double x = x0;

            for (int i = 0; i < iteraciones; i++) {
                // Aplicar la fórmula de Newton-Raphson
                x = x - funcion(x) / derivada(x);
            }

            return x;
        }

        public static void main(String[] args) {
            // Valor inicial
            double x0 = 1.0;

            // Número de iteraciones
            int iteraciones = 5;

            // Encontrar la raíz utilizando el método Newton-Raphson
            double raiz = newtonRaphson(x0, iteraciones);

            System.out.println("La raíz aproximada es: " + raiz);
        }
    }


