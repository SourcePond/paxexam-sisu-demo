package ch.sourcepond.demo.sisu;

import javax.inject.Named;

/**
 *
 */
@Named("strawberry")
public class Strawberry implements Fruit {

	public String getName() {
		return "strawberry";
	}

}
