package DuckFactory;
import DuckFactory.*;

public class DuckFactoryProduce {
	private DuckFactory factory;

	public DuckFactoryProduce(DuckFactory factory) {
		this.factory = factory;
	}

	public Duck newDuck(String duckType) {
		return this.factory.produce(duckType);
	}
}
