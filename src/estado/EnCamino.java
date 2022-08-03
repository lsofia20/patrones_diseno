/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estado;

import javax.swing.JOptionPane;

/**
 *
 * @author lsofi
 */
public class EnCamino implements Estado {

    @Override
    public void ejecutarAccion() {
        JOptionPane.showMessageDialog(null, "Estado: En camino.\n"+
                                      "El paquete ha sido enviado y esta en espera de entregarse.");
    }
    
}
