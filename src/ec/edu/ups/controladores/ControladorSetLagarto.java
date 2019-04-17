/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Ballena;
import ec.edu.ups.clases.Lagarto;
import ec.edu.ups.clases.Perro;
import ec.edu.ups.clases.Serpiente;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Domenica Cañizares
 */
public class ControladorSetLagarto {
    private Set<Lagarto> lista;

    public ControladorSetLagarto() {
        lista = new HashSet<>();
    }
    
    public void create(Lagarto objeto){
        lista.add(objeto);
    }
            
    public Lagarto read(int codigo){
        for (Lagarto ballena : lista) {
            if (ballena.getCodigo() == codigo) {
                return ballena;
            }
        }
        return null;
    }
    
    public void update(Lagarto objeto){
        for (int i = 0; i < lista.size(); i++) {
            Lagarto elemento = new Lagarto();
            if (elemento.equals(objeto)) {
                
                break;
            }

        }
    }
    
    public void delete(Lagarto objeto){
        for (int i = 0; i < lista.size(); i++) {
            Lagarto elemento = new Lagarto();
            if (elemento.equals(objeto)) {
                lista.remove(objeto);
                break;
            }
        }
    }
    
    /*public void set() {
        Lagarto lag = new Lagarto();
        lag.setCodigo(1);
        lag.setNombre(null);
        Lagarto lag1 = new Lagarto();
        lag1.setCodigo(2);
        lag1.setNombre("Juancho");
          
    }*/
    
}
