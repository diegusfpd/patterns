package exercise01LanStruct;

public class Node extends LanComponent {

	public Node(String address) {
		super(address);
		
	}

	@Override
	public void send(Packet packet) {
		
		this.getNextComponent().receive(packet);
	}

	@Override
	public void receive(Packet packet) {
		
		this.send(packet);
		}
	
	}


