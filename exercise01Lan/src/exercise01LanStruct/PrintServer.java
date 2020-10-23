package exercise01LanStruct;

public class PrintServer extends Node {
	private PrintStrategy printing;
	public PrintServer(String address, PrintStrategy printing) {
		super(address);
		this.printing=printing;
		// TODO Auto-generated constructor stub
	}
	
	public PrintStrategy getPrinting() {
		return printing;
	}

	public void setPrinting(PrintStrategy printing) {
		this.printing = printing;
	}

	@Override
	public void receive(Packet packet) {
		if (packet.getDestinationAddress().equals(address)) {
			this.print(packet);
		}
		else
		{ send(packet);			
		}		
		}
	@Override
	public void send(Packet packet) {
		
		this.getNextComponent().receive(packet);
		}
	public void print(Packet packet) {		
		System.out.println(this.getAddress() + " " + packet.getContents());
		printing.print(packet);
	}
	}

