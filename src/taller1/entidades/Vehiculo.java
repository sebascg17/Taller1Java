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
public class Vehiculo {
    protected String licensePlate;
    public String mark;
    public String line;
    private String transmitionType;

    public Vehiculo(String licensePlate, String mark, String line, String transmitionType) {
        this.licensePlate = licensePlate;
        this.mark = mark;
        this.line = line;
        this.transmitionType = transmitionType;
    }

    //Obtener Placa
    public String getLicensePlate() {
        return licensePlate;
    }

    //Establecer Placa
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    //Obtener Marca
    public String getMark() {
        return mark;
    }

    //Establecer Marca
    public void setMark(String mark) {
        this.mark = mark;
    }

    //Obtener Linea
    public String getLine() {
        return line;
    }

    //Establecer Linea
    public void setLine(String line) {
        this.line = line;
    }

    //Obtener Tipo de transmisión
    public String getTransmitionType() {
        return transmitionType;
    }

    //Establecer Tipo de transmisión
    public void setTransmitionType(String transmitionType) {
        this.transmitionType = transmitionType;
    }
    
    
    
}
