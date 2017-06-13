/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

import carros.Carro;
import fabricas.FabricaChevrolet;
import fabricas.FabricaDeCarro;
import fabricas.FabricaFiat;
import fabricas.FabricaFord;
import fabricas.FabricaWolks;

/**
 *
 * @author Rafael
 */
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaDeCarro fabrica = new FabricaFiat();
        Carro carro = fabrica.criarCarro();
        carro.exibirInfo();
        System.out.println();

        fabrica = new FabricaWolks();
        carro = fabrica.criarCarro();
        carro.exibirInfo();
        System.out.println();

        fabrica = new FabricaFord();
        carro = fabrica.criarCarro();
        carro.exibirInfo();
        System.out.println();

        fabrica = new FabricaChevrolet();
        carro = fabrica.criarCarro();
        carro.exibirInfo();
    }

}
