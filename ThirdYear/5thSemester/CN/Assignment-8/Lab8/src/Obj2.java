import java.net.ServerSocket;
import java.io.IOException;

public class Obj2 {
	 public static void main(String[] args) {
		 System.out.println("Name : Ujjwal Kumar ");
			System.out.println("Registration No : 2141011063");
	        int ephemeralPort = findEphemeralPort();

	        if (ephemeralPort != -1) {
	            System.out.println("Found Ephemeral Port: " + ephemeralPort);
	        } else {
	            System.out.println("Ephemeral Port not found");
	        }
	    }

	    private static int findEphemeralPort() {
	        for (int port = 49152; port <= 65535; port++) {
	            try (ServerSocket serverSocket = new ServerSocket(port)) {
	                // If the server socket is created successfully, the port is available
	                return port;
	            } catch (IOException e) {
	                // Port is already in use
	            }
	        }
	        return -1; // No ephemeral port found
	    }
}
