package exercise01LanStruct;

public abstract class PacketHandler extends Node{

	public PacketHandler(String address) {
		super(address);
		// TODO Auto-generated constructor stub
	}
	public void receive(Packet packet) {
		if (packet.getDestinationAddress().equals(address)) {
			this.print(packet);
		}
		else
		{ send(packet);			
		}		
		}
	protected abstract void print(Packet packet);
	
	

}
