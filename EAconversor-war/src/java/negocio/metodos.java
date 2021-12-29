/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
*/


package negocio;

import controlador.calcularServlet;

/**
 *
 * @author chris
 */



public class metodos {
   private double monto;
   private double conversion_hecha;
   private double valorDolar;
   private double valorEuro;
   private String urlDestino;
   private boolean aceptable;
   
   
   
   public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public double getConversion_hecha() {
        return conversion_hecha;
    }

    public void setConversion_hecha(double conversion_hecha) {
        this.conversion_hecha = conversion_hecha;
    }

    public double getValorDolar() {
        return valorDolar;
    }

    public void setValorDolar(double valorDolar) {
        this.valorDolar = valorDolar;
    }

    public double getValorEuro() {
        return valorEuro;
    }

    public void setValorEuro(double valorEuro) {
        this.valorEuro = valorEuro;
    }

    public String getUrlDestino() {
        return urlDestino;
    }

    public void setUrlDestino(String urlDestino) {
        this.urlDestino = urlDestino;
    }

    public boolean isAceptable() {
        return aceptable;
    }

    public void setAceptable(boolean aceptable) {
        this.aceptable = aceptable;
    }
    
    
}
