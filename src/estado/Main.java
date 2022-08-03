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
public class Main {
    public static void main(String[] args){
        Paquete paquete= new Paquete();
        SinEnviar sinEnviar = new SinEnviar();
        EnCamino enCamino = new EnCamino();
        Entregado entregado = new Entregado();
        
        int opcion;
        String x;
        do
        {
        x=JOptionPane.showInputDialog("====Seleccione una opción=====\n"+
                                      "1. Cambiar estado a: Sin enviar\n"+
                                      "2. Cambiar estado a: En camino\n"+
                                      "3. Cambiar estado a: Entregado\n"+
                                      "0. Salir");
        
        opcion=Integer.parseInt(x);
        
        switch (opcion)
        {
            case 1:
                paquete.setEstado(sinEnviar);
            break;
            case 2:
                paquete.setEstado(enCamino);
            break; 
            case 3:
                paquete.setEstado(entregado);
            break;
            case 4:
                paquete.getMiEstado();
            break;
            case 0:
                JOptionPane.showMessageDialog(null, "Saliendo");
            break;
            default:
                JOptionPane.showMessageDialog(null, "Esa opcion no existe");
            break;  
        }
        paquete.ejecutarAccion();
        }
        while(opcion!=0);
    }
}
