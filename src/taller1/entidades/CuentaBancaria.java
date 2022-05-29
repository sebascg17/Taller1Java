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
public class CuentaBancaria {
    
    //Declaración de variables
    private int accountNumber;
    protected boolean activated;

    //Constructor
    public CuentaBancaria(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    //Obtener variable activado
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    //Establecer variable activado
    public boolean isActivated() {
        return activated;
    }

    //Obtener Numero de cuenta
    public int getAccountNumber() {
        return accountNumber;
    }

    //Establecer Numero de cuenta
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    
    
}
