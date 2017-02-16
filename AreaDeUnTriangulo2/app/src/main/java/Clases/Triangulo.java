package Clases;

/**
 * Created by Luis Puc on 15/02/2017.
 */

public class Triangulo {
    private float ladoA; // Declaracion del atributo del primer lado del triangulo
    private float ladoB; // Declaracion del atributo del segundo lado del triangulo
    private float ladoC; //Declaracion del atributo del tercer lado del triangulo

    // Asignacion de valor al lado a por medio de un parametro
    public void setLadoA (float A){
        this.ladoA = A;
    }//Fin del metodo setLadoA

    // Obtener los datos de la variable lado a
    public float getLadoA(){
        return ladoA;
    }//Fin del metodo getLadoA

    // Asignacion de valor al lado b por medio de un parametro
    public void setLadoB (float B){
        this.ladoB = B;
    }//Fin del metodo setLadoB

    // Obtener los datos de la variable lado b
    public float getLadoB(){
        return ladoB;
    }//Fin del metodo getLadoB

    // Asignacion de valor al lado c por medio de un parametro
    public void setLadoC (float C){
        this.ladoC = C;
    }//Fin del metodo setLadoC

    // Obtener los datos de la variable lado c
    public float getLadoC(){
        return ladoC;
    }//Fin del metodo getLadoC
}
