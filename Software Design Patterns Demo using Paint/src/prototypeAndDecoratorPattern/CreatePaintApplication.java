package prototypeAndDecoratorPattern;

import java.util.Scanner;

import StrategyPattern.Context;
import StrategyPattern.InorderStrategy;
import StrategyPattern.ReverseStrategy;

public class CreatePaintApplication
{
	public static void main(String[] args) 
	{
		boolean exit = false;
		do
		{
		System.out.println("\n\nDifferent Canvas patterns:\n");
		System.out.println(" 1.LightCanvas\n "
				+ "2.Reverse LightCanvas\n "
				+ "3.LightCanvasWithDarkFooter\n "
				+ "4.Reverse LightCanvasWithDarkFooter\n "
				+ "5.DarkCanvas\n "
				+ "6.Reverse DarkCanvas\n "
				+ "7.DarkCanvasWithLightFooter\n "
				+ "8.Reverse DarkCanvasWithLightFooter\n "
				+ "9.Exit Creating Paint Application");
		Scanner s = new Scanner(System.in);
		System.out.println("Choose the required Canvas pattern:\n\n");
		int pattern=s.nextInt();
		switch(pattern) 
		{
		case 1:
		{	
			
			PaintApplication lightPaintApp=new LightPaintApp((LightPaintAppDecorator) PaintAppDecoratorStore.getPaintAppDecorator("LightPaintAppDecorator"));	
			Context context = new Context(new InorderStrategy());	
			context.executeStrategy(lightPaintApp);
			break;
		} 
		  
		case 2:
		{
			PaintApplication lightPaintApp=new LightPaintApp((LightPaintAppDecorator) PaintAppDecoratorStore.getPaintAppDecorator("LightPaintAppDecorator"));		
			Context context=new Context(new ReverseStrategy());
			context.executeStrategy(lightPaintApp);			
			break;
		}
		case 3:
		{
			PaintApplication lightPaintAppWithDarkFooter=new LightPaintAppWithDarkFooter((LightPaintAppDecorator) PaintAppDecoratorStore.getPaintAppDecorator("LightPaintAppDecorator"));		
			Context context = new Context(new InorderStrategy());	
			context.executeStrategy(lightPaintAppWithDarkFooter);			  
			break;
		} 
		case 4:
		{
			PaintApplication lightPaintAppWithDarkFooter=new LightPaintAppWithDarkFooter((LightPaintAppDecorator) PaintAppDecoratorStore.getPaintAppDecorator("LightPaintAppDecorator"));		
			Context context = new Context(new ReverseStrategy());	
			context.executeStrategy(lightPaintAppWithDarkFooter);			  
			break;
		} 
		case 5:
		{
			PaintApplication darkPaintApp=new DarkPaintApp((DarkPaintAppDecorator) PaintAppDecoratorStore.getPaintAppDecorator("DarkPaintAppDecorator"));		
			Context context = new Context(new InorderStrategy());	
			context.executeStrategy(darkPaintApp);			  
			break;		
		} 
		case 6:
		{
			PaintApplication darkPaintApp=new DarkPaintApp((DarkPaintAppDecorator) PaintAppDecoratorStore.getPaintAppDecorator("DarkPaintAppDecorator"));		
			Context context = new Context(new ReverseStrategy());	
			context.executeStrategy(darkPaintApp);			  
			break;		
		} 		
		case 7:
		{
			PaintApplication darkPaintAppWithLightFooter=new DarkPaintAppWithLightFooter((DarkPaintAppDecorator) PaintAppDecoratorStore.getPaintAppDecorator("DarkPaintAppDecorator"));		
			Context context = new Context(new InorderStrategy());	
			context.executeStrategy(darkPaintAppWithLightFooter);			  
			break;
		} 
		case 8:
		{
			PaintApplication darkPaintAppWithLightFooter=new DarkPaintAppWithLightFooter((DarkPaintAppDecorator) PaintAppDecoratorStore.getPaintAppDecorator("DarkPaintAppDecorator"));		
			Context context = new Context(new ReverseStrategy());	
			context.executeStrategy(darkPaintAppWithLightFooter);			
		}
		case 9:
			exit=true;
			System.out.println("Exiting the Create Paint Application");
			s.close();
		}
		}
		while(!exit);
	}
}