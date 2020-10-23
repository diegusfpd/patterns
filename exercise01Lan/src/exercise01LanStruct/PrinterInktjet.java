package exercise01LanStruct;

public class PrinterInktjet extends PrintServer implements PrintStrategy {

	public PrinterInktjet(String address) {
		super(address);		
	}
	@Override
	public void print(Packet packet) {
		System.out.println(this.getAddress() + " " + packet.getContents() + " on Inktjet");
	}

}
