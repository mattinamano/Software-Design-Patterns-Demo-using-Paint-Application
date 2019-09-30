package StrategyPattern;

import prototypeAndDecoratorPattern.PaintApplication;

public class Context {

	private Strategy strategy;

	   public Context(Strategy strategy){
	      this.strategy = strategy;
	   }

	   public void executeStrategy(PaintApplication canvas){
	       strategy.doOperation(canvas);
	   }
}
