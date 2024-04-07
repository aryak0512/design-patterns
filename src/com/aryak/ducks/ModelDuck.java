package com.aryak.ducks;

import com.aryak.behaviors.fly.FlyNoWay;
import com.aryak.behaviors.quack.Quack;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new Quack();
	}

	public void display() {
		System.out.println("I’m a model duck");
	}
}