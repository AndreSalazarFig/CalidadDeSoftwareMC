package Clases;

/**
 * Created by Luis Puc on 15/02/2017.
 */

public class TestTriangulo extends Triangulo{

    private float funcionS ;//Declaracionn del atributo funcionS del triangulo
    private  float areaTriangulo;// Declaracion del atributo area del Triangulo

    // Metodo para calcular la funcionS
    public void CalcularFuncionS() {

        float ladoA = getLadoA(); // Obtención del lado A del triángulo
        float ladoB = getLadoB(); // Obtención del lado B del triángulo
        float ladoC = getLadoC(); // Obtención del lado C del triángulo
        this.funcionS = (ladoA + ladoB + ladoC)/2; // Calculo de la funcionS

    }//Fin del metodo para calcular la funcionS

    //Metodo para calcular el area del triangulo
    public  float CalcularArea (){
        float ladoA = getLadoA(); // Obtención del lado A del triángulo
        float ladoB = getLadoB(); // Obtención del lado B del triángulo
        float ladoC = getLadoC(); // Obtención del lado C del triángulo
        this.areaTriangulo = (float) Math.sqrt(funcionS*(funcionS-ladoA)*(funcionS-ladoB)*(funcionS-ladoC)); //Calculo del area del triangulo en funcion a la variable funcionS
        return  this.areaTriangulo;
    }//fin del metodo para calcular el area del triangulo
}
