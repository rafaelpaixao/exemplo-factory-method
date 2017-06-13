/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

import carros.Carro;
import fabricas.FabricaDeTodosOsCarros;

/**
 *
 * @author Rafael
 */
public class Exemplo2 {
    public static void main(String[] args) {
        FabricaDeTodosOsCarros fabrica = new FabricaDeTodosOsCarros();
        
        Carro carro = fabrica.criarCarro("celta");
        carro.exibirInfo();
        System.out.println();

        carro = fabrica.criarCarro("fiesta");
        carro.exibirInfo();
        System.out.println();

        carro = fabrica.criarCarro("gol");
        carro.exibirInfo();
        System.out.println();

        carro = fabrica.criarCarro("palio");
        carro.exibirInfo();
    }
}
