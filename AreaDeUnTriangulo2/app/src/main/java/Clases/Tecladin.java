package Clases;

/**
 * Created by Yair Vega on 15/02/2017.
 */

public class Tecladin {

    // Metodo de validación de triangulo
    public boolean ValidarTriangulo(TestTriangulo Triangulo){
        float ladoA = Triangulo.getLadoA(); // Obtención del lado A del triángulo
        float ladoB = Triangulo.getLadoB(); // Obtención del lado B del triángulo
        float ladoC = Triangulo.getLadoC(); // Obtención del lado C del triángulo

        // si la suma de dos lados  es menor al valor del tercer lado, no es un triángulo
        if ((ladoA+ladoB) < ladoC || (ladoA+ladoC)< ladoB || (ladoB+ladoC)< ladoA) {
            return false; // Se retorna un valor falso
        }
        // Si no, si es un triángulo
        else {
            return true; // Se retorna un valor verdadero
        }
    } // Fin del método de validación

}
