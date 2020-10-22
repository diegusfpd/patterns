package exercise01LanStruct;

public class PrintServer extends Node{

	public PrintServer(String address) {
		super(address);
		// TODO Auto-generated constructor stub
	}
	public void receive(Packet packet) {
		
		this.getNextComponent().receive(packet);
		}
	public void print(Packet packet) {
		
		this.getNextComponent().send(packet);
	}
	}

