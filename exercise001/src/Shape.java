
public abstract class Shape {
	public String color;
	public Point point;

	public void setColor(String color) {
		this.color = color;
	}

	public abstract double  area(); 
		

	public String getColor() {
		return color;
	}
}
