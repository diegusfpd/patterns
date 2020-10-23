package exercise01LanStruct;

public class PrintServer extends Node {
	private PrintStrategy printing;
	public PrintServer(String address, PrintStrategy printing) {
		super(address);
		this.printing=printing;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void receive(Packet packet) {
		if (packet.getDestinationAddress().equals(address)) {
			print(packet, printing);
		}
		else
		{ send(packet);			
		}		
		}
	@Override
	public void send(Packet packet) {
		
		this.getNextComponent().receive(packet);
		}
	public void print(Packet packet,PrintStrategy printing) {
		this.printing.print(packet);
		//System.out.println(this.getAddress() + " " + packet.getContents());
	}
	}

