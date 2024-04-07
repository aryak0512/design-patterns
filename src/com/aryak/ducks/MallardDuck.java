package com.aryak.ducks;

import com.aryak.behaviors.fly.FlyWithWings;
import com.aryak.behaviors.quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}

	@Override
	public void display() {


		
	}

}
