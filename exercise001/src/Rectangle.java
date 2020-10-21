
public class Rectangle extends Shape {
	
	public double height;
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWidth(double width) {
		this.width = width;
	}

	public double width;
	public Rectangle(String color,double height, double width) {
		this.height=height;
		this.width=width;
		this.color=color;
	};
	@Override
	public double area() {
		return height * width;
	}
	public double getHeigth() {		
		return height;
	};

	public double getWidth() {
		return width;
	};
}
