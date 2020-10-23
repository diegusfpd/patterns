package exercise01LanStruct;

public class MQServer extends PacketHandler{

	public MQServer(String address) {
		super(address);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void handle(Packet packet) {
		System.out.println("save in MQServer");
		
	}

	
	

}
