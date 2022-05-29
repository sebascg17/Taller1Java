/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1.entidades;

import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class Fruta {

    //Declaración de variables
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

    //Constructor
    public Fruta(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    //Obtener Color
    public ArrayList<String> getColors() {
        return colors;
    } 
    
    //Establecer Color
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    //Obtener Nombre
    public String getName() {
        return name;
    }

    //Establecer Nombre
    public void setName(String name) {
        this.name = name;
    }

    //Obtener Promedio de peso
    public float getAverageWeight() {
        return averageWeight;
    }

    //Establecer Promedio de peso
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    
    
    
    
}
