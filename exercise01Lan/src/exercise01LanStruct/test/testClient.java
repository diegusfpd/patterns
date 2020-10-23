package exercise01LanStruct.test;

import exercise01LanStruct.Node;
import exercise01LanStruct.Packet;
import exercise01LanStruct.PrintServer;
import exercise01LanStruct.PrinterInktjet;
import exercise01LanStruct.PrinterLaser;
import exercise01LanStruct.WorkStation;

public class testClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkStation w1 = new WorkStation("12");
		Node n1 = new Node("n11");
		//PrintServer p1 = new PrintServer("printerabis");
		PrintServer p1 = new PrinterInktjet("printerabis");
		Node n2 = new Node("n12");
		PrintServer p2 = new PrinterLaser("printersfpd");
		Packet packet1 = new Packet("printersfpd","messagePrint");
		
		w1.setNextComponent(n1);
		n1.setNextComponent(p1);
		p1.setNextComponent(n2);
		n2.setNextComponent(p2);
		p2.setNextComponent(w1);
		
		w1.originate(packet1);
	}

}
