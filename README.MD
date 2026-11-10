# Práctica: Regresión Lineal por Mínimos Cuadrados y Correlación de Pearson

Este repositorio contiene la implementación en Java de un modelo de Regresión Lineal Simple ajustado por el método de Mínimos Cuadrados, complementado con el análisis estadístico del Coeficiente de Correlación de Pearson (r) y el Coeficiente de Determinación (r²).

El programa procesa las observaciones mediante una sola pasada secuencial para acumular las sumatorias necesarias, calcula analíticamente la pendiente (beta1) y la ordenada al origen (beta0), evalúa el grado de asociación y la bondad de ajuste del modelo, y proporciona una función para proyectar o predecir estimaciones con datos futuros.

---

## Estructura del Proyecto

El código fuente se encuentra organizado dentro del paquete Ajuste_de_Funciones:

    src/
    └── Ajuste_de_Funciones/
        ├── RegresionLineal.java  # Cálculo de coeficientes, Pearson, r2 y función de predicción
        └── Main.java             # Definición de observaciones de prueba y ejecución del modelo

---

## Requerimientos del Entorno

* Lenguaje: Java SE (JDK 21 o superior, desarrollado y verificado sobre OpenJDK 25.0.4).
* Entorno de Desarrollo (IDE): IntelliJ IDEA (versión 2026.2.3 o superior).
* Sistema Operativo: Multiplataforma (Windows, Linux, macOS).

---

## Guía de Ejecución Rápida

### Opción 1: Desde IntelliJ IDEA
1. Abrir la carpeta del proyecto en IntelliJ IDEA (File > Open...).
2. Verificar la asignación correcta del SDK en File > Project Structure > Project > SDK.
3. Localizar el archivo src/Ajuste_de_Funciones/Main.java en el árbol del proyecto.
4. Ejecutar el programa haciendo clic derecho sobre Main.java y seleccionando Run 'Main.main()' (o presionar Shift + F10).

### Opción 2: Desde la Terminal (Línea de Comandos)
1. Abrir la consola y situarse en la carpeta src del repositorio:
   cd ruta/al/proyecto/src

2. Compilar los archivos fuente del paquete:
   javac Ajuste_de_Funciones/*.java

3. Ejecutar la clase principal:
   java Ajuste_de_Funciones.Main

---

## Datos de Prueba y Salida en Consola

Para comprobar el ajuste del modelo y la precisión de los cálculos, se cargó un conjunto de prueba con 5 pares de datos y se realizó una estimación para X = 6.00:
* X = {1.0, 2.0, 3.0, 4.0, 5.0}
* Y = {2.0, 3.0, 5.0, 7.0, 8.0}

### Salida generada:

    --- RESULTADOS DE MINIMOS CUADRADOS Y CORRELACION ---
    Sumatorias: n=5, X=15.0, Y=25.0, X2=55.0, Y2=151.0, XY=91.0
    Pendiente (beta1): 1.6000
    Ordenada al origen (beta0): 0.2000
    Modelo obtenido: Y = 0.2000 + 1.6000X
    Coeficiente de Pearson (r): 0.9923
    Coeficiente de Determinacion (r2): 0.9846

    --- ESTIMACION DE PRUEBA ---
    Para un valor de X = 6.00, el modelo predice Y = 9.8000