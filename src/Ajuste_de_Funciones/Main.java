package Ajuste_de_Funciones;

public class Main {
    public static void main(String[] args) {
        // definimos un conjunto de datos de prueba para validar que el modelo matematico y la salida en consola sean correctos
        double[] x = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] y = {2.0, 3.0, 5.0, 7.0, 8.0};

        // ejecutamos el calculo de minimos cuadrados, pearson y coeficiente de determinacion
        double[] resultados = RegresionLineal.calcularMinimosCuadrados(x, y);

        // extraemos los coeficientes del modelo lineal obtenido
        double beta0 = resultados[0];
        double beta1 = resultados[1];

        // definimos un valor de prueba para verificar la rutina de prediccion
        double xEstimacion = 6.0;
        double yEstimada = RegresionLineal.predecir(beta0, beta1, xEstimacion);

        // mostramos en consola la estimacion obtenida con el modelo ajustado
        System.out.println("\n--- ESTIMACION DE PRUEBA ---");
        System.out.printf("Para un valor de X = %.2f, el modelo predice Y = %.4f%n", xEstimacion, yEstimada);
    }
}