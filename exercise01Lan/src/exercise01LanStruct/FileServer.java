package exercise01LanStruct;

public class FileServer extends PacketHandler{

	public FileServer(String address) {
		super(address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handle(Packet packet) {
		System.out.println("save in FileServer");
		
	}

}
