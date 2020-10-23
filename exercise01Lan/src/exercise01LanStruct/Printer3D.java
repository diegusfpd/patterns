package exercise01LanStruct;

public class Printer3D  implements PrintStrategy{

	public Printer3D(String address) {
		super();		
	}
	@Override
	public void print(Packet packet) {
		System.out.println(this.getClass() + " " + packet.getContents() + " on 3D");
	}

}
