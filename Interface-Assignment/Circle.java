
public class Circle extends Shape implements Calculation {
	 private int radius;
	 
	 public Circle()
	 {
		 
	 }
		public Circle(int radius) {
		super("Circle");
		this.radius = radius;
	}
		public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		
		return (3.14*radius*radius);
	}

	@Override
	public double perimeter() {
		
		return (2*3.14*radius);
	}

}
