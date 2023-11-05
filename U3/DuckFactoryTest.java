import DuckFactory.*;

public class DuckFactoryTest {
	public static void main(String args[]) {
		DuckFactoryProduce producer = new DuckFactoryProduce(new DuckFactory());

		Duck duck = producer.newDuck("wild");
		int meatWeight = duck.carve();
		assert meatWeight > 0;

		meatWeight = duck.carve();
		assert meatWeight == 0;

		duck = producer.newDuck("lure");
		duck.lure();

		duck = producer.newDuck("rubber");
		duck.frolick();
	}
}
