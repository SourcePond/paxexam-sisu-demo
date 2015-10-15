package ch.sourcepond.demo.sisu;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ops4j.pax.exam.junit.PaxExam;

/**
 *
 */
@RunWith(PaxExam.class)
public class FruitBasketTest {
	@Inject
	private FruitBasket basket;

	/**
	 * 
	 */
	@Test
	public void getFruits() {
		final List<Fruit> fruits = basket.getFruits();
		assertEquals(3, fruits.size());
	}
}
