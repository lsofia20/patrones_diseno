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
public class Entregado implements Estado {

    @Override
    public void ejecutarAccion() {
        JOptionPane.showMessageDialog(null, "Estado: Entregado.\n"+
                                      "El paquete ha sido entregado correctamente.");
    }
    
}
