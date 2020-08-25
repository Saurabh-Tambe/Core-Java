
public class Rectangle extends Shape implements Calculation {
	 private int width;
	 private int height;
	 
	 public Rectangle()
	 {
		 
	 }
		 

	public Rectangle( int width, int height) {
		super("Rectangle");
		this.width = width;
		this.height = height;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	@Override
	public double area() {
		
		return (width*height);
	}

	@Override
	public double perimeter() {
		
		return (2*(width+height));
	}

}
