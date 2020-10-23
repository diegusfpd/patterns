package exercise01LanStruct;

public class PrinterInktjet  implements PrintStrategy {

	public PrinterInktjet(String address) {
		
	}
	@Override
	public void print(Packet packet) {
		System.out.println(this.getClass() + " " + packet.getContents() + " on Inktjet");
	}

}
