package fabricas;

import carros.Carro;
import carros.Gol;

public class FabricaWolks implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		return new Gol();
	}

}
