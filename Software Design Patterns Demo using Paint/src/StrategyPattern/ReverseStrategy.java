package StrategyPattern;

import Commandpattern.CommandExecutor;
import Commandpattern.RedoCommand;
import Commandpattern.UndoCommand;
import compositeSingletonPattern.Canvas;
import compositeSingletonPattern.ShapeStore;
import compositeSingletonPattern.Window;
import prototypeAndDecoratorPattern.PaintApplication;

public class ReverseStrategy implements Strategy{

	@Override
	public void doOperation(PaintApplication canvas) {
		canvas.drawFooter();
		canvas.drawCanvas();
		Canvas canvas_shape=(Canvas) ShapeStore.getShape("Canvas");
		  ShapeStore.getShape("Canvas").drawShape();
		  canvas_shape.addShape(ShapeStore.getShape("Triangle"));
		  ShapeStore.getShape("Triangle").drawShape();
		  canvas_shape.addShape(ShapeStore.getShape("Circle"));
		  ShapeStore.getShape("Circle").drawShape();
		  Window w1=(Window) ShapeStore.getShape("OuterWindow");
		  canvas_shape.addShape(w1);
		  ShapeStore.getShape("OuterWindow").drawShape();
		  canvas_shape.addShape(ShapeStore.getShape("Square"));
		  ShapeStore.getShape("Square").drawShape();
		  CommandExecutor command=new CommandExecutor();
		  command.setCommand(new UndoCommand(canvas_shape));
		  command.executeCommand();
		  canvas_shape.addShape(ShapeStore.getShape("Triangle"));
		  ShapeStore.getShape("Triangle").drawShape();
		  command.executeCommand();
		  Window w2=(Window) ShapeStore.getShape("InnerWindow");
		  canvas_shape.addShape(w2);
		  ShapeStore.getShape("InnerWindow").drawShape();
		  command.executeCommand();
		  canvas_shape.addShape(ShapeStore.getShape("Circle"));
		  ShapeStore.getShape("Circle").drawShape();
		  command.executeCommand();
		  command.setCommand(new RedoCommand(canvas_shape));
		  command.executeCommand();
		canvas.drawHeader();
	}
}
