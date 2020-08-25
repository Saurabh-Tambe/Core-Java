
public class Square extends Shape implements Calculation {
	 private int side;
	 
	 public Square()
	 {
		 
	 }
		public Square(int side) {
		super("Square");
		this.side = side;
	}
		public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public double area() {
		
		return (side*side);
	}

	@Override
	public double perimeter() {
		
		return (4*side);
	}

}
