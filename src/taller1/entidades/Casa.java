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
public class Casa {
    
    //Declaración de variables
    public String address;
    public String postalCode;
    public String aditionalInformation;
    private int nPersonas;
    protected int nHabitaciones;

    //Constructor
    public Casa(String address, String postalCode, String aditionalInformation, int nPersonas, int nHabitaciones) {
        this.address = address;
        this.postalCode = postalCode;
        this.aditionalInformation = aditionalInformation;
        this.nPersonas = nPersonas;
        this.nHabitaciones = nHabitaciones;
    }

    //Obtener Direccion
    public String getAddress() {
        return address;
    }

    //Establecer Direccion
    public void setAddress(String address) {
        this.address = address;
    }

    //Obtener codigo postal
    public String getPostalCode() {
        return postalCode;
    }

    //Establecer codigo postal
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    //Obtener informacion adicional
    public String getAditionalInformation() {
        return aditionalInformation;
    }

    //Establecer informacion adicional
    public void setAditionalInformation(String aditionalInformation) {
        this.aditionalInformation = aditionalInformation;
    }

    //Obtener numero de personas
    public int getnPersonas() {
        return nPersonas;
    }

    //Establecer numero de personas
    public void setnPersonas(int nPersonas) {
        this.nPersonas = nPersonas;
    }

    //Obtener habitaciones
    public int getnHabitaciones() {
        return nHabitaciones;
    }

    //Establecer habitaciones
    public void setnHabitaciones(int nHabitaciones) {
        this.nHabitaciones = nHabitaciones;
    }
    
    
    
    
    
    
    
}
