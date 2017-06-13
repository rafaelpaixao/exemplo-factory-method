/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import carros.Carro;
import carros.Celta;
import carros.Fiesta;
import carros.Gol;
import carros.Palio;

/**
 *
 * @author Rafael
 */
public class FabricaDeTodosOsCarros {
    
    public Carro criarCarro(String modelo) {
        switch (modelo) {
            case "celta":
                return new Celta();
            case "fiesta":
                return new Fiesta();
            case "gol":
                return new Gol();
            case "palio":
                return new Palio();
            default:
                break;
        }
        return null;
    }
}
