package exercise01LanStruct;

public class PrintServer extends PacketHandler {
	private PrintStrategy printing;
	
	public PrintServer(String address, PrintStrategy printing) {
		               super(address);
		               this.printing=printing;
	}
	
	
	public PrintStrategy getPrinting() {
		return printing;
	}

	public void setPrinting(PrintStrategy printing) {
		this.printing = printing;
	}

	@Override
	public void receive(Packet packet) {		
			this.handle(packet);
	}
	@Override
	public void send(Packet packet) {
		
		this.getNextComponent().receive(packet);
		}
	public void print(Packet packet) {		
		System.out.println(this.getAddress() + " " + packet.getContents());
		printing.print(packet);
	}


	@Override
	protected void handle(Packet packet) {
		System.out.println(this.getAddress() + " " + packet.getContents());
		
		// TODO Auto-generated method stub
		
	}


//	@Override
//	protected void handle(Packet packet) {
//		System.out.println("printing");
//		
//	}
	}

