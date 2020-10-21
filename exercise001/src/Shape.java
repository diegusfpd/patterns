
public abstract class Shape {
	public String color;
	public Point point;

	public void setColor(String color) {
		this.color = color;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public abstract double  area(); 
		

	public String getColor() {
		return color;
	}
}
