package java_training;
import food.*;
import beberage.*;

public class Fruit{
	public static void main(String [] args){
//		Soda x = new food.Soda();
		Soda y = new beberage.Soda();
		
		System.out.println("Son iguales?? "/*+ x.equals(y)*/);
		System.out.println("Son la misma clase?? "/*+ x instanceof y*/);
	}
}
