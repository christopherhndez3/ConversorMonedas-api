/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author chris
 */
@Stateless


public class convertidorBean implements convertidorBeanLocal {
      
      @Override   
      public double convertirClpADolar(double valorDolar, double monto){
          double conversion_hecha = (monto / valorDolar);
      return conversion_hecha;
      }
       
      @Override
      public double convertirClpAEuro(double valorEuro, double monto){
          double conversion_hecha = (monto / valorEuro);
      return conversion_hecha;
      }
      
      @Override
      public double convertirDolarAClp (double valorDolar, double monto){
          double conversion_hecha = (monto * valorDolar);
      return conversion_hecha;
      }
      
      @Override
      public double convertirDolarAEuro(double valorEuro, double monto, double valorDolar){
        double a;
          a = (monto * valorDolar);
         double conversion_hecha = ( a / valorEuro);
         return conversion_hecha;
      }
            
      @Override
      public double convertirEuroAClp(double valorEuro, double monto){
          double conversion_hecha = (monto * valorEuro);
      return conversion_hecha;
      }
      
      @Override
      public double convertirEuroADolar(double valorEuro, double monto, double valorDolar){
       double b;
          b = (monto * valorEuro);
         double conversion_hecha = ( b / valorDolar);
         return conversion_hecha;
      }
// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
