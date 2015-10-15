package ch.sourcepond.demo.sisu;

import javax.inject.Named;

/**
 *
 */
@Named("pineapple")
public class Pineapple implements Fruit {

	public String getName() {
		return "pineapple";
	}

}
