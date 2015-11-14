/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miappwin2;

import co.com.uniminuto.library.MiNegocioWS;
import co.com.uniminuto.library.MiNegocioWS_Service;

/**
 *
 * @author Administrador
 */
public class MiAppWin2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MiNegocioWS_Service servicio = new MiNegocioWS_Service();
        MiNegocioWS interfaceWS = servicio.getMiNegocioWSPort();
        System.out.println( interfaceWS.calculaDescuento(35000, 500));
    }
    
}
