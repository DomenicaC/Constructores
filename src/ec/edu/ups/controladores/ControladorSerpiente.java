/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Serpiente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Domenica Cañizares
 */
public class ControladorSerpiente {
    private List<Serpiente> lista;

    public ControladorSerpiente() {
        lista=new ArrayList<>();
    }
    
    public void create(Serpiente objeto){
        lista.add(objeto);
    }
    
    public Serpiente read(int codigo){
        for (Serpiente ballena : lista){
            if (ballena.getCodigo() == codigo){
                return ballena;
            }
        }
        return null;
    }
    
    public void update(Serpiente objeto){
        for (int i = 0; i < lista.size(); i++) {
            Serpiente elemento = new Serpiente();
            if(elemento.getCodigo() == objeto.getCodigo()){
                lista.set(i, elemento);
                break;
            }
            
        }
    }
    
    public void delete(int codigo){
        for (int i = 0; i < lista.size(); i++) {
            Serpiente elemento = lista.get(i);
            if(elemento.getCodigo() == codigo){
                lista.remove(i);
                break;
            }
        }
    }
}
