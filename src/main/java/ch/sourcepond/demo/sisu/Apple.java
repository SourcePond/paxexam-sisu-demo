package ch.sourcepond.demo.sisu;

import javax.inject.Named;

/**
 *
 */
@Named("apple")
public class Apple implements Fruit {

	public String getName() {
		return "apple";
	}
}
