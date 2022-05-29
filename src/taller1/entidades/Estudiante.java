/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1.entidades;

/**
 *
 * @author sebas
 */
public class Estudiante {
    
    //Declaracion de variables
    protected int id;
    public String name;
    private float grade;
    public float average;
    public int level;

    //Constructor
    public Estudiante(int id, String name, float grade, float average, int level) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.average = average;
        this.level = level;
    }

    //Obtener Cedula
    public int getId() {
        return id;
    }

    //Establecer Cedula
    public void setId(int id) {
        this.id = id;
    }

    //Obtener Nombre
    public String getName() {
        return name;
    }

    //Establecer Nombre
    public void setName(String name) {
        this.name = name;
    }

    //Obtener Notas
    public float getGrade() {
        return grade;
    }

    //Establecer Notas
    public void setGrade(float grade) {
        this.grade = grade;
    }

    //Obtener Promedio
    public float getAverage() {
        return average;
    }

    //Establecer Promedio
    public void setAverage(float average) {
        this.average = average;
    }

    //Obtener Nivel
    public int getLevel() {
        return level;
    }

    //Establecer Nivel
    public void setLevel(int level) {
        this.level = level;
    }

    
    
    
}
