abstract class Shape {
	abstract void numberOfSides();
}

class Rectangle extends Shape {
	void numberOfSides(){
		System.out.println("Number of sides in Rectangle is 4");
	}
}

class Triangle extends Shape {
	void numberOfSides(){
		System.out.println("Number of sides in Triangle is 3");
	}
}

class Hexagon extends Shape {
	void numberOfSides(){
		System.out.println("Number of sides in Hexagon is 6");
	}
}

class AbstractBaseDemo {
	
	public static void main( String args[] ) {
		Rectangle rect = new Rectangle();
		Triangle  tri  = new Triangle();
		Hexagon   hexa = new Hexagon();

		rect.numberOfSides();
		tri.numberOfSides();
		hexa.numberOfSides();
	}
}
