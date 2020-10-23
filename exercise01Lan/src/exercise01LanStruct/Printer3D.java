package exercise01LanStruct;

public class Printer3D extends PrintServer implements PrintStrategy{

	public Printer3D(String address) {
		super(address);		
	}
	@Override
	public void print(Packet packet) {
		System.out.println(this.getAddress() + " " + packet.getContents() + " on 3D");
	}

}
