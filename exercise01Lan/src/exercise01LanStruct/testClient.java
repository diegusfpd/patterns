package exercise01LanStruct;



public class testClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkStation w1= new WorkStation("12");
		Packet p1 = new Packet("secondNode","messagePrint");
		LanComponent n1 = new Node("printersfpd");
		w1.setNextComponent(n1);
	}

}
