package exercise01LanStruct;

public class PrinterLaser implements PrintStrategy {
	
	public PrinterLaser(String address) {
		super();		
	}
	@Override
	public void print(Packet packet) {
		System.out.println(this.getClass() + " " + packet.getContents() + " on Laser");
	}

}
