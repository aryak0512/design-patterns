package com.aryak.ducks;

import com.aryak.behaviors.fly.FlyBehaviour;
import com.aryak.behaviors.quack.QuackBehaviour;

public abstract class Duck {

	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;

	public abstract void display();

	public void performQuack() {
		quackBehaviour.quack();
	}

	public void performFly() {
		flyBehaviour.fly();
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}

	public void setFlyBehavior(FlyBehaviour fb) {
		flyBehaviour = fb;
	}

	public void setQuackBehavior(QuackBehaviour qb) {
		quackBehaviour = qb;
	}
}
