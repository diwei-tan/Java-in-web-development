package Worshops;
import java.util.ArrayList;
import java.util.List;

public class GenericsWshop {
    public static void main(String[] args) {
    	// exercise 1: add 3 different fruits into the "fruits" List
    	// and use addFruit1() to display the list
    	List<Fruit> fruits = new ArrayList<>();
    	Apple a1 = new Apple();
    	Orange o1 = new Orange();
    	Banana b1 = new Banana();
    	fruits.add(a1);
    	fruits.add(o1);
    	fruits.add(b1);
    	addFruit1(fruits);
    	
    	// exercise 2: add a fruit into each of the 3 lists below
    	// create addFruit2() such that it can display all the 3 lists below.
    	List<Apple> apples = new ArrayList<>();  	
    	List<Orange> oranges = new ArrayList<>();
    	List<Banana> bananas = new ArrayList<>();
    	apples.add(a1);
    	oranges.add(o1);
    	bananas.add(b1);
    	addFruit2(apples);
    	addFruit2(oranges);
    	addFruit2(bananas);
    	addFruit2(fruits);
    }
    
    public static void addFruit1(List<Fruit> fruits) {
    	System.out.println("\n*** addFruit1 ***");
    	
    	for (Fruit fruit: fruits)
    		System.out.println(fruit);
    }
    
    // define your addFruit2 static function here...
    // your implementation can be exactly the same
    // as in addFruit1()
    public static <T extends Fruit> void addFruit2(List<T> fruits) {
    	System.out.println("\n*** addFruit2 ***");
    	for(Fruit fruit : fruits) {
    		System.out.println(fruit);
    	}
    }
}

abstract class Fruit {
	protected int id;
	
	public Fruit() {		
	}
}

class Apple extends Fruit {
	private static int runId = 1;	
	
	public Apple() {
		id = runId;
		Apple.runId++;		
	}
	
	public String toString() {
		return "Apple" + id;
	}
}

class Orange extends Fruit {
	private static int runId = 1;	
	
	public Orange() {
		id = runId;
		Orange.runId++;		
	}
	
	public String toString() {
		return "Orange" + id;
	}	
}

class Banana extends Fruit {
	private static int runId = 1;
	
	public Banana() {
		id = runId;
		Banana.runId++;
	}
	
	public String toString() {
		return "Banana" + id;
	}
}