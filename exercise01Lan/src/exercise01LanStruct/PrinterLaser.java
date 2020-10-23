package exercise01LanStruct;

public class PrinterLaser extends PrintServer implements PrintStrategy{

	public PrinterLaser(String address) {
		super(address);		
	}
	@Override
	public void print(Packet packet) {
		System.out.println(this.getAddress() + " " + packet.getContents() + " on Laser");
	}

}
