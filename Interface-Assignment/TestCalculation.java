
public class TestCalculation {

	public static void main(String[] args) {
  
		Circle circle=new Circle(12);
		System.out.println("Area of circle is:"+circle.area());
		System.out.println("Perimeter of circle is:"+circle.perimeter());
		
		System.out.println("   ");
		Square square=new Square(12);
		System.out.println("Area of square is:"+square.area());
		System.out.println("Perimeter of square is:"+square.perimeter());
		
		System.out.println("   ");

		Rectangle rectangle=new Rectangle(5,6);
		System.out.println("Area of rectangle is:"+rectangle.area());
		System.out.println("Perimeter of rectangle is:"+rectangle.perimeter());
		

	}

}
