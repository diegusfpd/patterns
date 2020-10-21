
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle("blue",5);
		double circleArea =circle.area();
		System.out.println(circleArea);
		Rectangle rectangle = new Rectangle("red",5,6);
		double rectangleArea =rectangle.area();
		System.out.println(rectangleArea);
	}

}
