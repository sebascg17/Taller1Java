/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1.entidades;

import java.util.Date;

/**
 *
 * @author sebas
 */
public class Persona {
    
    //Declaración de variables
    public String name;
    public String lastName;
    public String lastName2;
    public Date dateBirth;
    public float height;

    //Constructor
    public Persona(String name, String lastName, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName = lastName;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    //Obtener Nombre
    public String getName() {
        return name;
    }
    
    //Establecer Nombre
    public void setName(String name) {
        this.name = name;
    }    
    
    //Obtener Apellido
    public String getLastName() {
        return lastName;
    }

    //Establecer Apellido
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Obtener Apellido 2
    public String getLastName2() {
        return lastName2;
    }

    //Establecer Apellido 2
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    //Obtener Fecha de Cumpleaños
    public Date getDateBirth() {
        return dateBirth;
    }

    //Establecer Fecha de Cumpleaños
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    //Obtener Altura
    public float getHeight() {
        return height;
    }

    //Establecer Altura
    public void setHeight(float height) {
        this.height = height;
    }

    
    
    
    
    
}
