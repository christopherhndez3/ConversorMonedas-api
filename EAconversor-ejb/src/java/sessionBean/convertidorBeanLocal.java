/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBean;

import javax.ejb.Local;

/**
 *
 * @author chris
 */
@Local
public interface convertidorBeanLocal {

    public double convertirDolarAEuro(double valorEuro, double monto, double valorDolar);

    public double convertirEuroAClp(double valorEuro, double monto);

    public double convertirEuroADolar(double valorEuro, double monto, double valorDolar);

    public double convertirClpADolar(double valorDolar, double monto);

    public double convertirClpAEuro(double valorEuro, double monto);

    public double convertirDolarAClp(double valorDolar, double monto);
    
}
