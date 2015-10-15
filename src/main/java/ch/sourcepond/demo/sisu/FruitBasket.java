package ch.sourcepond.demo.sisu;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 */
@Named
public class FruitBasket {
	@Inject
	private List<Fruit> fruits;

	public List<Fruit> getFruits() {
		return fruits;
	}
}
