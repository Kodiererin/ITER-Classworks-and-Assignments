import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Obj1 {
	public static void main(String[] args) {
		System.out.println("Name : Ujjwal Kumar\r Registration Number : 2141011063");
			
		String s = "This is a test.";
        
        try {
        	
            byte[] data = s.getBytes("UTF-8");
            InetAddress ia = InetAddress.getByName("www.ibiblio.org");
            int port = 7;
            DatagramSocket socket = new DatagramSocket();
            DatagramPacket outgoing = new DatagramPacket(data, data.length, ia, port);
            socket.send(outgoing);

            System.out.println("This packet is addressed to " + outgoing.getAddress() +
                    " on port " + outgoing.getPort());
            System.out.println("There are " + outgoing.getLength() + " bytes of data in the packet");

            String test = new String(outgoing.getData(), "UTF-8");
            System.out.println("Content of the packet: " + test);

        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
}
