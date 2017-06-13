package fabricas;

import carros.Carro;
import carros.Fiesta;

public class FabricaFord implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		return new Fiesta();
	}

}
