/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estado;

/**
 *
 * @author lsofi
 */
public class Paquete {
    private Estado miEstado;
    
    public void setEstado(Estado estado){
        this.miEstado = estado;
    }

    public Estado getMiEstado() {
        return miEstado;
    }
    
    public void ejecutarAccion(){
        miEstado.ejecutarAccion();
    }
}
