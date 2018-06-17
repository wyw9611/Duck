package test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import model.FlyNoWay;
import model.FlyWithRocket;
import model.FlyWithWings;
import model.MallardDuck;
import model.MuteQuack;
import model.Quack;
import model.RedheadDuck;
import model.RubberDuck;
import model.Squeak;

public class DuckTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		Quack quack=new Quack();
		Squeak squack=new Squeak();
		MuteQuack mutequack=new MuteQuack();
		
		FlyWithWings flyWithWings=new FlyWithWings ();
		FlyWithRocket flyWithRocket=new FlyWithRocket ();
		FlyNoWay flyNoWay=new FlyNoWay ();
		
		MallardDuck mallardduck=new MallardDuck(quack,flyWithWings);
		RedheadDuck redheadduck=new RedheadDuck(squack,flyWithRocket);
		RubberDuck rubberduck=new RubberDuck(mutequack,flyNoWay);
		
		mallardduck.display();
		redheadduck.display();
		rubberduck.display();
		
	}

}
