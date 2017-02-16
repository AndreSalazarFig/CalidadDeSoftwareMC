package com.example.electronica63.areadeuntriangulo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import Clases.*;

public class Principal extends AppCompatActivity {

    TextView jTextLadoA; // Se declaran objetos de tipo TextView
    TextView jTextLadoB; // Se declaran objetos de tipo TextView
    TextView jTextLadoC; // Se declaran objetos de tipo TextView
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        jTextLadoA = (TextView) findViewById(R.id.jTextValorA); // Se instancia un objeto TextView
        jTextLadoB = (TextView) findViewById(R.id.jTextValorB); // Se instancia un objeto TextView
        jTextLadoC = (TextView) findViewById(R.id.jTextValorC); // Se instancia un objeto TextView
        Button jButtonCalcular = (Button) findViewById(R.id.jButtonCalcular); // Se instancia un objeto Button
        // Se crea un evento para el botón y se realice un método creado
        jButtonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RealizarAccion(); // Se referencía al método a usar
            }
        });
    }

    // Se declara el método a utilizar por el botón de la interfaz
    private void RealizarAccion() {
        TestTriangulo oTest = new TestTriangulo(); // Instanciación de un objeto TestTriangulo
        Tecladin oTecla = new Tecladin(); // Instanciación de un objeto Tecladin
        // Se crea una condicional para saber si tienen valores los TextView
        if(!jTextLadoA.getText().equals("") && !jTextLadoB.getText().equals("") && !jTextLadoC.getText().equals("")) {

            // Asignación de valores
            oTest.setLadoA(Float.parseFloat(jTextLadoA.getText().toString()));
            oTest.setLadoB(Float.parseFloat(jTextLadoB.getText().toString()));
            oTest.setLadoC(Float.parseFloat(jTextLadoC.getText().toString()));

            // Se crea una condicional para saber si la longitud de los lados forman o son parte del triángulo
            if (oTecla.ValidarTriangulo(oTest)) {
                oTest.CalcularFuncionS(); // Calcula la función de S
                String strCadena = "El área del triángulo es: " + String.valueOf(oTest.CalcularArea()); // Creación de mensaje con el resultado de la operación
                Toast.makeText(this, strCadena, Toast.LENGTH_SHORT).show(); // Mostrar mensaje
            }
            else {
                Toast.makeText(this, "Las longitudes de los lados no le corresponden a un triángulo", Toast.LENGTH_SHORT).show(); // Mostrar mensaje si no es un triángulo
            }
        } // Fin de la condicional
    } // Fin del método

}
