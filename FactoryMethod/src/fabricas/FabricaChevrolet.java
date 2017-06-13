package fabricas;

import carros.Carro;
import carros.Celta;

public class FabricaChevrolet implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		return new Celta();
	}

}
