package DuckFactory;
import DuckFactory.*;

public class DuckFactory {
	public DuckFactory() {
		/* noop */
	}

	public Duck produce(String duckType) {
		// or use duckType.equals("wild")
		switch (duckType) {
		case "wild":
			return new WildDuck();
		case "lure":
			return new LureDuck();
		case "rubber":
			return new RubberDuck();
		default:
			throw new IllegalArgumentException("I can produce only wild, lure and rubber ducks");
		}

	}
}
