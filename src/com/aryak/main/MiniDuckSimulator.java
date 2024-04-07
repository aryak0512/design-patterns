package com.aryak.main;

import com.aryak.behaviors.fly.FlyRocketPowered;
import com.aryak.ducks.Duck;
import com.aryak.ducks.MallardDuck;
import com.aryak.ducks.ModelDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly(); 
	}
}