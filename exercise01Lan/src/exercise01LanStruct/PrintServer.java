package exercise01LanStruct;

public class PrintServer extends Node{

	public PrintServer(String address) {
		super(address);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void receive(Packet packet) {
		
		this.getNextComponent().receive(packet);
		}
	public void print(Packet packet) {
		if (packet.getDestinationAddress().equals(address)) {
			System.out.println("Print");
		}
		
	}
	}

