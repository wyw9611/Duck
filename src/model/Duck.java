package model;

public abstract class Duck {
	
	QuackBehavior quackBehavior;

	FlyBehavior flyBehavior;
	
	public Duck(QuackBehavior quackBehavior,FlyBehavior flyBehavior){
		this.quackBehavior=quackBehavior;
		this.flyBehavior=flyBehavior;
	}
	
	public void swim(){
		System.out.println("I can swim!");
	}
	
	public void display(){

	}
	
	public void performQuack(){
		quackBehavior.performQuack();
	}
	
	public void performFly(){
		flyBehavior.performFly();
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior){
		this.quackBehavior=quackBehavior;
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior){
		this.flyBehavior=flyBehavior;
	}
}
