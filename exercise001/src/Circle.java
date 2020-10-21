
public class Circle extends Shape{
	private double radius;
	private String color;
	public Circle(String color,double radius) {
		this.color=color;
		this.radius=radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	};
	@Override
	public double area() {
		return 3 * radius * radius;
	}
}
